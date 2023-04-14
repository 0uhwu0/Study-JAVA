package test.programmers;

import java.util.*;

public class S120913 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String[] answer;
		String str2 = "";
		if (my_str.length() % n == 0) {
			answer = new String[my_str.length()];
		} else {
			answer = new String[my_str.length() + 1];
		}

		if (my_str.length() % n == 0) {
			for (int i = 0; i < my_str.length(); i++) {
				str2 += my_str.charAt(i);asdioj23q0u
				answer[i] = str2;
				str2 = "";
			}
		} else {
			for (int i = n-1; i < my_str.length()/n + 1; i+=n) {
				str2 += my_str.charAt(i);
				answer[i] = str2;
				str2 = "";
			}
		}
		
		
		System.out.println(Arrays.toString(answer));
	}
}
