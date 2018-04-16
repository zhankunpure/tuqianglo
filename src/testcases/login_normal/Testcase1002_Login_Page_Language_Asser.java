package testcases.login_normal;

import org.testng.annotations.Test;

import data.comdata.assertDate.LoginPageAssertData;
import pages.loginPage.LoginPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Testcase1002_Login_Page_Language_Asser  {
	
	public WebDriver dr;
	
	private LoginPageAssertData assertData ;
	
	private LoginPage page;
	
	private String[] language = {"English", "Espana", "Portugal", "Polska", "Deutschland"};
	
	private String loginBtnText;
  @Test
  public void loginPageLanguageAsser() throws InterruptedException {
	  
	  page.openLoginPage();
	  
	 
	  loginBtnText = page.change_language(language[0]);
	  
	  assertEquals(loginBtnText, assertData.loginButtonText(), "英文切换失败");

	  loginBtnText = page.change_language(language[1]);
	  
	  assertEquals(loginBtnText, assertData.loginButtonText(), "西班牙文切换失败");

	  loginBtnText = page.change_language(language[2]);
	  
	  assertEquals(loginBtnText, assertData.loginButtonText(), "葡萄牙文切换失败");

	  loginBtnText = page.change_language(language[3]);
	  
	  assertEquals(loginBtnText, assertData.loginButtonText(), "波兰文切换失败");

	  loginBtnText = page.change_language(language[4]);
	  
	  assertEquals(loginBtnText, assertData.loginButtonText(), "德文切换失败");
	  
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
