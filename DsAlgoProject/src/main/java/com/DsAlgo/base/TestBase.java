package com.DsAlgo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	
	public static Properties prop;
	
public static Logger logger = LogManager.getLogger(TestBase.class);
	
public TestBase() {
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("C:\\Users\\deepu\\eclipse-workspace\\DsAlgoProject\\src\\main\\java\\com\\DsAlgo\\config\\config.properties");
			prop.load(ip);
			//logger.info(ip.toString());
	}
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found Exception from Test Base");
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			System.out.println("File not found Exception from Test Base");
			e.printStackTrace();
		}}
		public static void initialization() 
		{
			String browserName = prop.getProperty("browser");
			String username = prop.getProperty("username");
			System.out.println("Username from properties"+ username);
		if (browserName.equals("chrome")) 
		{
			System.setProperty( "webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 //System.out.println("Loaded Contents: " + prop.getProperty("ip")); 
		}
		driver.manage().window().maximize();
		logger.info("browser is maximized");
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("http://dsportalapp.herokuapp.com/home"));
	}
		public void failed(String methodName) {
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\deepu\\eclipse-workspace\\DsAlgoProject\\ShcreenShot\\"+ methodName +"_"+".jpg"));
						//C:/Users/Owner/eclipse-workspace/"+"DSALGOPROJECT/Screenshots/"+Methodname+"_"+".png
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
     	public void teardown() throws InterruptedException 
     	{
     		Thread.sleep(3000);
     		//extent.flush();
     		driver.quit();
     		//logger.info("browser closed successfully");
     	
     	}
}
