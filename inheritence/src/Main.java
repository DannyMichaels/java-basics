// https://www.w3schools.com/java/java_inheritance.asp

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig();

      List<Animal> animals = new ArrayList<>();

      animals.add(new Cow());

      System.out.println("animals: " + animals);
    }
}
