// This code compares the time taken by LinkedList and ArrayList for get and remove operations at different positions.

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedVsArrayList {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0 ; i<1000000 ; i++){
            ll.add(i);
            al.add(i);
        }

        /***********************LinkedList***********************/
        startTime = System.nanoTime();
        //ll.get(0);
        //ll.get(5000);
        //ll.remove(0);
        //ll.remove(999999);
        ll.remove(10000);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList took : " + elapsedTime + " ns");

        /***********************ArrayList***********************/
        startTime = System.nanoTime();
        //al.get(0);
        //al.get(5000);
        //al.remove(0);
        //al.remove(999999);
        al.remove(10000);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList took : " + elapsedTime + " ns");

    }
    
}

/*Conclusion:
    Use ArrayList if you need fast random access and mostly add/remove at the end.
    Use LinkedList if you frequently add/remove at the start or middle and don’t need fast random access.
*/
