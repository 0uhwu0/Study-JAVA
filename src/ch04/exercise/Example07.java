package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int out = 2000;
		boolean go = true;
		while (go) {
			String a = sc.nextLine();
			
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------");
			if (a.equals("1")) {
				int b = Integer.parseInt(sc.nextLine());
				money += b;
				System.out.println("선택> 1" );
				System.out.println("예금액> " + b);
			}

			else if (a.equals("2")) {
				int b = Integer.parseInt(sc.nextLine());
				money -= b;
				System.out.println("선택> 2" );
				System.out.println("출금액> " + b);
			}

			else if (a.equals("3")) {
				System.out.println("선택> 3" );
				System.out.println("예금액> " + money);
			}

			else if (a.equals("4")) {
				System.out.println("선택> 1" );
				System.out.println("프로그램 종료");
				go = false;
			}
		}
	}
}
