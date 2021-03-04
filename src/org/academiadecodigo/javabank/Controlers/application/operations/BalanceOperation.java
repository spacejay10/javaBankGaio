package org.academiadecodigo.javabank.Controlers.application.operations;

import org.academiadecodigo.javabank.Controlers.BankApplication;
import org.academiadecodigo.javabank.Controlers.application.Messages;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;
import org.academiadecodigo.javabank.Model.account.Account;
import java.text.DecimalFormat;
import java.util.Set;

/**
 * A bank operation to check the balance
 * @see AbstractBankOperation
 * @see UserOptions#GET_BALANCE
 */
public class BalanceOperation extends AbstractBankOperation {

    private DecimalFormat df = new DecimalFormat("#.##");

    public BalanceOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    @Override
    public void execute() {

        System.out.println("\n" + customer.getName() + Messages.BALANCE_MESSAGE + "\n");

        Set<Account> accounts = customer.getAccounts();
        for (Account account : accounts) {
            System.out.println(account.getId() + "\t" + account.getAccountType() + "\t" + df.format(account.getBalance()));
        }

        System.out.println("\n\n" + Messages.BALANCE_TOTAL_MESSAGE + df.format(customer.getBalance()));
    }
}
