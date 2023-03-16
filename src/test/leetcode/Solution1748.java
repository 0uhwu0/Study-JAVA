package test.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) {
			if(map.containsKey(n)) {
				int oldvalue = map.get(n);
				map.put(n, oldvalue+1);
			} else {
				map.put(n, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if(value == 1) {
				sum += entry.getKey();
			}
		}
		return sum;
	}
}
