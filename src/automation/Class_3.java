package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	WebElement SS1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	SS1.click();
	Alert SS = driver.switchTo().alert();
	SS.accept();
	WebElement SS2 = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	SS2.click();
	WebElement SS3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	SS3.click();
	driver.switchTo().alert();
	SS.dismiss();
	WebElement SS4 = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
	SS4.click();
	
	WebElement SS5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	SS5.click();
	driver.switchTo().alert();
	SS.sendKeys("Neha testing");
	SS.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}