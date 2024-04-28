package CodeAlphaProject.BankingApplication;

import CodeAlphaProject.BankingApplication.Enum.BankStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank  bank = new Bank();
        bank.setBankName("Hindutva Bank pvt. ltd.");
        bank.setBankStatus(BankStatus.OPEN);
        List<Account> accounts = new ArrayList<>();

        int i=0;
        Account account = new Account();
        account.setAccountNumber("XY1311"+ i++);
        account.setAmount(45000.50);

        User user = new User();
        user.setName("Pankaj");

        account.setUser(user);
        accounts.add(account);

        bank.setAccounts(accounts);

        System.out.println("Welcome to " + bank.getBankName());
        System.out.println("Name: " + account.getUser().getName() + "\nAccount Number: " + account.getAccountNumber());
        boolean isExit = false;
        do {
            System.out.println("Enter the option below: \n1) Deposite \n2) Withdraw Amount \n3) Check Balance \n4) Exit");
            int option = sc.nextInt();
            if(option == 1) {
                System.out.println("Enter amount : ");
                double amount = sc.nextDouble();
                bank.deposite(amount, account.getAccountNumber());
            }
            else if (option == 2) {
                System.out.println("Enter amount : ");
                double amount = sc.nextDouble();
                bank.withdraw(amount,account.getAccountNumber());
            }
            else if(option == 3){
                bank.checkBalance(account.getAccountNumber());
            }
            else {
                isExit = true;
            }
        }while(isExit == false);
        System.out.println("Thank you!");
    }
}
