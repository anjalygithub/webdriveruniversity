package webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		WebElement add = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		add.sendKeys("Software ");
		// code for enter key
		add.sendKeys(Keys.ENTER);
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[4]"));
		delete.click();
		

	}

}
