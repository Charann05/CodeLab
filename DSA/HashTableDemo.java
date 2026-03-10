// Demonstrates basic operations of a Java Hashtable including insertion, hashing, traversal, and deletion.

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        System.out.println("Is the table empty? " + table.isEmpty());

        table.put(234, "Aman");
        table.put(222, "Naman");
        table.put(134, "Karan");
        table.put(577, "Raman");

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        table.remove(134);
        System.out.println("\nHash Table after removing a key value pair : ");
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }
        System.out.println("Is the table empty? " + table.isEmpty());
    }
}
