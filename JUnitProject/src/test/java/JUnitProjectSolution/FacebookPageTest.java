package JUnitProjectSolution;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPageTest {

	WebDriver driver;
	
	@BeforeAll
	static void start() {
	System.out.println("Test started executing");
	}
	
	@BeforeEach
	public void Launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	

	@ParameterizedTest(name = "CSV source {arguments}")
	
	@CsvSource({"pruthvi@mail.com , pruthvi123", "shree@mail.com, shree.p"})
	
	@DisplayName("Login Test")

	public void testlogin(String usermail, String password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(usermail);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		Thread.sleep(2000);
	}
	@DisplayName("Create Account Test")
	@RepeatedTest(2)
	public void testcreateAccount() throws InterruptedException
	{
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Pruthvi");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Bhat");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("Pruthvi@mail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Pruthvi123");
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
		Thread.sleep(2000);
	}
	
	@AfterEach
	public void closebrowser()
	{
		driver.quit();
		
	}
	
	@AfterAll
	static void end() {
	System.out.println("Tests execution completed");
	}
}
