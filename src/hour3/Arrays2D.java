package hour3;

public class Arrays2D {
    public static void main(String[] args) {
        // int[][] grades = new int[5][];
        //I'll assign values to this 2d array

        int[][] grades = {
                {67, 78, 90, 88, 99, 76},
                {54, 56, 57, 43, 46, 49, 47, 52},
                {14, 22, 17, 23, 37, 26}
        };
        // System.out.println(grades[2][5]);// output 26
        // System.out.println(grades.length); //output 3
        // System.out.println(grades[1].length); //output 8

        for (int i = 0; i < grades.length; i++) { //the first time, i will be 0 ie the first row
            for (int k = 0; k < grades[i].length; k++) {
                System.out.print(grades[i][k] + " ");
            }
             System.out.println();
        }
    }
}