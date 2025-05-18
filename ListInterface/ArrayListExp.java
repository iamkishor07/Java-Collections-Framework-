package ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.System.out;

public class ArrayListExp {
    public  static  void  main(String[] args)
    {
        ///*** ArrayList is the concrete class , that implements the List Interface
        ///** ArrayList will implement all the methods provided by the Collection + List Interface

        List<Integer> arrayList = new ArrayList<>();

        //Add
        arrayList.add(10);
        //Add at specific index
        arrayList.add(0,14);

        Stack<Integer> st = new Stack<>();
        st.push(45);
        st.push(97);

        //Can add Collections to another collection
        arrayList.addAll(st);
        out.println("After adding Stack elememt ");
        arrayList.forEach((val -> out.println(val)));

        //Add at specific index
        arrayList.addAll(0,st);
        out.println("After adding Stack elememt again at index 0 ");

        arrayList.forEach((val -> out.println(val)));

        arrayList.replaceAll((Val) -> -1 * Val);
        out.println("After doing replaceAll  ");
        arrayList.forEach((val -> out.println(val)));

        //Sorting
        arrayList.sort((Integer a,Integer b) -> a-b);
        out.println("After doing sorting  ");

        arrayList.forEach((val -> out.println(val)));

        //set an element
        arrayList.set(0,90);
        out.println("After set an value at index 0");
        arrayList.forEach((val -> out.println(val)));


        //Remove an element at index 1
        arrayList.remove(3);
        out.println("After removing an element at index  3  ");

        arrayList.forEach((val -> out.println(val)));


        //Index of
        out.println("index of" + arrayList.indexOf(89));

        //Traversing Backward
        ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());

        while(listIterator.hasPrevious())
        {
            out.println("Traversing Back : " + listIterator.previous() + "Next Index : " + listIterator.nextIndex() + "previous Index :" + listIterator.previousIndex());
        }

        //Traversing Forward
        ListIterator<Integer> listIterator1 = arrayList.listIterator();

        while(listIterator1.hasNext())
        {
            out.println("Traversing forward : " + listIterator1.next() + " Next Index : " + listIterator1.nextIndex() + " previous Index :" + listIterator1.previousIndex());

        }

        //SubList
        List<Integer> subList = arrayList.subList(2,4);
        //Print Original list
        out.println("Original List Before changing anything in sublist");

        arrayList.forEach((Integer val) -> out.println(val));

        //Changes made to the sublist
        subList.add(99);

        //Original list
        out.println("Original List After changing anything in sublist");
        arrayList.forEach((Integer val) -> out.println(val)); //99 Added

        List<Integer> threadSafeArrayList = new CopyOnWriteArrayList<>();
        threadSafeArrayList.add(34);
        threadSafeArrayList.add(3);
        threadSafeArrayList.add(1);
        out.println("ThreadSafe version of ArrayList");
        threadSafeArrayList.forEach((Integer val) -> out.println(val));


    }

}
