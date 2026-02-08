//This program demonstrates the difference between printing an array directly and printing it using Arrays.toString().

import java.util.Arrays;

public class ToString {

    public static void main(String [] agrs){

        int[] numbers = {2, 4, 3, 4, 5};

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
