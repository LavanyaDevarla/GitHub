package com.DsAlgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgo.base.TestBase;

public class DataStructurePage extends TestBase {

	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement logo;

	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/a[1]")
	WebElement GetStarted;

	// @FindBy(xpath ="//a[@class='list-group-item']")
	@FindBy(xpath = "//a[@href='time-complexity']")

	WebElement TimeComplexity;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement PracticeQuestions;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement TryhereLink;

	@FindBy(xpath = "//div[@role='presentation']")
	WebElement tabindex;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement Run;

	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement Signout;

//Initialzing the page Objects
	public DataStructurePage() {
		PageFactory.initElements(driver, this);

	}
	

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public DataStructurePage clickOnGetStarted() {

		GetStarted.click();
		return new DataStructurePage();
	}

	public void clickonTimeComplexity() throws InterruptedException {
		Thread.sleep(2000);
		TimeComplexity.click();

	}

	public void clickonPracticeQuestions() throws InterruptedException {
		Thread.sleep(2000);
		PracticeQuestions.click();
	}

	public void TryhereLink() {
		TryhereLink.click();
	}

	public void loadTryHere() throws InterruptedException {
		WebElement tryherelink = driver.findElement(By.xpath("//a[@href='/tryEditor']"));
		tryherelink.click();
		WebElement codeTextArea = driver.findElement(By.xpath("//textarea[@tabindex='0']"));
		codeTextArea.sendKeys("print('Hello Friends, Thank You')");
		Thread.sleep(2000);

		WebElement runButton = driver.findElement(By.xpath("//button"));
		runButton.click();

	}

	public void clickonSignout() {
		Signout.click();
	}
}
