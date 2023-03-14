package test.programmers;

import java.util.*;

public class S120904 {
	public static void main(String[] args) {
		int answer = 0;
		int num = 29183;
		int k = 1;
		String a = String.valueOf(num);
		char[] b = new char[a.length()];
		for(int i = 0; i < a.length(); i++) {
			b[i] = a.charAt(i);
			if(k == Character.getNumericValue(b[i])) {
				answer = i + 1;
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(answer);
	}
}
