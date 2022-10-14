package com.DsAlgo.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends  TestBase {
	public static WebDriver driver;
	
	public static void initialization() 
	{
		String browserName = prop.getProperty("browser");
	if (browserName.equals("chrome")) 
	{
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 //System.out.println("Loaded Contents: " + prop.getProperty("ip")); 
	}}
	public void failed() {
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(scrFile, new File("C:\\Users\\deepu\\eclipse-workspace\\DsAlgoProject\\SchreenShot"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	}
