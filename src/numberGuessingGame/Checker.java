package numberGuessingGame;

public class Checker {
    public void checkValue() {
        var userNumber = new UserGuess();
        int valueOne = userNumber.userChoice();
        var computerNumber = new RandomNumber();
        int valueTwo = computerNumber.generateNumber();
        while (valueOne != valueTwo) {
            if (valueOne > valueTwo)
                System.out.println("enter smaller number");
            if (valueOne < valueTwo)
                System.out.println("enter bigger number");
            valueOne = userNumber.userChoice();
        }

        System.out.println("Congrats you got the right number");
    }
}
