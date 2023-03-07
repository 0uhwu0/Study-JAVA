package test.programmers;

public class S120844 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		String direction = "right";
		int[] answer = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			int j;
			if(direction == "right") {
				j = i + 1;
				answer[j] = numbers[i];
			} else {
				j = i - 1;
				answer[j] = numbers[i];
			}
		}
	}
}
