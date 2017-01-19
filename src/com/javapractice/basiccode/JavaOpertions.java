package com.javapractice.basiccode;
/*
 * This class makes you understand about file operations 
 *  
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//import java.util.Properties;

public class JavaOpertions {
	private static final String propertyfile = "/Users/adityag/Automation Projects/JavaPractice/SystemProperty.xml";
	private static final String systempropertyfiles = "systempropertyfiles.xml";

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
//		Properties sysytemproperties = new Properties();
		@SuppressWarnings("resource")
		OutputStream os = new FileOutputStream(propertyfile);

//		String comment = "Properties";
		String absoluteFilePath = "";
//		sysytemproperties = System.getProperties();

//		sysytemproperties.storeToXML(os, comment, "UTF-8");
		String workingDirectory = System.getProperty("user.dir");
		System.out.println(workingDirectory+" workingDirectory");
		absoluteFilePath = workingDirectory + File.separator + systempropertyfiles;

		System.out.println("Final filepath : " + absoluteFilePath);
		System.out.println("\n System Property\n" + workingDirectory);

	}

}
