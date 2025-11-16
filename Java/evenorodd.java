//This program tells if the given number is Even or Odd.

package Java_Samples;
import java.util.Scanner;

public class evenorodd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
        sc.close();
    }
    
}
