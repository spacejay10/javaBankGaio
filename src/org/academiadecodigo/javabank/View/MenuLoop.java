package org.academiadecodigo.javabank.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.Controlers.application.UserOptions;

public class MenuLoop implements View {

    private Prompt prompt;

    public MenuLoop() {

    }

    @Override
    public void PromptBuilder() {
        prompt = new Prompt(System.in,System.out);
    }

    @Override
    public Object show() {

        int userChoice = prompt.getUserInput(mainMenu);
        if (userChoice == UserOptions.QUIT.getOption()) {
            return;
        }
        operationsMap.get(userChoice).execute();
        menuLoop()
    }
}
