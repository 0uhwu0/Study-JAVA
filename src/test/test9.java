package test;

import java.util.Arrays;

public class test9 {
	public static void main(String[] args) {

		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		String a = my_string.replaceAll("[a-zA-Z]", "");
		String[] b = a.split("");
		
		int[] c = new int[b.length];
		for(int i = 0; i < b.length; i++) {
			c[i] = Integer.parseInt(b[i]);
			answer += c[i];
		}
		
		
		
	}

}
