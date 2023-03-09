package ch13.exercise.exam03;

public class Container<T, U> {
	private T a;
	private U b;
	
	public void set(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getKey() {
		return a;
	}
	
	public U getValue() {
		return b;
	}
	
}
