package com.javapractice.learningtime;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class LearnHttpConnection {

	@Test
	public void testURLConnection() {
		String test02URL = "https://dentest02.castlighthealth.com";

		try {
			URL url = new URL(test02URL);
			HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			urlConn.connect();
			System.out.println("Inside testurl");
			System.out.println(urlConn.getResponseCode());

			Assert.assertEquals(HttpURLConnection.HTTP_OK, urlConn.getResponseCode());
		} catch (IOException e) {
			System.err.println("Error creating HTTP connection");
			e.printStackTrace();
		
		}
	}

	
	
	public static void main(String[] args) throws Exception {
		LearnHttpConnection connect = new LearnHttpConnection();
		connect.testURLConnection();
		System.out.println("Inside main");
	}

}
