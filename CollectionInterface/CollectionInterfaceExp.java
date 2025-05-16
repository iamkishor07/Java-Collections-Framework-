package CollectionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionInterfaceExp {
    public static void main(String[] args)
    {
        //Collection is an interface & child of Iterable Interface
        /*
            It represents a group of object's & as it's an interface which provides
            methods to work on group objects
         */
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(9);
        list.add(45);

        //size() -> java 1.2 -> returns size
        System.out.println("size: " +list.size()); //4

        //isEmpty -> java 1.2 -> return true if empty else false
        System.out.println("isEmpty: " + list.isEmpty()); //false

        //Contains -> java 1.2 -> used to search element , return true or false
        System.out.println("contains : " +list.contains(2)); //return true;

        //toArray() -> java 1.2 -> used to convert into Array
        //add() -> java 1.2 -> add an element
        list.add(7);

        //remove  -> java 1.2 -> used to remove value at given index
        //remove at index
        list.remove(2);

        System.out.println("remove 2 " +list.contains(2));

        //remove object., removes the first occurence of the value
        list.remove(Integer.valueOf(9));

        //addAll() r-> java 1.2 -> used to add data from collection to another

        Stack<Integer> st = new Stack<>();
        st.add(78);
        st.add(8);
        st.add(10);

        list.addAll(st);

        System.out.println("containsAll " + list.containsAll(st)); //true
        // 12 78 8 10

        //remove all
        System.out.println("removeAll " + list.removeAll(st)); // true

        //equals -java 1.2
        System.out.println(list.equals(st)); //false

        //Clear - java 1.2
        list.clear();
        System.out.println("Clear "+list.size()) ; //0

    }
}
