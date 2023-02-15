package ch02.lecture.p04scanner;
import java.util.Scanner;

public class C07Scanner {
	public static void main(String[] args) {
		// 백준 2525
		
		String input = """
				23 48
				25""";
		
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int currentHour = sc.nextInt();
		int currentMin = sc.nextInt();
		int pastMin = sc.nextInt();
		
		currentHour = (currentHour + ( currentMin + pastMin) / 60) %24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);
		
		
		
		
	}
}
