import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guessNumber = 44;
        int inputNumber;
        boolean repeat = true;

        while (repeat) {
            System.out.print("Guess the number: ");
            inputNumber = scanner.nextInt();

            if (inputNumber == guessNumber) {
                System.out.println("Congratulations! You guessed the right number!");
                repeat = false;
            } 
            else if (inputNumber > guessNumber) {
                System.out.println("Your guess is too high!");
            } 
            else {
                System.out.println("Your guess is too low!");
            }
        }

        System.out.println("Thank you for playing!");
    }
}