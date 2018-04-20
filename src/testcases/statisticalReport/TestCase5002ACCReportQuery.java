package testcases.statisticalReport;

import org.testng.annotations.Test;

import data.comdata.assertDate.StatisticalReportAssertData;
import model.ClientRedis;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.ACCReportPage;
import pages.statisticalReportPage.StatisticalReportPage;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5002ACCReportQuery {
	public WebDriver dr;
	
	private BasePage page;
	
	private StatisticalReportPage srPage;
	
	private AccountCenterNaviBarPage nbPage;
	
	private ACCReportPage accPage;
	
	private ClientRedis cr;
	
	private StatisticalReportAssertData srAssertData;

	@BeforeTest
	public void beforeTest() {
		  dr = new FirefoxDriver();
		  
		  page = new BasePage(dr);
		  
		  accPage = new ACCReportPage(dr);
		  
		  srPage = new StatisticalReportPage(dr);
		  
		  nbPage = new AccountCenterNaviBarPage(dr);
		  
		  srPage.max_window();
	}

	@Test

	public void StayPeportQuery() throws InterruptedException {
		
		String startTime;
		String endTime;
		String onTimes;
		String offTimes;
		String totalTime;
		List<List<String>> accdata;
		  page.login();
		  
		  String currentHandle = srPage.getCurrentWindowHandle();
		  //点击统计报表
		  
		  nbPage.click_StatisticalReport();
		  
		  srPage.switchToWindow(currentHandle);
		  //点击运动统计
		  if (!srPage.getElement("x,//*[@id=\"motionstatistics\"]/ul").isDisplayed()) {
			   srPage.clickElement(StatisticalReportPage.motionstatistics);
		  }
		  //点击acc报表
		  srPage.clickStatisticalReportSubmenu(accPage.accReport);
		  //进入acc报表表单
		  srPage.intoFrame(accPage.accReportFrame);
		  //acc报表查询
		  accdata =  accPage.accReportQuery("868120111111120");
		  System.out.println();
		  for (List<String> data : accdata) {
			  int size = data.size();
			  System.out.println(size);
			  startTime = data.get(0);
			  System.out.println("startTime:"+startTime);
			  endTime = data.get(1);
			  System.out.println("endTime:"+endTime);
			  onTimes = data.get(2);
			  System.out.println("onTimes:"+onTimes);
			  offTimes = data.get(3);
			  System.out.println("offTimes:"+offTimes);
			  totalTime = data.get(4);
			  System.out.println("totalTime:"+totalTime);
		}

	}

	@AfterTest
	public void afterTest() {
		
		srPage.quit_bor();
	}

}
