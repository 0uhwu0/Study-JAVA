package test.programmers;

// a = 97
public class S120834 {
	public static void main(String[] args) {
		String answer = "";
		int age = 23;
		String age1 = String.valueOf(age);
		char[] age2 = new char[age1.length()];
		int[] age3 = new int[age2.length];
		for (int i = 0; i < age1.length(); i++) {
			age2[i] = age1.charAt(i);
		}

		for (int i = 0; i < age2.length; i++) {
			age3[i] = Character.getNumericValue(age2[i]) + 97;
		}

		for (int i = 0; i < age3.length; i++) {
			age2[i] = (char) age3[i];
		}

		for (int i = 0; i < age2.length; i++) {
			answer += age2[i];
		}

		System.out.println(answer);
	}
}
