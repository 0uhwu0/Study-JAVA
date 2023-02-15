package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int loop = sc.nextInt();
		
		for(int a = 0; a < loop; a++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1 + num2;
			System.out.println(sum);
		}
		
		
	}
}
