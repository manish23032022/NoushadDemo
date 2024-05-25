package Script;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 System.out.println("first window" + driver.getTitle());
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.facebook.com");
		 System.out.println("2nd window "+ driver.getTitle());

	}

}
