package com.seleniumpractice.operations;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumOperations {
	public static final String MAKEMYTRIP_HOMETABS = ".//*[@class='tabs_list clearfix']/li[%s]//span[@class='tab_txt']";
	WebDriver webdriver = new FirefoxDriver();
//	SeleniumOperations operation = new SeleniumOperations();
	String url = "https://www.makemytrip.com";

	public void openUrl(String url) {
		webdriver.get(url);
	}

	@Test
	public void getWebElement() throws InterruptedException {
		openUrl(url);
		
		for(int i=3; i<8; i++){
			webdriver.findElement(By.xpath(String.format(MAKEMYTRIP_HOMETABS, i))).click();
//		}
//		List<WebElement> list = webdriver.findElements(MAKEMYTRIP_HOMETABS);
//		for (WebElement element : list) {
//			System.out.println(element.getText());
//			element.click();
			webdriver.navigate().back();
			Thread.sleep(6000);
		}
		
		webdriver.close();
	}

}
