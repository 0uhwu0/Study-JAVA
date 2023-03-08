package test.programmers;

// 9 - 18 - 2판
// 11 - 66 - 11판
// 6 12 18 24 30 36 42 48 54 60 66 72 78

public class S120815 {
	public static void main(String[] args) {
		int n = 6;
		int answer;
		if (n % 6 == 0) {
			answer = n/6;
		} else {
			for(int i = 0; i <= n; i++) {
				if((i*n) % n == 0) {
					answer = n/6;
				}
			}
		}
	}
}
