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

    /**
     * Constructs an employee using another employee
     * @param ee Employee to copy
     */
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

    /**
     * Gets the name of the Employee
     * @return name of employee
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the rank of the Employee
     * @return boolean true if supervisor
     */
    public boolean getRank()
    {
        return supervisor;
    }

    /**
     * Gets the Availability of the Employee
     * @return Availability object for the employee
     */
    public Availability getAvailability()
    {
        return avail;
    }

    /**
     * Gets the ArrayList of shift that the Employee is assigned to work
     * @return ArrayList of Shift objects
     */
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
            return false;
        }

        // Rank
        if (!supervisor && s.isSupervisor())
        {
            return false;
        }

        // Working another shift at the same time
        for (Shift w : workingShifts)
        {
            if (w.conflictsWith(s))
            {
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
        workingShifts.add(s.clone());
    }
}
