package LoopsExercises;

import static java.lang.IO.*;

//Display n numbers and thier Sum as well
public class Q1 {
    void main() {
        int n = Integer.parseInt(readln("Enter a number : "));
        int sum = 0;
        for(int i = 1 ; i<=n;i++){
            print(i +"  ");
            sum += i;
        }
        println();
        println("Sum = " + sum);

    }
}
