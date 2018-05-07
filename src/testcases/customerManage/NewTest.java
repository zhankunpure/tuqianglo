package testcases.customerManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.customerManagePage.RoleManagementPage;

public class NewTest {
	
	private WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterNaviBarPage nbPage;
	
	private RoleManagementPage rmPage;
  @Test
  public void f() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = nbPage.getCurrentWindowHandle();
	  
	  nbPage.click_CustomerManage();
	  
	  nbPage.switchToWindow(currentHandle);
	  
	  rmPage.createRole();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  rmPage = new RoleManagementPage(dr);
	  
	  rmPage.max_window();
	  
  }
  																							
  @AfterTest
  public void afterTest() {
	  
	  rmPage.quit_bor();
  }
  														
}
