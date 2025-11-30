import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class New {

		@Test
		public void TestGoogle() throws Exception {
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("cdac", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}

}
