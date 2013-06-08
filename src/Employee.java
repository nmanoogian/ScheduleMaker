/**
 * Employee Class
 * Represents an employee
 * @author Nic Manoogian
 */

import java.util.ArrayList;

public class Employee
{
    // Name of Employee
    private String name;
    // Rank of employee
    private boolean supervisor;
    // Employee availability
    private Availability avail;
    // Shifts that the employee is scheduled for
    private ArrayList<Shift> workingShifts;
    
    /**
     * Constructs an employee
     * @param ename employee name
     * @param su employee rank
     * @param a employee availability
     */
    public Employee(String ename, boolean su, Availability a)
    {
        this.name = ename;
        this.supervisor = su;
        this.avail = a;
        this.workingShifts = new ArrayList<Shift>();
    }

    public Employee(Employee ee)
    {
        this.name = ee.getName();
        this.supervisor = ee.getRank();
        this.avail = ee.getAvailability().clone();

        this.workingShifts = new ArrayList<Shift>();
        for (Shift sh : ee.getShifts())
        {
            this.workingShifts.add(sh.clone());
        }
    } 

    public Employee clone()
    {
        return new Employee(this);
    }

    public String toString()
    {
        String out = name + (supervisor ? "\n Supervisor\n" : "\nEmployee\n");
        for (Shift s : workingShifts)
        {
            out += "\t" + s + "\n";
        }
        return out;
    }

    public String getName()
    {
        return name;
    }

    public boolean getRank()
    {
        return supervisor;
    }

    public Availability getAvailability()
    {
        return avail;
    }

    public ArrayList<Shift> getShifts()
    {
        return workingShifts;
    }

    /**
     * Determines if the employee could work a given shift
     * @param s tentative shift
     * @return boolean true if the employee could work the shift
     */
    public boolean canWork(Shift s)
    {
        // Availability
        if (avail.conflictsWith(s))
        {
            System.out.println("Availability");
            return false;
        }

        // Rank
        if (!supervisor && s.isSupervisor())
        {
            System.out.println("Rank");
            return false;
        }

        // Working another shift at the same time
        for (Shift w : workingShifts)
        {
            if (w.conflictsWith(s))
            {
                System.out.println("Shift");
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Adds a Shift to the Employee Shifts list
     * @param s Shift to add
     */
    public void take(Shift s)
    {
        workingShifts.add(s);
    }
}
