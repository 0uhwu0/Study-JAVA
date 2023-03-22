package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (var wr = new FileWriter("output/test.txt");) {
			
			char a = 'A';
			wr.write(a);
			char b = 'B';
			wr.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			wr.write(arr);
			
			wr.write("FGH");
			wr.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
