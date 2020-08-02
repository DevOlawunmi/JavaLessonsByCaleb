package loops;
/*
Just like the While Loop, it's also controlled by a condition.
That condition is tested after the completion of the loop. So, the loop will always run at least once.
So, it's good to use the do while loop when the loop should run at least one time,
and based on the situation, they now need to repeat.
 */


import java.util.Scanner;

public class RepetitionStructuresDoWhile2 {
    public static void main(String[] args) {
//Let's write a program that allows a user to calculate the sum of two numbers as many times as they like to.


        boolean response;
        do {System.out.println("Please enter first number");
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            System.out.println("Please enter second number");
            int number2 = scanner.nextInt();
            int total = number1+number2;
            System.out.println("Total is " + total);
            System.out.println("Do you want to add 2 other numbers?");
            response = scanner.nextBoolean();

        }while (response);
    }
}
