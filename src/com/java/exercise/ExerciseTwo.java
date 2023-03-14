
package com.java.exercise;
public class ExerciseTwo {

	public static void main(String[] args) {
		float score = 8;
		float bonus = 0;
		float father_bonus = 50;
		float uncle_bonus = 20;
		if(score >= 8) {
			bonus = father_bonus + uncle_bonus;
		}else if(score >= 6) {
			bonus = uncle_bonus;
		}else {
			bonus = 0;
		}
		
		System.out.printf("Total: %.2f", bonus + 150);
	}

}


