package com.testngFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
  @Test(dataProvider = "loginvalue")
  public void loginParam(String uName, String pwd) {
	  System.out.println("Enter user name is :"+uName);
	  System.out.println("Enter password is:"+pwd);
  }
  
  @DataProvider
  public Object[][] loginvalue() {
	  return new Object[][] {{"user1","123"},{"user2","345"}};
  }
}
