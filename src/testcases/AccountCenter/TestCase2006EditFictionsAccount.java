package testcases.AccountCenter;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.comdata.assertDate.ComAssertData;
import model.CsvReader;
import pages.accountcenterPage.AccountCenterFictitiousAccountManagerPage;
import pages.base.BasePage;

public class TestCase2006EditFictionsAccount {
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
     public void testEditFictionsAccount() throws Exception{
    	 BasePage basep=new BasePage(dr);
    	 AccountCenterFictitiousAccountManagerPage acfam=new AccountCenterFictitiousAccountManagerPage(dr);
 		 CsvReader csvr=new CsvReader("accountcenter","editFicAccountData.csv");
 		 ComAssertData assertd = new ComAssertData();
 		 List<List<String>> CsvData=csvr.readCSVFile();
 		 basep.login();
 		 acfam.enterFictitiousAccountPage();
 		 acfam.clickEditFicAccountBtn();
 		 for(int i=0;i<CsvData.size();i++){
 		 acfam.editFicAccount(CsvData.get(i).get(0), CsvData.get(i).get(1), CsvData.get(i).get(2), CsvData.get(i).get(3));
 		 if(CsvData.get(i).get(1).equals("jimi1234")){
 			 Assert.assertEquals(acfam.getFicAccountRePasswordTip(), assertd.accountCenterFictitiousRePaawordTip(),"");
 			 
 		 }else{
 			 String editDataCheck=CsvData.get(i).get(2);
 			 String SendInsCheck=CsvData.get(i).get(3);
 			 Assert.assertEquals(acfam.getEditFicAccountOperateSuccTitle(),assertd.accountCenterMsgCenterGetSetReadStatusText(),"");
 			 acfam.switchToFicAccountPage();
 			 acfam.clickEditFicAccountBtn();
 			 if(editDataCheck.equals("enableEditData")){
 				 Assert.assertTrue(acfam.getEditFicAccountEditDateSelectStatus(),"");
 			 }else{
 				Assert.assertFalse(acfam.getEditFicAccountEditDateSelectStatus(),"");
 			 }
 			 if(SendInsCheck.equals("enableSendIns")){
 				Assert.assertTrue(acfam.getEditFicAccountSendInsSelectStatus(),"");
 			 }else{
 				Assert.assertFalse(acfam.getEditFicAccountSendInsSelectStatus(),"");
 			 }
 		 }
 		 }
     }

}
