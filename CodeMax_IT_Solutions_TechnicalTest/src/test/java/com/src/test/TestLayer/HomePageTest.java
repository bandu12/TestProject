package com.src.test.TestLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.src.main.BaseLayer.NewTours_TestBase;
import com.src.main.PageLayer.HomePage;

public class HomePageTest extends NewTours_TestBase {

	HomePage hPage;
	
	public  HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		intialization();
		hPage= new HomePage();
	}
	@Test
	public void HomepageTest() {
		
		hPage.clickOnSignOnButton();
	}
	
}
