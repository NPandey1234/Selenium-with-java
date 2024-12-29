package automation;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tab_switch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//driver.switchTo().window("https://www.instagram.com/accounts/login/?hl=en");
		WebElement INST = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		Thread.sleep(2000);
		INST.click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		String pw=driver.getWindowHandle();    //parent ID
		Set<String> aw=driver.getWindowHandles();  //child ID 
		for(String i:aw) {
			if(!(pw.equals(i))) {
				driver.switchTo().window(i);
			}
		}
		


		Thread.sleep(2000);
		
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("nehapandey125");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Neha@1234");
		
		
		//input[@name='password']

	}


		
		
		
		
	
		

}

