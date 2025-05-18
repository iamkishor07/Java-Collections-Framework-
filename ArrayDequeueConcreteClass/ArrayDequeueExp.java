package ArrayDequeueConcreteClass;

import java.util.ArrayDeque;

public class ArrayDequeueExp {
    public static void main(String[] args) {

        ///*** ArrayDequeue is a concrete class of dequeue , which implements all the methods
        ///*** provided by the Dequeue & Queue Interface


        ///*** Now Using ArrayDequeue as a Queue, It follows FIFO principle
        ArrayDeque<Integer> arrayDequeueAsQueue = new ArrayDeque<>();
        arrayDequeueAsQueue.addLast(10);
        arrayDequeueAsQueue.addLast(90);
        arrayDequeueAsQueue.addLast(3);

        //Deletion
        //Now we can remove from the front
        int firstEle = arrayDequeueAsQueue.removeFirst();
        System.out.println(firstEle); //prints 10 -> First Insertion First Removal


        ///*** Now Using ArrayDequeue as a Stack, It follows LIFO principle
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        //Insertion
        arrayDequeAsStack.addFirst(18);
        arrayDequeAsStack.addFirst(11);
        arrayDequeAsStack.addFirst(78);

        int lastEle = arrayDequeAsStack.removeFirst();
        System.out.println(lastEle); // Prints 78 -> last in First Out

    }
}
