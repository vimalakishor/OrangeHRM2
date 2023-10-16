package com.testngFeatures;

import org.testng.annotations.Test;

public class TimeoutTest {
  @Test(timeOut = 3000)
  public void f() throws InterruptedException {
	  System.out.println("login");
	  Thread.sleep(2000);
	  System.out.println("create employee");
	  Thread.sleep(2000);
	  System.out.println("create admin");
  }
}
