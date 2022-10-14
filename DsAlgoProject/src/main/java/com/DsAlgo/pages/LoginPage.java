package com.DsAlgo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgo.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	WebElement getStarted;

//@FindBy(xpath = "//a[text()=' Register ']")
	//WebElement Register;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement Singin;

	@FindBy(xpath= "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@name = 'password2']")
	WebElement password2;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Login;
	
	@FindBy(xpath= "//body/div[3]/div[1]/div[1]/div[1]/a[1]")
	WebElement GetStarted;
	
	@FindBy(xpath = "//html/body/div[1]/nav/a")
	WebElement logo;
	///html/body/div[1]/nav/a
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}

	public void clickongetStarted() {
		getStarted.click();

	}

	
	public void clickonSingin() {
		
		Singin.click();

	}

	public HomePage login(String un, String pwd) {
		System.out.println("Homepage Login info:" + un + "/" + pwd);
		System.out.println("Loaded URL: "+ driver.getCurrentUrl().toString());
		
		driver.navigate().to("http://dsportalapp.herokuapp.com/login");
		System.out.println("Changed URL: "+ driver.getCurrentUrl().toString());
		username.sendKeys(un);
		Password.sendKeys(pwd);
		
		Login.click();
		return new HomePage();

	}
	
	
	public void clickongetstsrted1() {
		GetStarted.click();
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
		// TODO Auto-generated method stub

	}

}
