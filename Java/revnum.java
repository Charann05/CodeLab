//This program reverses a given integer number.

package Java_Samples;

import java.util.Scanner;

public class revnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value : ");
        int n = sc.nextInt();

        int ans = 0;

        while(n>0){
            int rem = n%10;
            n /=10;
            ans = ans*10+rem;
        }
        System.out.println("The reversed Integer value will be : " +ans);
        sc.close();
    }
}
