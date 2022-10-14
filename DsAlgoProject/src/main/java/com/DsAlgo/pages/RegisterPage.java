package com.DsAlgo.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.DataStructurePage;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;

public class RegisterPage extends TestBase {
	 

	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	WebElement getStarted;

	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement Register;

	@FindBy(xpath = "//input[@name = 'username']")
	WebElement username;
	@FindBy(xpath = "//input[@name = 'password1']")
	WebElement password;
	@FindBy(id = "id_password2")
	WebElement password2;
	// @FindBy(xpath = "//input[@name = 'password2']")
	// WebElement password2;
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement Register2;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
		
	}

	public void clickongetStarted() {
		getStarted.click();

	}

	public void clickonRegister() {

		Register.click();
	}

	/*
	 * public RegisterPage register(String un, String pwd, String pwd2) {
	 * username.sendKeys(un); password.sendKeys(pwd); password2.sendKeys(pwd2);
	 * Register2.click(); return new RegisterPage();
	 * 
	 * }
	 */

	public RegisterPage login(String name, String pswd, String pswd2) throws InterruptedException {
		Thread.sleep(2000);
		username.sendKeys(name);
		password.sendKeys(pswd);
		password2.sendKeys(pswd2);
		Register2.click();
		return new RegisterPage();
		// TODO Auto-generated method stub

	}

	public void clickonRegister2() {

		Register2.click();
	}

//public void Register(String property, String property2, String property3) {
	// TODO Auto-generated method stub

//}
}
