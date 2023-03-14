package test.programmers;

public class S120846 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		int cnt;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				cnt = 2;
				if(i % j == 0) {
					cnt++;
					if(cnt >= 3) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
