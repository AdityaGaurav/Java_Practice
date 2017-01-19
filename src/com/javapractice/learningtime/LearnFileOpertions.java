package com.javapractice.learningtime;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/*
 * This class makes you understand about file operations
 */
public class LearnFileOpertions {

	private static final String propertyfile = "/Users/adityag/Automation Projects/JavaPractice/SystemProperty.xml";
	private static final String systempropertyfiles = "systempropertyfiles.xml";

	public static void main(String[] args) throws IOException {

		Properties sysytemproperties = new Properties();
		OutputStream os = new FileOutputStream(propertyfile);

		String comment = "Properties";
		String absoluteFilePath = "";
		sysytemproperties = System.getProperties();

		sysytemproperties.storeToXML(os, comment, "UTF-8");
		String workingDirectory = System.getProperty("user.dir").toUpperCase();
		absoluteFilePath = workingDirectory + File.separator + systempropertyfiles.toUpperCase();
		

		System.out.println("Final filepath : " + absoluteFilePath);
		System.out.println("\n System Property\n" + System.getProperty("user.dir"));

	}

}
