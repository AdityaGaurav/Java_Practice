package com.javapractice.stringoperations;

public class StringMethodExamples {

	// Char charAt(int i): Returns the character at ith index.
	public void charToArrayMethod() {
		String s1 = "hello";
		System.out.println(s1.charAt(3));
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
			// System.out.printf("%1s ",ch[i]);
		}

		System.out.println("================");
		for (char ele : ch) {
			System.out.println(ele);
		}
	}

	// Methods used to obtain information about an object are known as accessor
	// methods. One accessor method that you can use with strings is the
	// length() method,
	// int length(): Returns the number of characters in the String.
	public void lengthOfString() {
		String str = "Aditya";
		String str1 = "Aditya ";
		System.out.println(str.length());
		System.out.println(str1.length());
	}

	// String substring (int i): Return the substring from the ith index
	// character to end.
	// String substring (int i, int j): Returns the substring from i to j-1
	// index.
	public void subStrinMethod() {
		String str = "AdityaGauravji";
		String result = "";
		System.out.println(str.substring(str.length()));
		System.out.println(str.substring(str.length(),str.length()));
		System.out.println("======================");
		result = str.substring(6, str.length());
		System.out.println(result);
		System.out.println(str.substring(0));
		System.out.println(str.substring(0).length());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1).length());
		System.out.println(str.substring(0, 6));
		System.out.println(str.substring(0, 6).length());
		System.out.println(str.substring(6));
		System.out.println(str.substring(6).length());
		System.out.println(str.substring(6, 12));
		System.out.println(str.substring(6, 12).length());
		System.out.println(str.substring(12, 14));
		System.out.println(str.substring(12, 14).length());
	}

	// String concat( String str): Concatenates specified string to the end of
	// this string.
	public void concatMethod() {
		@SuppressWarnings("unused")
		String first = "Aditya", last1 = "gaurav";
		String last = "Gaurav";
		String whiteSpace = " ";
		String result = first.concat(whiteSpace);
		String finalResult = result.concat(last);
		System.out.println(first.concat(last));
		System.out.println(finalResult);
	}

	// int indexOf (String s): Returns the index within the string of the first
	// occurrence of the specified string.
	// int indexOf (String s, int i): Returns the index within the string of the
	// first occurrence of the specified
	// Int lastindexOf( int ch): Returns the index within the string of the last
	// occurrence of the specified string.

	// The indexOf() methods search forward from the beginning of the string,
	// and the lastIndexOf() methods search backward from the end of the string.
	// If a character or substring is not found, indexOf() and lastIndexOf()
	// return -1.

	// int indexOf(int ch)
	// int lastIndexOf(int ch)

	// int indexOf(int ch, int fromIndex)
	// int lastIndexOf(int ch, int fromIndex)

	// int indexOf(String str)
	// int lastIndexOf(String str)

	// int indexOf(String str, int fromIndex)
	// int lastIndexOf(String str, int fromIndex)

	public void indexOfMethod() {
		String fullName = "Aditya Gaurav Tripathi Aditya";
		String str = "Aadityay5adiid Adityayadiid it ii id Adit yay";
		System.out.println(str.indexOf("5"));
		System.out.println(str.indexOf("it", 12));

		String fullName1 = "Aditya GaAurAv";

		System.out.println(fullName1.indexOf("A"));
		System.out.println(fullName1.lastIndexOf("A"));
		System.out.println(fullName1.indexOf("ay"));

		System.out.println(fullName1.indexOf("ya"));
		System.out.println(fullName1.lastIndexOf("ya"));

		System.out.println("=======================");

		System.out.println(fullName.indexOf('A'));
		System.out.println(fullName.indexOf(""));
		System.out.println(fullName.indexOf(" "));
		System.out.println(fullName.indexOf('z'));
		System.out.println(fullName.indexOf('a'));
		System.out.println(fullName.indexOf("a"));
		System.out.println(fullName.indexOf("Gaurav"));
		System.out.println(fullName.indexOf("Aditya", 1));
		System.out.println(fullName.lastIndexOf("Aditya"));
		System.out.println(fullName.lastIndexOf('i'));
	}

	// boolean equalsIgnoreCase (String anotherString): Compares string to
	// another string, ignoring case considerations.
	public void equalsIgnoreCaseMethod() {
		String first = "Aditya";
		String last = "aditYa";

		if (first.equals(last)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		System.out.println("-------------------------");
		if (first.equalsIgnoreCase(last)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	// int compareToIgnoreCase( String anotherString): Compares two string
	// lexicographically, ignoring case considerations.
	// int compareTo( String anotherString): Compares two string
	// lexicographically.

	public void compareTomethod() {
		String first = "Aditya";
		String last = "Aditya";
		String last2 = "Aditya G";
		String last3 = "Adi";
		String last4 = "adITya";

		int result = first.compareTo(last);
		int result1 = first.compareTo(last2);
		int result2 = first.compareTo(last3);
		int result3 = first.compareToIgnoreCase(last4);

		//// The result is a negative integer:
		// if this String object lexicographically precedes the argument string.
		// The result is a positive integer:
		// if this String object lexicographically follows the argument string.
		// The result is zero:
		// if the strings are equal; compareTo returns 0 exactly when the
		//// equals(Object) method would
		// return true.

		System.out.println(result + " : compareTo()");
		System.out.println(result1 + " : compareTo()");
		System.out.println(result2 + " : compareTo()");
		System.out.println(result3 + " : compareToIgnoreCase()");

	}

	// String toLowerCase(): Converts all the characters in the String to lower
	// case.
	public void toLowerCaseMethod() {
		String name = "AdItYa";
		System.out.println(name.toLowerCase());
	}

	// String toUpperCase(): Converts all the characters in the String to upper
	// case.
	public void toUpperCaseMethod() {
		String name = "aditya gaurav";
		System.out.println(name.toUpperCase());
	}

	// String trim(): Returns the copy of the String, by removing whitespaces at
	// both ends. It does not affect whitespaces in the middle.
	public void trimMethod() {
		String fullName = "    Aditya Gaurav Tripathi .";
		System.out.println(fullName);
		System.out.println(fullName.length());
		System.out.println(fullName.trim());
		System.out.println(fullName.trim().length());
	}

	// String replace (char oldChar, char newChar): Returns new string by
	// replacing all occurrences of oldChar with newChar.

	// Replaces each substring of this string that matches the literal target
	// sequence with the specified literal replacement sequence.
	// String replace(CharSequence target, CharSequence replacement)

	// Replaces each substring of this string that matches the given regular
	// expression with the given replacement.
	// String replaceAll(String regex, String replacement)

	// Replaces the first substring of this string that matches the given
	// regular expression with the given replacement.
	// String replaceFirst(String regex, String replacement)
	public void replaceMethod() {
		String fname = "zdityz";
		String reg1 = "zz";
		String str = "Azz Bzz";
		System.out.println(str.replaceFirst(reg1, "aa"));
		System.out.println(str.replaceAll(reg1, "aa"));

		System.out.println(fname.replace('z', 'a'));

	}

	// java string contains() method searches the sequence of characters in this
	// string. It returns true if sequence of char values are found in this
	// string otherwise returns false.
	public void containsMethod() {
		String fName = "Aditya Gaurav Tripathi";
		String sName = "Gau";
		String lName = "av Tri";
		boolean result = fName.contains(sName);
		boolean result1 = fName.contains(lName);
		System.out.println(result);
		System.out.println(result1);
	}

	// java.lang.String.contentEquals(CharSequence cs) method compares this
	// string to the specified CharSequence. The result is true if and only if
	// this String represents the same sequence of char values as the specified
	// sequence.
	public void contentEqualsMethod() {
		CharSequence cs = "Aditya";
		String name = "Aditya";
		boolean result = name.contentEquals(cs);
		System.out.println(result);
	}

	// isEmpty() :Returns true if, and only if, length() is 0.
	public void isEmptyMethod() {
		String str = "";
		// String str1 = null;
		String str2 = "Aditya";
		System.out.println(str.isEmpty());
		// System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
	}

	// Searches for a match as specified by the string argument (which contains
	// a regular expression) and splits this string into an array of strings
	// accordingly.
	// String[] split(String regex)
	// String[] split(String regex, int limit)
	// The optional integer argument specifies the maximum size of the returned
	// array.
	public void splitMethod() {
		String str = "a d, m, i.n";
		String delimiters = "\\s+|,\\s*|\\.\\s*";

		// analyzing the string
		String[] tokensVal = str.split(delimiters);

		// prints the number of tokens
		System.out.println("Count of tokens = " + tokensVal.length);

		for (String token : tokensVal) {
			System.out.print(token);
		}
	}

	public void splitMethod2() {
		/*
		 * limit > 0 : If this is the case then the pattern will be applied at
		 * most limit-1 times, the resulting array’s length will not be more
		 * than n, and the resulting array’s last entry will contain all input
		 * beyond the last matched pattern. 
		 * limit < 0 : In this case, the
		 * pattern will be applied as many times as possible, and the resulting
		 * array can be of any size. 
		 * limit = 0 : In this case, the pattern will
		 * be applied as many times as possible, the resulting array can be of
		 * any size, and trailing empty strings will be discarded.
		 */
		String str = "Geeks for Geeks";
		String reg = " ";
		String[] arrayofString = str.split(reg);
		for (String ele : arrayofString) {
			System.out.println(ele);
		}
		System.out.println("==========================");
		String str2 = "Geekss@for@Geek@ss";
		String reg2 = "@";
		String[] arrayOfStr = str2.split(reg2, 2);
		for (String ele : arrayOfStr) {
			System.out.println(ele);
		}
	}

	// boolean equals( Object otherObj): Compares this string to the specified
	// object.
	public void useOfEquals() {
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		if (s1 == s3) {
			System.out.println("Both are equals");
		} else {
			System.out.println("Not equals");
		}
		String s4 = s3.intern();
		if (s1 == s4) {
			System.out.println("Both are equals");
		} else {
			System.out.println("Not equals");
		}
		if (s2.equals(s3)) {
			System.out.println("Both are equals. Using equals");

		} else {
			System.out.println("Not equals");
		}

	}

	public static void main(String[] args) {
		new StringMethodExamples().subStrinMethod();
	}

}
