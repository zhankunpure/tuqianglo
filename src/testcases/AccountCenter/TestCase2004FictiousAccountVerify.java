package testcases.AccountCenter;

import java.sql.SQLException;
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
import data.comdata.ComData;
import pages.accountcenterPage.AccountCenterFictitiousAccountManagerPage;
import pages.base.BasePage;
import model.ConnectMysql;

public class TestCase2004FictiousAccountVerify {
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
     public void testFictiousAccountVerify() throws SQLException, InterruptedException{
    	 BasePage basep=new BasePage(dr);
    	 AccountCenterFictitiousAccountManagerPage acfam=new AccountCenterFictitiousAccountManagerPage(dr);
    	 ComAssertData assertd=new ComAssertData();
    	 ComData comd=new ComData();
    	 ConnectMysql conn=new ConnectMysql();
    	 SqlData sqld=new SqlData();
    	 basep.login();
    	 acfam.enterFictitiousAccountPage();
    	 Assert.assertEquals(acfam.getFicAccountTitle(), assertd.accountCenterFictitiousAccountTitle()[0], "杩涘叆铏氭嫙璐﹀彿椤甸潰澶辫触");
    	 List<String> ficAccountData =new ArrayList<String>();
    	 ficAccountData=conn.connectMySql(sqld.accountCenterFictitiousAccountData(comd.baseUser()[2])[0], sqld.accountCenterFictitiousAccountData(comd.baseUser()[2])[1]);
    	 if(ficAccountData.size()==0){
    		 Assert.assertTrue(acfam.ficAccountIsNull(), "椤甸潰鏁伴噺涓嶄负0");
    	 }else{
    		 Assert.assertEquals(acfam.getAllFicAccountNum(),ficAccountData.size(),"铏氭嫙璐﹀彿鏁伴噺涓庡疄闄呬笉绗�");
    		 for(int i=0;i<acfam.getAllFicAccountNum();i++){
    		
    			 Assert.assertTrue(ficAccountData.contains(acfam.getAllFicAccount().get(i)), "铏氭嫙璐﹀彿鏁版嵁閿欒");
    		 }
    	 }
    	 
     }

}
