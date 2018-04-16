package testcases.AccountCenter;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
/**
 * �豸��ֵ
 * @author Administrator
 *
 */
public class TestCase2012DeviceRecharge {
	public WebDriver dr;

	private AccountCenterNaviBarPage navBarPage;

	private BasePage basePage;
  @Test
  public void deviceRecharge() throws InterruptedException {
	  
	  basePage.login();
	  //�꿨�豸��ֵ
	  navBarPage.yearCardRecharge("201801080951079");
	  //�����豸��ֵ
	  navBarPage.lifeTimeRecharge("201801081118001");
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
