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

public class TestCase2001AccountCenterMsgUnread {
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
	public void test_account_center_msg_unread() throws Exception{
		BasePage basep=new BasePage(dr);
		ComAssertData assertd=new ComAssertData();
		ConnectMysql conn=new ConnectMysql();
		SqlData sqld=new SqlData();
		
		CsvReader csvr=new CsvReader("accountcenter","message_search_unread.csv");
		List<List<String>> csv_data=csvr.readCSVFile();
		AccountCenterMsgCenterPage acmcp=new AccountCenterMsgCenterPage(dr);
		//登录
		basep.login();
		//进入消息中心
		acmcp.enterMsgCenter();
		
		Assert.assertEquals(acmcp.mess_center_title(), assertd.account_center_msg_center_title(), "");
		//参数输入查询
		acmcp.msgCenterParamInput(csv_data.get(0).get(0), csv_data.get(0).get(1), csv_data.get(0).get(2));
		//未读消息页数
		int actual_message_unread_num=acmcp.messageNumber();
		
		List<String> fullParentIdAnduserId=new ArrayList<String>();
		List<String> account_center_msg_unread_number=new ArrayList<String>();
		
		fullParentIdAnduserId=conn.connectMySql(sqld.fullParentIdAnduserId()[0], sqld.fullParentIdAnduserId()[1]);
		String fullParentId=fullParentIdAnduserId.get(0);
		String userId=fullParentIdAnduserId.get(1);
		
		account_center_msg_unread_number=conn.connectMySql(sqld.account_center_msg_unread(fullParentId, userId)[0], sqld.account_center_msg_unread(fullParentId, userId)[1]);
		int except_message_unread_num=Integer.parseInt(account_center_msg_unread_number.get(0));
		
		int actual_show_unread_num=acmcp.unreadMessNumber();
		Assert.assertEquals(actual_show_unread_num, except_message_unread_num,"");
		Assert.assertEquals(actual_message_unread_num, except_message_unread_num,"");
	}

}
