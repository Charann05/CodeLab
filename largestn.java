//This program gives the largest and second largest element of the given array.

package Java_Samples;
import java.util.Scanner;

public class largestn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = sc.nextInt();
        int FL = ar[0];
        int SL = 0;
        for(int i=1;i<n;i++){
            if(ar[i]>FL){
                SL = FL;
                FL = ar[i];
            }
            else if(ar[i]>SL && ar[i]<FL)
                SL = ar[i];
        }
        System.out.println("The Elements are:");
        for(int i=0;i<n;i++)
            System.out.println(ar[i]);
        System.out.println("Largest Element is "+FL);
        if(SL != 0)
            System.out.println("Second Largest Element is "+SL);
        else
            System.out.println("All elements are same | No second largest");
        sc.close();
    }
    
}
