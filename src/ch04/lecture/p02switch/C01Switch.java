package ch04.lecture.p02switch;

public class C01Switch {
	public static void main(String[] args) {
		// switch
		// 값에 따라 실행 흐름을 변경할 떄 사용

		System.out.println("이전 실핼문..");
		
		switch (1) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		case 3:
			System.out.println("code 3");
			break;
		default :
			System.out.println("code 4");
		}
		
		System.out.println("다음 흐름..");
	}
}
