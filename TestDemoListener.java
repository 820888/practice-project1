package com.app.ListenerDemo;

import org.testng.Assert;

public class TestDemoListener {

	
	public void method1() {
		System.out.println("Executing method1");
	}

	public void method2() {
		System.out.println("Executing method2");
		Assert.assertTrue(false);
	}
	
	
}
