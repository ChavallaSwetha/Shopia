package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Mona Lisa/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uae.shopia.com/");
		System.out.println("Hellow Shopia");
        System.out.println("Swetha for testing");
        
	}

}
