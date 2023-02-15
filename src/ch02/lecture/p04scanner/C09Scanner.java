package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		// 백준 25304

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			X -= (a*b);
		}
		if (X == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}

	}
}
