package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement EC =driver.findElement(By.xpath("//input[@name=\"username\"]"));
		EC.sendKeys("Admin");
		WebElement NP =driver.findElement(By.xpath("//input[@name=\"password\"]"));
		NP.sendKeys("admin123");
		WebElement LN =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		LN.click();
		Thread.sleep(2000);
		WebElement Buzz =driver.findElement(By.xpath("//a[@href=\"/web/index.php/buzz/viewBuzz\"]"));
		Buzz.click();
		Thread.sleep(2000);
		WebElement mind =driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		mind.sendKeys("NTGP");
		WebElement post =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		post.click();
		
		
		
		
		
		
				
		}

}
