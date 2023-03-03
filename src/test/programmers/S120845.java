package test.programmers;

import java.util.*;

public class S120845 {
	public static void main(String[] args) {
		
			int[] box = {10, 8, 6};
			int n = 3;
			int answer = 1;
			
			int[] sum = new int[box.length];
			int sum2;
			for(int i = 0; i < box.length; i++) {
				sum[i] = box[i] / n;
				
			}
			
			for(int i = 0; i < box.length; i++) {
				
				answer *= sum[i];
			}
			System.out.println(answer);
	}
}