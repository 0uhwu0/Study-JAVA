package ch18.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/exercise/exam07/Example.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while (true) {
			rowNumber++;
			rowData = br.readLine(); 
			if(rowData == null) {
				break;
			}
			System.out.println(rowNumber + ": \t" + rowData);
		}

		br.close();
		fr.close();
	}
}
