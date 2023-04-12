package test.programmers;

import java.util.*;

// 10같이 뒤에 0이 붙으면 인식을 못함 그래서 4, 5, 6 틀림
public class S120864 {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		
		String[] c = my_string.split("[A-Za-z]");
		for (int i = 0; i < c.length; i++) {
			if (!c[i].isEmpty()) {
				answer += Integer.parseInt(c[i]);
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(answer);
	}
}
