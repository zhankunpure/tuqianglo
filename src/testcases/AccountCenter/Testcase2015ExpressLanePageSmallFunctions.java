package testcases.AccountCenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterExpressLanePage;
import pages.base.BasePage;

public class Testcase2015ExpressLanePageSmallFunctions {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterExpressLanePage elPage;
  @Test
  public void expressLanePageSmallFunctions() throws InterruptedException {
	  
	  page.login();
	  
	  elPage.AddModula();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  elPage = new AccountCenterExpressLanePage(dr);
	  
	  elPage.max_window();
  }

  @AfterTest
  public void afterTest() {
	  
	  elPage.quit_bor();
  }

}
