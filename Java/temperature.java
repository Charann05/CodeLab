// This program converts a given temperature between Celsius and Fahrenheit.

package Java_Samples;
import java.util.Scanner;

public class temperature {
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Temperature Convertor---");
        System.out.println("1. C->F");
        System.out.println("2. F->C");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        
        switch(n){
            case 1 : System.out.println("Enter the temperature : ");
                     double temp = sc.nextDouble();
                     temp = temp*(9.0/5.0)+32;
                     System.out.printf("F=%.2f\n",temp);
                     break;

            case 2 : System.out.println("Enter the temperature : ");
                     temp = sc.nextDouble();
                     temp = (temp-32)*5.0/9.0;
                     System.out.printf("C=%.2f\n",temp);
                     break;

            default : System.out.println("Invalid Choice!");
        }

        sc.close();
    }
    
}
