package JUnitProjectSolution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchEngine {
	
	WebDriver driver;
	
	@BeforeEach
	public void Launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"what is selenium"})
	@DisplayName("Test Google Search Engine")
	public void searchtest(String searchtext) throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys(searchtext);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='wM6W7d'])[3]")).click();
		
		Thread.sleep(2000);
	}
	
	@AfterEach
	public void closebrowser()
	{
		driver.quit();
		
	}
	

}
