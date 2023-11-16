package Sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsWebelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.echoecho.com/htmlforms09.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.name("option2")).getAttribute("chechked"));
		driver.quit();
		
	}

}
