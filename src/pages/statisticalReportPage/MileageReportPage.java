package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 里程报表页面
 * @author Administrator
 *
 */
public class MileageReportPage extends AutomateDriver{
	
	public StatisticalReportPage srPage;

	public MileageReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * 里程报表
	 */
	public static final String mileageReport = "mileageReport";
	/**
	 * 里程报表表单 iframe //*[@id="mileageReportFrame"]
	 */
	public static final String mileageReportFrame = "mileageReportFrame";
	/**
	 * 里程报表下拉菜单 
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/button
	 * 
	 */
	public static final String mileageReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/button";
	
	public static final String mileageReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String mileageReportDefaltDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/span[2]";
	
	public static final String mileageReportDefaltDateSelectLi = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[2]";
	
	public static final String mileageReportTodayDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[2]";
	
	public static final String mileageReportYestodayDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[3]";
	
	public static final String mileageReportThisWeekDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[4]";
	
	public static final String mileageReportLastWeekDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[5]";
	
	public static final String mileageReportThisMonthDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[6]";
	
	public static final String mileageReportLastMonthDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li[7]";
	
	public static final String mileageReportCheckDaySelect = "x,//*[@id=\"MileageFrom\"]/div[1]/div[3]/label[3]/div/ins";
	
	public static final String mileageReportCheckSegmentSelect = "x,//*[@id=\"MileageFrom\"]/div[1]/div[3]/label[2]/div/ins";
	
	public static final String mileageReportSelectUser = "x,//*[@id=\"search_text\"]";
	
	public static final String mileageReportClickSelectUser = "x,//*[@id=\"tree_1_a\"]";
	
	public static final String mileageReportImeiInput= "imeiInput_mileageReport";
	
	public static final String mileageReportImeiSearchBtn= "x,//*[@id=\"MileageFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String mileageReportSearchBtn= "x,//*[@id=\"MileageFrom\"]/div[2]/div[3]/button";
	
	public static final String mileageReportSearchImeiAllSelect= "x,//*[@id=\"treeModal_mileageReport\"]/div[2]/label/div/ins";
	
	public static final String mileageReportSearchEnsure= "x,//*[@id=\"treeModal_mileageReport\"]/div[2]/div/button[1]";
	
	public static final String mileageReportSearchCancel= "x,//*[@id=\"treeModal_mileageReport\"]/div[2]/div/button[2]";
	
	public static final String mileageReportAllmileages= "allmileages";
	
	public static final String mileageReportAllfuel= "allfuel";
	
	public static final String mileageReportRecalculateFuelBtn= "recalculateFuelBtn";
	
	public static final String mileageReportFuelValue= "fuelvalue";
	
