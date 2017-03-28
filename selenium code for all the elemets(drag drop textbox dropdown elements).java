import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webuy2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nitin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uk.webuy.com//");
		driver.findElement(By.name("stext")).sendKeys("Iphone");
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[1]/form/div[4]/ul/li/span")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[1]/div[3]/div/a[2]/div/span")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[2]/div[3]/div/a[2]/div/span")).click();
		driver.findElement(By.xpath(".//*[@id='buyBasketRow']/td[2]/a")).click();
		driver.findElement(By.xpath(".//html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[5]/a/img")).click();
	    Select count=new Select(driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/div/select")));
	    count.selectByIndex(1);
	    
	
	}

}

