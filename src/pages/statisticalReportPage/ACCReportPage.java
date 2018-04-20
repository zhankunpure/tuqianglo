package pages.statisticalReportPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * ACC报表页面
 * @author Administrator
 *
 */
public class ACCReportPage extends AutomateDriver{
	
	private StatisticalReportPage srPage;

	public ACCReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * ACC报表
	 */
	public static final String accReport = "accReport";
	/**
	 * ACC报表表单 iframe //*[@id="accReportFrame"]
	 */
	public static final String accReportFrame = "accReportFrame";
	
	public static final String accReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String accReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String accReportDefaltDateSelect = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/span[2]";
	
	public static final String accReportDefaltDateSelectLi = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	public static final String accReportSelectUserBtn ="x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String accReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String accReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String accReportImeiInput= "imeiInput_acc";
	
	public static final String accReportImeiSearchBtn= "x,"
			+ "/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String accReportImeiSearchEnsure = "x,//*[@id=\"treeModal_acc\"]/div[2]/div/button[1]";
	
	public static final String accReportImeiSearchCancel = "x,//*[@id=\"treeModal_acc\"]/div[2]/div/button[2]";
	
	public static final String accReportSearch= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[3]/button";
	
	public static final String accReportStartTimeInput= "startTime_acc";
	
	public static final String accReportEndTimeInput= "endTime_acc";
	
	public static final String accReportCheakAllACC = "x,//*[@id=\"treeModal_acc\"]/div[2]/label/div/input";
	
	public static final String accReportDefaltStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/span[2]";

	public static final String accReportDefaltStatusLi ="x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/div/ul/li[1]";
	
	public static final String accReportOnStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/div/ul/li[2]";
	
	public static final String accReportOffStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/div/ul/li[3]";
	
	public static final String accReportACCOffTimes= "aCCOff";
	
	public static final String accReportACCOnTimes= "aCCOn";
	
	public static final String accReportACCTotalTime= "aCCTotalTime";
	
	/**
	 * acc报表查询
	 * @throws InterruptedException 
	 */
	public List<List<String>> accReportQuery(String imei) throws InterruptedException{
		String startTime;
		String endTime;
		String onTimes;
		String offTimes;
		String totalTime;
		List<List<String>> accData = null;
		
		super.clickElement(accReportDefaltDateSelect);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(accReportDefaltDateSelectLi);
		
		for (WebElement element : elements) {
			
			element.click();
			Thread.sleep(2000);
			startTime = super.getElement(accReportStartTimeInput).getAttribute("value");
			System.out.println("startTime="+startTime);
			endTime = super.getElement(accReportEndTimeInput).getAttribute("value");
			System.out.println("endTime="+endTime);
			super.operateInputElement(accReportImeiInput, imei);
			Thread.sleep(2000);
			super.clickElement(accReportImeiSearchBtn);
			Thread.sleep(2000);
			super.clickElement(accReportImeiSearchEnsure);
			Thread.sleep(2000);
			
			super.clickElement(accReportDefaltStatus);
			Thread.sleep(2000);
			List<WebElement> elements1 = super.getElements(accReportDefaltStatusLi);
			System.out.println(elements1);
			System.out.println(elements1.size());
			for (WebElement element1 : elements1) {
				
				element1.click();
				Thread.sleep(3000);
				super.clickElement(accReportSearch);
				
				onTimes = super.getText(accReportACCOnTimes);
				System.out.println("onTimes="+onTimes);
				offTimes = super.getText(accReportACCOffTimes);
				System.out.println("offTimes="+offTimes);
				totalTime = super.getText(accReportACCTotalTime);
				System.out.println("totalTime="+totalTime);
				List<String> data = new ArrayList<String>();
				
				data.add(startTime);
				
				data.add(endTime);
				
				data.add(onTimes);
				
				data.add(offTimes);
				
				data.add(totalTime);
				System.out.println(data);
				
				accData = new ArrayList<List<String>>();
				
				accData.add(data);
				data.clear();
				System.out.println(accData);
				super.clickElement(accReportDefaltStatus);
				Thread.sleep(2000);
			}
			
			super.clickElement(accReportDefaltDateSelect);
			Thread.sleep(2000);
		}
		
		super.getElement(accReportImeiInput).clear();
		Thread.sleep(2000);
		super.clickElement(accReportImeiSearchBtn);
		Thread.sleep(2000);
//		super.clickElement(accReportCheakAllACC);
//		Thread.sleep(2000);
		super.clickElement(accReportImeiSearchEnsure);
		Thread.sleep(2000);
		super.clickElement(accReportSearch);
		Thread.sleep(2000);
		
		return accData;
		
		
	}
	/**
	 * ACC报警导出
	 * @throws InterruptedException 
	 */
	public void accReportExport() throws InterruptedException{
		
		srPage.selectDropdownToggle(accReportDropdownToggle, accReportDropdownToggleLi);
		
		
			super.clickElement(srPage.Export);

			super.clickElement(srPage.ExportModalBaseInfoAllSelect);

			super.clickElement(srPage.ExportModalCustomerInfoAllSelect);

			super.clickElement(srPage.ExportModalAddTaskBtn);
			// 隐性等待
			super.waitForElementToLoad(10, srPage.ExportModalDownloadTask);
			super.clickElement(srPage.ExportModalDownloadTask);
		
	}
	

}
