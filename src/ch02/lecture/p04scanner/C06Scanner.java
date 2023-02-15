package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
		String input = """
				23 50
				130""";
		
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		// 코드 작성
		
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		
		
		// 여기서 line1,2 를 String으로 받았는데 int로 자동 변환
		// 되는건지 질문하기
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);
		
		int currentHour = line1Scanner.nextInt();
		int currentMin = line1Scanner.nextInt();
		
		int pastMin = line2Scanner.nextInt();
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);
		
//		int hour = sc.nextInt();
//		int min = sc.nextInt();
//		int res = sc.nextInt();
//		int a;
//		
//		if(res>=60) {
//			hour++;
//		} else if (res < 60) {
//			a = min + res;
//		}	
	}
}
