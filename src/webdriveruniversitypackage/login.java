package webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html?");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("text"));
		username.sendKeys("anjaly@123");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		
		

	}

}
