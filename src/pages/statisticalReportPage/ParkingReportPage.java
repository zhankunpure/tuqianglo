package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

public class ParkingReportPage extends AutomateDriver{

	public ParkingReportPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * 停车未熄火报表
	 */
	public static final String parkingReport = "parkingReport";
	/**
	 * 停车未熄火报表表单 iframe //*[@id="parkingReportFrame"]
	 */
	public static final String parkingReportFrame = "//*[@id=\"parkingReportFrame\"]";
	
	public static final String parkingReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String parkingReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String parkingReportDefaltDateSelect = "x,//*[@id=\"stopNotOffFrom\"]/div[1]/div[1]/div/div/select";
	
	public static final String parkingReportSelectUserBtn ="x,//*[@id=\"stopNotOffFrom\"]/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String parkingReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String parkingReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String parkingReportImeiInput= "imeiInput_stopNotOff";
	
	public static final String parkingReportImeiSearchBtn= "x,"
			+ "//*[@id=\"stopNotOffFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String parkingReportSearch= "x,//*[@id=\"stopNotOffFrom\"]/div[2]/div[3]/button";
	
	public static final String parkingReportStartTimeInput= "startTime_stopNotOff";
	
	public static final String parkingReportEndTimeInput= "endTime_stopNotOff";
	
	public static final String parkingReportStopNotOffAllTimes= "stopNotOff-alltimes";
	
	public static final String parkingReportCheckAll = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/label/div/ins";
	
	public static final String parkingReportImeiEnsure = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[1]";
	
	public static final String parkingReportImeiCancel = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[2]";
	
	public static final String parkingReportDefaltDateSelectLi = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	
	/**
	 * 停车未熄火报表查询
	 * @throws InterruptedException 
	 * 
	 */
	public void parkingReportCheak() throws InterruptedException {
		
		super.clickElement(parkingReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(parkingReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(parkingReportImeiEnsure);
		Thread.sleep(2000);
		
		super.clickElement(parkingReportDefaltDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(parkingReportDefaltDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(parkingReportSearch);
				Thread.sleep(2000);
				super.clickElement(parkingReportDefaltDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
		
	}
	
	/**
	 * 停车未熄火报表下拉菜单
	 * 
	 */
	public void parkingReportDropdownMenu() {
		
		//this.selectDropdownToggle(parkingReportDropdownToggle, parkingReportDropdownToggleLi);
	}
	/**
	 * 停车未熄火报表获取总停留时间
	 * 
	 */
	public String parkingReportStayAlltimes() {
		
		return super.getText(parkingReportStopNotOffAllTimes);
		
	}
	
	/**
	 * 停车未熄火报表导出
	 */
//	public void parkingReporttExport() {
//
//		super.clickElement(Export);
//
//		super.clickElement(ExportModalBaseInfoAllSelect);
//
//		super.clickElement(ExportModalCustomerInfoAllSelect);
//
//		super.clickElement(ExportModalAddTaskBtn);
//		// 隐性等待
//		super.waitForElementToLoad(10, ExportModalDownloadTask);
//		super.clickElement(ExportModalDownloadTask);
//	}

}
