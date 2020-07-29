package hour2;
/*
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.
 */

import java.util.Scanner;

public class NestedIfStatements {
    public static void main(String[] args) {
        //Initialize what we know
        int minimumPayToQualify = 30000;
        int minimumNoOfYearsAtJob = 2;

        //Get values we don't know
        System.out.println("How much is your current salary?");
        Scanner scanner = new Scanner(System.in);
        int currentPay = scanner.nextInt();
        scanner.close();
        System.out.println("How many years have you worked for the company? ");
        int yearsWorked = scanner.nextInt();
        if (currentPay >= minimumPayToQualify) {
            if (yearsWorked >= minimumNoOfYearsAtJob) {
                System.out.println("You qualify for a loan");
            } else {
                System.out.println("You do not qualify for the loan. Number of years worked is less than required");
            }
        } else {
            System.out.println("You do not qualify due to salary");
        }
    }
}