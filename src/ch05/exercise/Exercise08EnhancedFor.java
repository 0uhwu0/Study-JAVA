package ch05.exercise;

public class Exercise08EnhancedFor {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int a = 0;
		
		for(int []n : array) {
			for(int i : n) {
				sum += i;
				a++;
			}
		}
		System.out.println(sum);
		double avg = (double)sum/a;
		System.out.println(avg);
	}
}
