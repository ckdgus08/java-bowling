package bowling.view;

import bowling.domain.Player;

import java.util.Scanner;

public class InputView {

    private static Scanner SCANNER = new Scanner(System.in);

    public String requestPlayerName() {
        return SCANNER.nextLine();
    }

    public int requestScore() {
        return SCANNER.nextInt();
    }
}


