import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaDate {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.add(Calendar.DATE, 2);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        System.out.println(d1);
    }
}
