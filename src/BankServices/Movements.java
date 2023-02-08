package BankServices;

public class Movements {
    private Deposit deposit;
    private Withdrawal withdrawal;

    public Movements(Deposit deposit) {
        this.deposit = deposit;
    }

    public Movements(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public int getDate() {
        return deposit != null ? deposit.getDate() : withdrawal.getDate();
    }

    public double getAmount() {
        if (deposit == null) {
            return withdrawal.getAmount();
        } else return deposit.getAmount();
    }

    @Override
    public String toString() {
        return
                "Deposit=" + deposit +
                        ", withdrawal=" + withdrawal;
    }
}
