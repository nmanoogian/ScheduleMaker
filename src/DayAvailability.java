/**
 * DayAvailability Class
 * A representation of a single-day availability
 * @author Nic Manoogian
 */

public class DayAvailability
{
    // time that the employee can begin work on the given day
    private WeekTime startTime;
    // time that the employee can end work on the given day
    private WeekTime endTime;

    /**
     * Constructs an employee availability with start and end times
     */
    public DayAvailability(WeekTime t1, WeekTime t2)
    {
        this.startTime = t1;
        this.endTime = t2;
    }

    /**
     * Determines if the shift will cause a conflict in the schedule
     * @param s shift in question
     * @return boolean true if the shift causes a conflict
     */
    public boolean conflictsWith(Shift s)
    {
        return s.getStartTime().before(startTime) || s.getEndTime().after(endTime);
    }

    /**
     * Makes a copy of the DayAvailability
     * @return copy
     */
    public DayAvailability clone()
    {
        return new DayAvailability(startTime.clone(), endTime.clone());
    }
}
