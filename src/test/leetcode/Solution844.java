package test.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch (c) {
			case '#' -> {
				if (!s1.isEmpty()) {
					s1.pop();
				}
			}
			default -> {
				s1.push(c);
			}
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);

			switch (c) {
			case '#' -> {
				if (!s2.isEmpty()) {
					s2.pop();
				}

			}
			default -> {
				s2.push(c);
			}
			}
		}

		while (!s1.isEmpty() && !s2.isEmpty()) {
			char c1 = s1.pop();
			char c2 = s2.pop();

			if (c1 != c2) {
				return false;
			}
		}
		return s1.size() == s2.size();
	}
}
