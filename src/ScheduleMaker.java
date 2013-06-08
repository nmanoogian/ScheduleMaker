/**
 * ScheduleMaker Class
 * Uses a backtracking algorithm to generate an employee schedule
 */

import java.util.ArrayList;

public class ScheduleMaker
{
    public static Schedule backtrack(Schedule s)
    {
        if (s.isGoal())
        {
            return s;
        }
        else
        {
            for (Schedule child : s.getNeighbors())
            {
                backtrack(new Schedule(child));
            }
        }

        return null;

    }

    public static void main(String[] args)
    {
    }
}
