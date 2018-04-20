package testcases.statisticalReport;

import org.testng.annotations.Test;

import data.comdata.assertDate.StatisticalReportAssertData;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.ElectricityReportPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5007ElectricityReportQuery {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private ElectricityReportPage erPage;
	
	private AccountCenterNaviBarPage nbPage;
	
	@BeforeTest
	public void beforeTest() {
		
		  dr = new FirefoxDriver();
		  
		  page = new BasePage(dr);
		  
		  erPage = new ElectricityReportPage(dr);
		  
		  nbPage = new AccountCenterNaviBarPage(dr);
		  
		  erPage.max_window();
	}

	@Test
	public void electricityReportQuery() throws InterruptedException {
		
		  page.login();
		  //���ͳ�Ʊ���
		  String currentHandle = erPage.getCurrentWindowHandle();
		  nbPage.click_StatisticalReport();
		  
		  erPage.switchToWindow(currentHandle);
		  //����豸ͳ��
		  if (!erPage.getElement("x,//*[@id=\"deviceStatistic\"]/ul").isDisplayed()) {
			  erPage.clickElement(StatisticalReportPage.deviceStatistic);
		}
		  //�������ͳ��
		  erPage.srPage.clickStatisticalReportSubmenu(erPage.ElectricityReport);
		  //�������ͳ��iframe
		  erPage.toElectricityReportFrame();
		  //����ͳ�Ʊ����ѯ
		  erPage.electricityReportQuery();
		  String actual = erPage.getText(erPage.NoExportData).trim();
		  
		  assertEquals(actual, StatisticalReportAssertData.NoDataExpected, "����ͳ�Ʋ�ѯʧ��");
	}

	@AfterTest
	public void afterTest() {
		
		erPage.quit_bor();
	}

}
