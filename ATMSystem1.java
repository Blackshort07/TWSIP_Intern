import java.util.*;
public class ATMSystem1{
    private double balance;

    public ATMSystem1(double initialBalance){
        this.balance = initialBalance;
    }
    public void displayOptions(){
        System.out.println("WELCOME TO ATM MACHINE");
        System.out.println("ATM menu:");
        System.out.println("1 : Check Balance");
        System.out.println("2 : Withdraw cash");
        System.out.println("3 : Deposit monry");
        System.out.println("4 : Exit");
    }

    public void checkBalance(){
        System.out.println("Your acount balance is : $" + balance);

    }

    public void withdrawCash(double amount){
        if(amount <= 0) {
         System.out.println("Invalid amount. Please rnter a positive amount.");
        }else if(amount > balance){
            System.out.println("Insufficient funds.");
        }else{
            balance -=amount;
            System.out.println("Withdraw Successful of amount: $" + amount);
            System.out.println("Remaining balance: $" + balance);
        }
    }
    public void depositMoney(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount.please enter a positive amount.");
        }else{
            balance += amount;
            System.out.println("Deposite Successful of amount: $" + amount);
            System.out.println("New balance: $" + balance);
        }
    }
public static void main(String args[]){
    ATMSystem1 atm = new ATMSystem1(10000.0);
    Scanner sc = new Scanner(System.in);

    while(true){
        atm.displayOptions();
        System.out.println("Enter your choice(1-4): ");
        int choice = sc.nextInt();

        switch(choice){
        case 1 :
            atm.checkBalance();
            break;
         case 2 :
            System.out.println("Enter the amount to Withdraw: $ ");
            double withdrawAmount = sc.nextDouble();
            atm.withdrawCash(withdrawAmount);
            break;
         case 3 :
            System.out.println("Enter the amount to Deposite: $");
            double depositAmount =sc.nextDouble();
            atm.depositMoney(depositAmount);
            break;
        case 4 :
            System.out.println("Thank you for using the ATM.");
            sc.close();
            System.exit(0);
        default : 
        System.out.println("Invalid choice.Please select a valid option.");

        }
        }
    }
}
