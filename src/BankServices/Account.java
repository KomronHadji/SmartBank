package BankServices;

import java.util.List;

public class Account {
    public static int counter = 0;
    private String ownerName;
    private int date;
    private double balance;
    private int code;

    public Account() {
    }

    public Account(String ownerName, int date, double balance) {
        this.ownerName = ownerName;
        this.date = date;
        this.balance = balance;
        this.code = ++counter;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCode() {
        return code;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return null;
    }

    public List<Operation> getMovements() {
        return null;
    }

    public List<Deposit> getDeposits() {
        return null;
    }

    public List<Withdrawal> getWithdrawals() {
        return null;
    }

    public void addBalance(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }
}
