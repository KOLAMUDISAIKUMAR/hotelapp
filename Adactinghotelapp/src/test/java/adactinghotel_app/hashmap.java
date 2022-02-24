package adactinghotel_app;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class hashmap {
public static void main(String[] args) {
    HashMap<Integer, String> ha =new HashMap<Integer, String>();
    ha.put(100, "saikumar");
    ha.put(200, "vishu");
    ha.put(300, "karthik");
    ha.put(400, "harika");
    ha.put(500, "lakshmi");
    ha.put(600, "nikhil");
    // duplucate int and char is given
    ha.put(600, "nikhil");
  // given all out put fields in("ha")reference 
    System.out.println(ha);
    System.out.println(ha.get(200));
    System.out.println(ha.containsKey(200));
    System.out.println(ha.get(100));
    System.out.println(ha.containsKey(100));
    System.out.println(ha.get(400));
    System.out.println(ha.containsKey(400));
    System.out.println(ha.get(600));
    System.out.println(ha.containsKey(600));
    System.out.println(ha.get(500));
    System.out.println(ha.containsKey(500));
    
   ha.forEach((v, k) -> {
        System.out.format("value: %d%n", "key: %s", v, k);
    });
    
   /* Set<Entry<Integer, String>> entryset = ha.entrySet();
    // using by iterator
    Iterator<Entry<Integer, String>> it= entryset.iterator();
    while(it.hasNext()) 
    {	
    }Entry<Integer, String>entry=it.next();
     
  System.out.println("entry.key"+entry.getKey()+"----"+"entr.value"+entry.getValue());
*/
}
}
   
