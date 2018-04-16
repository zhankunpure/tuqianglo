package testcases.login_abnormal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.comdata.assertDate.LoginPageAssertData;
import pages.loginPage.LoginPage;

public class Testcase1006_loginPageExceptionVerification {
	public WebDriver dr;
	
	private LoginPage page;
	
	private String actual;
	
	private LoginPageAssertData assertData;
  @Test
  public void loginExceptionVerification() throws InterruptedException {
	  
	  page.openLoginPage();
	  
	  //1用户名和密码都为空
	  
	  page.user_login("", "");
	  
//	  page.JavascriptExecutor("x,//*[@id=\"tipsmsg\"]", "$("#tipsmsg").text(isError));
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "不显示用户名或密码不能都为空错误");
	  //2用户名和密码其中一个为空
	  
	  page.user_login("", "jimi123");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "不显示用户名或密码不能都为空错误");
	  
	  page.user_login("jimitest", "");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "不显示用户名或密码不能都为空错误");
	  //3用户名不存在
	  
	  page.user_login("etrytuyi", "jimi123");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.accountNon_existent(), "不显示账户不存在错误");
	  //4密码错误
	  
	  page.user_login("jimitest", "588ytgh");
	  
	  actual = page.getCurrentUrl().split("index")[0];
//	  
	  assertEquals(actual, "http://tujunsat.jimicloud.com/", "异常登录成功");
	  
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
