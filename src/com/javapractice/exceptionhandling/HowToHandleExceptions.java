package com.javapractice.exceptionhandling;

import java.util.List;
import java.util.ArrayList;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HowToHandleExceptions {
	private static final int SIZE = 10;
	private List<Integer> list;

	public HowToHandleExceptions() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}
// public void writeList() throws IndexOutFofBoundsException, IOExceptiopn{
	public void writeList() {
		PrintWriter out = null;
		String filePath="/Users/adityag/Desktop/OutFile1.Txt";
		try {
			out = new PrintWriter(new FileWriter(filePath));
			for (int i = 0; i < SIZE; i++) {
				out.println(" Value at: " + i + " = " + list.get(i));
			}

		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Resource is not closed");
				out.close();
			} else {
				System.out.println("Resource is closed");
			}
		}

	}
	
	public static void main(String[] args){
		HowToHandleExceptions exp= new HowToHandleExceptions();
		exp.writeList();
	}
}
