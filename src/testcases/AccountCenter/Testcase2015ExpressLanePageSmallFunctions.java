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
	  //���ͳ��
	  elPage.inOrOutFrame("stockStatFrame");
	  
	  elPage.clickLowerFlag("lowerFlag");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("stockStatDiv");
	  
	  elPage.deleteModula("stockStatDiv");
	  
	  //״̬ͳ�Ʊ���
	  elPage.inOrOutFrame("statusStatFrame");
	  
	  elPage.clickLowerFlag("devCountIsContainLower");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("statusStatDiv");
	  
	  elPage.deleteModula("statusStatDiv");
	  
	  //����ͳ�Ʊ���
	  elPage.inOrOutFrame("actStatFrame");
	  
	  elPage.clickLowerFlag("lowerFlagActive");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("actStatDiv");
	  
	  elPage.deleteModula("actStatDiv");
	  
	  //�澯ͳ�Ʊ���
	  elPage.inOrOutFrame("alarmStatFrame");
	  
	  elPage.clickLowerFlag("isContainLower");
	  
	  elPage.inOrOutFrame("");
	  
	  elPage.refreshFrame("alarmStatDiv");
	  
	  elPage.deleteModula("alarmStatDiv");
	  
	  //�豸����
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
