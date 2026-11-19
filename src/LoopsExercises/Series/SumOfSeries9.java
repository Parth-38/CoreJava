package LoopsExercises.Series;

import java.util.Scanner;

//Write a program in to Java display the sum of the series [ 9 + 99 + 999 + 9999 ...].
public class SumOfSeries9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms :  ");
        int term = sc.nextInt();
        int s_number=9;
        int temp_number = s_number;
        int sum = 0;
        for(int i=1 ; i<=term;i++){
            System.out.print(s_number+ " + ");
            sum+=s_number;

            s_number=s_number*10+temp_number;


        }
        System.out.println();
        System.out.println(sum);
    }
}
