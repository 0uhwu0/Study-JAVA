package test.programmers;

public class S120902 {
	public static void main(String[] args) {
		String my_string = "3 + 4 + 10";
		int answer = 0;
		String[] a = my_string.split(" ");
		answer = Integer.parseInt(a[0]);
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("+")) {
				answer += Integer.parseInt(a[i+1]);  
			} else if (a[i].equals("-")) {
				answer -= Integer.parseInt(a[i+1]);
			} else if (a[i].equals("*")) {
				answer *= Integer.parseInt(a[i+1]);
			} else if (a[i].equals("/")) {
				answer /= Integer.parseInt(a[i+1]);
			} else if (a[i].equals("%")) {
				answer %= Integer.parseInt(a[i+1]);
			}
		}
		System.out.println(answer);
	}
}
