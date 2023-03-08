package ch12.lecture.p01object;

public class C09Record {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09("son", 33);
		System.out.println(o1);
		System.out.println(o1.name());
		System.out.println(o1.age());
	}
}

record MyClass09(String name, int age) {
	// 자동으로 생성자, get, set 메소드 생성하게 해주는거임
}