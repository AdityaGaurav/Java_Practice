package com.javapractice.javacollection.listcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperation {
	public void allArrayListMethod() {
		// Creation of ArrayList
		List<String> lst = new ArrayList<String>();

		String s1 = "Aditya";

		lst.add("Aditya");
		lst.add("Gaurav");
		lst.add(s1);

		// Using Contains method
		if (lst.contains("Aditya")) {
			System.out.println("Match Found");

		} else {
			System.out.println("Not Found");
		}

		// Iteration of ArrayList using Advanced For loop
		System.out.println("\n" + "Iteration of ArrayList using Advanced For loop");
		for (String tmp : lst) {
			System.out.println(tmp);
		}

		// Iteration of ArrayList using for loop
		System.out.println("\n" + "Iteration of ArrayList using  For loop");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		// Iteration of ArrayList using Iterator loop
		System.out.println("\n" + "Iteration of ArrayList using Iterator loop");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Iteration of ArrayList using While loop
		System.out.println("\n" + "Iteration of ArrayList using While loop");
		int j = 0;
		while (lst.size() > j) {
			System.out.println(lst.get(j));
			j++;
		}

		// check whether ArrayList is Emplty
		System.out.println("\n" + lst.isEmpty());

		// Converting ArrayList into array of String
		System.out.println("\n" + "Converting ArrayList into array of String");
		String[] str = lst.toArray(new String[lst.size()]);
		System.out.println(str[1]);

	}

	public void doPrcticeOfMethoda() {
		List<Integer> lst = new ArrayList<Integer>();

		lst.add(10);
		lst.add(0, 1);
		lst.add(11);
		lst.add(12);
		lst.add(13);

		List<Integer> lst2 = new ArrayList<Integer>();
		boolean result = lst2.addAll(lst);
		System.out.println(result);

		Integer[] intArray = lst2.toArray(new Integer[lst2.size()]);
		for (int read : intArray) {
			System.out.println(read);
		}
        System.out.println("\n"+"Iterator");
		Iterator<Integer> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

	public static void main(String[] args) {
		new ArrayListOperation().doPrcticeOfMethoda();

	}
}
