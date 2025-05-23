package QueueCollectionInterface;

import java.util.PriorityQueue;
import java.util.Queue;

class pair
{
    int value;
    int index;

    public pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

public class MinPriorityQueue {
    public static void main(String[] args)
    {
        Queue<Integer> minHeap = new PriorityQueue<>();
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


        PriorityQueue<pair> minHeapPriority = new PriorityQueue<>((pair a ,pair b) -> a.value - b.value);
        minHeapPriority.offer(new pair(20,0));
        minHeapPriority.offer(new pair(15,1));
        minHeapPriority.offer(new pair(26,2));
        minHeapPriority.offer(new pair(2,3));
        minHeapPriority.offer(new pair(98,4));
        minHeapPriority.offer(new pair(6,5));

        int arr[] = new int[minHeapPriority.size()];
        while (!minHeapPriority.isEmpty())
        {
            System.out.println(minHeapPriority.peek().value +" "+minHeapPriority.peek().index);
            minHeapPriority.poll();
        }

    }
}
