package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2500, 100));
		System.out.println(set);
		
		// first
		System.out.println(set.first());
		
		// last
		System.out.println(set.last());
		
		// lower : 미만
		System.out.println(set.lower(50));
		System.out.println(set.lower(20));
		
		// higher : 초과
		System.out.println(set.higher(50));
		
		// floor : lower와 비슷한데 20을 포함해서임 (이하)
		System.out.println(set.floor(50));
		System.out.println(set.floor(20));
		
		// ceiling : higher와 비슷한데 100을 포함해서임 (이상)
		System.out.println(set.ceiling(50));
		System.out.println(set.ceiling(100));
		
		// 거꾸로 정렬된 NavigableSet 리턴
		NavigableSet<Integer> descendingSet =  set.descendingSet();
		System.out.println(descendingSet);
	}
}
