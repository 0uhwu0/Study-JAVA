package test.programmers;

import java.util.*;

public class S120894 {
	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		long answer = 0;
		String n1 = "";
		String n2 = "";
		for (int i = 0; i < numbers.length(); i++) {
			n1 += numbers.charAt(i);
			if (n1.equals("one")) {
				n1 = "";
				n2 += "1";
			} else if (n1.equals("two")) {
				n1 = "";
				n2 += "2";
			} else if (n1.equals("three")) {
				n1 = "";
				n2 += "3";
			} else if (n1.equals("four")) {
				n1 = "";
				n2 += "4";
			} else if (n1.equals("five")) {
				n1 = "";
				n2 += "5";
			} else if (n1.equals("six")) {
				n1 = "";
				n2 += "6";
			} else if (n1.equals("seven")) {
				n1 = "";
				n2 += "7";
			} else if (n1.equals("eight")) {
				n1 = "";
				n2 += "8";
			} else if (n1.equals("nine")) {
				n1 = "";
				n2 += "9";
			} else if (n1.equals("zero")) {
				n1 = "";
				n2 += "0";
			}
			
		}
		answer = Long.parseLong(n2);
		System.out.println(n2);
		System.out.println(answer);
	}
}
