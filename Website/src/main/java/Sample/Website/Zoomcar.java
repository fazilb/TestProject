package Sample.Website;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zoomcar.com/");
		Thread.sleep(4000);
	    List<WebElement> element = driver.findElements(By.xpath("//div[@class='cities p-cities']"));
	//	System.out.println(element.size());
		for(int i=0; i<element.size(); i++) 
		{
		 System.out.println(element.get(i).getText());
		}
		System.out.println("----------------------------------------------");
		WebElement city = driver.findElement(By.xpath("//div[@class='cities other-cities']"));
		System.out.println( city.getText());
		Thread.sleep(2000);
		System.out.println("----------------------------------------------");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		System.out.println("Self Drive Car Rental in: Chennai");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[text()='Start your wonderful journey']")).click();
		Thread.sleep(2000);
	}
	
}
