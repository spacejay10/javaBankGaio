package org.academiadecodigo.javabank.Controlers.application.operations.transaction;

import org.academiadecodigo.javabank.Controlers.BankApplication;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;
import org.academiadecodigo.javabank.View.MenuAccountNumber;
import org.academiadecodigo.javabank.View.MenuChooseAmount;

/**
 * An account transaction used to deposit an amount
 * @see AbstractAccountTransactionOperation
 * @see UserOptions#DEPOSIT
 */
public class DepositOperation extends AbstractAccountTransactionOperation {

    /**
     * Initializes a new {@code DepositOperation}
     *
     * @see AbstractAccountTransactionOperation
     */
    public DepositOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    /**
     * Deposit an amount into an account
     *
     * @see AbstractAccountTransactionOperation#execute()
     */
    @Override
    public void execute() {

        super.execute();

        if (!hasAccounts()) {
            return;
        }

        Integer accountId = MenuAccountNumber();
        Double amount = MenuChooseAmount();

        if (customer.getAccountIds().contains(accountId)) {
            accountManager.deposit(accountId, amount);
        }
    }
}
