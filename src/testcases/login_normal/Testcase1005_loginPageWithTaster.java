package testcases.login_normal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.loginPage.LoginPage;

public class Testcase1005_loginPageWithTaster {
	
	public WebDriver dr;
	
	private LoginPage page;
	
	private AccountCenterNaviBarPage navBarPage;
  @Test
  public void loginTaster() throws InterruptedException {
	  
	  page.openLoginPage();
	  
	  page.taste_user_login();
	  
	  //断言当前登录账号的用户名
	  String actualUserAccount;
	  String company_name;
        if(navBarPage.getTasteUserAccount().contains("(")) {
        	actualUserAccount = navBarPage.getTasteUserAccount().split(" \\(")[0].trim();
        	company_name = navBarPage.getTasteUserAccount().split(" \\(")[1].split("\\)")[0];
        }else {
        	actualUserAccount = navBarPage.getTasteUserAccount().trim();
        	System.out.println("用户名："+actualUserAccount);
        	company_name = null;
        }
	  
	  
	  assertEquals(actualUserAccount, "taste", "体验用户登录后用户名不一致");
	  
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
