//This program sorts a given array using the Arrays class and displays the sorted array.

package Java_Samples;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements : ");
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The unsorted array elements are : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted array elements are : "+Arrays.toString(a));

        sc.close();
    }
    
}
