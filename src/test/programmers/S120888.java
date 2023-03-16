package test.programmers;

import java.util.*;

public class S120888 {
	public static void main(String[] args) {
		// 중복된 문자 제거
		String my_string = "people";
		String answer = "";
		char[] a = new char[my_string.length()];
		List<char[]> list = new ArrayList<>();
		
		for(int i = 0; i < my_string.length(); i++) {
			a[i] = my_string.charAt(i);
		}
		
		list.add(a);
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
			answer += list.get(i);
		}
		System.out.println(list.toString());asdasdjasoipdjasoidj
		System.out.println(answer);
	}
}
