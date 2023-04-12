package test.programmers;

public class S120885 {
	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		// 얘네를 10진수로 바꾼 다음에 더하고 다시 이진수 변환
		int b1 = Integer.parseInt(bin1, 2);
		int b2 = Integer.parseInt(bin2, 2);
		String answer = Integer.toBinaryString(b1 + b2);
		System.out.println(answer);
	}
}
