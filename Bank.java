package CodeAlphaProject.BankingApplication;


import CodeAlphaProject.BankingApplication.Enum.BankStatus;
import OOPs1.ConstructorChaining.src.A;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Account> accounts;
    private BankStatus bankStatus;


    public Bank() {
        accounts = new ArrayList<>();
    }

    public Bank(String bankName, List<Account> accounts, BankStatus bankStatus) {
        this.bankName = bankName;
        this.accounts = accounts;
        this.bankStatus = bankStatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public BankStatus getBankStatus() {
        return bankStatus;
    }

    public void setBankStatus(BankStatus bankStatus) {
        this.bankStatus = bankStatus;
    }

    public void deposite(double amount, String accountNumber){
        int a = accountNumber.charAt(accountNumber.length()-1) - '0';
        Account account = accounts.get(a);
        account.setAmount(account.getAmount() + amount);
        System.out.println("Amount deposited : " + amount);
        System.out.println("Current balance : "+account.getAmount());
    }

    public void withdraw(double amount, String accountNumber){
        int a = accountNumber.charAt(accountNumber.length()-1) - '0';
        Account account = accounts.get(a);
        double cash = account.getAmount();
        if(cash - amount <= 200){
            System.out.println("Amount cannot be withdrawed");
            return;
        }
        System.out.println("Withdrawed amount : " + amount);
        account.setAmount(account.getAmount()-amount);
        System.out.println("Current balance : "+account.getAmount());
    }

    public void checkBalance(String accountNumber){
        int a = accountNumber.charAt(accountNumber.length()-1) - '0';
        Account account = accounts.get(a);
        System.out.println("Current balance : "+account.getAmount());
    }
}
