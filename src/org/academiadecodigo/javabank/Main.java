package org.academiadecodigo.javabank;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public class Main {
    public static void main(String[] args) {
        AccountManager gaio = new AccountManager();
        Bank bank = new Bank(gaio);
        Customer ana = new Customer();
        Customer bombom = new Customer();
        bank.addCustomer(ana);
        bank.addCustomer(bombom);
        ana.setAccountManager(gaio);
        bombom.setAccountManager(gaio);
        bank.start();
    }
}
