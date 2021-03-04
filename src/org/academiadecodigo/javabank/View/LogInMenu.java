package org.academiadecodigo.javabank.View;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.Controlers.application.Messages;
import java.util.Set;

public class LogInMenu implements View {

    private Prompt prompt;
    private IntegerSetInputScanner scanner;

    public LogInMenu(Set<Integer> set) {

        prompt = new Prompt(System.in,System.out);
        scanner = new IntegerSetInputScanner(set);
        scanner.setMessage(Messages.CHOOSE_CUSTOMER);
        scanner.setError(Messages.ERROR_INVALID_CUSTOMER);

    }

    @Override
    public Object show() {
        return prompt.getUserInput(scanner);
    }
}