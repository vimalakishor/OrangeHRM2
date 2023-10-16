package com.testngFeatures;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void f1() {
		System.out.println("Create Admin");
	}

	@Test(priority = -1)
	public void f() {
		System.out.println("Login");
	}

	@Test
	public void f3() {
		System.out.println("Time sheet");
	}

	@Test(priority = 0)
	public void f2() {
		System.out.println("Create Employee");
	}
}
