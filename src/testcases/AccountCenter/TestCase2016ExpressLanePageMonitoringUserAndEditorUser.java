package testcases.AccountCenter;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.comdata.assertDate.AccountCenterAssertData;
import pages.accountcenterPage.AccountCenterExpressLanePage;
import pages.base.BasePage;

public class TestCase2016ExpressLanePageMonitoringUserAndEditorUser {
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterExpressLanePage elPage;
	
	private AccountCenterAssertData assertDate;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  elPage = new AccountCenterExpressLanePage(dr);
	  
	  elPage.max_window();
  }

  
  @Test
  public void MonitoringUserAndEditorUser() throws InterruptedException {
	  
	  page.login();
	  
	  //进入监控用户iframe
	  elPage.switch_to_frame("monitUserFrame");
	  
	  elPage.treeSubUserSearch("account_4");
	  String current_handle = elPage.getCurrentWindowHandle();
	  
	  elPage.clickMonitoringUsersBtn();
	  
	  elPage.switchToWindow(current_handle);
	  
	  String actualUrl = elPage.getCurrentUrl();
	  
	  assertDate = new AccountCenterAssertData();
	  
	  String expectedUrl = assertDate.monitoringUserUrl();
	  
	  assertEquals(actualUrl, expectedUrl, "进入监控用户页面失败");
	  
	  elPage.close();
	  
	  elPage.getCurrentWindow(current_handle);
	  
	 //编辑用户
	  elPage.switch_to_frame("monitUserFrame");
	  
	  elPage.editorUser();
	  //重置编辑用户
	  elPage.resetEditorUser();
	  
	  elPage.switch_to_frame("");
  }
  
  @AfterTest
  public void afterTest() {
	  
	  elPage.quit_bor();
  }
}
