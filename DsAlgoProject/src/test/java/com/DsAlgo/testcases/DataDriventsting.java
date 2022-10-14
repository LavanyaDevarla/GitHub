package com.DsAlgo.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DsAlgo.Excel.util.XLUtility;

public class DataDriventsting {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/register");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("print excelSheet data");
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String username, String password, String password2) {
		System.out.println("print excelSheet data1");
		WebElement txtusername = driver.findElement(By.xpath("//input[@name = 'username']"));
		txtusername.clear();
		txtusername.sendKeys(username);
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name = 'password1']"));
		txtpassword.clear();
		txtpassword.sendKeys(password);
		WebElement txtpassword2 = driver.findElement(By.id("id_password2"));
		txtpassword2.clear();
		txtpassword2.sendKeys(password2);
		System.out.println("print excelSheet data2");
	}

@DataProvider(name="LoginData")
public String[][] getData()throws IOException{
	System.out.println("print excelSheet data3");
	String path = "C:\\Users\\deepu\\eclipse-workspace\\DsAlgoProject\\excel\\LoginData.xlsx";
XLUtility xlutil = new XLUtility(path);
System.out.println("print excelSheet data4");
int totalrows = xlutil.getRowCount("Sheet1");
int totalcols= xlutil.getCellCount("Sheet1", 1);

String loginData[][]= new String[totalrows][totalcols];

for(int i =1;i<totalcols;i++)
{
	for(int j =0;j<totalcols;i++)
	{
	loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
	}
}
	return loginData;



}}





