package Script;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit
		
		driver.switchTo().frame("moneyiframe");
		//WebElement ele=driver.findElement(By.id("nseindex"));
		//driver.switchTo().frame(ele);
		//String s=	ele.getText();
		String s=driver.findElement(By.id("nseindex")).getText();
		System.out.println(s);
		

	
	}
}
