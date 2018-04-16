package testcases.AccountCenter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.comdata.assertDate.ComAssertData;
import data.comdata.sqlDate.SqlData;
import model.ConnectMysql;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterMsgCenterPage;
import pages.base.BasePage;


public class TestCase2002AccountCenterMsgSetRead {
	WebDriver dr;
	@BeforeMethod
	public void setUp() throws Exception{
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
	}
     @AfterMethod
	public void tearDown() throws Exception{
		dr.quit();
	}
     @Test
     public void test_account_center_msg_set_read() throws Exception{
    	BasePage basep=new BasePage(dr);
 		ComAssertData assertd=new ComAssertData();
 		ConnectMysql conn=new ConnectMysql();
 		SqlData sqld=new SqlData();
 		CsvReader csvr=new CsvReader("account_center","message_search_unread.csv");
 		List<List<String>> csv_data=csvr.readCSVFile();
 		AccountCenterMsgCenterPage acmcp=new AccountCenterMsgCenterPage(dr);
 		basep.login();
 		acmcp.enterMsgCenter();
 		Assert.assertEquals(acmcp.mess_center_title(), assertd.account_center_msg_center_title()[0], "娑堟伅涓績title閿欒");
 		acmcp.msgCenterParamInput(csv_data.get(0).get(0), csv_data.get(0).get(1), csv_data.get(0).get(2));
 		int actual_message_unread_num=acmcp.messageNumber();
 		if(actual_message_unread_num>0){
 			acmcp.clickFirstCheckboxUnreadAndSetRead();
 			Assert.assertEquals(acmcp.getSetReadStatusText(),assertd.accountCenterMsgCenterGetSetReadStatusText()[0],"璁剧疆宸茶鎿嶄綔澶辫触");
 			Assert.assertEquals(acmcp.getStatusListText(), assertd.accountCenterMsgCenterGetFirstReadStatus()[0],"娑堟伅娌℃湁璁剧疆涓哄凡璇�");
 			List<String> fullParentIdAnduserId=new ArrayList<String>();
 			List<String> accountCenterMsgFirstReadStatus=new ArrayList<String>();
 			fullParentIdAnduserId=conn.connectMySql(sqld.fullParentIdAnduserId()[0], sqld.fullParentIdAnduserId()[1]);
 			String fullParentId=fullParentIdAnduserId.get(0);
 			String userId=fullParentIdAnduserId.get(1);
 			accountCenterMsgFirstReadStatus=conn.connectMySql(sqld.accountCenterMsgReadStatus(fullParentId, userId)[0], sqld.accountCenterMsgReadStatus(fullParentId, userId)[1]);
 			Assert.assertTrue(accountCenterMsgFirstReadStatus.get(0).equals("1"), "鏁版嵁搴撴病鏈夋爣璁颁负宸茶");
 			
 		}else{
 			System.out.println("娌℃湁鏈娑堟伅");
 		}
 		acmcp.clickSetreadedToAll();
 		if(actual_message_unread_num>0){
 			acmcp.waitWhileMegNumIsNotNull();
 			Assert.assertEquals(acmcp.getSetReadToAllStatusText(),assertd.accountCenterMsgCenterGetSetReadStatusText()[0],"鍏ㄩ儴鏍囪宸茶澶辫触");
 		}else{
 			acmcp.waitWhileMegNumIsNull();
 			Assert.assertEquals(acmcp.getStatusListTextWhileNumIsNull(),assertd.accountCenterMsgSetReadStatusTextWhileNumIsNull()[0],"鍏ㄩ儴鏍囪宸茶澶辫触");
 		}
     }

}
