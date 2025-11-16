//This program demonstrates String operations in Java.

package Java_Samples;

import java.util.Arrays;

public class stringdemo {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "WORLD";
        String str3 = "world";
        String str4 = "Hello World !";

        System.out.println("Length of str1 : "+str1.length());
        System.out.println("Concatenating Strings : "+str1+" "+str2);
        System.out.println("Converting str2 to lowercase : "+str2.toLowerCase());
        System.out.println("Converting str1 ro uppercase : "+str1.toUpperCase());
        System.out.println("Comparing str2 and str3 : "+str2.equals(str3));
        System.out.println("Comparing str2 and str3 : "+str2.equalsIgnoreCase(str3));
        System.out.println("Substring : "+str1.substring(0,3));
        System.out.println("Index of 'll' in str1 : "+str1.indexOf("ll"));
        System.out.println("Last index of 'l' in str1 : "+str1.lastIndexOf("l"));
        System.out.println("Replacing 'R' with 'U' in str2 : "+str2.replace('R','U'));
        System.out.println("Checking if str4 starts with 'Hello' : "+str4.startsWith("Hello"));
        System.out.println("Check if str4 ends with 'World' : "+str4.endsWith(str3));
        System.out.println("str1 Compare to str2 : "+str1.compareTo(str2));
        String[] s = str4.split("o");
        System.out.println(Arrays.toString(s)); //Converts array into readable string.
    }
}
