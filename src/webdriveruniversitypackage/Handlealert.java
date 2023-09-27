package webdriveruniversitypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		Alert alert =driver.switchTo().alert();
		driver.switchTo().alert().accept();
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"user_full_name\"]"));
		fullname.sendKeys("anjaly varghese");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"user_email_login\"]"));
		email.sendKeys("anjal@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
		password.sendKeys("123456");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"user_submit\"]"));
		submit.click();
		
		

	}

}
