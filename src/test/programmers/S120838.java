package test.programmers;

import static org.junit.Assert.*;

import java.util.*;

public class S120838 {
	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---"; // hello
		String[] l2 = letter.split(" ");
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
						 ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
						 "...","-","..-","...-",".--","-..-","-.--","--.."};
		// a = 97
		for (int i = 0; i < l2.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if(morse[j].equals(l2[i])) {
					System.out.print(((char)(j+97)));
				}
			}
		}
		
	}
}
