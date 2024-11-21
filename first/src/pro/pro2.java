package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\sel\\chromedrive.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.id("")).sendKeys("oo,ol,");
		driver.findElement(By.id("")).sendKeys("535524");
		driver.findElement(By.id("")).click();
	}

}
