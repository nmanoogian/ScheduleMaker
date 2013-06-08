public class TimeTest
{
    public static void main(String[] args)
    {
        WeekTime w1 = new WeekTime(4,9,0);
        WeekTime w2 = new WeekTime("41200");
        System.out.println(w1.getStamp());
        System.out.println(w2.getStamp());
        System.out.println(w2.before(w1));

        Schedule s = new Schedule("data/shifts.txt","data/employees.txt");
        System.out.println(s.getShifts());
    }
}
