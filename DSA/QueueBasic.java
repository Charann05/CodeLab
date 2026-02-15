// Demonstrates basic Queue operations in Java using LinkedList.


import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Naman");       
        queue.offer("Javad");
        queue.offer("Akash");       //Same as add but don't throw exception.
        queue.offer("Elica");
        queue.offer("Alen");
        queue.add("Jessica");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());       //Methods from Collection class.
        System.out.println(queue.contains("Akash"));

        System.out.println(queue);
        System.out.println("Element at the head position : "+ queue.peek());       //Same as element.
        queue.poll();
        queue.poll();       //Same as remove.
        queue.poll();       
        System.out.println("Affter removing the elements : " + queue);
        
    }
    
}
