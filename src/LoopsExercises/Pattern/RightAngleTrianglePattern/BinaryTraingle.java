package LoopsExercises.Pattern.RightAngleTrianglePattern;

import java.util.Scanner;
//Write a program in Java to print Floyd's Triangle.
public class BinaryTraingle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j =1;j<=i;j++){
                // If we add i and j that is row+column , if the sum is even number then 1 should be printed else 0
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();

        }
    }
}
