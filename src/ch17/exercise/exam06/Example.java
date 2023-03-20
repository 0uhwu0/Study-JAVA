package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		
		double avg = list.stream()
				.mapToDouble(s-> s.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " + avg);
		
		int sum = 0;
		
		for(Member m : list) {
			sum += m.getAge();
		}
		
		double avg2 = sum / list.size();
		
		System.out.println("평균 나이: " + avg2);
		
		double avg3 = list.stream()
			.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println(avg3);
	}
}
