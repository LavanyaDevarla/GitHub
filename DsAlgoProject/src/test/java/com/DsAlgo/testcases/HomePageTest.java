package com.DsAlgo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.DataStructurePage;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;
import com.DsAlgo.pages.QueuePage;


import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class HomePageTest extends TestBase {
LoginPage loginPage;
	HomePage homePage;
	DataStructurePage dataStructurePage;
	
	QueuePage queuePage;
	
	public HomePageTest() {
		
		super();
	}

@BeforeClass
public void setUp() throws IOException {
	initialization();
	loginPage = new LoginPage();
	homePage = new HomePage();
	
	dataStructurePage = new DataStructurePage();
	queuePage= new QueuePage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}

@Test(priority = 1)
public void verifyHomePageTitleTest() {
	String HomePageTitle = 	homePage.verifyHomePageTitle();
//String title = homePage.validateHomePageTitle();
Assert.assertEquals(HomePageTitle, " NumpyNinja2","Home Page Title not matched"); 
System.out.println("HomePageTitle"); }	


@Test(priority = 2)	
public void GetStarted() {
	//dataStructurePage.clickOnDataStructures();}
	dataStructurePage = homePage.clickOnGetStarted();

}

@AfterMethod
public void tearDown() {
	//driver.quit();
	}	


}
