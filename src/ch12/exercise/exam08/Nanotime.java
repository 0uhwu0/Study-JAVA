package ch12.exercise.exam08;

public class Nanotime {
	public static void main(String[] args) {
		long a = System.nanoTime();
		int[] scores = new int[100];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		long b = System.nanoTime();
		System.out.println(b - a);
	}
}
