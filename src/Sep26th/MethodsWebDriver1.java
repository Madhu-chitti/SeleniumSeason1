package Sep26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.adactinhotelapp.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		driver.findElement(By.linkText("New User Register Here")).click();
		
		//driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("https://www.facebook.com/");
		//close():void this method will close the window or tab only one tab
		//driver.close();
		//quit():void this method close all the tabs open during the session
		driver.quit();
		

	}

}
