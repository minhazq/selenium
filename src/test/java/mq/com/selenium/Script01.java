package mq.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script01 {

	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com");
	}
}
