package ch18.sec11;

import java.io.*;
import java.text.*;
import java.util.*;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File f : contents) {
			System.out.printf("%-25s", sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", f.getName());
			} else {
				System.out.printf("%-10s%-20s", f.length(), f.getName());
			}
			System.out.println();
		}
	}
}
