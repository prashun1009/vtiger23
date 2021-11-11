package actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Luxire_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()= 'Account']"));
	
		Actions a = new Actions(driver);
		
		a.moveToElement(ele1).perform();
		//driver.findElement(By.id("customer_login_link")).click();
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		driver.findElement(By.id("CustomerEmail")).sendKeys("heloo@gmail.com");
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
