package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_skill {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("course"));
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text() ='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		
		//driver.switchTo().alert().accept();
		Alert ele1 = driver.switchTo().alert();
		System.out.println(ele1.getText());
		ele1.accept();
		
		
	}

}
