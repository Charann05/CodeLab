// Program to find the last occurrence of an element in a sorted array using Binary Search.

import java.util.Scanner;

public class BinarySearchLast {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        byte[] array = {1,2,3,4,4,4,5,6,7,8,9};
        System.out.println("Enter the element to be searched : ");
        byte key = sc.nextByte();
        sc.close();

        int lb = 0;
        int ub = array.length - 1;
        int result = -1;

        while(lb <= ub){

            int mid = (lb + ub) / 2;

            if(key == array[mid]){
                result = mid;
                lb = mid + 1;
            }
            else if(key > array[mid]){

                lb = mid + 1;
            }
            else{

                ub = mid - 1;
            }

        }

        if(result != -1)
            System.out.println("Element found at index : "+result);
        
        else
            System.out.println("Element not found!");

    }
}
