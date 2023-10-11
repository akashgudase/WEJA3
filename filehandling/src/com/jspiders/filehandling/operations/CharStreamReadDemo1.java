package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamReadDemo1 {

	public static void main(String[] args) throws IOException {

		File file = new File("Demo.txt");
		if (file.exists()) {

			FileReader fileReader = new FileReader(file);
			int value = fileReader.read();//returns ASCII value of first character
			System.out.println(value);
			System.out.println("Data is fetched from the file.");
			fileReader.close();

		} else {
			System.out.println("File does not exist.");
		}

	}

}
