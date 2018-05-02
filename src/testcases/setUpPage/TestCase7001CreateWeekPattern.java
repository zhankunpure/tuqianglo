package testcases.setUpPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.base.BasePage;
import pages.setUpPage.InstructionManagementPage;

public class TestCase7001CreateWeekPattern {
	
	private WebDriver dr;
	
	private BasePage page;
	
	private InstructionManagementPage imPage;
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  imPage = new InstructionManagementPage(dr);
	  
	  imPage.max_window();
	  
  }
  
  @Test
  public void CreateWeekPattern() throws InterruptedException {
	  
	  page.login();
	  
	  String actualURL = imPage.enterInstructionManagementPage();
	  
	  assertEquals(actualURL, imPage.InstructionManagementURL, "进入指令管理页面不成功");
	  
	  imPage.CreateWeekPattern();
	  
	  String actualPatternName = imPage.InsWeekPatternFirstRecordModify();
	  
	  assertEquals(actualPatternName, "星期模式第一条记录修改成功", "星期模式第一条记录修改失败");
	  
	  imPage.sendInstructions("868120137194665");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  imPage.quit_bor();
  }

}
