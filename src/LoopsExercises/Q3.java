package LoopsExercises;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.math.MathContext;

import static java.lang.IO.*;

//Write a java program to display the n terms of odd natural numbers and their sum.
public class Q3 {
    static void main() {
        int n = Integer.parseInt(readln("Enter a nth term : "));
        int sum = 0;

        for (int i = 1; i<=n;i++){
            int odd = 2 * i - 1 ;
            print(odd +" , ");
            sum += odd;
        }
        println();
        println("Sum of "+ n + "th term is : "+sum);

    }

}
