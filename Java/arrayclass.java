//This program demonstrates copying arrays using Arrays.copyOf() and Arrays.copyOfRange().


package Java_Samples;
import java.util.Arrays;
import java.util.Scanner;

public class arrayclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n =sc.nextInt();

        System.out.println("Enter the Array elements : ");
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int[] b = new int[a.length];

        System.out.println("Array b before copying from a :");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        b = Arrays.copyOf(a,a.length);
        System.out.println("Array b after copying from a :");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        int[] c = Arrays.copyOfRange(a,0,2);
        System.out.println("Array c (copied range 0 to 2) :");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    
}
