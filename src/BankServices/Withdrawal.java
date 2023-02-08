package BankServices;

public class Withdrawal {
    private static int withdrawCounter = 0;
    private Account account;
    private int date;
    private double amount;
    private int id;

    public Withdrawal(Account account, int date, double amount) {
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.id = ++withdrawCounter;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
