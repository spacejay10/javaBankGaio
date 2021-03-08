package org.academiadecodigo.javabank.Service;

import org.academiadecodigo.javabank.model.account.CheckingAccount;
import org.academiadecodigo.javabank.model.account.SavingsAccount;

/**
 * The possible {@link Account} types
 */
public enum AccountType {

    /**
     * @see CheckingAccount
     */
    CHECKING,

    /**
     * @see SavingsAccount
     */
    SAVINGS
}
