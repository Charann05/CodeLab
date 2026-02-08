//This program formats numbers as currency and percentage using NumberFormat.

import java.text.NumberFormat;

public class FormatNumber {

    public static void main(String[] args) {
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345);
        System.out.println("12345 in Dollars : "+result);
        
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result1 = percentage.format(0.1);
        System.out.println("Percentage of 0.1 : "+result1);
    }
    
}
