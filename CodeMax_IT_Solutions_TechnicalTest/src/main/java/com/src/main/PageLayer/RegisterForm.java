package com.src.main.PageLayer;

import java.util.List;

import org.apache.poi.hssf.util.HSSFColor.SKY_BLUE;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.src.main.BaseLayer.NewTours_TestBase;

public class RegisterForm extends NewTours_TestBase {

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement email;

	@FindBy(xpath = "//input[@name='address1']")
	WebElement address;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(xpath = "//input[@name='email']")
	WebElement uName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@name='register']")
	WebElement submitButton;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")
	WebElement signInLink;
	
	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password' and @type='password']")
	WebElement pass;

	@FindBy(xpath = "//input[@name='login']")
	WebElement button;
	
	@FindBy(xpath="//input[@value='oneway' ]")
	WebElement oneway;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passCount;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departure;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement fromDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElement arrivePlace;
	
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement tomonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElement today;
	
	@FindBy(xpath="//input[@value='Business']")
	WebElement classBooking;
	
	@FindBy(xpath="//select[@name='airline']")
	WebElement airline;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@value='Pangea Airlines$362$274$9:17']")
	WebElement Pangea_Airlines;
	
	@FindBy(xpath="//input[@value='Blue Skies Airlines$631$273$14:30']")
	WebElement BlueSkiesAirlines;
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	WebElement continueButton2;
	
	
	
	

	public RegisterForm() {
		PageFactory.initElements(driver, this);
	}

	public void  fillTheData(String fName, String lName, String phoneNo, String mailID, String addr, String ci,
			String sta, String postal, String countryName, String userName, String pass, String cpass)
			throws InterruptedException {
		
		//WebDriverWait wait= new WebDriverWait(driver, 30);

		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		phone.clear();
		phone.sendKeys(phoneNo);
		email.sendKeys(mailID);
		Thread.sleep(2000);
		address.sendKeys(addr);
		city.sendKeys(ci);
		state.sendKeys(sta);
		postalCode.sendKeys(postal);

		Select sc = new Select(country);
		sc.selectByVisibleText(countryName);
		Thread.sleep(2000);

		uName.sendKeys(userName);
		password.sendKeys(pass);
		confirmPassword.sendKeys(cpass);
		submitButton.click();

		
		/*WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(signInLink));
		ele.click();*/
		signInLink.click();
		/*this.userName.sendKeys(u_name);
		this.pass.sendKeys(u_pass);
		button.click();
		*/
	}
	public void credential(String uName, String password){	
		userName.sendKeys(uName);
		pass.sendKeys(password);
		button.click();
	}
	
	public FilghtBookedDetailed setDetails() throws InterruptedException{
		oneway.click();
		
		Select sc= new Select(passCount);
		sc.selectByValue("2");
		
		Select sc2= new Select(departure);
		sc2.selectByVisibleText("London");
		
		Select sc3= new Select(fromMonth);
		sc3.selectByVisibleText("August");
		
		Select sc4= new Select(fromDay);
		sc4.selectByValue("10");
		
		Select sc5= new Select(arrivePlace);
		sc5.selectByVisibleText("Paris");
		
		Select sc6= new Select(tomonth);
		sc6.selectByVisibleText("August");
		
		Select sc7= new Select(today);
		sc7.selectByValue("14");
		
		classBooking.click();
		Select sc8= new Select(airline);
		sc8.selectByVisibleText("Unified Airlines");
		
		continueButton.click();
		Thread.sleep(2000);
		Pangea_Airlines.click();
		BlueSkiesAirlines.click();
		continueButton2.click();
		
		return new FilghtBookedDetailed();
		
		
		
	}
	
}
