
import java.util.Scanner;

// Part 1: Write a Java program that will accept a matrix of integers then this matrix will be printed out and
//sum of values and average of values are printed also.
public class Part1 {

    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm[" + i + "][" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted: ");
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }

        //Task 2: get sum of values
        int sum = 0;
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        // Task 3: het average of values
        System.out.println("Average: " + (float) sum / (rows * cols));
    }
}
