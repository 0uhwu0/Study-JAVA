package test.programmers;

import java.util.*;

public class S120913 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String[] answer;
		if (my_str.length() % n == 0) {
			answer = new String[my_str.length()/n];
		} else {
			answer = new String[my_str.length()/n + 1];
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (i * n + n <= my_str.length() ? my_str.substring(i * n, i * n + n) : my_str.substring(i * n));
		}
		System.out.println(Arrays.toString(answer));
	}
}
