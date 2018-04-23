package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.StatisticalReportPage;
import pages.statisticalReportPage.StayReportPage;
import pages.statisticalReportPage.TracelReportPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5010TracelReportQuery {
	
	  public WebDriver dr;
	  
	  private BasePage page;
	  
	  private AccountCenterNaviBarPage nbPage;
	  
	  private TracelReportPage  trPage;
 
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  trPage = new TracelReportPage(dr);
	  
	  trPage.max_window();
	  
  }
  
  @Test
  public void tracelReportQuery() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = trPage.getCurrentWindowHandle();
	  
	  nbPage.click_StatisticalReport();
	  
	  trPage.switchToWindow(currentHandle);
	  
	  //点击运动统计
	  if (!trPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		  trPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  
	  trPage.srPage.clickStatisticalReportSubmenu(trPage.tracelReport);
	  
	  trPage.srPage.intoFrame(trPage.tracelReportFrame);
	  
	  trPage.tracelReportMileagesCheak();
	  
	  trPage.tracelReportDayCheak();
  }

  @AfterTest
  public void afterTest() {
	  
	  trPage.quit_bor();
  }

}
