package test.programmers;

public class S120854 {
	// 프로그래머스 120854
	public static void main(String[] args) {
		String[] list = { "We", "are", "the", "world!" };
		int[] a = {};
		for (int i = 0; i < list.length; i++) {
			a[i] = list[i].length();

			System.out.println(a[i]);
		}
	}
}