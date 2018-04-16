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
 			 Assert.assertEquals(acfam.getFicAccountRePasswordTip(), assertd.accountCenterFictitiousRePaawordTip()[0],"纭瀵嗙爜閿欒楠岃瘉澶辫触");
 			 
 		 }else{
 			 String editDataCheck=CsvData.get(i).get(2);
 			 String SendInsCheck=CsvData.get(i).get(3);
 			 Assert.assertEquals(acfam.getEditFicAccountOperateSuccTitle(),assertd.accountCenterMsgCenterGetSetReadStatusText()[0],"缂栬緫铏氭嫙璐︽埛澶辫触");
 			 acfam.switchToFicAccountPage();
 			 acfam.clickEditFicAccountBtn();
 			 if(editDataCheck.equals("enableEditData")){
 				 Assert.assertTrue(acfam.getEditFicAccountEditDateSelectStatus(),"妫�鏌ョ紪杈戞暟鎹閫夋涓哄嬀閫夊け璐�");
 			 }else{
 				Assert.assertFalse(acfam.getEditFicAccountEditDateSelectStatus(),"妫�鏌ョ紪杈戞暟鎹閫夋涓轰笉鍕鹃�夊け璐�");
 			 }
 			 if(SendInsCheck.equals("enableSendIns")){
 				Assert.assertTrue(acfam.getEditFicAccountSendInsSelectStatus(),"妫�鏌ヤ笅鍙戞寚浠ゅ閫夋涓哄嬀閫夊け璐�");
 			 }else{
 				Assert.assertFalse(acfam.getEditFicAccountSendInsSelectStatus(),"妫�鏌ヤ笅鍙戞寚浠ゅ閫夋涓轰笉鍕鹃�夊け璐�");
 			 }
 		 }
 		 }
     }

}
