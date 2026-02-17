// Basic LinkedList operations: add, insert, remove, and search.

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        
        LinkedList<String> ls = new LinkedList<String>();

        // ls.push("A");
        // ls.push("B");
        // System.out.println(ls);      //LinkedList as a Stack.
        // ls.pop();
        // ls.pop();
        // System.out.println(ls);

        // ls.offer("A");
        // ls.offer("B");
        // System.out.println(ls);     //LinkedList as a Queue.
        // ls.poll();
        // ls.poll();
        // System.out.println(ls);

        ls.add("A");
        ls.add("B");
        System.out.println("Intial LinkedList : " + ls);

        ls.add(1,"C");
        ls.add(2,"D");
        System.out.println("LinkedList after adding elements : " + ls);

        ls.removeFirst();
        System.out.println("LinkedList after removing the first element : " + ls);

        ls.remove(1);
        System.out.println("LinkedList after removing the element at index 1 : " + ls);

        System.out.println("Index Of element 'C' : " + ls.indexOf("C"));

    }
    
}
