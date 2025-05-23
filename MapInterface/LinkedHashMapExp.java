package MapInterface;

import java.util.*;

public class LinkedHashMapExp {
    public static  void main(String[] args)
    {
        ///*** LinkedHashMap maintain's the insertion order ,It's similar to hashMap but also uses as Double linkedlist
        ///*** It is not a threadsafe,there is no threadsafe version available for this
        ///** so, we have to explicitly need to make it collection threadsafe , below like this:
       // Map<Integer,Integer> map = Collections.synchronizedMap(new LinkedHashMap<>());
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
         System.out.println("----------------Below is LinkedHashMap-------------------------");
        linkedHashMap.put("apple",1);
        linkedHashMap.put("Banana",1);
        linkedHashMap.put("dragon fruit",1);
        linkedHashMap.put("strawberry",1);

        for(Map.Entry<String,Integer> entryMap: linkedHashMap.entrySet())
        {
            System.out.println("key: " + entryMap.getKey() +" , value: "+ entryMap.getValue());
        }

        System.out.println("----------------Below is HashMap-------------------------");
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",1);
        hashMap.put("D",1);
        hashMap.put("C",1);

        hashMap.forEach((String key,Integer val) -> System.out.println("key: " + key +" Value: " + val));


        ///*** LinkedHashMap with Acess order
        System.out.println("----------------Below is LinkedHashMap with Freq Access Order-------------------------");
        HashMap<String,Integer> linkedHashMapAcessOrder = new LinkedHashMap<>(16, 0.75F,true);
        linkedHashMapAcessOrder.put("A",1);
        linkedHashMapAcessOrder.put("B",33);
        linkedHashMapAcessOrder.put("D",46);
        linkedHashMapAcessOrder.put("C",99);
        System.out.println("----------------Below is Before accessing any element-------------------------");

        linkedHashMapAcessOrder.forEach((String key,Integer val) -> System.out.println("Before accessing : key: " + key +" Value: " + val));
        System.out.println("----------------Below is After accessing any element-------------------------");

        //Accessing the B key
        linkedHashMapAcessOrder.get("B");
        linkedHashMapAcessOrder.forEach((String key,Integer val) -> System.out.println("After accessing : key: " + key +" Value: " + val));



    }
}
