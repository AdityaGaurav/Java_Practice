package com.javapractice.stringoperations;

public class StringBuilderMethodExamples {

	public void howToCreatStringBuilder() {
		// Constructs a string builder with no characters in it and an initial
		// capacity of 16 characters.
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		// Constructs a string builder initialized to the contents of the
		// specified string.
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1.capacity());

		// Constructs a string builder with no characters in it and an initial
		// capacity specified by the capacity argument.
		StringBuilder sb2 = new StringBuilder(18);
		System.out.println(sb2.capacity());

		// Constructs a string builder that contains the same characters as the
		// specified CharSequence.
		CharSequence cs = "Aditya";
		StringBuilder sb3 = new StringBuilder(cs);
		System.out.println(sb3.capacity());
		System.out.println(sb3.append(" Gaurav"));
	}

	// public StringBuilder append(Object obj)
	// public StringBuilder append(String str)
	// public StringBuilder append(StringBuffer sb)
	// public StringBuilder append(CharSequence s)
	// public StringBuilder append(CharSequence s,int start,int end)
	// public StringBuilder append(char[] str)
	// public StringBuilder append(char[] str, int offset,int len)
	// public StringBuilder append(boolean b)
	// public StringBuilder append(char c)
	// public StringBuilder append(int i)
	// public StringBuilder append(long lng)
	// public StringBuilder append(float f)
	// public StringBuilder append(double d)
	public void appendMethod() {
		StringBuilder sb1 = new StringBuilder("Hello");
		String str = null;
		sb1.append(" Aditya");
		System.out.println(sb1);
		sb1.append(str);
		System.out.println(sb1);
	}

	public void insertMethod() {
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1);
		StringBuilder sb2 = sb1.insert(5, " Aditya");
		System.out.println(sb2);
		System.out.println(sb1);
	}

	// StringBuilder replace(int start, int end, String str)
	// Replaces the characters in a substring of this sequence with characters
	// in the specified String.
	public void replaceMethod() {
		StringBuilder sb1 = new StringBuilder("Adixxa");
		sb1.replace(3, 5, "ty");
		System.out.println(sb1);
	}

	// StringBuilder delete(int start, int end)
	// Removes the characters in a substring of this sequence.
	public void deleteMethod() {
		StringBuilder sb1 = new StringBuilder("Adixxa");
		sb1.delete(3, sb1.length());
		System.out.println(sb1);

	}

	public void reverseMethod() {
		StringBuilder sb1 = new StringBuilder("Aditya");
		sb1.reverse();
		System.out.println(sb1);

	}

	public void equalsMethod() {
		StringBuilder sb1 = new StringBuilder("Aditya");
		StringBuilder sb2 = new StringBuilder("Aditya");

		boolean isSame = true;
		if (sb1.length() == sb2.length()) {
			
			for (int i = 0; i < sb1.length(); i++) {
				if (sb1.charAt(i) != sb2.charAt(i)) {
					isSame = false;
					break;
				}
			}

		} else {
			isSame = false;
		}

		if (isSame) {
			System.out.println("both are same");
		} else {
			System.out.println("both are different");
		}
		
		if(sb1.toString().equals(sb2.toString())){
			System.out.println("Both are same: equals()");
			
		}else{
			System.out.println("Bothe are not sane: equals()");
		}
		
	}

	public static void main(String[] args) {
		StringBuilderMethodExamples sbe = new StringBuilderMethodExamples();
		sbe.equalsMethod();

	}

}
