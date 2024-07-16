package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTestCase extends BaseClass
{
	
  @Test(priority=1)
  public void verifyUrl() {
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"), "Test Fail: Url not matched");
	  System.out.println("Test Pass: Url matched!");
  }
  
  
  @Test(priority=2)
  public void verifyTitle() {
	  String actTitle=hp.getAppTItle();
	  Assert.assertTrue(actTitle.contains("Customer"), "Test Fail: Title not matched");
	  System.out.println("Test Pass: Title matched!");
  }
  
  @Test(priority=2)
  public void velidateSignInLink() {
	  String nextPageUrl=hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"), "Test Pass: login page not open");
	  System.out.println("Test Pass: Application navigating to login page");
  }
}
