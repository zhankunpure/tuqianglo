package testcases.customerManage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.http.cookie.SM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.customerManagePage.AdministratorManagementPage;
import pages.customerManagePage.CustomerManagePage;
import pages.customerManagePage.RoleManagementPage;

public class NewTest {
	
	private WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterNaviBarPage nbPage;
	
	private RoleManagementPage rmPage;
	
	private CustomerManagePage cmPage;
	
	private AdministratorManagementPage amPage;
	
  @Test
  public void f() throws InterruptedException {
	  
	  cmPage.page.login();
	  
	  String currentHandle = cmPage.getCurrentWindowHandle();
	  
	  cmPage.nbPage.click_CustomerManage();
	  
	  cmPage.switchToWindow(currentHandle);
	  
	 // rmPage.createRole();
	  
	  //amPage = new AdministratorManagementPage(dr);
	  
//	  String actual1 = amPage.newAddAdministrator();
//	  System.out.println(actual1);
//	  assertEquals(actual1, "操作成功", "操作失败");
//	  
//	  String actual2 = amPage.removeAdministrator();
//	  System.out.println(actual2);
//	  assertEquals(actual2, "操作成功", "操作失败");
//	  
//	  String actual3 = amPage.editAdministrator();
//	  System.out.println(actual3);
//	  assertEquals(actual3, "操作成功", "操作失败");
	  
	 // cmPage.newAddCustomer();
	  //cmPage.resetPassword();
	  //cmPage.batchTransCustomer();
	  //cmPage.removeCustomer();
	  //System.out.println(cmPage.editCustomer());
	 // System.out.println(cmPage.toConsole());
	  cmPage.clickCustomerTree();
//	  List<Integer> recordNumbers = cmPage.customerRecordQuery();
//	  
//	  System.out.println("recordNumber:"+recordNumbers);
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  cmPage = new CustomerManagePage(dr);
	 // page = new BasePage(dr);
	  
	 // nbPage = new AccountCenterNaviBarPage(dr);
	  
	  //rmPage = new RoleManagementPage(dr);
	  
	  cmPage.max_window();
	  
  }
  																							
  @AfterTest
  public void afterTest() {
	  
	  cmPage.quit_bor();
  }
  														
}
