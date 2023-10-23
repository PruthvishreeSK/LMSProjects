package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testamazon {

	WebDriver driver;
	
	//Using hooks
	@Before
	public void openbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("I am on amazon page")
	public void i_am_on_amazon_page() {
	    
		driver.get("https://www.amazon.in/");
	}

	@Then("I click on Mobiles")
	public void i_click_on_mobiles() throws InterruptedException {
	    
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(5000);
	}

	

	@When("I hover over Mobiles & Accessories")
	public void i_hover_over_mobiles_accessories() throws InterruptedException {
	    
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobile).build().perform();
		
		Thread.sleep(5000);
	}
	
	@Then("I click on Apple")
	public void i_click_on_apple() {
	    
		driver.findElement(By.linkText("Apple")).click();
	}
	
	@When("I select one of the products of Apple say Pencil")
	public void i_select_apple_i_phone_15_blue() {
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[8]")).click();
	}
	
	@Then("Product opens on a new Window")
	public void product_opens_on_new_window() throws InterruptedException {
	    
		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
		
		Thread.sleep(3000);
		
	}

	@Then("I click on Add to Cart")
	public void i_click_on_add_to_cart() throws InterruptedException {
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(3000);
	}

	@After
	public void i_close_all_tabs() {
	    
		driver.quit();
	}
	
}
