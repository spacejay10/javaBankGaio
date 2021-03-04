package org.academiadecodigo.javabank.Model.account;

/**
 * A factory for creating accounts of different types
 */
public class AccountFactory {

    private int nextAccountId = 1;

    /**
     * Gets the next account id
     *
     * @return the next account id
     */
    private int getNextId() {
        return nextAccountId++;
    }

    /**
     * Creates a new {@link Account}
     *
     * @param accountType the account type
     * @return the new account
     */
    public Account createAccount(AccountType accountType) {

        Account newAccount;
        switch (accountType) {
            case CHECKING:
                newAccount = new CheckingAccount(getNextId());
                break;
            case SAVINGS:
                newAccount = new SavingsAccount(getNextId());
                break;
            default:
                newAccount = null;

        }

        return newAccount;
    }
}
