package LoopsExercises.Pattern;
//Write a program in C to display a pattern like a right angle triangle using an asterisk.
import static java.lang.IO.*;

public class RightAngleTriangle {
    static void main() {
        int row = Integer.parseInt(readln("Enter a number of rows : "));

        for(int i =1 ; i<=row;i++){
            for(int j =1;j<=i;j++){
                print("*");
            }
            println();
        }
    }
}
