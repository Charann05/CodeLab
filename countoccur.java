//This program counts the number of occurrences of a digit in a given number.

package Java_Samples;
import java.util.Scanner;

public class countoccur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        System.out.println("Enter the digit to check its occurrence :");
        int occur = sc.nextInt();
        
        int count = 0;
        int temp = n;

        while(n>0){
            int rem = n%10;

            if(rem == occur){
                count++;
            }
            n/=10;
        }
        System.out.println("\nIn the number " + temp + ":");
        System.out.println("The digit " + occur + " appears " + count + " time(s).");
        sc.close();
    }
    
}
