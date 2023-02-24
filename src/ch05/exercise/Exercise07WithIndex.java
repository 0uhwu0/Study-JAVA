package ch05.exercise;

public class Exercise07WithIndex {
	public static void main(String[] args) {
		int [] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
		int indexOfMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				indexOfMax = i;
			}
		}
		System.out.println("최댓값:" + max);
		System.out.println("최댓값의 인덱스" + indexOfMax);
	}
}
