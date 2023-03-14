package ch15.exercise.exam0620;

import java.util.*;

import ch06.exercise.exam20.Account;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Account> list = new ArrayList<>();
		int num = 0;

		while (run) {
			System.out.println("""
					-------------------------------------------------------
					1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
					-------------------------------------------------------
					선택>
					""");
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
				
				Account ac = new Account();
				ac.setNumber(number);
				ac.setName(name);
				ac.setMo(money);
				list.add(ac);
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				
				for (Account ac : list) {
					System.out.printf("%7s%10s%10d%n", ac.getNumber(), ac.getName(), ac.getMo());
				}
			}
			case 3 -> {
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				
				System.out.print("계좌번호: ");
				String number = sc.next();
				
				System.out.print("예금액: ");
				int inputMoney = sc.nextInt();
				
				list.forEach(ac -> {
					if(ac.getNumber().equals(number)) {
						int origin = ac.getMo() + inputMoney;
						ac.setMo(origin);
					}
				});
				
//				for(Account ac : list) {
//					if(ac.getNumber().equals(number)) {
//						int origin = ac.getMo() + inputMoney;
//						ac.setMo(origin);
//					}
//				}
				System.out.println("결과: 예금이 성공되었습니다.");
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
				for (Account ac : list) {
					if (ac.getNumber().equals(number)) {
						// 입력 받은 금액을 빼서 다시 넣어준다(set)
						int origin = ac.getMo() - inputMoney;
						ac.setMo(origin);
					}
				}
				System.out.println("결과: 출금이 성공되었습니다.");
			}
			case 5 -> {
				run = false;
			}
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
