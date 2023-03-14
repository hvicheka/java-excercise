
package com.java.exercise;
import java.util.Scanner;
public class ExerciseSix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter character (a-z) or (A-Z) :");
		char ch = keyboard.next().charAt(0);
		char alphabet = Character.toLowerCase(ch);
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ){
		    System.out.println(ch + " is vowel");
		}
        else {
            System.out.println(ch + " is consonant");
        }
		keyboard.close();
	}
}


