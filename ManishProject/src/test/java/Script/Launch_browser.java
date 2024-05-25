package Script;

import java.nio.file.Path;

import javax.sound.midi.Patch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone14");
		//String inventry = 
				
				
				
		//driver.findElement(By.cssSelector("span._1CzsRN")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='plus back cover']")).click();
		
	}

}
