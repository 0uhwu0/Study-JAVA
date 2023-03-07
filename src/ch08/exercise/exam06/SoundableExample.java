package ch08.exercise.exam06;

public class SoundableExample {
	public static void printSound(Soundable sounable) {
		System.out.println(sounable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
