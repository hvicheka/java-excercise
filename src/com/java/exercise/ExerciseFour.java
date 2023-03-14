
package com.java.exercise;
import java.util.Scanner;
public class ExerciseFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N = ");
		int n = input.nextInt();
		if( n % 2 != 0) {
			System.out.println("Wired");
		} else {
			if( n >= 2 && n <= 5) {
				System.out.println("Not Wired");
			}else {
				System.out.println("Wired");
			}
		}
		input.close();
	}
}

