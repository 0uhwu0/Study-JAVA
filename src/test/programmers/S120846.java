package test.programmers;

public class S120846 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt > 2) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
