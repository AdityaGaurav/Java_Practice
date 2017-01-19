package com.javapractice.stringoperations;

public class FileNameDemo {
	public static void main(String[] args) {
		final String FPATH = "/home/user/index.html";
		FileName myHomePage = new FileName(FPATH, '/', '.');
        System.out.println("Extension: "+myHomePage.extension());
        System.out.println("File Name: "+myHomePage.fileName());
        System.out.println("Path: "+myHomePage.path());
	}
}
