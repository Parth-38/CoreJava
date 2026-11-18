package LoopsExercises;

import java.util.Scanner;

//Write a Java program to calculate the factorial of a given number.
public class FactorialCalculation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i =1;i<=num;i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+num +" is : "+factorial);
    }

}
