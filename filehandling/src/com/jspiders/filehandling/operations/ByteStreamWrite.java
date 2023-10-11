package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) throws IOException {

		File file = new File("Test.txt");
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1000);
			System.out.println("Data is written to the file.");
			fileOutputStream.close();
		} else {
			System.out.println("File does not exist.");
			file.createNewFile();
			System.out.println("File is created.");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(20);
			System.out.println("Data is written to the file.");
			fileOutputStream.close();
		}

	}

}
