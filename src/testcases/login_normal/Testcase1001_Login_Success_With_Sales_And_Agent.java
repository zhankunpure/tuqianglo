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
	 * # ͨ��csv�������ۺʹ������˻��ɹ���¼�ͳɹ��˳�����
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
   * # ͨ��csv�������ۺʹ������˻��ɹ���¼�ͳɹ��˳�����
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
			  //��¼
			  loginPage.user_login(list.get(0), list.get(1));
			  
			  String current_handle = loginPage.getCurrentWindowHandle();
			  System.out.println(current_handle);
			  naBarPage.click_account_center();
			  
			  loginPage.switchToWindow(current_handle);
			  
			  String actual_url = loginPage.getCurrentUrl();
			  
			  assertEquals(actual_url, loginPage.comd.baseUrl()+"/customer/toAccountCenter","��¼�ɹ���ҳ����ת����");
			  
			  //���Ե�ǰ��¼�˺ŵ��û���
			  String usr_info_account;
			  String company_name;
	            if(naBarPage.getUserAccount().contains("(")) {
	            	 usr_info_account = naBarPage.getUserAccount().split(" \\(")[0].trim();
	            	 company_name = naBarPage.getUserAccount().split(" \\(")[1].split("\\)")[0];
	            }else {
	            	 usr_info_account = naBarPage.getUserAccount().trim();
	            	 System.out.println("�û�����"+usr_info_account);
	            	 company_name = null;
	            }
	            
	            
	            String expect_usr_info_account = list.get(0);
	            //�����û���
	            assertEquals(usr_info_account, expect_usr_info_account, "�û���������¼�û�����ʾ����");
	            Thread.sleep(1000);
	            String phone =  naBarPage.getUserInfoPhone();
	            Thread.sleep(1000);
	            String nickName = naBarPage.getNickName().trim();
	            System.out.println("nickName="+nickName);
	            String sql =  "WHERE o.account = '"+usr_info_account+ "';";
	            System.out.println("sql="+sql);
	            String listValue = "o.account,o.type,o.phone,o.parentId,o.nickName,o.companyName from user_info o";
	            System.out.println("listValue="+listValue);
	            //��ѯ���ݿ�user info
	            List<String> user_info =  cm.connectMySql(sql, listValue);
	            System.out.println(user_info);
	            assertEquals(user_info.get(0), usr_info_account, "ǰ̨�û���������ݿ��ѯ�����û�����һ��");
	            
	            assertEquals(user_info.get(5), company_name, "ǰ��̨��˾���Ʋ�һ��");
	            
	            Thread.sleep(2000);
	            
	            naBarPage.usr_logout();
	            
	            
	            assertEquals(loginPage.comd.baseUrl()+"/", loginPage.getCurrentUrl(), "�����˳�ϵͳ����");
	            
//		}
			  
			  
		
		  
		  
		
	}
	  
  }
}
