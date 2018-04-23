package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.ParkingReportPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5011ParkingReportQuery {
 
	  public WebDriver dr;
	  
	  private BasePage page;
	  
	  private AccountCenterNaviBarPage nbPage;
	  
	  private ParkingReportPage  prPage;
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  prPage = new ParkingReportPage(dr);
	  
	  prPage.max_window();
	  
  }
  
  @Test
  public void parkingReportQuery() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = prPage.getCurrentWindowHandle();
	  
	  nbPage.click_StatisticalReport();
	  
	  prPage.switchToWindow(currentHandle);
	  
	  //点击运动统计
	  if (!prPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		  prPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  
	  prPage.srPage.clickStatisticalReportSubmenu(prPage.parkingReport);
	  
	  prPage.srPage.intoFrame(prPage.parkingReportFrame);
	  
	  prPage.parkingReportCheak();
	  
	  prPage.parkingReportStayAlltimes();
	  
	  prPage.parkingReportDropdownMenu();
	  
	  prPage.parkingReportExport();
	  
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  prPage.quit_bor();
  }

}
