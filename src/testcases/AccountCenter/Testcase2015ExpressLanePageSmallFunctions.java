package testcases.AccountCenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterExpressLanePage;
import pages.base.BasePage;

public class Testcase2015ExpressLanePageSmallFunctions {
	
	public WebDriver dr;
	
	private BasePage page;
	
	private AccountCenterExpressLanePage elPage;
  @Test
  public void expressLanePageSmallFunctions() throws InterruptedException {
	  
	  page.login();
	  
	  elPage.AddModula();
	  //库存统计
	  elPage.inOrOutFrame("stockStatFrame");
	  
	  elPage.clickLowerFlag("lowerFlag");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("stockStatDiv");
	  
	  elPage.deleteModula("stockStatDiv");
	  
	  //状态统计报表
	  elPage.inOrOutFrame("statusStatFrame");
	  
	  elPage.clickLowerFlag("devCountIsContainLower");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("statusStatDiv");
	  
	  elPage.deleteModula("statusStatDiv");
	  
	  //激活统计报表
	  elPage.inOrOutFrame("actStatFrame");
	  
	  elPage.clickLowerFlag("lowerFlagActive");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("actStatDiv");
	  
	  elPage.deleteModula("actStatDiv");
	  
	  //告警统计报表
	  elPage.inOrOutFrame("alarmStatFrame");
	  
	  elPage.clickLowerFlag("isContainLower");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("alarmStatDiv");
	  
	  elPage.deleteModula("alarmStatDiv");
	  
	  //设备期限
	  elPage.inOrOutFrame("devExpiresFrame");
	  
	  elPage.clickLowerFlag("devCountIsContainLower");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("devExpiresDiv");
	  
	  elPage.deleteModula("devExpiresDiv");  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  elPage = new AccountCenterExpressLanePage(dr);
	  
	  elPage.max_window();
  }

  @AfterTest
  public void afterTest() {
	  
	  elPage.quit_bor();
  }

}
