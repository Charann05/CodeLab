//This program prints first n natural numbers.

package Java_Samples;
import java.util.Scanner;

public class natural {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        int n = sc.nextInt();

        System.out.println("---Printing first n natural numbers---");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        sc.close();
    }
    
}
