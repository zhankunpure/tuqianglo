package testcases.statisticalReport;

import org.testng.annotations.Test;

import data.comdata.assertDate.StatisticalReportAssertData;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.AlarmOverviewPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5008AlarmOverviewQuery {
  
	public WebDriver dr;
	
	private BasePage page;
	
	private AlarmOverviewPage aoPage;
	
	private AccountCenterNaviBarPage nbPage;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  aoPage = new AlarmOverviewPage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  aoPage.max_window();
  }
  
  @Test
  public void alarmOverviewQuery() throws InterruptedException {
	  
	  page.login();
	  //���ͳ�Ʊ���
	  String currentHandle = aoPage.getCurrentWindowHandle();
	  
	  nbPage.click_StatisticalReport();
	  
	  aoPage.switchToWindow(currentHandle);
	  //����澯ͳ��
	  if (!aoPage.getElement("x,//*[@id=\"alarmstatistics\"]/ul").isDisplayed()) {
		  aoPage.clickElement(StatisticalReportPage.alarmstatistics);
	}
	  //����澯����
	  aoPage.srPage.clickStatisticalReportSubmenu(AlarmOverviewPage.AlarmOverview);
	  //����澯����iframe
	  aoPage.toAlarmOverviewFrame();
	  //�澯���������ѯ
	  aoPage.alarmOverviewQuery();
	  
	  String actual = aoPage.getText(aoPage.NoExportData).trim();
	  
	  assertEquals(actual, StatisticalReportAssertData.NoDataExpected, "�澯������ѯʧ��");
  }

  @AfterTest
  public void afterTest() {
	  
	  aoPage.quit_bor();
  }

}
