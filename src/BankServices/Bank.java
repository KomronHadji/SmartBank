package BankServices;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private int accountCount;

    private List<Account> accountList = new ArrayList<>();
    private List<Deposit> depositList = new ArrayList<>();
    private List<Withdrawal> withdrawalList = new ArrayList<>();


    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int createAccount(String name, int date, double initial) {
//        if (accountList == null) {
//            accountList = new ArrayList<>();
//        }

        Account account = new Account(name, date, initial);
        accountList.add(account);
        Deposit deposit = new Deposit(account, date, initial);
        depositList.add(deposit);
        return accountCount;

//        return accountList.size();
    }

    public Account deleteAccount(int code, int date) throws InvalidCode {
        Account account = getAccount(code);
        if (getAccount(code) == null) {
            System.err.println("Please enter correct Code");
            return null;
        }
        account.withdraw(account.getBalance());
//        accountList.remove(account);
        return account;
    }

    public Account getAccount(int code) throws InvalidCode {
//        InvalidCode InvalidCode;
        if (code < 1) {
            System.err.println("Invalid Code");
            return null;
        }
        for (Account account : accountList) {
            if (account.getCode() == code)
                return account;
        }
        return null;
    }

    public void deposit(int code, int date, double value) throws InvalidCode {
        Account account = getAccount(code);
        if (account == null) {
            System.err.println("Account not found");
            return;
        }
        Deposit deposit = new Deposit(account, date, value);
        account.addBalance(value);
        depositList.add(deposit);
    }

    public void withdraw(int code, int date, double value) throws InvalidCode, InvalidValue {
        Account account = getAccount(code);
        if (getAccount(code) == null) {
            System.err.println("Account not found");
            return;
        }
        Withdrawal withdrawal = new Withdrawal(getAccount(code), date, value);
        account.withdraw(value);
        withdrawalList.add(withdrawal);

    }

    public void transfer(int fromCode, int toCode, int date, double value) throws InvalidCode, InvalidValue {
        Account account = getAccount(fromCode);
        Account account1 = getAccount(toCode);
        if (getAccount(fromCode) == null || getAccount(toCode) == null) {
            System.err.println("Accounts are not found");
            return;
        }
        Withdrawal withdrawal = new Withdrawal(getAccount(fromCode), date, value);
        account.withdraw(value);
        withdrawalList.add(withdrawal);
        Deposit deposit = new Deposit(getAccount(toCode), date, value);
        account1.addBalance(value);
        depositList.add(deposit);

    }

    public double getTotalDeposit() {

        return 0.0;
    }

    public List<Account> getAccounts() {
        return null;
    }


    public List<Account> getZeroAccounts() {
        return null;
    }

    public List<Account> getAccountsByBalance(double low, double high) {
        return null;
    }

    public long getNumberHigher(double min) {
        return 0;
    }
}
