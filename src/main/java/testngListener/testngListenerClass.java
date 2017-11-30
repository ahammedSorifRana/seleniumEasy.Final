package testngListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class testngListenerClass extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("============"+result.getName()+" Test Start ===================");
		
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("============"+result.getName()+" Test Passed ===================");
		takeScreenShot(result);
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("============"+result.getName()+" Test Failed ===================");
		takeScreenShot(result);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("============"+result.getName()+" Test Skipped ===================");
		takeScreenShot(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("============"+result.getName()+" Test Get Issues ===================");
		takeScreenShot(result);
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

		
	

	
}
