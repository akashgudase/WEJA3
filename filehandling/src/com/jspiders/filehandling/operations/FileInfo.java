package com.jspiders.filehandling.operations;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("Demo.txt");
		if (file.exists()) {

			System.out.println("Name : " + file.getName());
			System.out.println("Path : " + file.getAbsolutePath());
			if (file.canRead()) {
				System.out.println("File is readable.");
			} else {
				System.out.println("File is not readable.");
			}
			if (file.canWrite()) {
				System.out.println("File is writable.");
			} else {
				System.out.println("File is not writable.");
			}
			if (file.canExecute()) {
				System.out.println("File is executable.");
			} else {
				System.out.println("File is not executable.");
			}
			System.out.println("Length : " + file.length());

		} else {
			System.out.println("File does not exist.");
		}

	}

}
