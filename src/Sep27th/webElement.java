package Sep27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
