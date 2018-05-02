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
	  
	  //1�û��������붼Ϊ��
	  
	  page.user_login("", "");
	  
//	  page.JavascriptExecutor("x,//*[@id=\"tipsmsg\"]", "$("#tipsmsg").text(isError));
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "����ʾ�û��������벻�ܶ�Ϊ�մ���");
	  //2�û�������������һ��Ϊ��
	  
	  page.user_login("", "jimi123");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "����ʾ�û��������벻�ܶ�Ϊ�մ���");
	  
	  page.user_login("jimitest", "");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.usernameOrPasswordNotNull(), "����ʾ�û��������벻�ܶ�Ϊ�մ���");
	  //3�û���������
	  
	  page.user_login("etrytuyi", "jimi123");
	  
//	  actual = page.getLoginExceptionText();
//	  
//	  assertEquals(actual, assertData.accountNon_existent(), "����ʾ�˻������ڴ���");
	  //4�������
	  
	  page.user_login("jimitest", "588ytgh");
	  
	  actual = page.getCurrentUrl().split("index")[0];
//	  
	  assertEquals(actual, "http://tujunsat.jimicloud.com/", "�쳣��¼�ɹ�");
	  
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
