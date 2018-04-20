package testcases.statisticalReport;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.statisticalReportPage.OBDMileageReportPage;

public class TestCase5003OBDMileageReportQuery {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private OBDMileageReportPage obdMRPage;
	
	private AccountCenterNaviBarPage nBarPage;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  obdMRPage = new OBDMileageReportPage(dr);
	  
	  nBarPage = new AccountCenterNaviBarPage(dr);
	  
	  obdMRPage.max_window();
	  
  }
  
  @Test
  public void odbMileageReportQuery() throws InterruptedException {
	  
	  List<List<String>> queryData;
	  
	  page.login();
	  
	  String currentHandle = obdMRPage.getCurrentWindowHandle();
	  
	  nBarPage.click_StatisticalReport();
	  
	  obdMRPage.switchToWindow(currentHandle);
	  
	  if (!obdMRPage.srPage.getElement("x,//*[@id=\"obdStatistics\"]/ul").isDisplayed()) {
		   obdMRPage.srPage.clickStatisticalReportSubmenu(obdMRPage.srPage.obdStatistics);
	  }
	  
	  obdMRPage.clickElement(obdMRPage.OBDMileageReport);
	  
	  obdMRPage.toOBDMileageReportFrame();
	  
	  queryData = obdMRPage.obdMileageReportQuery("868120111111120");
	  
	  for (List<String> list : queryData) {
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println(list);
	}
	  
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  obdMRPage.quit_bor();
  }

}
