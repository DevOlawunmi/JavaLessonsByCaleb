package hour2;
/*
Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week.
For any of them who make more than 10 sales that week, they get an additional bonus of $250.
 */

import java.util.Scanner;

public class IfStatementTAUTask {
    public static void main(String[] args) {
        int rate = 1000;
        int targetSales = 11;
        int bonus = 250;
        System.out.println("How many sales did you make this week ?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= targetSales) {
            rate = rate + bonus;
            System.out.println("You get paid a bonus, therefore you take home £ " + rate);
        } else {
            int shortage = targetSales - sales;
            if (shortage == 1) {
                System.out.println("Sorry, you did not hit the bonus target, you are " + shortage + " sale short");
            } else {

                System.out.println("Sorry, you did not hit the bonus target, you are " + shortage + " sales short");
            }

        }
    }
}