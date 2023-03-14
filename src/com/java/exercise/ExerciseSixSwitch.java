
package com.java.exercise;
import java.util.Scanner;
public class ExerciseSixSwitch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter character (a-z) or (A-Z) :");
		char ch = keyboard.next().charAt(0);
        switch (Character.toLowerCase(ch)) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is vowel");
            default -> System.out.println(ch + " is consonant");
        }
		keyboard.close();
	}
}


