package com.testngFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void f() {
	  System.out.println("Login");
  }
  @Test
  public void f1() {
	  System.out.println("Create Admin");
  }
  @Test
  @Ignore
  public void f2() {
	  System.out.println("Create Employee");
  }
  @Test(enabled = false)
  public void f3() {
	  System.out.println("Time sheet");
  }
}
