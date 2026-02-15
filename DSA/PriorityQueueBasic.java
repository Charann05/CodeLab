// Demonstrates the use of Java PriorityQueue to store and automatically order elements based on natural (or custom) priority instead of FIFO.

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<>();  //If you want it in reverse order pass 'Collection.reverseOrder()' in the Constructor.

        queue.offer("Naman");       
        queue.offer("Javad");
        queue.offer("Akash");       //Same as add but don't throw exception.
        queue.offer("Elica");
        queue.offer("Alen");
        queue.add("Jessica");

        System.out.println(queue);

    }
}
