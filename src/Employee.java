/**
 * Employee Class
 * Represents an employee
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

    }
}
