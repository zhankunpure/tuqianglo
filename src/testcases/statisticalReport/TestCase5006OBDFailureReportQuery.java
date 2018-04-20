package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.OBDFailureReportPage;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5006OBDFailureReportQuery {
	public WebDriver dr;
	
	private BasePage page;
	
	private OBDFailureReportPage obdFRPage;
	
	private AccountCenterNaviBarPage nBarPage;
 
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  obdFRPage = new OBDFailureReportPage(dr);
	  
	  nBarPage = new AccountCenterNaviBarPage(dr);
	  
	  obdFRPage.max_window();
	  
  }
  
  @Test
  public void obdFailureReportQuery() throws InterruptedException {
	  
	  List<List<String>> queryData;
	  
	  page.login();
	  
	  String currentHandle = obdFRPage.getCurrentWindowHandle();
	  
	  nBarPage.click_StatisticalReport();
	  
	  obdFRPage.switchToWindow(currentHandle);
	  
	  if (!obdFRPage.srPage.getElement("x,//*[@id=\"obdStatistics\"]/ul").isDisplayed()) {
		  obdFRPage.srPage.clickStatisticalReportSubmenu(obdFRPage.srPage.obdStatistics);
	  }
	  
	  obdFRPage.clickElement(obdFRPage.OBDFailureReport);
	  
	  obdFRPage.toOBDFailureReportFrame();
	  
	  queryData = obdFRPage.obdFailureReportQuery("868120111111120");
	  
	  for (List<String> list : queryData) {
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println(list);
	}
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  obdFRPage.quit_bor();
  }

}
