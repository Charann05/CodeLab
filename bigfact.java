//This program generates the factorial of a given number.

package Java_Samples;
import java.util.Scanner;
import java.math.BigInteger;

public class bigfact {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        sc.close();

        BigInteger fact = BigInteger.ONE;

        if(n<0){
            System.out.println("Not Defined!");
        }
        else{
            for(int i=1;i<=n;i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println("The factorial of "+n+" is "+fact);
        }
    }
}
