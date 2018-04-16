package testcases.AccountCenter;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.ConnectMysql;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterBillManagementPage;
import pages.base.BasePage;

public class TestCase2014BillManagementSearch {
	public WebDriver dr;
	
	private AccountCenterBillManagementPage bmPage;
	
	private BasePage page;
	
	private CsvReader cr;
	
	private ConnectMysql cm;
  @Test
  public void billManagementSearch() throws Exception {
	  
	  page.login();
	  
	  bmPage.clickBillManagerBtn();
	  
	  bmPage.defaltBillSearch();
	  
	  cr = new CsvReader("accountcenter", "bill_list.csv");
	  //   ����,����,����,����,�Զ���
	  List<List<String>> csv_data = cr.readCSVFile();
	  
	  for (List<String> list : csv_data) {
		  
		  if (list.get(0)=="����ѡ��") {
			continue;
		} else {
			if(list.get(1)=="����") {
				
				bmPage.thisWeekBillSearch();

			}else if(list.get(2)=="����") {
				
				bmPage.thisMonthBillSearch();
				
			}else if(list.get(3)=="����") {
				
				bmPage.lastMonthBillSearch();
				
			}else if(list.get(4)=="�Զ���") {
				
				bmPage.customTimeBillSearch(list.get(5),list.get(6));
				//SELECT b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info 
				//FROM vs_bill b WHERE b.imei='789456120171025';
				
				
			}

		}		
		  		//�澯�豸IMEI��ѯ
		   		bmPage.alarmDeviceIMEIBillSearch(list.get(7));
		   		
		   		String listValue = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql = "b.imei=+'"+list.get(7)+"'";
				
				List<String> dataSQL = cm.connectMySql(sql, listValue);
				System.out.println(dataSQL);
				//���ո澯�绰��ѯ
		   		bmPage.receivingAlarmPhoneBillSearch(list.get(8));
		   		
		   		String listValue2 = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql2 = "b.phone=+'"+list.get(8)+"'";
				List<String> dataSQL2 = cm.connectMySql(sql2, listValue2);
				System.out.println(dataSQL2);
				
		   		bmPage.allReceptionAlarmMethodsBillSearch();
		   		//�绰�澯��ʽ��ѯ
		   		bmPage.phoneAlarmMethodsBillSearch();
		   		
		   		String listValue3 = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql3 = "b.alarmPushType='3'";
				
				List<String> dataSQL3 = cm.connectMySql(sql3, listValue3);
				System.out.println(dataSQL3);
		   		//���Ÿ澯��ʽ��ѯ
		   		bmPage.messageAlarmMethodsBillSearch();
		   		
		   		String listValue4 = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql4 = "b.alarmPushType='4'";
				
				List<String> dataSQL4 = cm.connectMySql(sql4, listValue4);
				System.out.println(dataSQL4);
		   		
		   		bmPage.allProcessingResultsBillSearch();
		   		//�ɹ������ѯ
		   		bmPage.successResultsBillSearch();
		   		
		   		String listValue5 = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql5 = "b.status='1'";
				
				List<String> dataSQL5 = cm.connectMySql(sql5, listValue5);
				System.out.println(dataSQL5);
		   		//ʧ�ܽ����ѯ
		   		bmPage.failResultsBillSearch();
		   		
		   		String listValue6 = "b.creationDate,b.phone,b.alarmPushType,b.alarmType,b.imei,b.amount,b.content,b.status,b.info FROM vs_bill b WHERE"; 
				String sql6 = "b.status='0'";
				
				List<String> dataSQL6 = cm.connectMySql(sql6, listValue6);
				System.out.println(dataSQL6);
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr = new FirefoxDriver();
	  
	  page = new BasePage(dr);
	  
	  cm = new ConnectMysql();
	  
	  bmPage = new AccountCenterBillManagementPage(dr);
	  
	  bmPage.max_window();
  }

  @AfterTest
  public void afterTest() {
	  
	  bmPage.quit_bor();
  }

}
