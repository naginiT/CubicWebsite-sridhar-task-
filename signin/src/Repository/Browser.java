package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver driver;
	
	public static void Browser() {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		 
		   driver = new ChromeDriver();
	}
		   public static void opeen() {
		

			   driver.get("http://localhost:8081/OnlineHibernate/index.jsp");
	}
	

}
