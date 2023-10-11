package com.jspiders.filehandling.operations;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("D:/Demo/Test.txt");
		if (file.exists()) {

			file.delete();
			System.out.println("File is deleted.");

		} else {
			System.out.println("File does not exist.");
			
		}

	}

}
