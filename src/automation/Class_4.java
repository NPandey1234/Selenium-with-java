package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

final class Class_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement UC = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions(driver);
		a.moveToElement(UC).perform();
		WebElement UC1 = driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		a.moveToElement(UC1).perform();
		WebElement UC3 = driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		a.moveToElement(UC3).perform();
		UC3.click();
		
		
	}

}
