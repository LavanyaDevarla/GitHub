package com.DsAlgo.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.DataStructurePage;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class DataStructurePageTest extends TestBase {
	//public static Logger logger = LogManager.getLogger(DataStructurePageTest.class);

	LoginPage loginPage;
	DataStructurePage dataStructurePage;
	HomePage homePage;

	public DataStructurePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();// data-structures-introduction
		dataStructurePage = new DataStructurePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		System.out.println("Print Home Page");

	}

	@Test(priority = 1)
	public void GetStarted() {
		homePage.clickOnGetStarted();
logger.debug("dataStructurePage");
		System.out.println("print DatastructurePage GetStared");

	}

	

	@Test(priority = 2)
	public void TimeComplexity() throws InterruptedException {

		dataStructurePage.clickonTimeComplexity();

	}

	@Test(priority = 3)
	public void PracticeQuestions() throws InterruptedException {
		dataStructurePage.clickonPracticeQuestions();
		Thread.sleep(2000);
		driver.navigate().back();

	}

	
	@Test(priority = 4)
	public void loadTryHere1() throws InterruptedException {
		

		dataStructurePage.loadTryHere();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority = 5)
	public void clickonSignout() throws InterruptedException {
		

		dataStructurePage.clickonSignout();
		
	}
@AfterMethod

	public void tearDown() throws InterruptedException {
		//Thread.sleep(3000);
	//driver.quit();
	}
}