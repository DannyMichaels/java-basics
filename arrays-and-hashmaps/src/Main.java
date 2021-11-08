import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    // ------
    // ARRAYS
    // List<type> varName = new ArrayList<>();
    // https://www.w3schools.com/java/java_arraylist.asp
    List<Integer> myList = new ArrayList<>();
     
    myList.add(10); // 0
    myList.add(5); // 1
    myList.add(106); // 2

    System.out.println("mylist: " + myList);
    System.out.println("myList[2]: " + myList.get(2));
    System.out.println("myList contains 106?: " + myList.contains(106)); // works on strings too

    
    // ------
    // HASHMAPS
    // HashMap <key, value> varName = new HashMap<>();
    HashMap<String, Integer> myMap = new HashMap<>();

    myMap.put("goodSpidermanMoviesCount", 3); // key, value
    myMap.put("catLegsCount", 4); // key, value

    System.out.println("how many good spider-man movies are there? " + myMap.get("goodSpidermanMoviesCount"));
    System.out.println("Does this key (catLegsCount) exist? " + myMap.containsKey("catLegsCount"));
    System.out.println("Does this value (4) exist? " + myMap.containsValue(4));
  }
}
