// Program to perform Linear Search on an array.

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte[] array = {3,2,8,5,6,7,8,8};

        System.out.println("Enter the element to be searched : ");
        byte key = sc.nextByte();
        int i = 0;
        boolean found = false;

        while(i < array.length){

            if(key == array[i]){
                
                System.out.println("Element found at index : "+i);
                found = true;

                break;      //Comment out the break statement to find all occurences.
            }
            
            i++;
        }

        if(!found){
            System.out.println("Element not found!");
        }

        sc.close();
    }
    
}
