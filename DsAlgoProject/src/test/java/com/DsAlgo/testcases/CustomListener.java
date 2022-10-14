package com.DsAlgo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.DsAlgo.base.TestBase;

import io.netty.handler.codec.http.HttpContentEncoder.Result;
@Listeners(CustomListener.class)
public class CustomListener extends TestBase implements ITestListener{
	WebDriver driver;
	public CustomListener()
	{
		super ();
	}
	public void onTestFailure(ITestResult result) {

		System.out.println("Failed test");
	      failed(result.getMethod().getMethodName());
	
	}
	
	
	
	
	
}
	
	
	
	
