
package com.java.exercise;
import java.util.Scanner;
public class ExerciseOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = input.nextInt();
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("AB");
		}else if(n % 3 == 0) {
			System.out.println("A");
		}
		else if(n % 5 == 0) {
			System.out.println("B");
		}
		else{
			System.out.println("Unknown");
		}
		input.close();
	}

}


