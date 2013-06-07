/**
 * Availability Class
 * A seven-day representation of an employee availability
 * @author Nic Manoogian
 */
public class Availability
{
    // Collection of 7 daily availabilities
    private DayAvailability[] days;
   
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
    
}
