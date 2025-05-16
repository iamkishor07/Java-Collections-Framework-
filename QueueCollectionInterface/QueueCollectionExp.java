package QueueCollectionInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionExp {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new PriorityQueue<>();
        /*
            Queue is an interface, It follows FIFO(First in First Out principle)
            But there are some Exceptions like PriorityQueue
            Supports all methods available in Collection + someOther Methods provided by Queue Interface
            Insertion - Happens from the back
            Deletion - Happens from the first
         */

        //add()  -> inserts an element from the back
        //True if Insertion is Successful & Exception when it's fail
        //Can insert NUll values will throw NPE(Null Pointer Exception)
        queue.add(12);
        queue.add(90);

        //offer() -> this does the same thing as add
        //but there are some added advantages
        //True if Insertion is successful,& false if fails
        //Null insertion is not allowed
        queue.offer(1);

        //remove() -> removes the head of the queue
        //return Exception if the queue is Empty
        queue.remove(1);

        //poll() -> does the same thing as the remove ,but added advantage
        //Poll will returns Null incase of queue is empty
        queue.poll();

        //Peek() -> retrieves the head of the queue,but does not removes
        //Returns null incase if the queue ie empty
        System.out.println(queue.peek()); //90

        //element() -> retrieves the head of the queue,but does not removes
        //Returns an Exceptions if the queue is empty
        System.out.println(queue.element()); //90

    }

}
