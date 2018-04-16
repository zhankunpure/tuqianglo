package testcases.AccountCenter;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.comdata.assertDate.AccountCenterAssertData;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

public class TestCase2008ModifyUserInfo {
	
	private CsvReader cr;

	public WebDriver dr;
	
	private AccountCenterNaviBarPage navBarPage;
	
	private BasePage basePage;
	
	private AccountCenterAssertData assertData;
  @Test
  public void modifyUserInfo() throws Exception {
	  
	  basePage.login();
	  
	  cr = new CsvReader("accountcenter", "user_to_modify_info.csv");
	  
	  List<List<String>> csv_data = cr.readCSVFile();
	  
	  for (List<String> list : csv_data) {
		  
		  String actual =  navBarPage.modify_usr_info(list.get(0), list.get(1), list.get(2)).trim();
		  
		  assertData = new AccountCenterAssertData();
		  
		  assertEquals(actual, assertData.modifyUserInfoSuccessText(), "用户资料修改失败");
		  
		  basePage.logout();
		  
		  basePage.clickLoginBtn();
		
	}
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  dr = new FirefoxDriver();
	  
	  basePage = new BasePage(dr);
	  
	  navBarPage = new AccountCenterNaviBarPage(dr);
	  
	  navBarPage.max_window();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  navBarPage.quit_bor();
  }

}
