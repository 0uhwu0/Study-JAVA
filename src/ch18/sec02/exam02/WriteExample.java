package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("output/test2.db")){
			byte[] arr = {10, 20, 30};
			
			os.write(arr);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
