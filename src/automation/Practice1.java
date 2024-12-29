package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement FN = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FN.sendKeys("Neha");
		
		WebElement LN = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LN.sendKeys("Pandey");
		
		WebElement AD = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		AD.sendKeys("krishna Vihar");
		Thread.sleep(2000);
		WebElement EA = driver.findElement(By.xpath("//input[@type='email']"));
		EA.sendKeys("npandey3670@gmail.com");
		WebElement PN = driver.findElement(By.xpath("//input[@type='tel']"));
		PN.sendKeys("9938292992");
		
		WebElement GR = driver.findElement(By.xpath("//input[@value='Male']"));
		GR.click();
		
		WebElement Cric = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		Cric.click();
		WebElement movies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		movies.click();
		WebElement Hoc = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		Hoc.click();
		Thread.sleep(2000);
		WebElement lan = driver.findElement(By.xpath("//div[@id='msdd']"));
	    lan.click();
		
		WebElement EN = driver.findElement(By.xpath("//a[normalize-space()='English']"));
		EN.click();
		WebElement Es = driver.findElement(By.xpath("//a[normalize-space()='Estonian']"));
		Es.click();
		WebElement Es1 = driver.findElement(By.xpath("//div[normalize-space()='Estonian']//span[@class='ui-icon ui-icon-close']"));
		Es1.click();
		
		WebElement Bo = driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
		Bo.click();
		Thread.sleep(2000);
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		skills.click();
		WebElement skills1 = driver.findElement(By.xpath("//option[@value='Client Support']"));
		skills1.click();
		WebElement Country = driver.findElement(By.xpath("//label[normalize-space()='Country*']"));
		Country.click();
		WebElement Country1 = driver.findElement(By.xpath("//select[@id='countries']"));
		Country1.click();
		WebElement Country2 = driver.findElement(By.xpath("//label[@for='usr']"));
		Country2.click();
		WebElement Country3 = driver.findElement(By.xpath("//b[@role='presentation']"));
		Country3.click();
		Thread.sleep(2000);
		WebElement Country4 = driver.findElement(By.xpath("//span[@role='combobox']"));
		Country4.click();
//		WebElement Country5 = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
//		Thread.sleep(2000);
//		Country5.click();
		//option[@value='1']
//		WebElement Country5 = driver.findElement(By.xpath("//footer[@id='footer']"));
//		Thread.sleep(2000);
//		Country5.click();
		
		WebElement DOB = driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		DOB.click();
		WebElement DOB1 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		DOB1.click();
		WebElement DOB2 = driver.findElement(By.xpath("//option[@value='1987']"));
		DOB2.click();
		WebElement DOB3 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		DOB3.click();
		WebElement DOB4 = driver.findElement(By.xpath("//option[@value='May']"));
		DOB4.click();
		WebElement DOB5 = driver.findElement(By.xpath("//select[@id='daybox']"));
		DOB5.click();
		WebElement DOB6 = driver.findElement(By.xpath("//option[@value='7']"));
		DOB6.click();
		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("Neha@1234");
		WebElement pass1 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		pass1.sendKeys("Neha@1234");
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		image.sendKeys("C:\\Users\\h262545\\Downloads\\AC.PNG");
		

//		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
//		submit.click();
		WebElement refresh = driver.findElement(By.xpath("//button[@id='Button1']"));
		refresh.click();
		
		
		

		
		
		
		//span[@id='select2-country-container']
		
		
		
		
		
		
		
		
		
		
	

}
}
