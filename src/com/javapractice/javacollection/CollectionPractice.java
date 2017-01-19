package com.javapractice.javacollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {

	public void arrayListDeclaration() {
		List<String> employyeename = new ArrayList<String>();
		  List<Integer> employyeeID= new ArrayList<Integer>();
		  employyeename.add("addity");
		  employyeeID.add(12103);
		  Map<List<String>,List<Integer>>employyeeDtails =new HashMap<List<String>,List<Integer>>();
		  employyeeDtails.put(employyeename, employyeeID);
		  
	}

	public static void main(String[] args) {

	}

}
