package webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();	
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		fullname.sendKeys("ANJALY VARGHESE");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lastname.sendKeys("VARGHESE");
		WebElement email =driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("anjalyvarghesemail.com");
		WebElement comment = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comment.sendKeys("Nice Webpage");
		//WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		//submit.click();
		//WebElement reset= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		//reset.click();
		

	}

	
}
