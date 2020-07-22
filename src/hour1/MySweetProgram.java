package hour1;

import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
        int a = 5;
        int y =a+7;
        System.out.println(y);
        int z = y%a;
        System.out.println(z);
    }


}
