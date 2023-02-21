package ch04.lecture.p04for;

public class C04For {
	public static void main(String[] args) {

		for (int j = 2; j <= 9; j++) {
			System.out.println(j + " 단");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", j, i, (j * i));
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
