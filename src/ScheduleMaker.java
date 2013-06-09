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
                System.out.println(child);
                backtrack(new Schedule(child));
            }
        }

        return null;

    }

    public static void main(String[] args)
    {
        Schedule s = new Schedule("data/shifts.txt","data/employees.txt");
        // Schedule finished = backtrack(s);
        // if (finished == null)
        // {
        //     System.out.println("No solution found");
        // }
        System.out.println(s.getNeighbors());
    }
}
