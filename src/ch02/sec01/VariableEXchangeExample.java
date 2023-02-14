package ch02.sec01;

public class VariableEXchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int t;
		
		// 코드 작성
		t = x;
		x = y;
		y = t;
		
		System.out.println(x); // 5
		System.out.println(y); // 3
	}
}
