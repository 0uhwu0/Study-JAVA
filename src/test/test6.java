package test;

import java.util.Scanner;

public class test6 {
	// 백준 2884
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt() - 45;
		
		int h = hour + (min / 60);
		
		if(h >= 24) {
			h = 0;
		} else if(min < 0) {
			h--;
			min = 60 % min;
		} else if (min > 60) {
			h++;
		}
		
		System.out.printf("%d %d", h, min-45);
		
	}
}
