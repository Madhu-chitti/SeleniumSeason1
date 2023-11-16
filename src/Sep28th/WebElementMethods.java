package Sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(string):void this method will lunch app
		driver.get("https://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("username")).sendKeys("reyaz009");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("username_span")).getText());
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));*/
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("color"));
		System.out.println(driver.findElement(By.className("build_title")).getTagName());
		System.out.println(driver.findElement(By.id("username")).getLocation().x);
		System.out.println(driver.findElement(By.id("username")).getLocation().y);
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());

		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
