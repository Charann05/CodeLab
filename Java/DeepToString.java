//This program prints a 2D array using Arrays.deepToString().

import java.util.Arrays;

public class DeepToString {
    
    public static void main(String[] args) {
        
        int[][] numbers = {{1,2,3}, {4,5,6}};

        System.out.println(Arrays.deepToString(numbers));
    }
}
