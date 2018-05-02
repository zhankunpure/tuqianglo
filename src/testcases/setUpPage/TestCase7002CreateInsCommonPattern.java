package testcases.setUpPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.base.BasePage;
import pages.setUpPage.InstructionManagementPage;

public class TestCase7002CreateInsCommonPattern {
	
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
  public void CreateInsCommonPattern() throws InterruptedException {
	  
	  page.login();
	  
	  String actualURL = imPage.enterInstructionManagementPage();
	  
	  assertEquals(actualURL, imPage.InstructionManagementURL, "����ָ�����ҳ�治�ɹ�");
	  
	  imPage.createInsCommonPattern();
	  
	  String actualPatternName = imPage.InsCommonPatternFirstRecordModify();
	  
	  assertEquals(actualPatternName, "��ͨģʽ��һ����¼�޸ĳɹ�", "��ͨģʽ��һ����¼�޸�ʧ��");
	  
	  imPage.sendInstructions("868120137194665");
  }

  @AfterTest
  public void afterTest() {
	  
	  imPage.quit_bor();
  }

}
