package testcases.login_normal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.comdata.assertDate.LoginPageAssertData;
import pages.loginPage.LoginPage;

public class Testcase1003_loginPageThirdPartyWebSiteAssert {
	public WebDriver dr;
	
	private LoginPage page;
	
	private LoginPageAssertData assertData;
	
	private String[] webKey = {"cybercop","safeMonitor","badInfo","trustWeb"};
	
	private String actualText;
	
	private String currenthandle;
	
  @Test
  public void ThirdPartyWebSiteAssert() throws InterruptedException {
	  
	  page.openLoginPage();
	  
	  currenthandle = page.getCurrentWindowHandle();
	  
	  actualText = page.enter_third_party_website(webKey[0],currenthandle);
	  
	  assertEquals(actualText, assertData.cyberpoliceURL(), "ÍøÂç¾¯²ìÍøÕ¾ÇĞ»»Ê§°Ü");
	  
	  page.getCurrentWindow(currenthandle);

	  actualText = page.enter_third_party_website(webKey[1],currenthandle);
	  
	  assertEquals(actualText, assertData.networkSafeURL(), "°²È«¼à²ìÍøÕ¾ÇĞ»»Ê§°Ü");
	  
	  page.getCurrentWindow(currenthandle);

	  actualText = page.enter_third_party_website(webKey[2],currenthandle);
	  
	  assertEquals(actualText, assertData.reportingCenterURL(), "¾Ù±¨ÖĞĞÄÍøÕ¾ÇĞ»»Ê§°Ü");
	  
	  page.getCurrentWindow(currenthandle);

	  actualText = page.enter_third_party_website(webKey[3],currenthandle);
	  
	  assertEquals(actualText, assertData.networkSupervisorURL(), "¹¤ÉÌÍø¼àÍøÕ¾ÇĞ»»Ê§°Ü");
	  
	  page.getCurrentWindow(currenthandle);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  assertData = new LoginPageAssertData();
	  
	  dr = new FirefoxDriver();
	  
	  page = new LoginPage(dr);
	  
	  page.max_window();
  }

  @AfterTest
  public void afterTest() {
	  
	  page.quit_bor();
  }

}
