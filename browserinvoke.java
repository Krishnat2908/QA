package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.close();
		
	}

}
