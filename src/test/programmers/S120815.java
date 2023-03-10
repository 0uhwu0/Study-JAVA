package test.programmers;

// 1 - 6 - 1판
// 2 - 6 - 1판
// 3 - 6 - 1판
// 4 - 12 - 2판
// 5 - 30 - 5판
// 6 - 6 - 1판
// 7 - 42 - 7판
// 8 - 48 - 8판
// 9 - 18 - 2판
// 10 - 30 - 5판
// 11 - 66 - 11판
// 12 - 12 - 2판
// 13 - 78 - 12판
// 14 - 84 - 13판
// 15 - 30 - 2판
// 
// 6 12 18 24 30 36 42 48 54 60 66 72 78 84

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
