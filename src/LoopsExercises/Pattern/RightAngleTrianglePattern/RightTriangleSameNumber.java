package LoopsExercises.Pattern.RightAngleTrianglePattern;
import java.util.Scanner;

//Write a program in Java to make such a pattern like a right angle triangle with a number which will repeat a number in a row.
public class RightTriangleSameNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i =1 ; i<=row;i++){

            for(int j=1; j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
