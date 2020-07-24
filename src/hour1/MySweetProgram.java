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
        // the % gives the remainder value
        int z = y%a;
        System.out.println(z);
        //valueOf takes a string value and converts it to an integer value
        String money  ="300";
        System.out.println(Integer.valueOf(money));//returns an object Integer
        System.out.println(Integer.parseInt(money));//returns a primitive int

        //working with individual characters of a string
        String boo = "gorgeous";
        System.out.println(boo.charAt(0));
        System.out.println(boo.indexOf('g'));

        // \n gets rendered as a new line
        String eg = "Semilore\n\n\nOlorun";
        System.out.println(eg);
        // \' inserts single quotes
        // \" inserts double quotes

    }


}
