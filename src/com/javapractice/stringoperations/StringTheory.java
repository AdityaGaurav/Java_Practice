package com.javapractice.stringoperations;


public class StringTheory {
	String fullName;
	int i;

	public String checkString() {
		String first = "Aditua";
		String last = "Aditya";
		String result = (first == last ? "Both are same" : "Both are not same");
		return result;
	}

	public void stringIsImmutable() {
		// The most direct way to create a string is to write:
		// In this case, "Aditya" is a string literal.a series of characters in
		// your code
		// that is enclosed in double quotes.
		String fName = "Aditya";
		String lName = "Aditya";

		String str = new String("Aditya");
		System.out.println("============================");
		if (fName == lName) {
			System.out.println("both are same");
		} else {
			System.out.println("Both are not same");
		}

		if (fName == str) {
			System.out.println("fName and str are same with '==' operator");
		} else {
			System.out.println("fName and str are not same '==' operator");
		}
		if (fName.equals(str)) {
			System.out.println("fName and str are same with equals() method");
		} else {
			System.out.println("fName and str are not same with equals() method");
		}

		System.out.println("============================");
		char[] abc = { 'A', 'd', 'i', 't', 'y', 'a' };
		String data = new String(abc);
		System.out.println("============================");
		if (data == fName) {
			System.out.println("Both are same: +char() array");
		} else {
			System.out.println("Both are not same: +char array");
		}
		if (data.equals(fName)) {
			System.out.println("Both are same: +char() array with equals method");
		} else {
			System.out.println("Both are not same: +char array with equals method");
		}
		System.out.println("============================");
		/*
		 * Returns a canonical representation for the string object. A pool of
		 * strings, initially empty, is maintained privately by the class
		 * String.
		 * 
		 * When the intern method is invoked, if the pool already contains a
		 * string equal to this String object as determined by the
		 * equals(Object) method, then the string from the pool is returned.
		 * Otherwise, this String object is added to the pool and a reference to
		 * this String object is returned.
		 * 
		 * It follows that for any two strings s and t, s.intern() == t.intern()
		 * is true if and only if s.equals(t) is true.
		 * 
		 * All literal strings and string-valued constant expressions are
		 * interned. String literals are defined in section 3.10.5 of the The
		 * Java™ Language Specification.
		 * 
		 * Returns: a string that has the same contents as this string, but is
		 * guaranteed to be from a pool of unique strings.
		 * 
		 */
		System.out.println(str.intern() + " : intern()");
		if (fName.intern() == str.intern()) {
			System.out.println("fName and str are same+ intern() ");
		} else {
			System.out.println("fName and str are not same+intern()");
		}
		System.out.println("============================");
		String first = "Gaurav";
		String first2 = "Gau";
		String last = first2.concat("rav");
		if (first == last) {
			System.out.println("fName and str are same+ concat() ");
		} else {
			System.out.println("fName and str are not same+ concat()");
		}
		if (first.equals(last)) {
			System.out.println("Both are same: +char() array with concat method");
		} else {
			System.out.println("Both are not same: +char array with concat method");
		}
	}

	public static void main(String[] args) {
		StringTheory str = new StringTheory();
		String fName = "";
		String lName = null;
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(str.fullName);
		System.out.println(str.i);
		System.out.println(str.checkString());
	}

}
