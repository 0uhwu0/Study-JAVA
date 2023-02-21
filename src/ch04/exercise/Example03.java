package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		
		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
		
		for(i = 1; i<=100; i++) {
			if(i % 3 == 0) {
				sum2 += i;				
			}
		}
		
		System.out.println(sum2);
		
	}
}
