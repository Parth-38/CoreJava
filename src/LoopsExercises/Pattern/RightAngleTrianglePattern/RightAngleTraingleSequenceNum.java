package LoopsExercises.Pattern.RightAngleTrianglePattern;

import java.util.Scanner;

//Write a program in Java to make such a pattern like a right angle triangle with the number increased by 1.
public class RightAngleTraingleSequenceNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
