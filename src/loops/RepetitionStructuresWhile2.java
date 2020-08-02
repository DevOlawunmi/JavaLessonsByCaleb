package loops;
// As long as they keep guessing the wrong password, it will loop


import java.util.Scanner;

public class RepetitionStructuresWhile2 {
    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Please enter password");
        Scanner scanner = new Scanner(System.in);
        String guess =scanner.nextLine();
        while (!(guess.equals(password))){
            System.out.println("Please enter password");
            guess = scanner.nextLine();
        }

        scanner.close();
        System.out.println("You are correct");



    }
}
