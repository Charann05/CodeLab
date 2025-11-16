//This program generates the factorial of a given number (0-19).

package Java_Samples;
import java.util.Scanner;

public class fact {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int fact = 1;
        sc.close();

        if(n<0){
            System.out.println("Not Defined!");
        }
        else if(n>19){
            System.out.println("Out of Range!");
        }

        /*if(n==1 || n==0){
            System.out.println("The factorial of "+n+" is "+fact);
        }*/

        else{

            for(int i=1;i<=n;i++){
                fact *= i;
            }
            System.out.println("The factorial of "+n+" is "+fact);

        }
    }
    
}
