package com.testngFeatures;

import org.testng.annotations.Test;

public class InvocationTest {
	@Test(priority = 1)
	public void f1() {
		System.out.println("Create Admin");
	}

	@Test(priority = -1,invocationCount = 2)
	public void f() {
		System.out.println("Login");
	}

	@Test(priority = 0,invocationCount = 2)
	public void f2() {
		System.out.println("Create Employee");
	}
}
