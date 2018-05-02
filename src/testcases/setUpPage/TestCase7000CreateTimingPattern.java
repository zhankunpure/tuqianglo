package testcases.setUpPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.setUpPage.InstructionManagementPage;

public class TestCase7000CreateTimingPattern {
	
	private WebDriver dr;
	
	private InstructionManagementPage imPage;
 
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  imPage = new InstructionManagementPage(dr);
	  
	  imPage.max_window();
	  
	  
  }
  
  @Test
  public void createTimingPattern() throws InterruptedException {
	  
	  imPage.page.login();
	  
	  String actualURL = imPage.enterInstructionManagementPage();
	  
	  assertEquals(actualURL, imPage.InstructionManagementURL, "进入指令管理页面不成功！");
	  
	  imPage.CreateTimingPattern();
	  
	  String actualPatternName = imPage.InsTimingPatternFirstRecordModify();
	  
	  assertEquals(actualPatternName, "定时模式第一条记录修改成功", "定时模式第一条记录修改失败");
	  
	  imPage.sendInstructions("868120137194665");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  imPage.quit_bor();
  }

}
