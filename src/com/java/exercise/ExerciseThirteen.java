
package com.java.exercise;
public class ExerciseThirteen {
	public static void main(String[] args) {
		int num = 10;
        for(int i = 1; i <= num; ++i)
        {
            for(int j = 2; j < num; ++j)
            {
                System.out.printf("%d * %d = %d \t",j, i, i *j);
            }
            System.out.printf("\n");
        }
	}
}


