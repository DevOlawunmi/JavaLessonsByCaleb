package hour2;
/*
FizzBuzz is a fun game mostly played in elementary school. Print numbers 1-20
 However, if that number is a multiple of 3, print 'fizz' If the number is a multiple of 5, you should print “buzz.”
And if it is a multiple of both, you should print “fizzbuzz.” If you mess up, you’re out, and the game continues without you.
 */

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
        System.out.println("fizz buzz");

            else if (i % 5 == 0) {
                System.out.println("buzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else System.out.println(i);
        }
    }
}
