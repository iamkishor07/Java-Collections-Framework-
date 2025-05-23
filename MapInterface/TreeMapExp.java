package MapInterface;

import java.util.*;

public class TreeMapExp {
    public static  void main(String[] args)
    {
        //Map is sorted ascending of it's natural ordering of it's key or comparator provided during the map creation
        //Its based on Red Black Tree (Self Balancing Binary Search tree)
        // O(logn) time complexity of insert,delete & search operations

        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("D",46);
        treeMap.put("A",1);
        treeMap.put("C",99);
        treeMap.put("B",33);

        //Values are sorted in ascending order of its keys
        treeMap.forEach((String key,Integer val) -> System.out.println("key :" + key +" value: " + val));
        System.out.println("-------------------------------------------------------------------------");
        Map<String,Integer> treeMapDesc = new TreeMap<>((String key1,String key2) -> key2.compareTo(key1));
        treeMapDesc.put("D",46);
        treeMapDesc.put("A",1);
        treeMapDesc.put("C",99);
        treeMapDesc.put("B",33);

        //Values are sorted in descending order of its keys
        treeMapDesc.forEach((String key,Integer val) -> System.out.println("key :" + key +" value: " + val));

    }
}
