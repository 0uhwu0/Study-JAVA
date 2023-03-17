package test.programmers;

import java.util.*;

public class S120888 {
	public static void main(String[] args) {
		// 중복된 문자 제거
		String my_string = "people";
		String answer = "";
		char[] a = new char[my_string.length()];
		
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = i+1; j < my_string.length(); j++) {
				if(a[i] != a[j]) {
					a[i] = my_string.charAt(i);
				}
			}asdasd
			answer += a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(answer);
	}
}
