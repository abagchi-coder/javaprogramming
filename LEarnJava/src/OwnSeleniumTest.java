//Program to test successful login to GitHub
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OwnSeleniumTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
	       driver.get("https://github.com/");
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div[2]/a")).click();
	       WebDriverWait wait = new WebDriverWait(driver, 10);
	       WebElement Login_Fld = wait.until(
	       ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'login_field\']")));
	       WebElement pwd_Fld = driver.findElement(By.xpath("//*[@id=\'password\']"));
	       Login_Fld.sendKeys("arunadityabagchi@gmail.com");
	       pwd_Fld.sendKeys("Sunshine@10");
	       driver.findElement(By.xpath("//*[@id='login']/div[4]/form/div/input[11]")).click();
	       String actual_title = driver.getTitle();
	       String expected_title ="GitHub";
	       if(actual_title.equalsIgnoreCase(expected_title)) {
	    	System.out.println("Test Passed");
	       }
	    	else {
	    		System.out.println("Test Failed");
	    	}
	       driver.close();
	}
}	
