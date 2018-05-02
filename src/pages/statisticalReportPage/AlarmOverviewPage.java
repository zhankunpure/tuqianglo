package pages.statisticalReportPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 告警总览页面
 * 
 * @author ZhanKun
 *
 */
public class AlarmOverviewPage extends AutomateDriver {

	public StatisticalReportPage srPage;

	List<String> deviceTypeList;

	public AlarmOverviewPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
		deviceTypeList = new ArrayList<String>();
		deviceTypeList.add("ET200");
		deviceTypeList.add("V50测试");
		deviceTypeList.add("GT710新的啊");
		deviceTypeList.add("TR02");
		deviceTypeList.add("GT300");
		deviceTypeList.add("GT300L-晚上的");
	}

	/**
	 * 告警总览
	 */
	public static final String AlarmOverview = "alarmOverview";
	/**
	 * 告警总览表单 iframe //*[@id="alarmOverviewFrame"]
	 */
	public static final String AlarmOverviewFrame = "alarmOverviewFrame";

	public static final String AlarmOverviewSelectUserBtn = "x,//*[@id=\"alarmForm\"]/div/div[3]/div/div[1]/span/button";

	public static final String AlarmOverviewSearchUserInput = "search_user_text";

	public static final String AlarmOverviewSearchUserBtn = "search_user_btn";

	public static final String AlarmOverviewUserSwith = "tree_1_switch";

	public static final String AlarmOverviewCurSelectedNode = "tree_1_a";

	public static final String AlarmOverviewDefaltDate = "x,//*[@id=\"alarmForm\"]/div/div[1]/div/div/div/span[2]";

	public static final String AlarmOverviewDateLi = "x,//*[@id=\"alarmForm\"]/div/div[1]/div/div/div/div/ul/li";

	public static final String AlarmOverviewImeiSearchBtn = "x,//*[@id=\"alarmForm\"]/div/div[4]/div/div/div/div[1]/span/button";

	public static final String AlarmOverviewImeiInput = "imeiInput_alarmOverview";

	public static final String AlarmOverviewImeiUl = "dev_tree_alarmOverview_1_ul";

	public static final String AlarmOverviewImeiSwitch = "dev_tree_alarmOverview_1_switch";

	public static final String AlarmOverviewCheckAll = "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/label/div/input";

	public static final String AlarmOverviewImeiSearchEnsure = "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/div/button[1]";

	public static final String AlarmOverviewImeiSearchCancel = "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/div/button[2]";

	public static final String AlarmOverviewDeviceType = "mcTypeShow";

	public static final String AlarmOverviewDeviceTypeLi = "x,//*[@id=\"autocompleter-1\"]/ul/li";

	public static final String AlarmOverviewLowerCustom = "x,//*[@id=\"alarmForm\"]/div/div[6]/div/label/div/ins";

	public static final String AlarmOverviewStartTime = "startTime_alarmReport";

	public static final String AlarmOverviewEndTime = "endTime_alarmReport";

	public static final String AlarmOverviewSearchBtn = "x,//*[@id=\"alarmForm\"]/div/div[7]/button";

	public static final String AlarmOverviewDropdownToggle = "x,/html/body/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/button";

	public static final String AlarmOverviewDropdownToggleLi = "x,/html/body/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/ul/li";

	public static final String AlarmOverviewExport = "Export";

	public static final String ExportBaseInfo = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div[1]/div/label/div/ins";

	public static final String ExportCusInfo = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[2]/div[1]/div/label/div/ins";

	public static final String AddTaskBtn = "addTaskBtn";
	// 没有任务记录!
	public static final String NoTaskRecord = "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div";

	public static final String ExportClose = "x,/html/body/div[3]/div[2]/span[1]/a";

	public static final String ExportIframe = "x,/html/body/div[3]/div[2]/iframe";

	public static final String NoExportData = "x,//*[@id=\"alarmReportTable\"]/tbody/tr/td";

	/**
	 * 告警总览查询
	 * 
	 * @throws InterruptedException
	 */
	public void alarmOverviewQuery() throws InterruptedException {
		
		super.clickElement(AlarmOverviewImeiSearchBtn);
		Thread.sleep(2000);
		
		super.clickElement(AlarmOverviewCheckAll);
		
		Thread.sleep(2000);
		super.clickElement(AlarmOverviewImeiSearchEnsure);
		Thread.sleep(2000);
		
		if (!super.getElement(AlarmOverviewLowerCustom).isSelected()) {
			super.clickElement(AlarmOverviewLowerCustom);
		}
		Thread.sleep(2000);

		super.clickElement(AlarmOverviewDefaltDate);
		Thread.sleep(2000);

		List<WebElement> dates = super.getElements(AlarmOverviewDateLi);
		Thread.sleep(2000);
		for (WebElement date : dates) {

			date.click();
			Thread.sleep(2000);

			
			// if (super.isElementExist(AlarmOverviewImeiUl)==false) {
			// super.clickElement(AlarmOverviewImeiSwitch);
			// }
			// Thread.sleep(2000);
			// if (!super.getElement(AlarmOverviewCheckAll).isSelected()) {
			
			super.getElement(AlarmOverviewDeviceType).clear();
			Thread.sleep(2000);
			List<WebElement> deviceTypes = super.getElements(AlarmOverviewDeviceTypeLi);
			int size = deviceTypes.size();

			for (String deviceType : deviceTypeList) {
				System.out.println("deviceType=" + deviceType);

				super.operateInputElement(AlarmOverviewDeviceType, deviceType);
				Thread.sleep(2000);
				super.clickElement(AlarmOverviewSearchBtn);
				Thread.sleep(2000);
				srPage.selectDropdownToggle(AlarmOverviewDropdownToggle, AlarmOverviewDropdownToggleLi);
				Thread.sleep(2000);
			}

			super.clickElement(AlarmOverviewDefaltDate);
			Thread.sleep(2000);
		}

	}

	/**
	 * 告警总览导出
	 * 
	 * @throws InterruptedException
	 */
	public void AlarmOverviewExport() throws InterruptedException {
		Thread.sleep(2000);
		srPage.intoFrame(ExportIframe);

		super.clickElement(AlarmOverviewExport);
		Thread.sleep(2000);
		super.clickElement(ExportBaseInfo);

		super.clickElement(ExportCusInfo);
		Thread.sleep(2000);
		super.clickElement(AddTaskBtn);
		Thread.sleep(5000);
		if (super.getText(NoTaskRecord).trim().equals("没有任务记录!")) {
			srPage.intoFrame("");
			super.clickElement(ExportClose);
		} else {
			// 隐性等待
			super.waitForElementToLoad(10, srPage.ExportModalDownloadTask);
			super.clickElement(srPage.ExportModalDownloadTask);
		}

	}

	public void toAlarmOverviewFrame() {

		srPage.intoFrame(AlarmOverviewFrame);
	}

}
