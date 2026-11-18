package LoopsExercises;

import java.math.BigInteger;

import static java.lang.IO.*;

//Display Cube of Numbers Up to an Integer
public class Q2 {
    static void main() {
        int n = Integer.parseInt(readln("Enter a number : "));
        for(int i = 1; i<=n; i++){
            println("Number is : " + i + "  && The cube of " + i + " is "+ i*i*i);
        }
        println("-------Thank You--------");
    }
}
