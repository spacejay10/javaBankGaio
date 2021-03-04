package org.academiadecodigo.javabank.Controlers.application.operations.transaction;

import org.academiadecodigo.javabank.Controlers.BankApplication;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;
import org.academiadecodigo.javabank.View.MenuAccountNumber;
import org.academiadecodigo.javabank.View.MenuChooseAmount;

/**
 * An account transaction used to withdraw an amount
 * @see AbstractAccountTransactionOperation
 * @see UserOptions#WITHDRAW
 */
public class WithdrawOperation extends AbstractAccountTransactionOperation {

    /**
     * Initializes a new {@code WithdrawOperation}
     *
     * @see AbstractAccountTransactionOperation
     */
    public WithdrawOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    /**
     * Withdraw an amount from an account
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
            accountManager.withdraw(accountId, amount);
        }
    }
}
