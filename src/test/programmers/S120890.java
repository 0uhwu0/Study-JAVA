package test.programmers;

import java.util.*;

public class S120890 {
	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		int answer = 0;
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(n-array[0]) > Math.abs(n-array[i])) {
				array[0] = array[i];
			}
		}
		answer = array[0];
		
		System.out.println(answer);
	}
}
