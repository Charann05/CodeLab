//This program searches for a specific element in a sorted array using the Arrays.binarySearch() method.

package Java_Samples;

import java.util.Arrays;
import java.util.Scanner;

public class arraybi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in sorted order : ");
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the searching element : ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(a, key);

        if(index>=0)
            System.out.println(key +" was found at position : "+index);
        else
            System.out.println("Element not found!");
        sc.close();
    }
    
}
