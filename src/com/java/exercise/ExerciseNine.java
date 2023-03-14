
package com.java.exercise;
import java.util.Scanner;
public class ExerciseNine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter character :");
		char ch = keyboard.next().charAt(0);
		if(Character.isAlphabetic(ch)) {
			System.out.printf("%c Is Alphabet", ch);
		}else {
			System.out.printf("%c Is Not Alphabet", ch);
		}
		keyboard.close();
	}
}

