package testcases.AccountCenter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import model.CsvReader;
import pages.accountcenterPage.AccountCenterFictitiousAccountManagerPage;
import pages.base.BasePage;
import model.ConnectMysql;
import data.comdata.assertDate.ComAssertData;
import data.comdata.sqlDate.SqlData;

public class TestCase2005AddFictiousAccount {
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
     public void testAddFictiousAccount() throws Exception{
    	 BasePage basep=new BasePage(dr);
    		
    	 AccountCenterFictitiousAccountManagerPage acfam=new AccountCenterFictitiousAccountManagerPage(dr);
    	 ComAssertData assertd=new ComAssertData();
    	 SqlData sqld=new SqlData();
    	 CsvReader csvr=new CsvReader("accountcenter","addFicAccountData.csv");
    	 List<List<String>> CsvData=csvr.readCSVFile();
    	 ConnectMysql conn=new ConnectMysql();
    	 List<String> getEditFicAccountAcc=new ArrayList<String>();
    	 basep.login();
    	 acfam.enterFictitiousAccountPage();
    	 acfam.clickAddFicAccountBtn();
    	 acfam.clickCancelAddFicAccount();
    	 Assert.assertTrue(acfam.ficAccountManagerIsExist(), "");
    	 acfam.clickCancelAddFicAccountBtn();
    	 Assert.assertTrue(acfam.ficAccountManagerIsExist(), "");
    	 acfam.thirdClickAddAccountBtn();
    	 for(int i=0;i<CsvData.size();i++){
    		 acfam.addFicAccount(CsvData.get(i).get(0), CsvData.get(i).get(1), CsvData.get(i).get(2), CsvData.get(i).get(3), CsvData.get(i).get(4));
    		 if(CsvData.get(i).get(0).contains("#")){
    			 Assert.assertEquals(acfam.getFicAccountAccountTip(), assertd.accountCenterFictitiousAccountTip(),"");
    		 }else if(CsvData.get(i).get(1).equals("888888")){
    			 Assert.assertEquals(acfam.getFicAccountPasswordTip(), assertd.accountCenterFictitiousPaawordTip(),"");
    		 }else if(CsvData.get(i).get(1).equals("jimi1234")){
    			 Assert.assertEquals(acfam.getFicAccountRePasswordTip(), assertd.accountCenterFictitiousRePaawordTip(),"");
    		 }else{
    			 
    			 //Assert.assertEquals(acfam.getAddFicAccountSuccessLayui(), assertd.accountCenterMsgCenterGetSetReadStatusText()[0],"娣诲姞铏氭嫙璐﹀彿澶辫触");
    			 for(String account:acfam.getAllFicAccount()){
    				 if(account.equals("910hm")){
    					 break;
    				 }else{
    					 Assert.fail("");
    				 }
    			 }
    		 }
    		 
    	 }
    	 acfam.switchToFicFrame();
    	 acfam.clickEditBtn("910hm");
    	 String id=acfam.getFicAccountId1();
    	 System.out.println(id);
    	 getEditFicAccountAcc=conn.connectMySql(sqld.accountCenterFicAccountGetAccount(acfam.getFicAccountId1())[0], sqld.accountCenterFicAccountGetAccount(acfam.getFicAccountId1())[1]);
    	 Assert.assertEquals(getEditFicAccountAcc.get(0), "910hm", "");
    	 Assert.assertTrue(acfam.getEditFicAccountEditDateSelectStatus(), "");
    	 Assert.assertTrue(acfam.getEditFicAccountSendInsSelectStatus(),"");
		 }
}

     


