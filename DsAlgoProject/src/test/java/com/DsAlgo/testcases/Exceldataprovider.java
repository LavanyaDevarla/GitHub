package com.DsAlgo.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DsAlgo.Excel.util.UtilsExcels;

public class Exceldataprovider {
	static WebDriver driver=null;

	@BeforeTest
	public static void browsersetup()
	{

	String projectpath=System.getProperty("C:\\Users\\deepu\\eclipse-workspace\\DsAlgoProject\\src\\main\\java\\Excel\\datatest.xlsx");
	System.setProperty( "webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	 //log.info("App URL is"+prop.getProperty("url"));
	}


	@Test(dataProvider="testdata")
	public void test1(String username,String password,String password2) throws InterruptedException {
	System.out.println(username+" | "+password+" "+password2);
	
	
	driver.get("https://dsportalapp.herokuapp.com/register");
	driver.findElement(By.id("id_username")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"id_password1\"]")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"id_password2\"]")).sendKeys(password2);

	driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/form/input[5]")).click();


	}



	@DataProvider(name="testdata")
	public Object getData() {

	String excelpath="C:\\Users\\deepu\\eclipse-workspace\\DsAlgoDemo\\src\\main\\java\\Excel\\datatest.xlsx";
	//C:\Users\deepu\eclipse-workspace\DsAlgoDemo\src\main\java\Excel\datatest.xlsx
	Object Data=testdata(excelpath,"Sheet1");
	return Data;


	}

	public Object[][]  testdata(String excelpath,String sheetname)
	{
	UtilsExcels excel=new UtilsExcels(excelpath,sheetname);
	int rowCount=excel.getrowcount();
	int colCount=excel.getcolcount();

	Object data[][]=new Object[rowCount-1][colCount];
	for (int i = 1; i < rowCount ; i++) {
	for (int j = 0; j <colCount  ; j++) {
	String celldata=excel.getcelldataString(i, j);
	//System.out.print(celldata   +" | ");
	data[i-1][j]=celldata;
	}
	// System.out.println();
	}
	return data;
	}
	@AfterClass
	  public void teardown() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  }


	}

