package hour1;

import java.util.Scanner;

public class MoreStringLessons {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("You don't look like a  " + name);
        if (name.equals("Sade")) {
            System.out.println("..but you're in babay");
        } else {
            System.out.println("Gerrarahere!");
        }
    }
}
