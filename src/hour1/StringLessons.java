package hour1;
/*
String comparison is a common source of bugs for novice Java programmers.
 A novice programmer will often attempt to compare strings using the comparison operator ==.
 When used with Strings, the comparison operator == compares object references (ie memory location),
 not the contents of the object ie actual value(works for primitive data types though)
 Because of this, two string objects that contain the same string data, but are physically distinct string object instances,
 will not compare as equal when using the comparison operator

  The equals() method on the String class compares a string’s contents ie exact value, rather than its object reference.
  This is the preferred string comparison behavior in most string comparison cases
 */

import java.util.Scanner;

public class StringLessons {
    public static void main(String[] args) {
        String name1 = new String("Timmy");
        String name2 = new String("Timmy");
        if (name1 == name2) {// this asks if the 2 are exactly the same object
            System.out.println("The strings are equal.");
        }
        else {
            System.out.println("The strings are not equal.");
        }

        //Lets try the equals()method
        String nameA = new String("Timmy");
        String nameB = new String("Timmy");
        if (nameA.equals(nameB)) { // this asks if the 2 have exactly the same value therefore true
            System.out.println("The strings are equal.");
        }
        else {
            System.out.println("The strings are not equal.");
        }
        // Another comparison from Caleb
        String password = "Let me in";
       System.out.println("Enter password");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        scanner.close();
        System.out.println(guess.equals(password));// this evaluates to true or false
    }
}
// Source : https://www.informit.com/articles/article.aspx?p=680309