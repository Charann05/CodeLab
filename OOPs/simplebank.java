package Java_Samples.OOPS;

import java.util.Scanner;

class Bank{
    int accno;
    String accname;
    double accbalance;
    public void deposit(int amt){
        accbalance += amt;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Amount successfully deposited");
    }

    public void withdraw(int amt){
        if(amt<=accbalance){
            accbalance -= amt;
            System.out.println("-----------------------------------------------------------");
            System.out.println("Amount successfully withdrawn");
        }
        else{
            System.out.println("-----------------------------------------------------------");
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayDetails(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Account number : "+accno+"\nAccount holder : "+accname+"\nBalance : "+accbalance);
        System.out.println("-----------------------------------------------------------");
    }

    public void displayBalance(){
        System.out.println("Your current balance is : "+accbalance);
        System.out.println("-----------------------------------------------------------");
    }

    Bank(int no, String name, double bala){
        this.accno = no;
        this.accname = name;
        this.accbalance = bala;
    }
}
public class simplebank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank(1, "Aman", 60000);
        Bank b2 = new Bank(2, "John", 80000);

        System.out.println("---Simple Bank---");
        
        System.out.println("Enter the Account number : ");
        while(true){

            int no = sc.nextInt();
            if(no<1 || no > 2){
                System.out.println("Account not found!\nPlease enter a valid Account number : ");
            }
            else{
                Bank current = (no==1)?b1:b2;
                boolean exit = false;
                while(!exit){
                System.out.println("Choose any one among the following operations :");
                System.out.println("1.Account details");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Withdraw Amount");
                System.out.println("4.Exit");
                System.out.println("Enter your choice : ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        current.displayDetails();
                        break;
                    
                    case 2:
                        System.out.println("Enter the amount to deposit : ");
                        int amt = sc.nextInt();
                        if(amt>0){
                            current.deposit(amt);
                            current.displayBalance();
                        }
                        else{
                            System.out.println("Invalid Amount!");
                        }
                        break;

                    case 3:
                        
                        System.out.println("Enter the amount to withdraw : ");
                        int wamt = sc.nextInt();
                        if(wamt>0){
                            current.withdraw(wamt);
                            current.displayBalance();
                        }
                        else{
                            System.out.println("Invalid Amount!");
                        }
                        break;

                    case 4:
                        exit = true;
                        break;

                    default:
                        System.out.println("Please enter a valid choice : ");
                }
            }
            }
            break;
        }
        sc.close();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Thanks for using");
        System.out.println("-----------------------------------------------------------");
    }   
    
}
