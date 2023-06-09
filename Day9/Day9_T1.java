package com.selenium.sample.Day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Day9_T1 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  System.out.println(n+s);
  }
  
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	  System.out.println(n-s);
  }
  
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) {
	  System.out.println(n*s);
  }
  
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  System.out.println(n/s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 100, 10 },
      new Object[] { 20, 8 },
    };
  }
}
