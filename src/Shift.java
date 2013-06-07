/**
 * Shift Class
 * Represents a single shift
 */

import java.util.Date;

public class Shift
{
    // Type of Shift
    private String type;
    // Rank
    private boolean supervisor;
    // Start time
    private Date startTime;
    // End time
    private Date endTime;

    /**
     * Constructs a shift
     * @param t type of shift
     * @param s rank
     * @param t1 start time
     * @param t2 end time
     */
    public Shift(String t, boolean s, Date t1, Date t2)
    {
        this.type = t;
        this.supervisor = s;
        this.startTime = t1;
        this.endTime = t2;
    }

    /**
     * Determines if the shift is for a supervisor
     * @return boolean true if the shift is for a supervisor
     */
    public boolean isSupervisor()
    {
        return supervisor;
    }

    public boolean conflictsWith(Shift s)
    {
        // return (startTime.before(s.getStartTime()) && endTime.after(s.getStartTime()));
    }

    /**
     * Gets the start time
     * @return start time
     */
    public Date getStartTime()
    {
        return startTime;
    }

    /**
     * Gets the end time
     * @return end time
     */
    public Date getStartTime()
    {
        return endTime;
    }
}
