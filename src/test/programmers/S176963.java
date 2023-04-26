package test.programmers;

import java.util.*;

public class S176963 {
	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		int answer[] = new int[photo.length];
		
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				for (int n = 0; n < name.length; n++) {
					if (name[n].equals(photo[i][j])) {
						answer[i] += yearning[n];
					}
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
