package test;

public class test11 {
	// 프로그래머스 120893
	public static void main(String[] args) {
		
	}
	public String solution(String str) {
		char a[] = str.toCharArray();
		String b;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 64 && a[i] < 91) {
				a[i] += 32;
			} else if(a[i] > 96 && a[i] < 123) {
				a[i] -= 32;
			}
		}
		b = String.valueOf(a);
		return b;
	}
}

