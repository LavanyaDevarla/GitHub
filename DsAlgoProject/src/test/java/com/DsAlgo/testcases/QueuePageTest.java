package com.DsAlgo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;
import com.DsAlgo.pages.QueuePage;

public class QueuePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	QueuePage queuePage;
	
	public QueuePageTest() {
		super();
		
	}
	
	@BeforeClass
	public void setUp()throws IOException{
		initialization();
		loginPage = new LoginPage();   
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		queuePage = new QueuePage();
	}
	
	
	@Test(priority = 1)
	public void GetStarted() {
		queuePage = homePage.clickOngetStarted1();
		System.out.println("Print getStarted QuePage");}
	
	@Test(priority = 2)	
	public void ImplementationofQueueinPython() throws InterruptedException {
		System.out.println("ImplementationofQueueinPythonLink");
		queuePage.clickOnImplementationofQueueinPython();
		
		Thread.sleep(2000);
		
		}
	@Test(priority = 3)
	public void loadTryHere1() throws InterruptedException {
		

		queuePage.loadTryHere();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority = 4)
		public void Implementationusingcollectionsdeque() throws InterruptedException {
			queuePage.clickonImplementationusingcollectionsdeque();
			queuePage.loadTryHere();
			Thread.sleep(2000);
			driver.navigate().back();
		}
	@Test(priority = 4)
	public void Implementationusingarray() throws InterruptedException {
		queuePage.clickonImplementationusingarray();
		queuePage.loadTryHere();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority = 5)
	public void QueueOperations() throws InterruptedException { 
	queuePage.clickonQueueOperations();
	queuePage.loadTryHere();
	Thread.sleep(2000);
	driver.navigate().back();
	
}
	@Test(priority = 6)
public void PracticeQuestions() throws InterruptedException {
queuePage.clickonPracticeQuestions();
Thread.sleep(2000);
driver.navigate().back();}
	
	@Test(priority = 7)
	public void clickonSignout() throws InterruptedException {
		

		queuePage.clickonSignout();
		
	}
@AfterMethod
public void tearDown(){
	//driver.quit();
}
}