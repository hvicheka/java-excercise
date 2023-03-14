
package com.java.exercise;
import java.util.Scanner;
public class ExerciseSeven {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter number: ");
		float number = keyboard.nextFloat();
		if(number < 0) {
		    System.out.printf("%.2f is a negative number", number);
		}else if(number > 0) {
		    System.out.printf("%.2f is a positive number", number);
		}else {
		    System.out.println("number is 0");
		}
		keyboard.close();
	}
}


