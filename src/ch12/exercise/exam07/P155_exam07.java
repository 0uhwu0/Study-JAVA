package ch12.exercise.exam07;

public class P155_exam07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int a = Integer.MIN_VALUE;
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = i+1; j < array.length; j++) {
//				a = Math.max(array[i], array[j]);
//			}
//		}
		
		for(int n : array) {
			a = Math.max(a, n);
		}
		
		System.out.println(a);
	}
}
