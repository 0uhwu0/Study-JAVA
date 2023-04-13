package test.programmers;

import java.util.*;

public class S120852 {
	public static void main(String[] args) {
		int n = 9536;
		int a = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				a = i;
				set.add(a);
				n /= i;
			}
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
}
