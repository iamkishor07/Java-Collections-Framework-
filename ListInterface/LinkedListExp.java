package ListInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExp {
    public static void main(String[] args)
    {
        ///*
        ///LinkedList is the concrete class, which implements both Dequeue & List Interface
        ///It supports Dequeue Methods like "getFirst()", "getLast()", "removeLast()" etc
        ///+
        ///It supports Index Based Operations like "get(index)","add(index,val)" etc..
        LinkedList<Integer> linkedListUsingDeqeue = new LinkedList<>();

        //Using deque functionality
        linkedListUsingDeqeue.addLast(10);
        linkedListUsingDeqeue.addLast(3);
        linkedListUsingDeqeue.addLast(6);
        linkedListUsingDeqeue.addFirst(99);
        linkedListUsingDeqeue.forEach((Integer val) -> System.out.println(val));

        //Using LinkedList functionality
        LinkedList<Integer> linkedListUsingList = new LinkedList<>();
        linkedListUsingList.add(0, 89);
        linkedListUsingList.add(1, 839);
        linkedListUsingList.add(2, 8);
        linkedListUsingList.add(3, 9);
        System.out.println(linkedListUsingList.get(1) + " and " + linkedListUsingList.get(2));


    }

}
