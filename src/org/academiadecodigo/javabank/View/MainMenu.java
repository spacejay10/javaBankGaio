package org.academiadecodigo.javabank.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.Controlers.application.Messages;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;

public class MainMenu implements View {

    private Prompt prompt;
    private MenuInputScanner mainMenu;

    public MainMenu() {

        prompt = new Prompt(System.in,System.out);
        mainMenu = new MenuInputScanner(UserOptions.getMessages());
        mainMenu.setError(Messages.ERROR_INVALID_OPTION);
        mainMenu.setMessage(Messages.MENU_WELCOME);
    }

    @Override
    public Object show() {

        int userChoice = prompt.getUserInput(mainMenu);

        if (userChoice == UserOptions.QUIT.getOption()) {
            return -1;
        }
        return userChoice;
    }
}
