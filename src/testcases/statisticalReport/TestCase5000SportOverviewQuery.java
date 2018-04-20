package testcases.statisticalReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.ClientRedis;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.SportOverviewPage;
import pages.statisticalReportPage.StatisticalReportPage;

public class TestCase5000SportOverviewQuery {
	public WebDriver dr;
	
	private BasePage page;
	
	private StatisticalReportPage srPage;
	
	private AccountCenterNaviBarPage nbPage;
	
	private SportOverviewPage soPage;
	
	private ClientRedis cr;
  
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  soPage = new SportOverviewPage(dr);
	  
	  srPage = new StatisticalReportPage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  srPage.max_window();
  }

  @SuppressWarnings("unused")
@Test
  public void sportOverviewQuery() throws InterruptedException {
	  page.login();
	  //点击统计报表
	  String currentHandle = soPage.getCurrentWindowHandle();
	  nbPage.click_StatisticalReport();
	  
	  soPage.switchToWindow(currentHandle);
	  //点击运动统计
	  if (!srPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		srPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  //点击运动总览
	  srPage.clickStatisticalReportSubmenu(soPage.sportOverview);
	  //进入运动总览iframe
	  srPage.intoFrame(soPage.sportOverviewFrame);
	  //运动总览报表查询
	  soPage.sportOverviewSelect("web_autotest");
	  
	  String AllMileage = srPage.getAllMileage(soPage.sportOverviewAllMileage);
	  
	  String AlloverSpeedTimes = soPage.getSpoerOverviewAlloverSpeedTimes();
	  
	  String AllstopTimes = soPage.getSpoerOverviewAllstopTimes();
	  
	  cr = new ClientRedis();
	  
	
  }
  @AfterTest
  public void afterTest() {
	  
	  srPage.quit_bor();
	  
  }

}
