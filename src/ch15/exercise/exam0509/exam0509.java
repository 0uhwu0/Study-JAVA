package ch15.exercise.exam0509;

import java.util.*;

public class exam0509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int numOf = 0;
		List<Integer> list = new ArrayList<>();

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1 -> {
				System.out.print("학생수>");
				numOf = sc.nextInt();
			}
			case 2 -> {
				for (int i = 0; i < numOf; i++) {
					System.out.println("scores[" + i + "]>");
					int score = sc.nextInt();
					list.add(score);
				}
			}
			case 3 -> {
				for (int i = 0; i < numOf; i++) {
					System.out.println("scores[" + i + "]:" + list.get(i));
				}
			}
			case 4 -> {
				int max = 0;
				double avg = 0;
				for (int i : list) {
					if (max < i) {
						max = Math.max(max, i);
						avg += i;
					}
					avg /= numOf;
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}
			case 5 -> {
				System.out.println("종료>");
				run = false;
			}
			}
		}

		System.out.println("프로그램 종료");
	}
}
