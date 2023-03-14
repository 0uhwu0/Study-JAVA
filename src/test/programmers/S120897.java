package test.programmers;

import java.util.*;

public class S120897 {
	public static void main(String[] args) {
		int n = 24;
		int j = 0;
		int[] answer = new int[n];
	
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				j++;
			}
		}
		
		answer = new int[j];
		
		j = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[j] = i;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
