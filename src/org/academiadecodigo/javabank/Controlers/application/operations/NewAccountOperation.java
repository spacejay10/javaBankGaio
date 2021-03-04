package org.academiadecodigo.javabank.Controlers.application.operations;

import org.academiadecodigo.javabank.Controlers.BankApplication;
import org.academiadecodigo.javabank.Controlers.application.Messages;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;
import org.academiadecodigo.javabank.Model.account.AccountType;

/**
 * A bank operation to create new accounts
 * @see AbstractBankOperation
 * @see UserOptions#OPEN_ACCOUNT
 */
public class NewAccountOperation extends AbstractBankOperation {

    /**
     * Creates a new {@code NewAccountOperation}
     *
     * @see AbstractBankOperation#AbstractBankOperation(BankApplication)
     */
    public NewAccountOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    /**
     * Creates a new bank account
     *
     * @see AbstractBankOperation#execute()
     */
    @Override
    public void execute() {

        int accountId = customer.openAccount(AccountType.CHECKING);

        System.out.println("\n" + Messages.CREATED_ACCOUNT + customer.getName() + " : " + accountId);
    }
}
