//This program tells if the given number is Positive, Negative or Zero.

package Java_Samples;
import java.util.Scanner;

public class sign {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();   //Use long if needed.
        check(n);
        /*if(n>0){
            System.out.println("The number "+n+" is Positive");
        }
        else if(n==0){
            System.out.println("The number is a Zero");
        }
        else{
            System.out.println("The number "+n+" is Negative");
        }*/
        sc.close();
    }
    static void check(int n){
        if(n>0){
            System.out.println("The number "+n+" is Positive");
        }
        else if(n==0){
            System.out.println("The number is a Zero");
        }
        else{
            System.out.println("The number "+n+" is Negative");
        }
    }
    
}
