package com.src.main.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.src.main.BaseLayer.NewTours_TestBase;

public class HomePage extends NewTours_TestBase {

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signOn;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public SignOnPage clickOnSignOnButton(){
		Actions ac= new Actions(driver);
		ac.moveToElement(signOn).click().build().perform();
		return new SignOnPage();
		
	}
}
