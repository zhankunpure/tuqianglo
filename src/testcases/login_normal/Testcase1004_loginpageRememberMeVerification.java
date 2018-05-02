package testcases.login_normal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.loginPage.LoginPage;

public class Testcase1004_loginpageRememberMeVerification {
	public WebDriver dr;
	
	private LoginPage page;
	
	private AccountCenterNaviBarPage navBarPage;
	
	
	
  @Test
  public void rememberMeVerification() throws InterruptedException {
	  
	  page.openLoginPage();
	  
	  page.user_login_with_remember_me("jimitest", "jimi123");
	  
	  navBarPage.usr_logout();
	  
	  page.login_button_click();
	//���Ե�ǰ��¼�˺ŵ��û���
	  String actualUserAccount;
	  String company_name;
        if(navBarPage.getUserAccount().contains("(")) {
        	actualUserAccount = navBarPage.getUserAccount().split(" \\(")[0].trim();
        	company_name = navBarPage.getUserAccount().split(" \\(")[1].split("\\)")[0];
        }else {
        	actualUserAccount = navBarPage.getUserAccount().trim();
        	System.out.println("�û�����"+actualUserAccount);
        	company_name = null;
        }
	  
	  
	  assertEquals(actualUserAccount, "jimitest", "��ס�ҵ�¼���û�����һ��");
	  
	  navBarPage.usr_logout();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new LoginPage(dr);
	  
	  navBarPage = new AccountCenterNaviBarPage(dr);
	  
	  page.max_window();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  page.quit_bor();
  }

}
