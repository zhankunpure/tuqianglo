package testcases.AccountCenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

public class TestCase2010NormalBuyCard {
	
	public WebDriver dr;
	
	private AccountCenterNaviBarPage navBarPage;
	
	private BasePage basePage;
  @Test
  public void NormalBuyCard() throws InterruptedException {
	  
	  basePage.login();
	  
	  navBarPage.normalBuyCard("1", "0", "test", "1235678952", "jimi");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  navBarPage = new AccountCenterNaviBarPage(dr);
	  
	  basePage = new BasePage(dr);
	  
	  navBarPage.max_window();
  }

  @AfterTest
  public void afterTest() {
	  
	  navBarPage.quit_bor();
  }

}
