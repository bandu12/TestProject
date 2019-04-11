package com.src.test.TestLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.src.main.BaseLayer.NewTours_TestBase;
import com.src.main.PageLayer.HomePage;
import com.src.main.PageLayer.SignOnPage;

public class SignOnPageTest  extends NewTours_TestBase{

	HomePage hpage;
	SignOnPage spage;
	
	
	public SignOnPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		intialization();
		hpage= new HomePage();
		spage= new SignOnPage();
		
		hpage.clickOnSignOnButton();
		
	}
	
	@Test
	public void registrationFrom(){
		spage.clickOnRegistrationForm();
	}
	
	
}
