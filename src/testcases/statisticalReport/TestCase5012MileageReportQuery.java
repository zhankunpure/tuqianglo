package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.MileageReportPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5012MileageReportQuery {
	
	  public WebDriver dr;
	  
	  private BasePage page;
	  
	  private AccountCenterNaviBarPage nbPage;
	  
	  private MileageReportPage  mrPage;
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  mrPage = new MileageReportPage(dr);
	  
	  mrPage.max_window();
  }
  
  @Test
  public void mileageReportQuery() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = mrPage.getCurrentWindowHandle();
	  
	  nbPage.click_StatisticalReport();
	  
	  mrPage.switchToWindow(currentHandle);
	  
	  //点击运动统计
	  if (!mrPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		  mrPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  
	  mrPage.srPage.clickStatisticalReportSubmenu(MileageReportPage.mileageReport);
	  
	  mrPage.srPage.intoFrame(MileageReportPage.mileageReportFrame);
	  
	  mrPage.mileageReportMileagesCheak();
	  
	  mrPage.mileageReportDayCheak();
  }
  
  @AfterTest
  public void afterTest() {
	  
	  mrPage.quit_bor();
  }

}
