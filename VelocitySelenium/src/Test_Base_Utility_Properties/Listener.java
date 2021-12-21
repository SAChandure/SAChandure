package Test_Base_Utility_Properties;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends BaseClass implements ITestListener {
	
 



private int TCID;

@Override
public void onTestFailure(ITestResult result) {
	
	try {
		Utility.captureScreenShot(driver, TCID);
	}
	catch(IOException e)
	{
		e.printStackTrace();
		Reporter.log("TC is Failed Take ScreenShot",true);
	}
}
	
	
	
	

}
