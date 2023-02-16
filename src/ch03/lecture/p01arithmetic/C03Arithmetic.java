package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		// 백준 2588
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b % 10;
		int d = (b / 10) %10;
		int e = b / 100;

		System.out.println(a * c);
		System.out.println(a * d);
		System.out.println(a * e);
		System.out.println(a * b);

	}

}
