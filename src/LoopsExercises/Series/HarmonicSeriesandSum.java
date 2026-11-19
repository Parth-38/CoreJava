package LoopsExercises.Series;

import java.util.Scanner;

//Write a program in Java to display the n terms of a harmonic series and their sum.
//1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
public class HarmonicSeriesandSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int terms = sc.nextInt();
        double sum= 0;

        for(double i=1;i<=terms;i++){
            sum+=1/i;
        }
        System.out.println(sum);


    }
}
