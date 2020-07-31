package loops;

/*
Pseudocode for 'for statement' looks something like the below
Make “count” = 0
For as long as “count” is in the range of 0 to 5
Print “I am in loop number: ” and the value contained in “count” together on a line
Increment “count” by 1
 */

import java.util.Scanner;

public class RepetitionStructuresFor {
    public static void main(String[] args) {
//
//        for (int i=1;i<=5;i++) {
//            System.out.println("I am in loop " + i);
//        }

        //Write a cashier programme that will scan a given number of items and tally the cost

        double total=0; //(total), is called an accumulator where you're basically just continuously adding into another variable.
        System.out.println("How many items did you buy?");
        Scanner scanner = new Scanner(System.in);
       int quantity = scanner.nextInt();

        for (int i = 0;i<quantity;i++){
/*
Now inside of this loop, what are we going to do?

We're going to ask the user for the cost of the item, and then we're going to input that and we're going to add it to our running total.
 */
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();
            total = total + price;
        }
        System.out.println("Your total is "+ "£"+total
        );
    }
}
