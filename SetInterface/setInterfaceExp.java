package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class setInterfaceExp {
    public static void main(String[] args) {

        //Set doesn't contain duplicates(Internally it uses hashMap) & it can have only 1 null value
        //Set is unordered Collection,means objects inside set doesn't follow insertion order
        //Unlike list,set can not be access via index.
        Set<Integer> hashset1 = new HashSet<>();
        hashset1.add(8);
        hashset1.add(2);
        hashset1.add(1);
        hashset1.add(0);

        Set<Integer> hashset2 = new HashSet<>();
        hashset2.add(18);
        hashset2.add(9);
        hashset2.add(4);
        hashset2.add(2);

        hashset2.addAll(hashset1);
        System.out.println("After Union: ");
        hashset2.forEach((Integer val) ->System.out.println(val));


        hashset2 = new HashSet<>();
        hashset2.add(18);
        hashset2.add(9);
        hashset2.add(4);
        hashset2.add(2);

        hashset1 = new HashSet<>();
        hashset1.add(8);
        hashset1.add(2);
        hashset1.add(1);
        hashset1.add(0);

        hashset2.retainAll(hashset1);
        System.out.println("After Intersection: ");
        hashset2.forEach((Integer val) ->System.out.println(val));

        hashset2 = new HashSet<>();
        hashset2.add(18);
        hashset2.add(9);
        hashset2.add(4);
        hashset2.add(2);

        hashset1 = new HashSet<>();
        hashset1.add(8);
        hashset1.add(2);
        hashset1.add(1);
        hashset1.add(0);

        hashset2.removeAll(hashset1);
        System.out.println("After Difference: ");
        hashset2.forEach((Integer val) ->System.out.println(val));

    }
}
