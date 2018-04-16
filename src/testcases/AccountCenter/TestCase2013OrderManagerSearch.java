package testcases.AccountCenter;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import model.CsvReader;
import pages.accountcenterPage.AccountCenterOrderManagerPage;
import pages.base.BasePage;


public class TestCase2013OrderManagerSearch {
	public WebDriver dr;
	
	private AccountCenterOrderManagerPage omPage;
	
	private BasePage page;
	
	private CsvReader cr;

	
  @Test
  public void orderManagerSearch() throws Exception {
	  
	  page.login();
	  
	  omPage.clickOrderManager();
	  
	  cr = new CsvReader("accountcenter", "order_manage.csv");
	  
	  List<List<String>> csv_data = cr.readCSVFile();
	  
	  for (List<String> list : csv_data) {
		  
		  if (list.get(0)=="¶©µ¥ºÅ") {
			continue;
		} else {
			
			
			
			omPage.orderNoSearch(list.get(0));
			
			omPage.paymentTimeSearch();
			
			omPage.creationTimeSearch();
			
			omPage.startTimeeSearch(list.get(1));
			
			omPage.endTimeSearch(list.get(2));
			
			omPage.productNameSearch(list.get(3));
			
			omPage.orderStatusNoPaySearch();
			
			omPage.orderStatusPaySearch();
			
			omPage.orderTypeMsgSearch();
			
			omPage.orderTypePhoneSearch();
			
			omPage.paymentMethodWeiXinSearch();
			
			omPage.paymentMethodZhiFuBaoSearch();
			
			omPage.platformOrderSearch();
			
		}
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  omPage = new AccountCenterOrderManagerPage(dr);
	  
	  page =omPage.page;
	  
	  omPage.max_window();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  omPage.orderExport();
	  
	  omPage.quit_bor();
  }

}
