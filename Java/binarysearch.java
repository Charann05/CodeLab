//This program performs binary search on the given array.

package Java_Samples;
import java.util.Scanner;

public class binarysearch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a[] = {10,9,8,7,4,3,2};
        int ub = 6;
        int lb = 0;
        System.out.println ("Enter the element to search:");
        int key = sc.nextInt();
        sc.close();
        while(lb <= ub){
            int mid = (ub+lb)/2;
            if(key == a[mid]){ 
                System.out.println("Element found at index:"+ mid); 
                return;
            }
            else if(key < a[mid]){
                lb = mid+1;
            }
            else{
                ub = mid-1;
            }
        }
        System.out.println("Element not found!");
        sc.close();
    }
}

