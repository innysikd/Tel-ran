package data;

import java.util.Objects;

public class BankAccount {

    private int account;
    private Person owner;
    private double balance;

    public BankAccount(int account, Person owner, double balance) {
        this.account = account;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getAccount() == that.getAccount() &&
                Double.compare(that.getBalance(), getBalance()) == 0 &&
                Objects.equals(getOwner(), that.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccount(), getOwner(), getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "account " + account +
                ", owner " + owner +
                ", balance " + balance;
    }

    public boolean credit (double sum){
        boolean flag = false;
        if (sum<=balance){
            balance = balance - sum;
            flag = true;
        }
        return flag;
    }

    public void debit (double sum){
        balance += sum;
    }
}
