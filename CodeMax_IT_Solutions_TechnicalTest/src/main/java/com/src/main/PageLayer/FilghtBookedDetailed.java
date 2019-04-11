package com.src.main.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.src.main.BaseLayer.NewTours_TestBase;

public class FilghtBookedDetailed extends NewTours_TestBase {

	@FindBy(name = "passFirst0")
	WebElement enterFirstMenberName;

	@FindBy(xpath = "//input[@name='passLast0']")
	WebElement enterFirstMenberNameLastName;

	@FindBy(xpath = "//select[@name='pass.0.meal']")
	WebElement mealPreferanceFirst;

	@FindBy(xpath = "//select[@name='creditCard']")
	WebElement card;

	@FindBy(xpath = "//input[@name='creditnumber']")
	WebElement cardNumber;

	@FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
	WebElement month;

	@FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
	WebElement year;

	@FindBy(xpath = "//input [@name='cc_frst_name']")
	WebElement firstName;

	@FindBy(xpath = "//input [@name='cc_mid_name']")
	WebElement middleName;

	@FindBy(xpath = "//input [@name='cc_last_name']")
	WebElement latName;

	@FindBy(xpath = "//input [@name='buyFlights']")
	WebElement continueButton3;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")
	WebElement confirmStatement;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/"
			+ "table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	WebElement logOutButton;

	@FindBy(xpath = "//input[@name='passFirst1']")
	WebElement passFirst1;

	@FindBy(xpath = "//input[@name='passLast1']")
	WebElement passLast1;

	public FilghtBookedDetailed() {
		PageFactory.initElements(driver, this);
	}

	public void setTicketDetails() {

		// enterFirstMenberName.clear();
		enterFirstMenberName.sendKeys("nik");
		enterFirstMenberNameLastName.clear();
		enterFirstMenberNameLastName.sendKeys("patik");
		Select sc = new Select(mealPreferanceFirst);
		sc.selectByVisibleText("Bland");
		passFirst1.sendKeys("ketan");
		passLast1.sendKeys("Kasar");

		Select sc2 = new Select(driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
		sc2.selectByVisibleText("Diabetic");

	}

	public void bookingConformation() {
		Select sc1 = new Select(card);
		sc1.selectByVisibleText("MasterCard");
		cardNumber.sendKeys("123456");
		Select sc2 = new Select(month);
		sc2.selectByVisibleText("06");
		Select sc3 = new Select(year);
		sc3.selectByVisibleText("2010");
		firstName.sendKeys("jack");
		middleName.sendKeys("pitter");
		latName.sendKeys("kelvin");
		continueButton3.click();

		logOutButton.click();
	}
}
