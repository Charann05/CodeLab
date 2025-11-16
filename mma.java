//This program takes three numbers as input and calculates their maximum, minimum, and average using the Math class.

package Java_Samples;

import java.util.Scanner;

public class mma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int f = sc.nextInt();
        System.out.println("Enter second number : ");
        int s = sc.nextInt();
        System.out.println("Enter third number : ");
        int t = sc.nextInt();

        int max = Math.max(t, Math.max(f, s));
        int min = Math.min(t,Math.min(f, s));
        double avg = (f+s+t)/3.0;

        System.out.println("Maximum value : "+max);
        System.out.println("Minimum value : "+min);
        System.out.println("Average value :"+avg);
        sc.close();

    }
    
}
