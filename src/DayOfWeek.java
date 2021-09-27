import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {
    static int method(int year, int month, int day)
    {
        int[] monthends = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (year > 0 && (month > 0 && month <= 12)) {

            if ((year % 4 == 0 || year % 400 == 0) &&
                    month == 2 && (day > 0 && day <= 29)) {
                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                return calendar.get(Calendar.DAY_OF_WEEK);
            }
            else {

                if (day > 0 && day <= monthends[month - 1]) {

                    Calendar calendar = new GregorianCalendar(year, month - 1, day);
                    return calendar.get(Calendar.DAY_OF_WEEK);
                }
                else
                    return 0;
            }
        }
        else
            return 0;
    }
    public static void main(String[] args)
    {
        String[] dayofweek = { "Invalid", "Sun", "Mon", "Tue",
                "Wed", "Thur", "Fri", "Sat" };
        int y = 2021, m = 6, d = 23;
        System.out.println(dayofweek[method(y, m, d)]);
    }
}