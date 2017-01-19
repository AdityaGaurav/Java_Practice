package com.javapractice.stringoperations;

/*
 * The following class, Filename, illustrates the use of lastIndexOf() and substring() 
 * to isolate different parts of a file name.
 */
public class FileName {
	private String fullPath;
	private char pathSeparator, extensionSeparator;

	public FileName(String str, char sep, char exSep) {
		this.fullPath = str;
		this.pathSeparator = sep;
		this.extensionSeparator = exSep;
	}

	public String extension() {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		return fullPath.substring(dot + 1);
	}

	// Gets file name without extension
	public String fileName() {
		int fileName = fullPath.lastIndexOf(pathSeparator);
		int f2 = fullPath.lastIndexOf(extensionSeparator);
		return fullPath.substring(fileName+1, f2);
	}

	public String path(){
		int sep= fullPath.lastIndexOf(pathSeparator);
		return fullPath.substring(0, sep);
		
	}
}
