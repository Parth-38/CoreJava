package LoopsExercises.Pattern.PyramidPattern;

import java.util.Scanner;

public class PyramidPatternAsterisks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int x = 1;x<=rows;x++){
            for(int y =1;y<=rows-x;y++){
                System.out.print(" ");
            }
            for(int z=1;z<=2*x-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
