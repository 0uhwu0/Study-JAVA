package test.programmers;

public class S12939 {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] s1 = s.split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < s1.length; i++) {
			if (max < Integer.valueOf(s1[i])) {
				max = Integer.valueOf(s1[i]);
			}
			
			if (min > Integer.valueOf(s1[i])) {
				min = Integer.valueOf(s1[i]);
			}
		}
		String answer = String.valueOf(min) + " " + String.valueOf(max); 
		System.out.println(answer);
	}
}
