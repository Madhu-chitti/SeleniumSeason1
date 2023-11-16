	package Sep26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsDriver2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getWindowHandles());
		driver.quit();

	}

}
