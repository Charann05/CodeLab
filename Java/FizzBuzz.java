//This program prints Fizz, Buzz, or FizzBuzz based on the input number.

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        byte number = sc.nextByte();

        // String result = (number%5 == 0) && (number%3 == 0) ? "FizzBuzz" : 
        //                 ((number%5 == 0) ? "Fizz" : 
        //                 ((number%3 == 0)? "Buzz" : String.valueOf(number)));

        // System.out.println(result);

        if (number % 15 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        sc.close();
    }
    
}
