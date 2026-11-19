package LoopsExercises.Pattern.PyramidPattern;

import java.util.Scanner;

//Write a program in Java to make a pyramid pattern with numbers increased by 1.
public class PyramidPatternIncreasingNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        int org = rows;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                //This loop is for spaces. a=n-1 for first, b= a-1, c=b-1..........and so on
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
