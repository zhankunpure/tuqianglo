package testcases.login_normal;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.ConnectMysql;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.loginPage.LoginPage;
	/**
	 * # 通过csv测试销售和代理商账户成功登录和成功退出功能
	 * @author zhankun
	 *
	 */
public class Testcase1001_Login_Success_With_Sales_And_Agent {
	
	private LoginPage loginPage;
	
	private CsvReader cr;
	
	private ConnectMysql cm;
	
	private AccountCenterNaviBarPage naBarPage;
	
	public WebDriver dr;
  
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  loginPage = new LoginPage(dr);
	  
	  loginPage.openLoginPage();
	  loginPage.max_window();
	  loginPage.deleteCookie();
	  try {
		  
		cr = new CsvReader("login", "login_with_sales_and_agent_user.csv");
		cm = new ConnectMysql();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	  
  }

  @AfterTest
  public void afterTest() {
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  loginPage.quit_bor();
  }
  
  /**
   * # 通过csv测试销售和代理商账户成功登录和成功退出功能
 * @throws Throwable 
   */
  @Test
  public void test_sales_and_agent_login_by_csv() throws Throwable {
	  
	  naBarPage = new AccountCenterNaviBarPage(dr);
	  List<List<String>> csv_data = cr.readCSVFile();
	  System.out.println(csv_data);
	  for (List<String> list : csv_data) {
		  int size = list.size();
//		  for (int i =0;i<size; i++) {
			  //登录
			  loginPage.user_login(list.get(0), list.get(1));
			  
			  String current_handle = loginPage.getCurrentWindowHandle();
			  System.out.println(current_handle);
			  naBarPage.click_account_center();
			  
			  loginPage.switchToWindow(current_handle);
			  
			  String actual_url = loginPage.getCurrentUrl();
			  
			  assertEquals(actual_url, loginPage.comd.baseUrl()+"/customer/toAccountCenter","登录成功后页面跳转错误");
			  
			  //断言当前登录账号的用户名
			  String usr_info_account;
			  String company_name;
	            if(naBarPage.getUserAccount().contains("(")) {
	            	 usr_info_account = naBarPage.getUserAccount().split(" \\(")[0].trim();
	            	 company_name = naBarPage.getUserAccount().split(" \\(")[1].split("\\)")[0];
	            }else {
	            	 usr_info_account = naBarPage.getUserAccount().trim();
	            	 System.out.println("用户名："+usr_info_account);
	            	 company_name = null;
	            }
	            
	            
	            String expect_usr_info_account = list.get(0);
	            //断言用户名
	            assertEquals(usr_info_account, expect_usr_info_account, "用户名正常登录用户名显示错误");
	            Thread.sleep(1000);
	            String phone =  naBarPage.getUserInfoPhone();
	            Thread.sleep(1000);
	            String nickName = naBarPage.getNickName().trim();
	            System.out.println("nickName="+nickName);
	            String sql =  "WHERE o.account = '"+usr_info_account+ "';";
	            System.out.println("sql="+sql);
	            String listValue = "o.account,o.type,o.phone,o.parentId,o.nickName,o.companyName from user_info o";
	            System.out.println("listValue="+listValue);
	            //查询数据库user info
	            List<String> user_info =  cm.connectMySql(sql, listValue);
	            System.out.println(user_info);
	            assertEquals(user_info.get(0), usr_info_account, "前台用户名与从数据库查询到的用户名不一致");
	            
	            assertEquals(user_info.get(5), company_name, "前后台公司名称不一致");
	            
	            Thread.sleep(2000);
	            
	            naBarPage.usr_logout();
	            
	            
	            assertEquals(loginPage.comd.baseUrl()+"/", loginPage.getCurrentUrl(), "正常退出系统错误");
	            
//		}
			  
			  
		
		  
		  
		
	}
	  
  }
}
