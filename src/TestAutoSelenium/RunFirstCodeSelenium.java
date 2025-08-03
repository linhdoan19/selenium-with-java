
package TestAutoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunFirstCodeSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Dowload\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://anhtester.com");

		System.out.println(driver.getTitle());

		System.out.println('hi there');

		
		Thread.sleep(2000);
		// Thoát hẳn Browser

		driver.quit();

	}

}
