
package com.java.exercise;
import java.util.Scanner;
/*
 * To check if a year is a leap year, 
 * it must be divisible by 4 and not divisible by 100 or divisible by 400.
 */
public class ExerciseEdge {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Input Year :");
		int year = keyboard.nextInt();
		if  (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
          System.out.printf("%d is a leap year and has 29 days.", year);
        } else {
          System.out.printf("%d is not a leap year and has 28 days.", year);
        }
		keyboard.close();
	}
}


