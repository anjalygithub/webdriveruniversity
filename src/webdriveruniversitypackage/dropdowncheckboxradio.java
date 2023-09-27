package webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowncheckboxradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement checkbox1= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		checkbox2.click();
		WebElement purple= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
		purple.click();
		Select drop = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		drop.selectByIndex(1);
		Select drop2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		drop2.selectByValue("maven");
		Select drop3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		drop3.selectByVisibleText("JQuery");
		WebElement drop4 = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		drop4.click();
		

	}

}
