package com.javapractice.stringoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Extract the Number from the String
public class StringG2 {
	public static void extractNumber(String input) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while (test > 0) {
			test -= 1;
			String s = sc.nextLine();
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(s);
			ArrayList<Long> as = new ArrayList<Long>();
			while (m.find())
				as.add(Long.parseLong(m.group()));

			Collections.sort(as);
			for (int i = as.size() - 1; i >= 0; i--) {
				String x = Long.toString(as.get(i));
				if (!x.contains("9")) {
					System.out.println(x);
					break;
				}
			}
		}
		sc.close();
	}

	public void differenApproach() {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t-- > 0) {
			String a = scan.nextLine();
			String[] arr = a.split("[^\\d]+");
			long max = 0;

			for (String st : arr) {
				if (!st.isEmpty()) {
					long n1 = Long.parseLong(st);
					if (n1 > max && !Contains(n1)) {
						max = n1;
					}
				}

			}

			System.out.println(max);
		}
		scan.close();

	}

	static boolean Contains(long n1) {
		while (n1 != 0) {
			if (n1 % 10 == 9) {
				return true;
			}
			n1 = n1 / 10;
		}
		return false;
	}
}
