//This program calculates the mortgage (EMI) based on principal, interest rate, and loan tenure.

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final byte MONTH_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("===========================================================================================================");
        System.out.println("                                         Mortgage (EMI) Calculator");
        System.out.println("===========================================================================================================");
        System.out.print("Enter the Principal Amount (10K - 100K) : ");
        int principal = sc.nextInt();

        while(principal < 10_000 || principal > 100_000){
            System.out.print("Please enter a valid amount : ");
            principal = sc.nextInt();
        }

        System.out.print("Enter the Annual Interest Rate (3% - 8%) : ");
        float annualInterest = sc.nextFloat();
        while(annualInterest < 3 || annualInterest > 8){
            System.out.print("Please enter a valid interest rate : ");
            annualInterest = sc.nextFloat();
        }

        System.out.print("Enter the Loan Tenure (1year - 30years) : ");
        byte loanTenure = sc.nextByte();
        while(loanTenure < 1 || loanTenure > 30){
            System.out.print("Please enter a valid amount : ");
            loanTenure = sc.nextByte();
        }


        float monthlyInterest = annualInterest / (MONTH_IN_A_YEAR * PERCENT);
        int totalNumberOfPayments = loanTenure * MONTH_IN_A_YEAR;

        double mortgage = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), totalNumberOfPayments))) / ((Math.pow((1 + monthlyInterest), totalNumberOfPayments)) - 1));

        String formattedMortgage = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage : "+formattedMortgage);

        sc.close();
    }
    
}
