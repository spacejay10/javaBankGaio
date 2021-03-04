package org.academiadecodigo.javabank.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.Controlers.application.Messages;
import java.util.Set;

public class MenuAccountNumber implements View {

    private Prompt prompt;
    private IntegerSetInputScanner scanner;

    public MenuAccountNumber(Set<Integer> set) {

        prompt = new Prompt(System.in,System.out);
        scanner = new IntegerSetInputScanner(set);
        scanner.setMessage(Messages.CHOOSE_ACCOUNT);
        scanner.setError(Messages.ERROR_INVALID_ACCOUNT);

    }

    @Override
    public Object show() {

        return prompt.getUserInput(scanner);
    }
}

