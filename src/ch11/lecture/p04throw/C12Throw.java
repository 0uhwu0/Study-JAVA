package ch11.lecture.p04throw;

import java.io.*;

public class C12Throw {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws Exception {
		new FileInputStream("");
	}
}
