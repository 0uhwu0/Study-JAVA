package test.programmers;

public class S120846 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		for(int i = 4; i<n+1; i++) {
			if(i % 2 == 0) {
				answer++;
				continue;
			}
			else {
				for(int k = 3; k<i/2; k = k + 2) {
					if(i%k==0) {
						answer++;
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
