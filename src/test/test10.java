package test;

public class test10 {
	// 프로그래머스 120906
	public static void main(String[] args) {

		int n = 1234;
		int answer = 0;
		String a = Integer.toString(n);
		String[] str = a.split("");
		int[] b = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		for (int i = 0; i < b.length; i++) {
			answer += b[i];
		}
	}

}
