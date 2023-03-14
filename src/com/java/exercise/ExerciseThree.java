
package com.java.exercise;
import java.util.Scanner;
public class ExerciseThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int number = keyboard.nextInt();
		
		System.out.print("Enter double: ");
		double d = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.print("Enter string: ");
		String str = keyboard.nextLine();
		
		System.out.printf("String : %s \n", str);
		System.out.printf("Double : %.2f \n", d);
		System.out.printf("Integer : %d \n", number);
		keyboard.close();
	}
}


