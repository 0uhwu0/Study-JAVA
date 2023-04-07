package test.programmers;

import java.util.*;

public class S120842 {
	public static void main(String[] args) {
		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n = 3;
		int a = 0;
		int b = 0;
		int[][] answer = new int[num_list.length/n][n];
		for (int i = 0; i < num_list.length; i++) {
			if(b==n) {
				b = 0;
			}
			answer[a/n][b] = num_list[i];
			a++;
			b++;
		}
		System.out.println(Arrays.deepToString(answer));
	}
}
