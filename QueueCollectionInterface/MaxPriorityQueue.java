package QueueCollectionInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPriorityQueue {
    public static void main(String[] args)
    {
        //Passing Compartor to the priority Queue Constructor
        Queue<Integer> minHeap = new PriorityQueue<>((Integer a,Integer b) -> a-b);
        //By default it's min heap Natural ordering
        minHeap.offer(5);
        minHeap.offer(2);
        minHeap.offer(8);
        minHeap.offer(1);
        minHeap.offer(9);

        //TC :
        //Add & Offer -> O(logn)
        //peak -> O(1)
        //Poll & remove head ele -> O(logn)


        minHeap.forEach((Integer val)-> System.out.println(val));


    }
}
