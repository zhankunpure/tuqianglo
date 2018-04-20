package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

public class SpeedingReportPage extends AutomateDriver{
	
	public SpeedingReportPage(WebDriver dr) {
		super(dr);
		
	}


	/**
	 * 超速报表
	 */
	public static final String speedingReport = "speedingReport";
	/**
	 * 超速报表表单 iframe //*[@id="speedingReportFrame"]
	 */
	public static final String speedingReportFrame = "speedingReportFrame";
	
	public static final String speedingReportDateSelect = "x,//*[@id=\"OverspeedFrom\"]/div[1]/div[1]/div/div/div/span[2]";
	
	public static final String speedingReportDateSelectLi = "x,//*[@id=\"OverspeedFrom\"]/div[1]/div[1]/div/div/div/div/ul/li";
	
	public static final String speedingReportSelectUserBtn = "x,//*[@id=\"OverspeedFrom\"]/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String speedingReportSearchUserInput = "search_user_text";
	
	public static final String speedingSearchUserBtn = "search_user_btn";
	
	public static final String speedingReportImeiInput = "imeiInput_overSpeedReport";
	
	public static final String speedingReportImeiSearchBtn = "x,//*[@id=\"OverspeedFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String speedingReportSpeed = "speed";
	
	public static final String speedingReportStartTimeInput = "startTime_overspeed";
	
	public static final String speedingReportEndTimeInput = "endTime_overspeed";
	
	public static final String speedingReportImeiAllCheck = "x,//*[@id=\"treeModal_overSpeedReport\"]/div[2]/label/div";
	
	public static final String speedingReportImeiEnsure = "x,//*[@id=\"treeModal_overSpeedReport\"]/div[2]/div/button[1]";
	
	public static final String speedingReportDropdownToggle = "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String speedingReportDropdownToggleLi = "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String speedingReportSearchBtn = "x,//*[@id=\"OverspeedFrom\"]/div[2]/div[3]/button";
	
	public static final String speedingReportNoRecordsFound = "x,//*[@id=\"speedTableContent\"]/tbody/tr/td";
	
	
	/**
	 * 超速报表查询
	 * @param imei
	 * @throws InterruptedException
	 */
	public void overSpeedReportQuery(String imei) throws InterruptedException {
		super.waitForElementToLoad(10, speedingReportDateSelect);
		super.clickElement(speedingReportDateSelect);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(speedingReportDateSelectLi);
		
		for (WebElement element : elements) {
			
			
			element.click();
			System.out.println(element);
			Thread.sleep(2000);
			String startTime = super.getElement(speedingReportStartTimeInput).getAttribute("value");
			System.out.println("startTime="+startTime);
			String endTIme = super.getElement(speedingReportEndTimeInput).getAttribute("value");
			System.out.println("endTIme="+endTIme);
			super.operateInputElement(speedingReportImeiInput, imei);
			Thread.sleep(2000);
			super.clickElement(speedingReportImeiSearchBtn);
			Thread.sleep(2000);
//			if (!super.getElement(speedingReportImeiAllCheck).isSelected()) {
//				super.clickElement(speedingReportImeiAllCheck);
//			}
			
			
			super.clickElement(speedingReportImeiEnsure);
			Thread.sleep(2000);
			super.clickElement(speedingReportSearchBtn);
			Thread.sleep(4000);
			super.clickElement(speedingReportDateSelect);
			Thread.sleep(2000);
			
		}
		super.clickElement(speedingReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(speedingReportImeiEnsure);
		Thread.sleep(2000);
		super.clickElement(speedingReportSearchBtn);
		Thread.sleep(2000);
	}

}
