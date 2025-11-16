//This program sorts the elements of the given array.

package Java_Samples;
import java.util.Scanner;

public class arraydemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
       // for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        //}
        System.out.println("The sorted elements are:");
        for(int i : a)
            System.out.println(i);
        sc.close();
    }
}