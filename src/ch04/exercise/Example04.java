package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
//		do {
//			a = (int)(Math.random()*6+1);
//			b = (int)(Math.random()*6+1);
//			System.out.println(a+b);
//		} while(a+b != 5);
		
		while (true) {
			c = (int)(Math.random()*6) + 1;
			d = (int)(Math.random()*6) + 1;
			System.out.println("( " + c + ", " + d + " )");
			if(c + d == 5) {
				break;
			}
		}
	}
}
