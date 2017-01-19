package com.javapractice.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UseOfAssert {
	public static SoftAssert soft = new SoftAssert();

	@Test
	public void softassertMethod() {
        Assert.assertTrue(2 > 1);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		soft.assertTrue(2 > 1);
		soft.assertTrue(2 < 1);
		soft.assertEquals(5, 4);
		soft.assertAll();

	}

}
