package SortedMapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExp {
    public  static  void main(String[] args)
    {
        //SortedMap Interface -extends -> map Interface
        //NavigableMap Interface - extends -> sortedMap Interface
        //TreeMap Concrete Class - implements -> Navigable Interface

        SortedMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.put("D",46);
        sortedMap.put("A",1);
        sortedMap.put("C",99);
        sortedMap.put("B",33);


        //methods in SortedMap

        //SortedMap<K,V> headMap(K key) -> returns all the values from start to the specifed key(exclusive)
        System.out.println(sortedMap.headMap("C"));


        //SortedMap<K,V> tailMap(K key) -> returns all the values from end to the specifed key(Inclusive)
        System.out.println(sortedMap.tailMap("C"));


        // K firstKey() -> returns the first key
        System.out.println(sortedMap.firstKey());

        // K lastKey() -> returns the last key
        System.out.println(sortedMap.lastKey());

    }

}
