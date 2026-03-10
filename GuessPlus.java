import java.util.Random;
import java.util.Scanner;

public class GuessPlus {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNumber = rand.nextInt(100) + 1; // สุ่มเลข 1-100
        int inputNumber;
        boolean repeat = true;
        int count = 0;

        while (repeat) {
            System.out.print("Guess the number: ");
            inputNumber = scanner.nextInt();
            count++;

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
        System.out.println("You guessed the number in " + count + " attempts.");
    }
}