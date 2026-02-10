// Program to search an element in a sorted array using Binary Search.

import java.util.Scanner;

public class BinarySearchFirst {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        byte[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the element to be searched : ");
        byte key = sc.nextByte();
        sc.close();

        int lb = 0;
        int ub = array.length - 1;

        while(lb <= ub){

            int mid = (lb + ub) / 2;

            if(key == array[mid]){
                System.out.println("Element found at index : "+mid);
                return;
            }
            else if(key > array[mid]){

                lb = mid + 1;
            }
            else{

                ub = mid - 1;
            }

        }

        System.out.println("Element not found!");

    }
}
