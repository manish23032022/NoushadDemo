package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(4000);
	WebElement daylist=driver.findElement(By.cssSelector("select#day"));
    Select s=new Select(daylist);
	s.selectByValue("15");
	
	Thread.sleep(4000);
	//WebElement monthlist=driver.findElement(By.cssSelector("select#month"));
	WebElement monthlist=driver.findElement(By.id("month"));
	Select s1=new Select(monthlist);
	s1.selectByValue("6");
	
	Thread.sleep(4000);
	WebElement yearlist=driver.findElement(By.id("year"));
	//WebElement yearlist=driver.findElement(By.id("month"));
	Select s2=new Select(yearlist);
	s2.selectByVisibleText("2022");
	 
	
	
		
	}

}
