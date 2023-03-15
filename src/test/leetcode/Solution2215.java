package test.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}
		
		for (int num : nums2) {
			set2.add(num);
		}

		list1.addAll(set1);
		list2.addAll(set2);

		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);
		return List.of(list1, list2);
	}
}
