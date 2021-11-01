import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Random rand = new Random();

      List<String> greetings = new ArrayList<>();
      greetings.add("Hello!");
      greetings.add("Hi!");
      greetings.add("Hey!");

      System.out.print("greetings: " + greetings + " \n");
      System.out.print("greetings array length: " + greetings.size() + " \n");

      int randomIndex = rand.nextInt(greetings.size());  // nextInt returns a value from 0 (inclusive) and the specificied param value (exclusive)
      String randomGreeting = greetings.get(randomIndex);

      System.out.println("randomIndex: " + randomIndex + " \n");
      System.out.println("randomGreeting: " + randomGreeting + " \n");
    }
}
