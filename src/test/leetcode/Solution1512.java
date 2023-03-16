package test.leetcode;

import java.util.*;

public class Solution1512 {
	public int numIdenticalPairs(int[] nums) {
		// 1 / 2 / 3 / 1 / 1 / 3
		// (1, 1)/ 2, 1/ (3, 1)/ (1, 2)/ 1, 3/ 3, 2 
		// 키 값이 작은 것들 중 / value 값은 같은 경우 / 
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				answer += map.get(nums[i]);
				map.put(nums[i], map.get(nums[i]+1));
			} else {
				map.put(nums[i],1);
			}
		}
		return answer;
	}
}
