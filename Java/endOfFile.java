//This program reads input until EOF and prints each line with its line number.

package Java_Samples;

import java.util.Scanner;

public class endOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println(i + " " + word);
            i++;
        }

        sc.close();
    }
}
