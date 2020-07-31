package loops;
/*
Repetition Structures - Loops

Loops are structures that cause a block of code to repeat.
Each store employee makes £15 an hour. Write a programme that allows a manager to calculate number of hours an employee works
and calculate their pay. Do not allow for overtime.
We'll need to calculate the salary for employees based on how many hours they have worked.
This one says our program cannot allow for overtime, which means we need to validate the input, hence the while loop
As long as they are entering an invalid no of hours, it wil loop.


While loop is ICU. Initialization, comparison, update.
 */

import java.util.Scanner;

public class RepetitionStructuresWhile {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("Please enter no of hours worked");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        while (hoursWorked>maxHours){
            System.out.println("Overtime not paid for, please enter 40 or less");
            hoursWorked = scanner.nextDouble();

        }
scanner.close();
        double pay = hoursWorked*rate;
        System.out.println("Your pay is " + pay);

    }
}
