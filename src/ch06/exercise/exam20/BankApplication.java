package ch06.exercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		boolean go = true;
		Scanner sc = new Scanner(System.in);
		Account[] accs = new Account[100];
		int numOfAcc = 0;

		while (go) {
			System.out.println("----------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1 -> {
				System.out.println("----------------------------");
				System.out.println("계좌생성");
				System.out.println("----------------------------");

				System.out.print("계좌번호:");
				String number = sc.next();

				System.out.print("계좌주:");
				String name = sc.next();

				System.out.print("초기입금액:");
				int money = sc.nextInt();

				Account acc = new Account();
				acc.setNumber(number);
				acc.setName(name);
				acc.setMo(money);
				accs[numOfAcc] = acc;
				numOfAcc++;

				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				System.out.println("----------------------------");
				System.out.println("계좌목록");
				System.out.println("----------------------------");

				for (int i = 0; i < numOfAcc; i++) {
					System.out.printf("%7s%10s%10d%n", accs[i].getNumber(), accs[i].getName(), accs[i].getMo());
				}
			}
			
			case 3 -> {
				System.out.println("----------------------------");
				System.out.println("예금");
				System.out.println("----------------------------");

				System.out.println("계좌번호: ");
				String number = sc.next();
				System.out.println("예금액: ");
				int inputMoney = sc.nextInt();

				// 입력된 계좌번호를 가진 Account객체 찾아서
				for (int i = 0; i < numOfAcc; i++) {
					Account cur = accs[i];

					if (cur.getNumber().equals(number)) {
						// 입력 받은 금액을 더해서 다시 넣어준다(set)
						int origin = cur.getMo() + inputMoney;
						cur.setMo(origin);
					}
				}
			}
			case 4 -> {
				System.out.println("----------------------------");
				System.out.println("출금");
				System.out.println("----------------------------");

				System.out.println("계좌번호: ");
				String number = sc.next();
				System.out.println("출금액: ");
				int inputMoney = sc.nextInt();

				// 입력된 계좌번호를 가진 Account객체 찾아서
				for (int i = 0; i < numOfAcc; i++) {
					Account cur = accs[i];

					if (cur.getNumber().equals(number)) {
						// 입력 받은 금액을 빼서 다시 넣어준다(set)
						int origin = cur.getMo() - inputMoney;
						cur.setMo(origin);
					}
				}

			}
			case 5 -> {
				go = false;

			}

			}
		}
		System.out.println("프로그램 종료");

	}
}
