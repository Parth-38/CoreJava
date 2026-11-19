package LoopsExercises.Pattern.PyramidPattern;
//Write a C program to make such a pattern like a pyramid with a number which will repeat the number in the same row.

import java.util.Scanner;

public class PyramidPatternforOddAsterisks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
