package hour1;
/*
String comparison is a common source of bugs for novice Java programmers.
 A novice programmer will often attempt to compare strings using the comparison operator ==.
 When used with Strings, the comparison operator == compares object references, not the contents of the object.
 Because of this, two string objects that contain the same string data, but are physically distinct string object instances,
 will not compare as equal when using the comparison operator.

  The equals() method on the String class compares a string’s contents, rather than its object reference.
  This is the preferred string comparison behavior in most string comparison cases
 */

public class StringLessons {
    public static void main(String[] args) {
        String name1 = new String("Timmy");
        String name2 = new String("Timmy");
        if (name1 == name2) {
            System.out.println("The strings are equal.");
        }
        else {
            System.out.println("The strings are not equal.");
        }

        //Lets try the equals()method
        String nameA = new String("Timmy");
        String nameB = new String("Timmy");
        if (nameA.equals(nameB)) {
            System.out.println("The strings are equal.");
        }
        else {
            System.out.println("The strings are not equal.");
        }
    }
}
// Source : https://www.informit.com/articles/article.aspx?p=680309