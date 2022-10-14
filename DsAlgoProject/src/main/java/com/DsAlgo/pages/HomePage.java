package com.DsAlgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgo.base.TestBase;

public class HomePage extends TestBase{
	
	/*@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement logo;*/
	@FindBy(xpath = "//html/body/div[1]/nav/a")
	WebElement logo;
	
	@FindBy(xpath ="//body/div[3]/div[1]/div[1]/div[1]/a[1]")
	WebElement GetStarted;
	
	@FindBy(xpath ="//body/div[3]/div[5]/div[1]/div[1]/a[1]")
	WebElement getStarted;
	
	public HomePage () {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	
	}
	
	public DataStructurePage clickOnGetStarted() {
//		driver.navigate().to("http://dsportalapp.herokuapp.com/home");
		GetStarted.click();
return new DataStructurePage();


}
	public QueuePage clickOngetStarted1() {
		getStarted.click();
		return new QueuePage();
	}
	
}
	

