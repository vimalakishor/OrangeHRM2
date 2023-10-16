package com.testngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {//Soft Assert
  @Test
  public void f() {
	  String s ="ok";
	  String s1="Ok1";
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(s, s1);
  }
  @Test
  public void f1() {
	  String s ="Ok";
	  String s1="Ok";
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(s, s1);
  }
}
