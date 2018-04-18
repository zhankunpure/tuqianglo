package testcases.AccountCenter;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.CsvReader;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.accountcenterPage.AccountCenterRechargePage;
import pages.base.BasePage;

public class TestCase2020AccountCenterRechargePageVerify {
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterRechargePage rechargePage;
	
	private AccountCenterNaviBarPage nBarPage;
	
	private CsvReader cr;
  
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  rechargePage = new AccountCenterRechargePage(dr);
	  
	  nBarPage = new AccountCenterNaviBarPage(dr);
	  
	  rechargePage.max_window();
	  
  }
  
  @Test
  public void RechargePageVerify() throws Exception {
	  
	  page.login();
	  
	  nBarPage.clickRecharge();
	  
	  rechargePage.purchaseRecordSearch();
	  
	  rechargePage.transferRecordSearch();
	  
	  cr = new CsvReader("accountcenter", "recharge_record.csv");
	  
	 List<List<String>> csvData =  cr.readCSVFile();
	 
	 for (List<String> list : csvData) {
		 
		 
		 rechargePage.rechargeRecordSearch(list.get(0), list.get(1), list.get(2), list.get(3));
	}
	  
	//*[@id="recharge_tbody"]/tr[1]
	  
  }

  @AfterTest
  public void afterTest() {
	  rechargePage.quit_bor();
  }

}
