package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	public static void main(String[] args) {
		// 백준 11021

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		int a;
		int b;

		for (int i = 1; i <= loop; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("Case #%d: %d%n", i, a + b);
		}
	}
}
