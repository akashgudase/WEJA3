package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) throws IOException {

		File file = new File("Demo.txt");
		if (file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Hello World!");
			System.out.println("Data is written to the file.");
			fileWriter.close();
		} else {
			System.out.println("File does not exist.");
			file.createNewFile();
			System.out.println("File is created.");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Hello World!");
			System.out.println("Data is written to the file.");
			fileWriter.close();
		}

	}

}
