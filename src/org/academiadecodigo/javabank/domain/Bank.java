package org.academiadecodigo.javabank.domain;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.javabank.domain.account.Account;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank {

    private AccountManager accountManager;
    private Set<Customer> customers = new HashSet<>();
    private Prompt prompt;

    /**
     * Creates a new instance of Bank and initializes it with the given account manager
     *
     * @param accountManager the account manager
     */

    public Bank(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void start(){
        prompt = new Prompt(System.in,System.out);
        selectOption(menuAccountManager(),accountManager);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        customer.setAccountManager(accountManager);
    }

    public double getBalance() {

        double balance = 0;

        for (Customer customer : customers) {
            balance += customer.getBalance();
        }
        return balance;
    }

    private int menuAccountManager() {
        String[] menu = {

                "Open Account",
                "Deposit",
                "Withdraw",
                "Transfer"
        };
        MenuInputScanner input = new MenuInputScanner(menu);
        return prompt.getUserInput(input);
    }

    private int menuOpenAccount(){
        String[] menu = {
                "Checking account",
                "Savings account",
        };
        MenuInputScanner input = new MenuInputScanner(menu);
        return prompt.getUserInput(input);
    }

    public void selectOption(int option, AccountManager accountManager){

        switch (option){

            case 1:

                int replyNumber = menuOpenAccount();

                if(replyNumber == 1){
                    Account account = accountManager.openAccount(AccountType.CHECKING);
                    System.out.println("you have opened a checking account");
                    System.out.println("your Id is: " + account.getId());
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("back to the main menu");
                }else{
                    Account account = accountManager.openAccount(AccountType.SAVINGS);
                    System.out.println("you have opened a savings account");
                    System.out.println("your Id is: " + account.getId());
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("back to the main menu");
                }
                menuAccountManager();
                break;

            case 2:

                IntegerInputScanner input = new IntegerInputScanner();
                input.setMessage("Please insert your id number");
                int reply = prompt.getUserInput(input);
                for(Customer customer: customers){

                }

            default:
                System.out.println("sorry that is not an option");
        }
    }
}
