package org.academiadecodigo.javabank;

import org.academiadecodigo.javabank.Controlers.BankApplication;
import org.academiadecodigo.javabank.Model.Bank;
import org.academiadecodigo.javabank.Model.Customer;
import org.academiadecodigo.javabank.Controlers.AccountManager;

public class App {

    public static void main(String[] args) {

        Bank bank = new Bank();
        AccountManager accountManager = new AccountManager();
        bank.setAccountManager(accountManager);

        Customer c1 = new Customer(1, "Rui");
        Customer c2 = new Customer(2, "Sergio");
        Customer c3 = new Customer(3, "Bruno");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        BankApplication bankApplication = new BankApplication(bank);
        bankApplication.start();
    }
}
