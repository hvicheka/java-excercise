
package com.java.exercise;
import java.util.Scanner;
public class ExerciseFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month, year,days;
		System.out.print("Enter N: ");
		month = input.nextInt();
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				System.out.print("Enter Year: ");
				year = input.nextInt();
				days = year % 4 == 0 ? 29 : 28;
				break;
			default:
				days = 0;
		}
		
		if(days == 0) {
			System.out.print("Invalid Month");
		} else {
			System.out.printf("Month %d have %d days!.", month, days);
		}
		input.close();
	}
}


