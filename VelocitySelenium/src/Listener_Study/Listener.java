package Listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test failed, Take screenshot", true);	
		System.out.println("Test method failed>"+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test Skipped try again", true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	
		Reporter.log("Test Case successfully completed", true);
		
	}
	
	
	

}
