package org.academiadecodigo.javabank.domain.account;

public abstract class Account {

    private int id;
    private double balance = 0;

    public Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public abstract AccountType getAccountType();

    public void credit(double amount) {
        if (canCredit(amount)) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (canDebit(amount)) {
            balance -= amount;
        }
    }

    public boolean canCredit(double amount) {
        return amount > 0;
    }

    public boolean canDebit(double amount) {
        return amount > 0 && amount <= balance;
    }

    public boolean canWithdraw() {
        return true;
    }
}
