package testcases.devicemanage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.base.BasePage;
import pages.deviceManagePage.DeviceManagePage;

public class NewTest {
	
	private WebDriver dr;
	
	private BasePage page;
	
	private DeviceManagePage dmPage;
	
  @Test
  public void f() throws InterruptedException {
	  
	  page.login();
	  
	  String currentHandle = dmPage.getCurrentWindowHandle();
	  
	  dmPage.nbPage.click_DeviceManage();
	  
	  dmPage.switchToWindow(currentHandle);
	  
	 // dmPage.lookAtTheCustomerInTurn();
	  
	 // dmPage.uploadImage();
	  
	  //dmPage.batchSale();
	  
	 // dmPage.batchSetUpCustomExpires("201805024565236");
	  
	 // dmPage.DeviceInfoExport();
	  
	  dmPage.sendInstruction();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  dmPage = new DeviceManagePage(dr);
	  
	  dmPage.max_window();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  dmPage.quit_bor();
  }

}
