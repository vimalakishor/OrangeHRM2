package com.testngFeatures;

import org.testng.annotations.Test;

public class GroupsTest {
  @Test(groups = "Active")
  public void f() {
	  System.out.println("Active user1");
  }
  @Test(groups = "Active")
  public void f1() {
	  System.out.println("Active user2");
  } @Test(groups = "InActive")
  public void f2() {
	  System.out.println("InActive user1");
  } @Test(groups = "InActive")
  public void f3() {
	  System.out.println("InActive user2");
  } @Test(groups = "Draft")
  public void f4() {
	  System.out.println("Draft user1");
  } @Test(groups = "Draft")
  public void f5() {
	  System.out.println("Draft user2");
  }
}
