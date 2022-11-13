package numberGuessingGame;

import java.util.Scanner;

public class UserGuess {
    public int userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number from 1 to 100");
        int userInput = scanner.nextInt();
        while (userInput < 1 || userInput > 100) {
            System.out.println("Enter a valid number from 1 to 100");
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}
