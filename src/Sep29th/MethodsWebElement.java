package Sep29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("New User Register Here")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		  	    
		

	}

}
