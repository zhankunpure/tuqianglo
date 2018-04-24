package testcases.globalSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.globalSearchPage.GlobalSearchPage;

public class TestCase6000GlobalSearchBaseQuery {
 
  public WebDriver dr;
  
  private BasePage page;
  
  private AccountCenterNaviBarPage nbPage;
  
  private GlobalSearchPage gsPage;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  gsPage = new GlobalSearchPage(dr);
	  
	  nbPage.max_window();
  }
  
  @Test
  public void globalSearchBaseQuery() throws InterruptedException {
	  
	  page.login();
	  
	  nbPage.click_GlobalSearch();
	  
	  Thread.sleep(5000);
	  gsPage.switch_to_frame(GlobalSearchPage.GlobalSearchFrame);
	  Thread.sleep(2000);
	  gsPage.clickElement(GlobalSearchPage.DeviceBasicQueryBtn);
	  Thread.sleep(10000);
	  int totalNumber = gsPage.pageNumber(GlobalSearchPage.DeviceBaseQueryNoData, 
			  GlobalSearchPage.DeviceBasicQueryPageNumberLi, 
			  GlobalSearchPage.DeviceBasicQueryOrderNumberTr);
	  System.out.println(totalNumber);
	  Thread.sleep(2000);
	  gsPage.clickElement(GlobalSearchPage.CloseBaseQuery);
	  Thread.sleep(2000);
	  
	  page.logout();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	  
	  
	  
	  page.quit_bor();
  }

}
