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
    // Telephone number
    private int phoneNumber;
    // Rank of employee
    private boolean supervisor;
    // Employee availability
    private Availability avail;
    // Shifts that the employee is scheduled for
    private ArrayList<Shift> workingShifts;
    
    /**
     * Constructs an employee
     * @param ename employee name
     * @param phone employee phone number
     * @param su employee rank
     * @param a employee availability
     */
    public Employee(String ename, int phone, boolean su, Availability a)
    {
        this.name = ename;
        this.phoneNumber = phone;
        this.supervisor = su;
        this.avail = a;
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
}
