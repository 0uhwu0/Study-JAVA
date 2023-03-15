package ch13.lecture.p02wildcard;

public class C05WildCard {
	
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<>();
		addItem(o1);
		
		MyClass05<Number> o2 = new MyClass05<Number>();
		addItem(o2); // super 지우면 Number만 됨 -> super로 참조값 얻는거임
		
		MyClass05<Integer> o3 = new MyClass05<Integer>();
//		addItem(o3); // 참조값이 Integer로 Number보다 하위 클래스이기에 참고값 안됨.
		
	}
	
	public static void addItem(MyClass05<? super Number> param) {
		// 값을 Number 하위 클래스로 넣을 수 있음.
		param.setItem(3);
		param.setItem(3.14);
	}
}

class MyClass05<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}