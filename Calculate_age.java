import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calculate_age {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        boolean gender;
        short birthdate;

        String genderName;
        short age;
        
        IO.println("Enter your name: ");

        IO.println("Enter your name: ");
        name = input.nextLine();

        IO.println("Enter your gender (true for male, false for female): ");
        gender = input.nextBoolean();

        IO.println("Enter your birthdate (YYYY-MM-DD): ");
        birthdate = input.nextShort();

        IO.println("Name: " + name);
        IO.println("Gender: " + gender);
        IO.println("Birthdate: " + birthdate);

    }
}