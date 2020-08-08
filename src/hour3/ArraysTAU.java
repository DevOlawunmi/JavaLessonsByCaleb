package hour3;


import java.util.ArrayList;


public class ArraysTAU {
    private static int[]grades;

    public static void main(String[] args) {
        grades = new int[5];
        grades[0] =12;
        grades[1]=14;
        grades[2]=18;
        grades[3]=19;
        grades[4]=16;
        System.out.println(grades.length);


        System.out.println("Highest grade is " + getHighestGrade());
        System.out.println("Sum is " + getSum());
        System.out.println("Average is "+getAverage());

        //find the highest, lowest and average grade

    }

    public static int getHighestGrade() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;

    }

    public static double getSum() {

        int sum = 0;
        for (int grade : grades){
sum = sum+grade;
    }

        return sum;
}

public static double getAverage(){
return getSum()/grades.length;

}
    }