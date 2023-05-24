package testNG.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
	
	public void onFinish(ITestContext context) {
		System.out.println("All tests executed");
	}
	
	public void onStart(ITestContext context) {
		System.out.println("All tests will execute after this");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	public void onTestFailure(ITestResult result) {
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Test will start");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - "+result.getStatus());
		System.out.println("Test Successed");
	}
}
