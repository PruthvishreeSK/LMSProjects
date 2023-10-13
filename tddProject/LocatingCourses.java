package tddProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatingCourses {

	WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
	}
	
	@Test
	public void gettitle() {
			
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	@Test
	public void search() throws InterruptedException {
		
		driver.findElement(By.id("header_srch")).sendKeys("DevOps");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='icon-card pg-program']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
}
