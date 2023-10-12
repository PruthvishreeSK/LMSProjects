package com.ninjademo.qa.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.qa.base.TestBase;
import com.ninjademo.qa.pages.ProductPage;
import com.ninjademo.qa.pages.SearchPage;

public class TestProductPage extends TestBase{
	
	
	SearchPage sp;
	ProductPage pp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
		pp = new ProductPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void testproduct_addtocart() throws InterruptedException
	{
		
		sp.searchproduct();
		Thread.sleep(1000);
		sp.selectproduct();
		Thread.sleep(1000);
		pp.addtocart();
		
	}
}
