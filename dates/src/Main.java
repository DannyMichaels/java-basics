import java.util.Calendar;
import java.util.TimeZone;

public class Main {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EST"));

    printMyDateInfo(cal);
  }
    

  /* https://www.dummies.com/programming/java/what-is-the-static-keyword-in-java/ */
  private static void printMyDateInfo(Calendar cal) {
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    int minute = cal.get(Calendar.MINUTE);
    
    System.out.print("Day of Month: " + dayOfMonth);
    System.out.print("\nMinute: " + minute);
  }
}
