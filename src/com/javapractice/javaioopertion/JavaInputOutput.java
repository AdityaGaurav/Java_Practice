package com.javapractice.javaioopertion;

import java.io.File;
import java.io.IOException;

public class JavaInputOutput {

	public String currentDirectory() {
		return System.getProperty("user.dir");
	}

	public void cretaeFile() {
		try {
			String fileName = "MyFirstFile.txt";
			File f = new File(fileName);
			if (f.exists()) {
				System.out.println("File already exist in directory");

			} else {
				boolean isFileCreated = f.createNewFile();
				System.out.println(isFileCreated + " File created");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new JavaInputOutput().cretaeFile();

	}

}
