package loops;

import java.util.Scanner;

public class RepetitionStructuresDoWhile {
    public static void main(String[] args) {
        String password = "Greatness";
        String input;
        do {
            System.out.println("Please enter your password");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

        } while (!(password.equals(input)));


        System.out.println("Password correct");


    }
}
