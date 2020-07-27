package hour2;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        String password = "Sugar";
        System.out.println("Guess the password: ");
        Scanner scanner = new Scanner(System.in);
        String guess  = scanner.nextLine();
        scanner.close();
        if (guess.equals(password)){
            System.out.println("You are correct!!");
        }
        else {
            System.out.println("Piss off");
        }

    }
}
