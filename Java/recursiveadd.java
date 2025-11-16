//This program gives the sum of digits using "recursion".

package Java_Samples;
import java.util.Scanner;

public class recursiveadd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int sum = readd(num);
        System.out.println("Sum = "+sum);
        sc.close();
    }
    static int readd(int num){
        if(num>=0 && num<10) return num;
        return num%10+readd(num/10);
    }
}
