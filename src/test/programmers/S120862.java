package test.programmers;

import java.util.*;

class S120862 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, -3, 4, -5};
		int answer = Integer.MAX_VALUE * -1;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				if(answer < numbers[i] * numbers[j] && i != j) {
					answer = numbers[i] * numbers[j];
				}
			}
		}
		System.out.println(answer);
	}
}
