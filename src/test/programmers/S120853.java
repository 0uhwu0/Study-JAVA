package test.programmers;

public class S120853 {
	public static void main(String[] args) {
		String s = "10 20 30 40";
		int answer = 0;
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			if (!s1[i].equals("Z")) {
				answer += Integer.parseInt(s1[i]);
			} else {
				answer -= Integer.parseInt(s1[i-1]);
			}
		}
		
		System.out.println(answer);
	}
}
