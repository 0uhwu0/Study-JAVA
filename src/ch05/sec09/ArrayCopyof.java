package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyof {
	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };

		String[] newStrArray = Arrays.copyOf(oldStrArray, 5);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(newStrArray));
	}
}
