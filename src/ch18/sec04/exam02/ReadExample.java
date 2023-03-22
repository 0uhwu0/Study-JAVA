package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader rd = null;
			
			rd = new FileReader("output/writer2.txt");
			while(true) {
				int data = rd.read();
				if(data == -1) break;
				System.out.println((char) data);
			}
			rd.close();
			System.out.println();
			
			rd = new FileReader("output/writer2.txt");
			char[] data = new char[100];
			while(true) {
				int num = rd.read(data);
				if(num == -1) break;
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
				rd.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
