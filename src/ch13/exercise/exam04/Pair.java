package ch13.exercise.exam04;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V Value) {
		this.key = key;
		this.value = Value;
	}
	
	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}
}
