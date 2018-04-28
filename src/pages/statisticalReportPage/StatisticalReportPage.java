package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 统计报表页面
 * 
 * @author ZhanKun
 *
 */
public class StatisticalReportPage extends AutomateDriver {
	/**
	 * 运动统计
	 */
	public static final String motionstatistics = "motionstatistics";
	/**
	 * 状态统计
	 */
	public static final String stateStatistics = "stateStatistics";
	/**
	 * 设备统计
	 */
	public static final String deviceStatistic = "deviceStatistic";
	/**
	 * 告警统计
	 */
	public static final String alarmstatistics = "alarmstatistics";
	/**
	 * OBD统计
	 */
	public static final String obdStatistics = "obdStatistics";
	/**
	 * 导游播报统计
	 */
	public static final String guideMachineBroadcastStatistics = "guideMachineBroadcastStatistics";
	/**
	 * 打卡统计
	 */
	public static final String punchTheClockStatistics = "punchTheClockStatistics";
	/**
	 * 暂无数据
	 */
	public static final String no_records_found = "x,//*[@id=\"table\"]/tbody/tr/td";
	
	public static final String Export = "Export";
	
	public static final String ExportModalBaseInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div/label/div/ins";
	
	public static final String ExportModalCustomerInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[2]/div[1]/div/label/div/ins";
	
	public static final String ExportModalAddTaskBtn = "addTaskBtn";
	
	public static final String ExportModalDownloadTask = "x,//*[@id=\"taskList\"]/div[1]/ul/li[1]/a";
	
	public StatisticalReportPage(WebDriver dr) {
		super(dr);
		
	}
	
	public void clickStatisticalReportSubmenu(String selector) {
		
		super.clickElement(selector);
	}

	/**
	 * 选择下拉菜单选项
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("unused")
	public void selectDropdownToggle(String dropdown_toggle,String dropdown_toggle_li ) throws InterruptedException {

		super.clickElement(dropdown_toggle);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(dropdown_toggle_li);
		int size = elements.size();
		System.out.println(size);
		
		for (int i = 1; i<=size; i++) {
				
				if (!super.getElement(dropdown_toggle_li+"["+i+"]/label/input").isSelected()) {
					super.clickElement(dropdown_toggle_li+"["+i+"]/label/input");
					Thread.sleep(2000);
				} 
		}
	}

	/**
	 * 导出
	 */
	public void Export() {

		super.clickElement(Export);

		super.clickElement(ExportModalBaseInfoAllSelect);

		super.clickElement(ExportModalCustomerInfoAllSelect);

		super.clickElement(ExportModalAddTaskBtn);
		// 隐性等待
		super.waitForElementToLoad(10, ExportModalDownloadTask);
		super.clickElement(ExportModalDownloadTask);

	}

	/**
	 * 进入表单
	 * 
	 * @param selector
	 */
	public void intoFrame(String selector) {
		super.waitForElementToLoad(10, selector);
		super.switch_to_frame(selector);
	}

	
	


	
	public void checkRadio(String selector1,String selector2) throws InterruptedException {
			Thread.sleep(2000);
		if (super.getElement(selector1).isSelected()) {
			Thread.sleep(2000);
			super.clickElement(selector2);
			Thread.sleep(2000);
		} else {
			Thread.sleep(2000);
			super.clickElement(selector1);
			Thread.sleep(2000);
		}
		
	}
	public void selectDate(String selector,String by,String value) {
		
		super.Select(selector, by, value);
	}
	
}
