package com.testngFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsTest {
	@Test
	@Ignore
	public void f() {
		System.out.println("Login");
	}

	@Test(dependsOnMethods = "f")
	public void f2() {
		System.out.println("Create Employee");
	}

	@Test(dependsOnMethods = "f2")
	public void f3() {
		System.out.println("Time sheet");
	}

}
