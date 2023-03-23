package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("output/test6.txt");
		Writer wr = new OutputStreamWriter(os, "UTF-8");
		wr.write(str);
		wr.flush();
		wr.close();
	}
	
	public static String read() throws Exception {
		InputStream is = new FileInputStream("output/test6.txt");
		Reader rd = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = rd.read(data);
		rd.close();
		String str = new String(data, 0, num);
		return str;
	}
}
