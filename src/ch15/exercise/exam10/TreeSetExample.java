package ch15.exercise.exam10;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student stdent = treeSet.last();
		System.out.println(treeSet);
		System.out.println("최고 점수: " + stdent.score);
		System.out.println("최고 점수를 받은 아이디: " + stdent.id);
	}
}
