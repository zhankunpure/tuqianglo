package testcases.AccountCenter;

import org.testng.annotations.Test;

import data.comdata.assertDate.AccountCenterAssertData;
import pages.accountcenterPage.AccountCenterExpressLanePage;
import pages.base.BasePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase2017ExpressLanePageViewTrackAndTrackingDevice {
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterExpressLanePage elPage;
	
	@SuppressWarnings("unused")
	private AccountCenterAssertData assertDate;
  
  @BeforeTest
  public void beforeTest() {
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  elPage = new AccountCenterExpressLanePage(dr);
	  
	  elPage.max_window();
  }

  
  @Test
  public void viewTrackAndTrackingDevice() throws InterruptedException {
	  
	  page.login();
	  
	  String handle = elPage.getCurrentWindowHandle();
	  //imei:868120111111120
	  elPage.checkTrajectory("868120111111120", handle);
	  
	  String actual = elPage.getCurrentUrl();
	  
	  String expected = "http://tujunsat.jimicloud.com/trackreplay/locus?imei=868120111111120";
	  
	  assertEquals(actual, expected, "进入轨迹回放页面错误");
	  
	  elPage.close();
	  
	  elPage.getCurrentWindow(handle);
	  
	  elPage.trackingEquipment("868120111111120", handle);
	  
	  @SuppressWarnings("unused")
	String actual1 = elPage.getCurrentUrl();
	  
	  @SuppressWarnings("unused")
	String expected1 = "http://tujunsat.jimicloud.com/trackpreset/tracking/868120111111120?isTracking=0";
	  
	  assertEquals(actual, expected, "进入追踪设备页面错误");
	  
	  elPage.trajectoryPlaybackSearch();
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  elPage.quit_bor();
  }
  
}
