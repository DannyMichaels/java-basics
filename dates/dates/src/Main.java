import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args)  {
      Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EST"));
      System.out.print("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
