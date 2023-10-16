package com.testngFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotationTest {
  @Test
  public void f() {
	  System.out.println("leave balance checking");
	  
  }
  @BeforeMethod
  public void f1() {
	  System.out.println("before method process");
  }
  @AfterMethod
  public void f2() {
	  System.out.println("After method process");
  }
  @Test
  public void f3() {
	  System.out.println("Leave apply");
  }
  @BeforeClass
  public void f4() {
	  System.out.println("before class process");
  }
  @AfterClass
  public void f5() {
	  System.out.println("after class process");
  }
  @BeforeTest
  public void f6() {
	  System.out.println("before test process");
  }
  @AfterTest
  public void f7() {
	  System.out.println("after test process");
  }
}
