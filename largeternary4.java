//This program gives the largest element in the given array using "Ternary(Conditional)operator".

package Java_Samples;
import java.util.Scanner;

public class largeternary4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //System.out.println(a+" "+b+" "+c+" "+d);
        /*int e = a>b?a:b;
        int f = e>c?e:c;
        int g = f>d?f:d;*/

        int g = a>b&&a>c&&a>d?a:
        b>c&&b>d?b:
        c>d?c:d;
        System.out.println("Largest Number is "+ g);
        sc.close();
    }
    
}
