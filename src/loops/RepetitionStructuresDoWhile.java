package loops;

import java.util.Scanner;

public class RepetitionStructuresDoWhile {
    public static void main(String[] args) {
        String password = "Greatness";
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Please enter your password");

            input = scanner.nextLine();

        } while (!(password.equals(input)));
        scanner.close();


        System.out.println("Password correct");


    }
}
