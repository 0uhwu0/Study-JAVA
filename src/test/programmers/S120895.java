package test.programmers;

public class S120895 {
	public static void main(String[] args) {
		String my = "hello";
		String answer = "";
		int num1 = 1;
		int num2 = 2;
		char[] c = new char[my.length()];
		for (int i = 0; i < my.length(); i++) {
			c[i] = my.charAt(i);
			if(i == num1) {
				c[i] = my.charAt(num2);
			}
			if(i == num2) {
				c[i] = my.charAt(num1);
			}
			answer += c[i];
		}
	}
}
