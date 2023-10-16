package com.testngFeatures;

import org.testng.annotations.Test;

public class ExpectedTest {
  @Test (expectedExceptions = StringIndexOutOfBoundsException.class)
  public void f() {
	  String s ="ok"; //length =1,2 index =0,1
	  System.out.println(s.charAt(2));
	  
  }
}

