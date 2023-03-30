package test.programmers;

import java.util.*;

public class S120886 {
	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		
		char[] a = after.toCharArray();
		char[] b = before.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		String a1 = new String(a);
		String b1 = new String(b);
		
		if(a1.equals(b1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
