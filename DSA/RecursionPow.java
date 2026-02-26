// Computes the power of a number using recursion.

public class RecursionPow {
    public static void main(String[] args) {
        
        System.out.println(pow(2,4));
    }

    public static int pow(int base, int exponent){
        if(exponent < 1)
            return 1;
        return base * pow(base, exponent - 1);
    }
}
