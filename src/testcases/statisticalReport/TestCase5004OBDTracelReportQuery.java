package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.OBDTracelReportPage;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5004OBDTracelReportQuery {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private OBDTracelReportPage obdTRPage;
	
	private AccountCenterNaviBarPage nBarPage;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  obdTRPage = new OBDTracelReportPage(dr);
	  
	  nBarPage = new AccountCenterNaviBarPage(dr);
	  
	  obdTRPage.max_window();
	  
  }
  @Test
  public void OBDTracelReportQuery() throws InterruptedException {
	  
	  List<List<String>> queryData;
	  
	  page.login();
	  
	  String currentHandle = obdTRPage.getCurrentWindowHandle();
	  
	  nBarPage.click_StatisticalReport();
	  
	  obdTRPage.switchToWindow(currentHandle);
	  
	  if (!obdTRPage.srPage.getElement("x,//*[@id=\"obdStatistics\"]/ul").isDisplayed()) {
		  obdTRPage.srPage.clickStatisticalReportSubmenu(obdTRPage.srPage.obdStatistics);
	  }
	  
	  obdTRPage.clickElement(obdTRPage.OBDTracelReport);
	  
	  obdTRPage.toOBDTracelReportFrame();
	  
	  queryData = obdTRPage.obdTracelReportQuery("868120111111120");
	  
	  for (List<String> list : queryData) {
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println(list);
	  }
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  obdTRPage.quit_bor();
  }

}
