package SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExp {
    public static void main(String[] args) {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(89);
        linkedHashSet.add(2);
        linkedHashSet.add(45);
        linkedHashSet.add(11);

        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //Insertion order maintains.
    }
}
