package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("moneyiframe"));
		driver.switchTo().frame(ele);
		String s=driver.findElement(By.id("nseindex")).getText();
	
		System.out.println(s);
		
		//int wrong;
	
	}

}
