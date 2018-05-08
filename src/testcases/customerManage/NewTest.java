package testcases.customerManage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.customerManagePage.AdministratorManagementPage;
import pages.customerManagePage.RoleManagementPage;

public class NewTest {
	
	private WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterNaviBarPage nbPage;
	
	private RoleManagementPage rmPage;
	
	private AdministratorManagementPage amPage;
	
  @Test
  public void f() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = nbPage.getCurrentWindowHandle();
	  
	  nbPage.click_CustomerManage();
	  
	  nbPage.switchToWindow(currentHandle);
	  
	 // rmPage.createRole();
	  
	  amPage = new AdministratorManagementPage(dr);
//	  
//	  String actual1 = amPage.newAddAdministrator();
//	  System.out.println(actual1);
//	  assertEquals(actual1, "操作成功", "操作失败");
//	  
//	  String actual2 = amPage.removeAdministrator();
//	  System.out.println(actual2);
//	  assertEquals(actual2, "操作成功", "操作失败");
//	  
	  String actual3 = amPage.editAdministrator();
	  System.out.println(actual3);
	  assertEquals(actual3, "操作成功", "操作失败");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  //rmPage = new RoleManagementPage(dr);
	  
	  nbPage.max_window();
	  
  }
  																							
  @AfterTest
  public void afterTest() {
	  
	  nbPage.quit_bor();
  }
  														
}
