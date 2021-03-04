package org.academiadecodigo.javabank.Controlers;

import org.academiadecodigo.javabank.Controlers.application.UserOptions;
import org.academiadecodigo.javabank.Controlers.application.operations.BalanceOperation;
import org.academiadecodigo.javabank.Controlers.application.operations.NewAccountOperation;
import org.academiadecodigo.javabank.Controlers.application.operations.Operation;
import org.academiadecodigo.javabank.Controlers.application.operations.transaction.DepositOperation;
import org.academiadecodigo.javabank.Controlers.application.operations.transaction.WithdrawOperation;
import org.academiadecodigo.javabank.Model.Bank;
import org.academiadecodigo.javabank.View.LogInMenu;
import org.academiadecodigo.javabank.View.MainMenu;
import org.academiadecodigo.javabank.View.MenuAccountNumber;
import org.academiadecodigo.javabank.View.MenuChooseAmount;
import java.util.HashMap;
import java.util.Map;

public class BankApplication {

    private Map<Integer, Operation> operationsMap;
    private final Bank bank;
    private int accessingCustomerId;
    private LogInMenu logInMenu;
    private MainMenu mainMenu;
    private MenuAccountNumber menuAccountNumber;
    private MenuChooseAmount menuChooseAmount;

    public BankApplication(Bank bank) {
        this.bank = bank;
    }

    public void start() {

        accessingCustomerId = (int) new LogInMenu(bank.getCustomerIds()).show();
        mainMenu = new MainMenu();
        mainMenu.show();
        menuAccountNumber = new MenuAccountNumber();
        menuChooseAmount = new MenuChooseAmount();

        mainMenu.show();

        operationsMap = buildOperationsMap();
        menuLoop();

    }

    public Bank getBank() {
        return bank;
    }

    public int getAccessingCustomerId() {
        return accessingCustomerId;
    }

    private void menuLoop() {

        int userChoice = prompt.getUserInput(mainMenu);
        if (userChoice == UserOptions.QUIT.getOption()) {
            return;
        }
        operationsMap.get(userChoice).execute();
        menuLoop();
    }

    private Map<Integer, Operation> buildOperationsMap() {

        Map<Integer, Operation> map = new HashMap<>();
        map.put(UserOptions.GET_BALANCE.getOption(), new BalanceOperation(this));
        map.put(UserOptions.DEPOSIT.getOption(), new DepositOperation(this));
        map.put(UserOptions.WITHDRAW.getOption(), new WithdrawOperation(this));
        map.put(UserOptions.OPEN_ACCOUNT.getOption(), new NewAccountOperation(this));

        return map;
    }
}