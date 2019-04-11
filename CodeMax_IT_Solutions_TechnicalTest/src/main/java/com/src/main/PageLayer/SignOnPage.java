package com.src.main.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.src.main.BaseLayer.NewTours_TestBase;

public class SignOnPage extends NewTours_TestBase {

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/a")
	WebElement registrationForm;
	

	public SignOnPage(){
		PageFactory.initElements(driver, this);
	}
	
	public RegisterForm clickOnRegistrationForm(){
		registrationForm.click();
		return new RegisterForm();
	}
}
