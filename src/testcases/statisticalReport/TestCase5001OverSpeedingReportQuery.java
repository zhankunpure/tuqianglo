package testcases.statisticalReport;

import org.testng.annotations.Test;

import data.comdata.assertDate.StatisticalReportAssertData;
import model.ClientRedis;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.SpeedingReportPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5001OverSpeedingReportQuery {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private StatisticalReportPage srPage;
	
	private SpeedingReportPage speedrPage;
	
	private AccountCenterNaviBarPage nbPage;
	
	private ClientRedis cr;
	
	private StatisticalReportAssertData srAssertData;
  
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  speedrPage = new SpeedingReportPage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  srPage = new StatisticalReportPage(dr);
	  
	  speedrPage.max_window();
	  
  }
  
  @Test
  public void overSpeedingReportQuery() throws InterruptedException {
	  page.login();
	  
	  String currentHandle = speedrPage.getCurrentWindowHandle();
	  //���ͳ�Ʊ���
	  
	  nbPage.click_StatisticalReport();
	  
	  speedrPage.switchToWindow(currentHandle);
	  //����˶�ͳ��
	  if (!speedrPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
		  speedrPage.clickElement(StatisticalReportPage.motionstatistics);
	  }
	  //���ٱ���
	  srPage.clickStatisticalReportSubmenu(speedrPage.speedingReport);
	  //���볬�ٱ���iframe
	  srPage.intoFrame(speedrPage.speedingReportFrame);
	  //���ٱ����ѯ
	  speedrPage.overSpeedReportQuery("868120111111120");
	  
	  String actual = speedrPage.getText(speedrPage.speedingReportNoRecordsFound).trim();
	  System.out.println(actual);
	  assertEquals(actual, srAssertData.NoDataExpected, "ҳ���ѯʧ��");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  speedrPage.quit_bor();
  }

}
