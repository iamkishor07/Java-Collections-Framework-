package DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeExp {
    public static void main(String[] args) {
        ///** Deque is Double Ended Queue Means Addition & Deletion Can be done from either sides of the queue

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1); //Added at front 1
        deque.addFirst(1); //Added at front 1
        deque.offerFirst(7); //Added at front 7 by offerFirst
        System.out.println(deque.peekFirst()); // 7

        deque.offerLast(2); //  7,1, 2
        deque.addLast(10); //Added  10 at Last => 7, 1 ,2, 10
        System.out.println(deque.peekLast()); //10

        deque.pollLast(); //removes 10 pollLast
        deque.removeLast(); //removes 2
        System.out.println(deque.peekLast()); //1

        /*
             addFirst() & offerFirst() - Both does insertion at the first, but incase of
             addFirst() -> throws Exception if insertion fails
             offerFirst() -> returns false if insertion fails

             addLast() & offerLast() -> Both does insertion at the end of the queue, but the difference would be
             addLast() -> throws Exception if insertion fails
             offerLast() -> returns false if insertion fails

             removeLast() & pollLast() - Both does Deletion at the end, but diff
             removeLast() -> throws exception if deletion fails
             pollLast() -> returns null if queue is empty

             removeFirst() & pollFirst() - Both does Deletion at the end, but diff
             removeFirst() -> throws exception if deletion fails
             pollFirst() -> returns null if queue is empty

             peekFirst() & getFirst() -> Both retrieve the start/head element from the queue
             peekFirst() -> Returns Null,if queue is empty
             getFirst() -> Returns Exceptions if the queue is empty

             peekLast() & getLast() > Both retrieve the start/head element from the queue
             peekLast() -> Returns Null,if queue is empty
             getLast() -> Returns Exceptions if the queue is empty
         */


        ///*** Dequeue also have queue Interface methods available in that
        ///*** How does it behave in dequeue
        /*
         1.add() -> Internally calls the addLast() method
         2.offer() -> Internally calls the offerLast() method
         3.remove() -> Internally calls the removeFirst() method
         4.poll() -> Internally calls the pollFirst() method
         5.peek() -> Internally calls the peekFirst() method
         6.element() -> Internally calls the getFirst() method
         */

    }
}
