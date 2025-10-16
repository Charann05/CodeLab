// This program counts the number of digits in a given number.

package Java_Samples;
import java.util.Scanner;

public class countnum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n = sc.nextLong();
        sc.close();
        if(n<0)
            n = -n;
        int count = countno(n);
        System.out.println("The count of digits is : "+count);
    }
    static int countno(long n){
        if(n>=0 && n<10){
            //count++;
            //System.out.println("Count of numbers = "+count);
            return 1;
        }
        else{
            //count++;
            //countnum(n/10, count);
            return 1+countno(n/10);
        }
    }
}
