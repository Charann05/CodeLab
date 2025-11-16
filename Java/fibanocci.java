//This program calculates the nth Fibonacci number using an iterative approach.

package Java_Samples;
import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth element : ");
        int n = sc.nextInt();
        sc.close();

        if(n==0){
            System.out.println("0th element is 0");
            return;
        }
        if(n==1){
            System.out.println("1th element is 1");
            return;
        }

        int p = 0;
        int c = 1;

        for(int i=2;i<=n;i++){
            c += p;
            p = c-p;
        }

        System.out.println(n+"th element is "+c);
    }
}
