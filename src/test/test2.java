package test;

import java.util.Scanner;

public class test2 {
	// 백준 2439
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = " ";

		for (int i = 0; i < n; i++) {
			for (int k = n; k > i+1; k--) {
				System.out.print(a);
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}