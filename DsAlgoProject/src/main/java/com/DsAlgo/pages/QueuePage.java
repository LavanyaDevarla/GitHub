package com.DsAlgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgo.base.TestBase;

public class QueuePage extends TestBase {
	
	@FindBy(xpath ="//body/div[3]/div[5]/div[1]/div[1]/a[1]")
	WebElement getStarted;

	@FindBy(xpath = "//body/div[2]/ul[1]/a")
	//@FindBy(how = How.LINK_TEXT,using = "ImplementationofQueueinPython")
	WebElement ImplementationofQueueinPython;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement TryhereLink;
	
	@FindBy(xpath ="//a[text()='Implementation using collections.deque']")
			//"//body/div[2]/ul[2]/a")
	WebElement Implementationusingcollectionsdeque;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere1;
	
	@FindBy(xpath ="//a[text()='Implementation using array']")
			//"//body/div[2]/ul[3]/a")
	WebElement Implementationusingarray;
	
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere2;
	@FindBy(xpath ="//a[text()='Queue Operations']")
			//body/div[2]/ul[4]/a")
	WebElement QueueOperations;
	
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere3;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement PracticeQuestions;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	WebElement Signout;
	public QueuePage() {
	
	PageFactory.initElements(driver,this);
	}
	public void clickOngetStarted() {
		getStarted.click();
}

public void clickOnImplementationofQueueinPython() {
	ImplementationofQueueinPython.click();
	
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


public void clickonImplementationusingcollectionsdeque() throws InterruptedException {
	Thread.sleep(2000);
	Implementationusingcollectionsdeque.click();
}
public void clickontryhere1() {
	tryhere1.click();
}
public void clickonImplementationusingarray() throws InterruptedException {
	Thread.sleep(2000);
	Implementationusingarray.click();
}
public void clickontryhere2() {
	tryhere2.click();
}
public void clickonQueueOperations() throws InterruptedException {
	Thread.sleep(2000);
	QueueOperations.click();
}
public void clickontryhere3() throws InterruptedException {
	Thread.sleep(2000);
	tryhere2.click();
}
public void clickonPracticeQuestions() {
	PracticeQuestions.click();
}
public void clickonSignout() {
	Signout.click();
}
}