	/**
	 * 里程报表查询
	 * //今天查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportTodaySelect(String imei) throws InterruptedException {
		//今天查询里程报表
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportTodayDateSelect);
		
		super.clickElement(mileageReportSelectUser);
		
		super.clickElement(mileageReportClickSelectUser);
		
		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
			
	}
	/**
	 * 里程报表查询
	 * 昨天查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportYestodaySelect(String imei) throws InterruptedException {
		
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportYestodayDateSelect);
		
//		super.clickElement(mileageReportSelectUser);
//		
//		super.clickElement(mileageReportClickSelectUser);
		
		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
		
	}
	/**
	 * 里程报表查询
	 * 本周查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportThisWeekSelect(String imei) throws InterruptedException {
		
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportThisWeekDateSelect);
		//统计方式为天
		super.clickElement(mileageReportCheckDaySelect);
		
//		super.clickElement(mileageReportSelectUser);
//		
//		super.clickElement(mileageReportClickSelectUser);
		
		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
		
	}
	/**
	 * 里程报表查询
	 * 上周查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportLastWeekSelect(String imei) throws InterruptedException {
		
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportLastWeekDateSelect);
		//统计方式为天
		if (super.getElement(mileageReportCheckDaySelect).isSelected()) {
			super.clickElement(mileageReportCheckSegmentSelect);
		} else {
			super.clickElement(mileageReportCheckDaySelect);
		}
		
		
//		super.clickElement(mileageReportSelectUser);
//		
//		super.clickElement(mileageReportClickSelectUser);
		
		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
		
	}
	/**
	 * 里程报表查询
	 * 本月查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportThisMonthSelect(String imei) throws InterruptedException {
		
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportThisMonthDateSelect);
		//统计方式为天
		if (super.getElement(mileageReportCheckDaySelect).isSelected()) {
			super.clickElement(mileageReportCheckSegmentSelect);
		} else {
			super.clickElement(mileageReportCheckDaySelect);
		}
		
		
//		super.clickElement(mileageReportSelectUser);
//		
//		super.clickElement(mileageReportClickSelectUser);
		
//		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
		
	}
	/**
	 * 里程报表查询
	 * 上月查询里程报表
	 * @throws InterruptedException 
	 */
	public void mileageReportLastMonthSelect(String imei) throws InterruptedException {
		
		super.clickElement(mileageReportDefaltDateSelect);
		
		super.clickElement(mileageReportLastMonthDateSelect);
		//统计方式为天
		if (super.getElement(mileageReportCheckDaySelect).isSelected()) {
			super.clickElement(mileageReportCheckSegmentSelect);
		} else {
			super.clickElement(mileageReportCheckDaySelect);
		}
		
		
//		super.clickElement(mileageReportSelectUser);
//		
//		super.clickElement(mileageReportClickSelectUser);
		
//		super.operateInputElement(mileageReportImeiInput, imei);
		
		super.clickElement(mileageReportImeiSearchBtn);
		
		super.clickElement(mileageReportSearchImeiAllSelect);
		
		super.clickElement(mileageReportSearchEnsure);
		
		super.clickElement(mileageReportSearchBtn);
		
	}
	
	/**
	 * 按里程统计方式来查询记录
	 * @throws InterruptedException 
	 */
	public void mileageReportMileagesCheak() throws InterruptedException {
		
		super.clickElement(mileageReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(mileageReportSearchImeiAllSelect);
		Thread.sleep(2000);
		super.clickElement(mileageReportSearchEnsure);
		
		Thread.sleep(2000);
		super.clickElement(mileageReportDefaltDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(mileageReportDefaltDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(mileageReportSearchBtn);
				Thread.sleep(2000);
				srPage.selectDropdownToggle(mileageReportDropdownToggle, mileageReportDropdownToggleLi);
				Thread.sleep(2000);
				super.clickElement(mileageReportDefaltDateSelect);
				Thread.sleep(2000);
			}
			
		}
	}
	
	/**
	 * 按天统计方式来查询记录
	 * @throws InterruptedException 
	 */
	public void mileageReportDayCheak() throws InterruptedException {
		
		super.clickElement(mileageReportCheckDaySelect);
		Thread.sleep(2000);
		super.clickElement(mileageReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(mileageReportSearchImeiAllSelect);
		Thread.sleep(2000);
		super.clickElement(mileageReportSearchEnsure);
		Thread.sleep(2000);
		
		super.clickElement(mileageReportCheckDaySelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(mileageReportDefaltDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(mileageReportSearchBtn);
				Thread.sleep(2000);
				srPage.selectDropdownToggle(mileageReportDropdownToggle, mileageReportDropdownToggleLi);
				Thread.sleep(2000);
				super.clickElement(mileageReportDefaltDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
	}
	/**
	 * 获取总油耗
	 */
	public String getAllFuel(String selector) {
		
		String allFuel = super.getText(selector).trim();
		return allFuel;
	}
	

	/**
	 * 里程报表重新计算油耗
	 * @throws InterruptedException 
	 */
	public void recalculateFuel(String value) throws InterruptedException {
		
		super.operateInputElement(mileageReportFuelValue, value);
		
		super.clickElement(mileageReportRecalculateFuelBtn);
	}
	
	/**
	 * 获取总里程
	 * @return
	 */
	public String getAllMileage(String selector) {

		return super.getText(selector).trim();
	}

}
