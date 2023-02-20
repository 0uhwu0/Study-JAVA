package ch04.lecture.p03while;

public class C01While {
	public static void main(String[] args) {
		System.out.println("이전 실행문...");
		
		boolean con = true;
		while (con) {
			System.out.println("반복해야할 명령문1");
			System.out.println("반복해야할 명령문2");
		}
		System.out.println("다음 실행문...");
	}
	
}
