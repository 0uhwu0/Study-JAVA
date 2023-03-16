package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A", "B", "C");

		Set<String> immutableSet1 = Set.of("A", "B", "C");
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
				
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		// 수정가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("D");
		System.out.println(list2);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		// 수정가능한 셋 만들기
		Set<String> set2 = new HashSet<>(immutableSet2);
		set2.add("E");
		System.out.println(set2);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		// 수정가능한 맵 만들기
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map2.put(4, "D");
		System.out.println(map2);
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
//		immutableList3.add("Z"); // 추가 안됨
		immutableList3.replaceAll(s -> s + s); // 길이 수정은 안됨, 내용 수정은 가능
		System.out.println(immutableList3);
		
		Integer[] arr2 = {3, 4, 5}; // int로는 안됨
		List<Integer> list4 = Arrays.asList(arr2);
		System.out.println(list4);
	}
}
