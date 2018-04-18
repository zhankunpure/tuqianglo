package testcases.AccountCenter;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterExpressLanePage;
import pages.base.BasePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase2018ExpressLanePageFastSale {
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterExpressLanePage elPage;
 
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  elPage = new AccountCenterExpressLanePage(dr);
	  
	  elPage.max_window();
	  
	  
  }
  
  @Test
  public void FastSale() throws InterruptedException {
	  
	  page.login();
	  
	  elPage.selectUserFastSale();
	  
	  elPage.newUserFastSale("test", "web_autotest");
	  
	  page.logout();
  }
  
  @AfterTest
  public void afterTest() {
	  
	  elPage.quit_bor();
  }

}
