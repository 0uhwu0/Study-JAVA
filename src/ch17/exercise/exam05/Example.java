package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
							"This is a java book",
							"Lambda Expression",
							"Java8 supports lambda expressions"
							);
		
		for(String s : list) {
			if(s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		list.stream()
			.filter(s -> s.toLowerCase().contains("java"))
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		list.stream()
			.filter(Example::havingJava)
			.forEach(s -> System.out.println(s));
	}
	
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
