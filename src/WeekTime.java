/**
 * WeekTime Class
 * Represents a specific time of day with week
 */
public class WeekTime
{
    // Day of the Week (0-6) (Fri - Thur)
    public int week;
    // Hour of the Day (0-23)
    public int hour;
    // Minute of the Hour (0-59)
    public int minute;

    /**
     * Constructs a WeekTime object using the week, hour and minute values
     * @param w week integer
     * @param h hour integer
     * @param m minute integer
     */
    public WeekTime(int w, int h, int m)
    {
        this.week = w;
        this.hour = h;
        this.minute = m;
    }

    /**
     * Constructs a WeekTime object using a string representation (stamp)
     * Ex "10930" would represent Saturday, 9:30 am
     * @param s string representation
     */
    public WeekTime(String s)
    {
        this.week = Integer.parseInt(s.substring(0,1));
        this.hour = Integer.parseInt(s.substring(1,3));
        this.minute = Integer.parseInt(s.substring(3,5));
    }

    /**
     * Determines if this time is after another time
     * @param wt another weektime
     */
    public boolean after(WeekTime wt)
    {
        return getStamp() > wt.getStamp();
    }

    /**
     * Determines if this time is before another time
     * @param wt another weektime
     */
    public boolean before(WeekTime wt)
    {
        return getStamp() < wt.getStamp();
    }

    /**
     * Returns the stamp integer for the WeekTime
     * @return WeekTime stamp
     */
    public int getStamp()
    {
        return (10000 * week) + (100 * hour) + minute;
    }

    /**
     * Returns the week as an integer
     * @return week as an integer
     */
    public int getWeek()
    {
        return week;
    }

    public String toString()
    {
        String out = "";
        switch (week)
        {
            case 0:
                out += "Friday";
                break;
            case 1:
                out += "Saturday";
                break;
            case 2:
                out += "Sunday";
                break;
            case 3:
                out += "Monday";
                break;
            case 4:
                out += "Tuesday";
                break;
            case 5:
                out += "Wednesday";
                break;
            case 6:
                out += "Thursday";
                break;
        }
        out += ", " + hour + ":" + (minute <= 9 ? "0"+minute : minute);
        return out;
    }
}
