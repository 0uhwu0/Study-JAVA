package ch11.exercise.exam07;

public class NotExistIdException extends Exception{
	public NotExistIdException() {}
	public NotExistIdException(String message) {
		super(message);
	}
}
