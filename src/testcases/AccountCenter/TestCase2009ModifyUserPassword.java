package testcases.AccountCenter;

import org.testng.annotations.Test;

import data.comdata.assertDate.AccountCenterAssertData;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase2009ModifyUserPassword {

	private CsvReader cr;

	public WebDriver dr;

	private AccountCenterNaviBarPage navBarPage;

	private BasePage basePage;

	private AccountCenterAssertData assertData;

	@Test
  public void ModifyUserPassword() throws Exception {
	  
		basePage.login();
	  
	    cr = new CsvReader("accountcenter", "user_to_modify_passwd.csv");
	  
	    List<List<String>> csv_data = cr.readCSVFile();
	  
	    for (List<String> list : csv_data) {
	       System.out.println(list.get(1));
	       System.out.println(list.get(2));
		   String actual =  navBarPage.mondify_user_passwd(list.get(1), list.get(2), list.get(2)).trim();
		   
		   assertData = new AccountCenterAssertData();
		  
		   assertEquals(actual, assertData.modifyUserPasswordSuccessText(), "”√ªß√‹¬Î–ﬁ∏ƒ ß∞‹");
		  
		   
		   navBarPage.operateInputElement("account", list.get(0));
			
		   navBarPage.operateInputElement("password", list.get(2));
		   
		   navBarPage.clickElement("logins");
		   
		   
	    }
	    	}

	@BeforeTest
	public void beforeTest() {

		dr = new FirefoxDriver();

		basePage = new BasePage(dr);

		navBarPage = new AccountCenterNaviBarPage(dr);

		navBarPage.max_window();
	}

	@AfterTest
	public void afterTest() {
		
		

		navBarPage.quit_bor();
	}

}
