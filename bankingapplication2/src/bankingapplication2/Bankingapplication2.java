package bankingapplication2;

import java.util.Random;
import java.util.Scanner;

public class Bankingapplication2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("My Bank");
        Account account = null;
        int option = 0, accountNumber;   
        String accountName;
        double amount, balance = 0;
        
        while(option != 6) {     
        System.out.println("Main Menu");
        System.out.println("1. Display All Accounts");
        System.out.println("2. Open New Account");
        System.out.println("3. Close Existing Account");
        System.out.println("4. Deposit");
        System.out.println("5. Withdrawt");
        System.out.println("6. Open New Account");
        System.out.println();
        
        System.out.print("Enter your choice: ");
        option = scan.nextInt();
        
        switch(option){
            case 1:
                bank.listAccounts();
                break;
            case 2:
                System.out.print("Enter your choice: ");
                accountNumber = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter your choice: ");
                accountName = scan.nextLine();
                System.out.print("Enter Initial Balance: ");
                balance = scan.nextDouble();
                bank.openAccount(accountNumber, accountName,balance);
                break;
            case 3:
                System.out.print("Enter your choice: ");
                accountNumber = scan.nextInt();
                bank.closeAccount(accountNumber);
                break;
            case 4:
                System.out.print("Enter Account Number: ");
                accountNumber = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Amount: ");
                amount = scan.nextDouble();
                bank.depositMoney(accountNumber, amount);
                break;
            case 5:
                System.out.print("Enter Account Number: ");
                accountNumber = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Amount: ");
                amount = scan.nextDouble();
                bank.withdrawMoney(accountNumber, amount);  
                break;
        }
        
        System.out.println();
        
        }
        
        
    }
    
    public int generateNumber(){
        Random rand = new Random();
        int accNumber = 100000 + rand.nextInt(900000);
        return accNumber;
    }
}