package CodeAlphaProject.BankingApplication;

public class Account {
    private String accountNumber;
    private double amount;
    private User user;

    public Account() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account(String accountNumber, double amount, User user) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.user = user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
