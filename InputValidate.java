import java.util.Scanner;

public class InputValidate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (age < 0 || age > 150) {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Valid age entered: " + age);
    }
}
