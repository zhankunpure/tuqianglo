package testcases.AccountCenter;

import org.testng.annotations.Test;

import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
/**
 * �쳣�����ֵ��
 * @author ZhanKun
 *
 */
public class TestCase2011ExceptionBuyCard {
	public WebDriver dr;

	private AccountCenterNaviBarPage navBarPage;

	private BasePage basePage;
	
	@Test
	public void ExceptionBuyCard() throws InterruptedException {
		  List<String> actual;
		  String[] expected = {"����","�꿨, ����������һ����Ϊ0","����������"};
		  basePage.login();
		  
		  actual = navBarPage.abnormalBuyCard("", "", "", "", "");
		  
		  assertEquals(actual.get(0), expected[1], "�쳣����ɹ�");
		  
		  assertEquals(actual.get(1), expected[1], "�쳣����ɹ�");
		  
		  assertEquals(actual.get(2), expected[0], "�쳣����ɹ�");
		  
		  assertEquals(actual.get(3), expected[0], "�쳣����ɹ�");
		  
		  assertEquals(actual.get(4), expected[0], "�쳣����ɹ�");
		  		  
		  actual.clear();
		  
		  System.out.println(actual);
		  
		  actual = navBarPage.abnormalBuyCard("gg23", "@#%%_=", "", "", "");
		  
		  assertEquals(actual.get(0), expected[2], "�쳣����ɹ�");
		  
		  assertEquals(actual.get(1), expected[2], "�쳣����ɹ�");
		  
		  
		
	}

	@BeforeTest
	public void beforeTest() {
		  dr = new FirefoxDriver();
		  
		  navBarPage = new AccountCenterNaviBarPage(dr);
		  
		  basePage = new BasePage(dr);
		  
		  navBarPage.max_window();
	}

	@AfterTest
	public void afterTest() {
		
		navBarPage.quit_bor();
	}

}
