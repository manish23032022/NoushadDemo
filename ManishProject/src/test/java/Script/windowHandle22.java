package Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow" + parentwindow );
		WebElement click =driver.findElement(By.id("newWindowBtn"));
		js.executeScript("arguments[0].scrollIntoView(true);", click);
		click.click();
	Set<String>	child=driver.getWindowHandles();
	for(String handle :child) {
		//if(!handle.equals(parentwindow)) {
		driver.switchTo().window(handle);
		
		
	}

	WebElement text =driver.findElement(By.id("firstName"));
	js.executeScript("arguments[0].scrollIntoView(true);", text);
		text.sendKeys("manish");
		Thread.sleep(4000);
		driver.switchTo().window(parentwindow);
	}

}
