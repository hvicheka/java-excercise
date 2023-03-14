
package com.java.exercise;
import java.util.Scanner;
public class ExerciseEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int num = input.nextInt();
		int sum = 0;
        for(int i = 1; i <= num; ++i)
        {
        	int temp = 2 * i - 1;
            System.out.printf(" %d ", temp);
            if(i < num) {
                System.out.printf("+");
            }
            sum += temp;
        }
        System.out.printf("= %d", sum);
		input.close();
	}

}




