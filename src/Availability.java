/**
 * Availability Class
 * A seven-day representation of an employee availability
 * @author Nic Manoogian
 */
public class Availability
{
    // Collection of 7 daily availabilities
    private DayAvailability[] days;

    public Availability()
    {
        days = new DayAvailability[7];
    }

    public Availability(Availability aa)
    {
        days = new DayAvailability[7];
        DayAvailability[] original = aa.getDays();
        days[0] = original[0].clone();
        days[1] = original[1].clone();
        days[2] = original[2].clone();
        days[3] = original[3].clone();
        days[4] = original[4].clone();
        days[5] = original[5].clone();
        days[6] = original[6].clone();
    }

    public Availability(DayAvailability s0, DayAvailability s1, DayAvailability s2, DayAvailability s3, DayAvailability s4, DayAvailability s5, DayAvailability s6)
    {
        days = new DayAvailability[7];
        days[0] = s0;
        days[1] = s1;
        days[2] = s2;
        days[3] = s3;
        days[4] = s4;
        days[5] = s5;
        days[6] = s6;
    }

    public DayAvailability[] getDays()
    {
        return days;
    }
   
    /**
     * Determines if a given shift conflicts with the availability
     * @param s shift in question
     * @return boolean true if there is a conflict
     */
    public boolean conflictsWith(Shift s)
    {
        for (DayAvailability d : days)
        {
            if (d.conflictsWith(s))
            {
                return true;
            }
        }
        return false;
    }

    public Availability clone()
    {
        return new Availability(this);
    }
}
