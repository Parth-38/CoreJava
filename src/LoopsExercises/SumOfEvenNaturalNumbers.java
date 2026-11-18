package LoopsExercises;

import java.util.Scanner;

//Write a C program to display the sum of n terms of even natural numbers.
public class SumOfEvenNaturalNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            int even = 2*i;
            System.out.print(even + " ");
            sum +=even ;
        }
        System.out.println();
        System.out.println(sum);
    }
}
