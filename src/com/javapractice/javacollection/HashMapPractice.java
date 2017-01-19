package com.javapractice.javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public void howToDeclareHasMap() {

		Map<Integer, String> mapObject = new HashMap<Integer, String>();
		mapObject.put(1, "Aditya");
		mapObject.put(2, "Anand");
		mapObject.put(3, "Ankit");
		mapObject.put(1, "Gaurav");

		// Iterating or looping map using Java5 foreach loop
		System.out.println("Iteration Over HashMap Using foreach loop");
		for (Integer key : mapObject.keySet()) {

			System.out.println("Key: " + key + " values: " + mapObject.get(key));
		}

		// Iterating Map in Java using KeySet Iterator
		System.out.println("\n\nIterating Map in Java using KeySet Iterator");
		// Getting Set of keys for Iteration
		Set<Integer> keySet = mapObject.keySet();
		// Using Iterator to loop Map in Java,
		Iterator<Integer> itr = keySet.iterator();
		// Iterator begins
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println("key: " + key + " value: " + mapObject.get(key));

		}

		// Looping HashMap in Java using EntrySet and Java 5 for loop
		System.out.println("\n\nLooping HashMap in Java using EntrySet and Java 5 for loop");
		Set<Map.Entry<Integer, String>> entrySet = mapObject.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}

		// Iterating HashMap in Java using EntrySet and Java iterator
		System.out.println("\n\nIterating HashMap in Java using EntrySet and Java iterator");
		Set<Map.Entry<Integer, String>> entrySet1 = mapObject.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet1.iterator();
		while (entrySetIterator.hasNext()) {
			Map.Entry<Integer, String> entry = entrySetIterator.next();
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		new HashMapPractice().howToDeclareHasMap();

	}

}
