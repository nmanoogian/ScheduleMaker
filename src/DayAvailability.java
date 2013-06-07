/**
 * DayAvailability Class
 * A representation of a single-day availability
 * @author Nic Manoogian
 */

import java.util.Date;

public class DayAvailability
{
    // time that the employee can begin work on the given day
    private Date startTime;
    // time that the employee can end work on the given day
    private Date endTime;

    /**
     * Constructs an employee availability with start and end times
     */
    public DayAvailability(Date t1, Date t2)
    {
        this.startTime = t1;
        this.endTime = t2;
    }

    /**
     * Determines if the shift will cause a conflict in the schedule
     * @param s shift in question
     * @return boolean true if the shift causes a conflict
     */
    public boolean overlaps(Shift s)
    {
        return s.getStartTime().before(startTime) || s.getEndTime.after(endTime);
    }
}
