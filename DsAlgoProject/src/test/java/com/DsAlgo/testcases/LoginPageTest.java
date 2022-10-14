package com.DsAlgo.testcases;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.DataStructurePage;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;
import com.google.common.util.concurrent.Service.Listener;

import io.netty.handler.codec.http.HttpContentEncoder.Result;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;
	DataStructurePage dataStructurePage;
//	public static Logger logger = LogManager.getLogger(LoginPageTest.class);
HomePage homePage;
	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		dataStructurePage = new DataStructurePage();
	}
	
	
	@Test(priority = 1)
	public void Singin() {
		loginPage.clickongetStarted();
		loginPage.clickonSingin();
		Assert.assertTrue(true);
		logger.info("Test Message");
	}
	
	
	

/*@Test(priority = 2) 
	public void title() {
	   String title = loginPage.validateLoginPageTitle(); 
	
	  Assert.assertEquals(title," Numpy Ninja home page title");
	 //Assert.assertEquals(title, " Numpy Ninja2"); 
	//logger.debug("print title");
	logger.info("print title");
	 System.out.println(title); }*/
	 

	@Test(priority = 3)
	public void loginPage() throws IOException {
		// loginPage.clickonSingin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		

	}
	
	
	
	public void tearDown() {
  driver.quit();
	}

}
