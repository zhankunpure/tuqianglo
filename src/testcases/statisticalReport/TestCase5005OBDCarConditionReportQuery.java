package testcases.statisticalReport;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.OBDCarConditionReportPage;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase5005OBDCarConditionReportQuery {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private OBDCarConditionReportPage obdCCRPage;
	
	private AccountCenterNaviBarPage nBarPage;
 
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  obdCCRPage = new OBDCarConditionReportPage(dr);
	  
	  nBarPage = new AccountCenterNaviBarPage(dr);
	  
	  obdCCRPage.max_window();
  }
  
  @Test
  public void obdCarConditionReportQuery() throws InterruptedException {
	  
	  List<List<String>> queryData;
	  
	  page.login();
	  
	  String currentHandle = obdCCRPage.getCurrentWindowHandle();
	  //点击统计报表
	  nBarPage.click_StatisticalReport();
	  
	  obdCCRPage.switchToWindow(currentHandle);
	  //点击OBD统计
	  if (!obdCCRPage.srPage.getElement("x,//*[@id=\"obdStatistics\"]/ul").isDisplayed()) {
		  obdCCRPage.srPage.clickStatisticalReportSubmenu(obdCCRPage.srPage.obdStatistics);
	  }
	  //点击OBD车况报表
	  obdCCRPage.clickElement(obdCCRPage.OBDCarConditionReport);
	  //进入OBD车况报表表单
	  obdCCRPage.toOBDCarConditionReportFrame();
	  //OBD车况报表查询
	  queryData = obdCCRPage.obdCarConditionReportQuery("868120111111120");
	  
	  for (List<String> list : queryData) {
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println(list);
	}
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  obdCCRPage.quit_bor();
  }

}
