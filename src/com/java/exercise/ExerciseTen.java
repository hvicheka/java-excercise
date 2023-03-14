
package com.java.exercise;
import java.util.Scanner;
public class ExerciseTen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int num = input.nextInt();
		int sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            System.out.printf(" %d ", i);
            if(i < num) {
                System.out.printf("+");
            }
            sum += i;
        }
        System.out.printf("= %d", sum);
		input.close();
	}

}




