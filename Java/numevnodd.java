//This program counts the number of even and odd numbers in a given array.

package Java_Samples;
import java.util.Scanner;

public class numevnodd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();
        numofevenandodd(a);
    }

    static void numofevenandodd(int[] a){
        int e=0,o=0;

        for(int i : a){
            if(i%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.println("Number of Even numbers are : "+e+" and Number of Odd numbers are : "+o);
    }
}
