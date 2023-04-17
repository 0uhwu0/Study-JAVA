package test.programmers;

import java.util.*;

public class S120913 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String[] answer;
		int a = 0;
		String new_str = "";
		if (my_str.length() % n == 0) {
			answer = new String[my_str.length()/n];
		} else {
			answer = new String[my_str.length()/n + 1];
		}
		
		for (int i = n; i <= my_str.length(); i+=n) {asd
			answer[a] = my_str.substring(0, i);
			System.out.println(Arrays.toString(answer));
			a++;
		}
		System.out.println(Arrays.toString(answer));
	}
}
