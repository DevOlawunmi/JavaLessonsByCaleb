package hour2;
/*
Switch statements are good if there is a discrete number of values to choose from.
Not as broad as if statements
The switch statement solves a problem in the same way that the if-else-if does.
So, it's ideal for cases when you have more than two paths.
The difference between the if-else-if and the switch statements is that the if-else-if checks the condition to be true;
 whereas the switch statement checks for equality.
 */

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        String message;
        
        switch (name){
            case "Caleb":
                message = "My darling son";
                break;
            case "Claudia":
                message = "My beautiful daughter";
                break;
            case "Cody":
                message = "Introduce yourself sir";
                break;
            default: message = "Who are you, please?";
        }
        System.out.println(message);

    }

}
