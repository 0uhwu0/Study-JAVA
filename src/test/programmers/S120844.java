package test.programmers;

import java.util.*;

public class S120844 {
	public static void main(String[] args) {
//		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		int[] numbers = {1, 2, 3};
//		String direction = "left";
		String direction = "right";
		int[] answer = new int[numbers.length];
		int j;
		for(int i = 0; i < numbers.length; i++) {
			if(direction == "right") {
				j = i + 1;
				if(j == numbers.length) {
					j = 0;
				}
				answer[j] = numbers[i];
			} else if (direction == "left" ) {
				j = i - 1;
				if(j == numbers.length) {
					j = 0;
				} else if (j < 0) {
					j = numbers.length-1;
				}
				answer[j] = numbers[i];
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
