package com.myntra.genriclib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImpClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("About to begin executing Test " + result.getName(), true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test sussesfull  " + result.getName(), true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedTestName = result.getMethod().getMethodName();
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
		File src = eDriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+failedTestName+".PNG");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("This test got skipped "+result.getMethod(), true);
		
	}

	@Override
	public void onFinish(ITestContext result) {
		Reporter.log("Completed executing test " + result.getName(), true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

    @Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
