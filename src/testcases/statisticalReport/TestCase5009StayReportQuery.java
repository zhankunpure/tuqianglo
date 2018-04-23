package testcases.statisticalReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.StatisticalReportPage;
import pages.statisticalReportPage.StayReportPage;

public class TestCase5009StayReportQuery {
 
  public WebDriver dr;
  
  private BasePage page;
  
  private AccountCenterNaviBarPage nbPage;
  
  private StayReportPage  stayRPage;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  stayRPage = new StayReportPage(dr);
	  
	  stayRPage.max_window();
	  
  }
  
  @Test
  public void stayReportQuery() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = stayRPage.getCurrentWindowHandle();
	  
	  nbPage.click_StatisticalReport();
	  
	  stayRPage.switchToWindow(currentHandle);
	  
	  //点击运动统计
	  if (!stayRPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		  stayRPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  
	  stayRPage.srPage.clickStatisticalReportSubmenu(stayRPage.stayReport);
	  
	  stayRPage.srPage.intoFrame(stayRPage.stayReportFrame);
	  
	  stayRPage.stayReportCheak();
	  
	  stayRPage.getStayReportStayAlltimes();
	  
	  stayRPage.stayReportDropdownMenu();
	  
	  stayRPage.stayReportExport();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  stayRPage.quit_bor();
  }

}
