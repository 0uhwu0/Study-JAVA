package test.programmers;

public class S120912 {
	public static void main(String[] args) {
		int[] array = {7, 77, 14};
		int answer = 0;
		String a = "";
		
		for (int i = 0; i < array.length; i++) {
			a += array[i];
		}
		
		String[] a1 = a.split("");
		for (int i = 0; i < a1.length; i++) {
			if (Integer.parseInt(a1[i]) == 7) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
