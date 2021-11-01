import java.util.Calendar;
import java.util.TimeZone;

public class Main {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EST"));
    
    // cal.set(Calendar.MINUTE, 40); // change the minute to 40

    printMyDateInfo(cal);
  }
  
  
  /* https://www.dummies.com/programming/java/what-is-the-static-keyword-in-java/ */
  private static void printMyDateInfo(Calendar cal) {

    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);

    System.out.print("Day of Month: " + dayOfMonth);
    System.out.print("\nHour : " + hour);
    System.out.print("\nMinute: " + minute);
  }
}
