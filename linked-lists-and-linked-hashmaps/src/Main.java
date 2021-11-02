import java.util.LinkedList;
import java.util.Calendar;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
       
      // a linked list will maintain the order that it's put in, a linked hashmap will also maintain the order and they will never change the order. (in a array or hashmap the order can easily change)
      LinkedList<String> myLinkedList = new LinkedList<>();

      // add elements
      myLinkedList.add("I'm middle!");
      myLinkedList.addLast("Hey I'm last");
      myLinkedList.addFirst("Hey I'm first");
      
      System.out.println("linkedList before removing: " + myLinkedList);

      // removing elements
      myLinkedList.removeFirst();
      myLinkedList.removeLast();
      myLinkedList.remove("I'm middle!");

      System.out.println("linkedList after removing: " + myLinkedList);

      LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();
      myLinkedHashMap.put("hourOfDay", Calendar.HOUR_OF_DAY);
      System.out.println("hour of day: " + myLinkedHashMap.get("hourOfDay"));
    }
}
