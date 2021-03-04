package org.academiadecodigo.javabank.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleInputScanner;
import org.academiadecodigo.javabank.Controlers.application.Messages;

public class MenuChooseAmount implements View {

    private Prompt prompt;
    private DoubleInputScanner scanner;

    public MenuChooseAmount() {

        prompt = new Prompt(System.in,System.out);
        scanner = new DoubleInputScanner();
        scanner.setMessage(Messages.CHOOSE_AMOUNT);
        scanner.setError(Messages.ERROR_INVALID_AMOUNT);

    }

    @Override
    public Object show() {

       return prompt.getUserInput(scanner);
    }
}
