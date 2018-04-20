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
		  //点击统计报表
		  String currentHandle = erPage.getCurrentWindowHandle();
		  nbPage.click_StatisticalReport();
		  
		  erPage.switchToWindow(currentHandle);
		  //点击设备统计
		  if (!erPage.getElement("x,//*[@id=\"deviceStatistic\"]/ul").isDisplayed()) {
			  erPage.clickElement(StatisticalReportPage.deviceStatistic);
		}
		  //点击电量统计
		  erPage.srPage.clickStatisticalReportSubmenu(erPage.ElectricityReport);
		  //进入电量统计iframe
		  erPage.toElectricityReportFrame();
		  //电量统计报表查询
		  erPage.electricityReportQuery();
		  String actual = erPage.getText(erPage.NoExportData).trim();
		  
		  assertEquals(actual, StatisticalReportAssertData.NoDataExpected, "电量统计查询失败");
	}

	@AfterTest
	public void afterTest() {
		
		erPage.quit_bor();
	}

}
