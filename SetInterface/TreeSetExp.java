package SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(67);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(17);
        //Sorts according to its natural ordering
        treeSet.forEach((Integer val) -> System.out.println(val));
    }

    }
