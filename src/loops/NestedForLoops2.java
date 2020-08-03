package loops;

public class NestedForLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++)
                if (i == 7) {
                    System.out.println("We're in "+ i);
                    System.out.println("The current value of i is " + i + " J is currently " + j);
                }
            else System.out.println("The current value of i is " + i + " J is currently " + j);
        }
    }
}