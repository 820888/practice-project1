package com.app.ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Method Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
