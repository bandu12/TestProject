package com.src.test.TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.src.main.BaseLayer.NewTours_TestBase;
import com.src.main.PageLayer.FilghtBookedDetailed;
import com.src.main.PageLayer.HomePage;
import com.src.main.PageLayer.RegisterForm;
import com.src.main.PageLayer.SignOnPage;
import com.src.main.Reader.Reader;

public class RegisterFormPageTest extends NewTours_TestBase {

	HomePage hpage;
	SignOnPage spage;
	RegisterForm rpage;
	Reader reder;
	FilghtBookedDetailed fpage;

	String sheetName = "Sheet1";
	String sheetName2 = "Sheet2";
	String sheetName3 = "Sheet3";

	public RegisterFormPageTest() {
		super();

	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		intialization();
		hpage = new HomePage();
		spage = new SignOnPage();
		rpage = new RegisterForm();
		reder = new Reader();
		fpage= new FilghtBookedDetailed();
		

		hpage.clickOnSignOnButton();
		spage.clickOnRegistrationForm();

	}

	@DataProvider
	public Object[][] getFormData() {
		Object data[][] = Reader.getTestData(sheetName);
		return data;
	}

	@DataProvider
	public Object[][] getFormData2() {
		Object data[][] = Reader.getTestData(sheetName2);
		return data;
	}
	
	

	
	@Test(dataProvider = "getFormData", priority = 1)
	public void validateFillForm(String FirstName, String LastName, String Phone, String Email, String Address,
			String City, String State, String PostalCode, String Country, String UserName, String Password,
			String Cpassword, String User_Name, String Pass) throws InterruptedException {
		rpage.fillTheData(FirstName, LastName, Phone, Email, Address, City, State, PostalCode, Country, UserName,
				Password, Cpassword);
	}

	@Test(dataProvider = "getFormData2", priority = 2)
	public void credentialTest(String UserName, String Password) {
		rpage.credential(UserName, Password);
	}

	@Test(priority = 3)
	public void test3() throws InterruptedException {

		rpage.setDetails();

	}
	@Test(priority=4)
	public void addDetailsAboutTicket(){
		
		fpage.setTicketDetails();
		fpage.bookingConformation();
	}

}
