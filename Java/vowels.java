//This program displays the number of vowels and consonants in the given string.

package Java_Samples;
import java.util.Scanner;

public class vowels {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        s = s.toLowerCase();
        //System.out.println(s);

        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){           //This ensures the program doesn't count any kind of symbols or digits as consonants.

                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    v++;
                }
                else{
                    c++;
                }
            }
        }

        System.out.println("Number of Vowels are : "+v+" and number of Consonants are : "+c);
        sc.close();
    }
    
}
