package com.DsAlgo.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.DsAlgo.pages.RegisterPage;
import com.DsAlgo.base.TestBase;
import com.DsAlgo.pages.DataStructurePage;
import com.DsAlgo.pages.HomePage;
import com.DsAlgo.pages.LoginPage;

public class RegisterPageTest extends TestBase {
	LoginPage loginPage;
	RegisterPage registerPage;
	DataStructurePage dataStructurePage;
HomePage homePage;
public RegisterPageTest() {
	super();
}

@BeforeClass
public void setUp() throws IOException {
	initialization();
	loginPage = new LoginPage();
	dataStructurePage = new DataStructurePage();
	registerPage = new RegisterPage();
	
}
@Test(priority = 1)

public void getStarted() {
	registerPage.clickongetStarted();
	registerPage.clickonRegister();
}
/*public void Register() {
	registerPage.clickonRegister();
}*/
@Test(priority = 2)
public void RegisterPage() throws InterruptedException {
	Thread.sleep(2000);

	registerPage.login(prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("password2"));

}


@Test(priority = 3)
public void Register2() {
registerPage.clickonRegister2();


}




}
