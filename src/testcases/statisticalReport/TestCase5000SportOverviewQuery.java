package testcases.statisticalReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.StatisticalReportPage;

public class TestCase5000SportOverviewQuery {
	public WebDriver dr;
	
	private BasePage page;
	
	private StatisticalReportPage srPage;
	
	private AccountCenterNaviBarPage nbPage;
  
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  srPage = new StatisticalReportPage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  srPage.max_window();
  }

  @SuppressWarnings("unused")
@Test
  public void sportOverviewQuery() throws InterruptedException {
	  page.login();
	  //���ͳ�Ʊ���
	  nbPage.click_StatisticalReport();
	  //����˶�ͳ��
	  if (!srPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		srPage.clickElement(StatisticalReportPage.motionstatistics);
	}
	  //����˶�����
	  srPage.clickStatisticalReportSubmenu(StatisticalReportPage.sportOverview);
	  //�����˶�����iframe
	  srPage.intoFrame(StatisticalReportPage.sportOverviewFrame);
	  //�˶����������ѯ
	  srPage.sportOverviewSelect("web_autotest");
	  
	  String AllMileage = srPage.getAllMileage(StatisticalReportPage.sportOverviewAllMileage);
	  
	  String AlloverSpeedTimes = srPage.getSpoerOverviewAlloverSpeedTimes();
	  
	  String AllstopTimes = srPage.getSpoerOverviewAllstopTimes();
	  
	
  }
  @AfterTest
  public void afterTest() {
	  
	  srPage.quit_bor();
	  
  }

}
