package ch13.exercise.exam04;

public class Util<K, V> {
	private K key;
	private V value;
	
	Pair<K, V> p = new Pair<>(key, value);
	public Util(K key) {
		this.key = key;
	}
	
	public K getKey() {
		return key;
	}
	
	public static <K> Pair getValue(p<String, Interger>, K key){
		if(p.getKey() == key) {
			return p.getValue();
		} else {
			return null;
		}
	}
}
