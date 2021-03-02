package org.academiadecodigo.javabank.domain.account;


public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 100;

    public SavingsAccount(int id) {
        super(id);
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }

    @Override
    public boolean canDebit(double amount) {
        return super.canDebit(amount) && (getBalance() - amount) >= MIN_BALANCE;
    }

    @Override
    public boolean canWithdraw() {
        return false;
    }
}
