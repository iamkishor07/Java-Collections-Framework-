package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExp {
    public static  void main(String[] args)
    {
        ///*** does not maintain insertion order , can have null key or value
        ///*** It's not a threadsafe, for thread safe(use HashTable or concurrentHashMap)

        Map<Integer,Integer> hm = new HashMap<>();

        ///*** If map already contains 1 as a key , It will overwrite the value provided ,
        ///*** else it will add new key value mapping
        hm.put(1,5);
        hm.put(2,53);
        hm.put(3,15);

        for(Map.Entry<Integer,Integer> entryMap: hm.entrySet())
        {
            System.out.println("key: " + entryMap.getKey() + "Value: " + entryMap.getValue());
        }

        System.out.println(hm.size()); //returns the no.of key-value pair mappings

        System.out.println(hm.isEmpty());//return true if there are no key-value pairs,else return true

        System.out.println(hm.containsKey(2)); //returns true if 2-as key contains in hashMap or else return false

        System.out.println(hm.containsValue(53)); //returns true if one or more keys are mapped to the value else return false

        System.out.println(hm.get(3)); //returns to the value to which this key is mapped to  else if not present returns null

        System.out.println(hm.getOrDefault(13,-1));

        ///*** hm.keySet() returns the set of keys present in hashmap
        for(Integer keys : hm.keySet())
        {
            System.out.println("keys: " + keys);
        }

        ///*** hm.values() returns all the values of keys present in hashmap
        Collection<Integer> values = hm.values();
        for(Integer value : values)
        {
            System.out.println("values: "+value);
        }

    }

}
