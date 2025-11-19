
//A simple calculator program that takes two numbers and an operator, then performs the corresponding arithmetic operation.

package Java_Samples;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.println("                  SIMPLE CALCULATOR");
        System.out.println("========================================================");
        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the operator : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        sc.close();
        System.out.println();

        //System.out.println(a+""+op+""+b);
        switch(op){

            case '+' : System.out.println("Sum : "+(a+b));
                       break;
            
            case '-' : System.out.println("Difference : "+(a-b));
                       break;

            case '*' : System.out.println("Product : "+(a*b));
                       break;
            
            case '/' : 
                       if(b==0){
                        System.out.println("Error : Division by zero is not allowed");
                       }
                       else{
                        System.out.println("Quotient : "+(a/b));
                       }
                       break;
                    
            case '%' :                        
                       if(b==0){
                        System.out.println("Error : Modulus by zero is not allowed");
                       }
                       else{
                        System.out.println("Remainder : "+(a%b));
                       }
                       break;
                    
            default : System.out.println("Invalid Input");
        }
        System.out.println("--------------------------------------------------------");
    }
    
}
