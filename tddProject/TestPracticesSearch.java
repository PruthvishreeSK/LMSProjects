package tddProject;

import org.testng.annotations.Test;

public class TestPracticesSearch {

	@Test
	public void findpractices1()
	{
		
		String course = "DevOps";
		
		int ExpectedPractices = 47;
		
		PracticeSearch ps = new PracticeSearch();
		
		int actualcount = ps.getPractices(course);
		
		System.out.println("Course: "+course+"\nExpected Practices count= "+ExpectedPractices+"\nActual Practices count= "+actualcount);
		
	}
	
	@Test
	public void findpractices2()
	{
		
		String course = "Big Data";
		
		int ExpectedPractices = 50;
		
		PracticeSearch ps = new PracticeSearch();
		
		int actualcount = ps.getPractices(course);
		
		System.out.println("Course: "+course+"\nExpected Practices count= "+ExpectedPractices+"\nActual Practices count= "+actualcount);
		
	}
	
	@Test
	public void findpractices3()
	{
		
		String course = "";
		
		PracticeSearch ps = new PracticeSearch();
		
		ps.getPractices(course);
		
	}
	

	@Test
	public void findpractices4()
	{
		
		String course = "Testing";
		
		PracticeSearch ps = new PracticeSearch();
		
		ps.getPractices(course);
	
	}
	
}
