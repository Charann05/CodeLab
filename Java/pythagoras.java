//This program calculates the hypotenuse of a right-angled triangle using the Pythagorean Theorem.

package Java_Samples;

import java.util.Scanner;

public class pythagoras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a : ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        double hypo = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        System.out.println("Hypotenuse of the triangle is : "+hypo);
        sc.close();
    }
    
}
