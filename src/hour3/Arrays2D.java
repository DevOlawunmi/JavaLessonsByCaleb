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

        for (int row = 0; row < grades.length; row++) { //the first time, row will be 0 ie the first row
            for (int column = 0; column < grades[row].length; column++) {
                System.out.print(grades[row][column] + " ");
            }
            System.out.println();
        }
        for (int[] grade : grades) { //the first time, row will be 0 ie the first row
            for (int i : grade) {
                System.out.print(i + " ");
            }
        }
    }
}