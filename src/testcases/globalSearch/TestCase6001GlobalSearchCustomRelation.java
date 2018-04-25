package testcases.globalSearch;

import org.testng.annotations.Test;

import data.comdata.assertDate.GlobalSearchAssertData;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;
import pages.globalSearchPage.GlobalSearchDeviceDetailsPage;
import pages.globalSearchPage.GlobalSearchPage;

import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase6001GlobalSearchCustomRelation {
	
	  public WebDriver dr;
	  
	  private BasePage page;
	  
	  private AccountCenterNaviBarPage nbPage;
	  
	  private GlobalSearchPage gsPage;
	
	  private GlobalSearchDeviceDetailsPage detailsPage;
	  
	  public List<String> expectedInfos ;
	
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  nbPage = new AccountCenterNaviBarPage(dr);
	  
	  gsPage = new GlobalSearchPage(dr);
	  
	  nbPage.max_window();
	  
  }

  @Test
  
  public void globalSearchCustomRelation() throws InterruptedException{
	  
	  page.login();
	  
	  nbPage.click_GlobalSearch();
	  
	  Thread.sleep(5000);
	  gsPage.switch_to_frame(GlobalSearchPage.GlobalSearchFrame);
	  Thread.sleep(2000);
	  gsPage.clickElement(GlobalSearchPage.DeviceBasicQueryBtn);
	  Thread.sleep(10000);
	  
	  gsPage.clickDeviceDetail();
	  
	  detailsPage = new GlobalSearchDeviceDetailsPage(dr);
	  
	  String expectedImei = detailsPage.getText(detailsPage.DeviceImei).trim();
	  System.out.println(expectedImei);
	  expectedInfos = detailsPage.getUserInfo();
	  System.out.println("==================================================");
	  System.out.println(expectedInfos);
	  String actualImei = detailsPage.toTrackReplayPage();
	  assertEquals(actualImei, expectedImei, "imei号不一致");
	  
	  String actualImei1 = detailsPage.toTrackingPage();
	  assertEquals(actualImei1, expectedImei, "imei号不一致");
	  
	  String actualImei2 = detailsPage.lookAtTheAlarm();
	  assertEquals(actualImei2, expectedImei, "imei号不一致");
	  
	  String actualImei3 = detailsPage.toConsolePage();
	  assertEquals(actualImei3, expectedImei, "imei号不一致");
	  
	  String actualURL = detailsPage.clickConsole();
	  assertEquals(actualURL, GlobalSearchAssertData.consoleURL(), "进入控制台错误");
	  
	  assertEquals(expectedInfos.get(0), detailsPage.clickLookAt().get(0),"客户名称不一致");
	  
	  assertEquals(expectedInfos.get(1), detailsPage.clickLookAt().get(1),"客户类型不一致");
	  
	  assertEquals(expectedInfos.get(2), detailsPage.clickLookAt().get(2),"客户账号不一致");
	  
	  assertEquals(expectedInfos.get(3), detailsPage.clickLookAt().get(3),"客户电话不一致");
	  
	  detailsPage.clickElement(detailsPage.ComeBaceBtn);
	  Thread.sleep(2000);
	  gsPage.clickElement(GlobalSearchPage.CloseBaseQuery);
	  Thread.sleep(2000);
	  
	  page.logout();
  }
  
  @AfterTest
  public void afterTest() {
	  
	  page.quit_bor();
  }


 
}
