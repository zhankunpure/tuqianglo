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
	
	//======================================================================================================================
	
	//---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 超速报表
	 */
	public static final String speedingReport = "speedingReport";
	/**
	 * 超速报表表单 iframe //*[@id="speedingReportFrame"]
	 */
	public static final String speedingReportFrame = "//*[@id=\"speedingReportFrame\"]";
	
	public static final String speedingReportDateSelect = "x,//*[@id=\"OverspeedFrom\"]/div[1]/div[1]/div/div/select";
	
	public static final String speedingReportSelectUserBtn = "x,//*[@id=\"OverspeedFrom\"]/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String speedingReportSearchUserInput = "search_user_text";
	
	public static final String speedingSearchUserBtn = "search_user_btn";
	
	public static final String speedingReportImeiInput = "imeiInput_overSpeedReport";
	
	public static final String speedingReportImeiSearchBtn = "x,//*[@id=\"OverspeedFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String speedingReportSpeed = "speed";
	
	public static final String speedingReportStartTimeInput = "startTime_overspeed";
	
	public static final String speedingReportEndTimeInput = "endTime_overspeed";
	
	public static final String speedingReportDropdownToggle = "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String speedingReportDropdownToggleLi = "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String speedingReportSearchBtn = "//*[@id=\"OverspeedFrom\"]/div[2]/div[3]/button";
	
	//--------------------------------------------------------------------------------------------------------------------------
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
	 * 停留报表查询
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
	 * 停留报表下拉菜单
	 * 
	 */
	public void parkingReportDropdownMenu() {
		
		this.selectDropdownToggle(parkingReportDropdownToggle, parkingReportDropdownToggleLi);
	}
	/**
	 * 停留报表获取总停留时间
	 * 
	 */
	public String parkingReportStayAlltimes() {
		
		return super.getText(parkingReportStopNotOffAllTimes);
		
	}
	
	/**
	 * 停留报表导出
	 */
	public void parkingReporttExport() {

		super.clickElement(Export);

		super.clickElement(ExportModalBaseInfoAllSelect);

		super.clickElement(ExportModalCustomerInfoAllSelect);

		super.clickElement(ExportModalAddTaskBtn);
		// 隐性等待
		super.waitForElementToLoad(10, ExportModalDownloadTask);
		super.clickElement(ExportModalDownloadTask);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	/**
	 * ACC报表
	 */
	public static final String accReport = "accReport";
	/**
	 * ACC报表表单 iframe //*[@id="accReportFrame"]
	 */
	public static final String accReportFrame = "//*[@id=\"accReportFrame\"]";
	
	public static final String accReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String accReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String accReportDefaltDateSelect = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/select";
	
	public static final String accReportSelectUserBtn ="x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String accReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String accReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String accReportImeiInput= "imeiInput_acc";
	
	public static final String accReportImeiSearchBtn= "x,"
			+ "/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String accReportSearch= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[3]/button";
	
	public static final String accReportStartTimeInput= "startTime_acc";
	
	public static final String accReportEndTimeInput= "endTime_acc";
	
	public static final String accReportDefaltStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/span[2]";
	
	public static final String accReportOnStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/div/ul/li[2]";
	
	public static final String accReportOffStatus= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[3]/div/span/div/div/ul/li[3]";
	
	public static final String accReportACCOffTimes= "aCCOff";
	
	public static final String accReportACCOnTimes= "aCCOn";
	
	public static final String accReportACCTotalTime= "aCCTotalTime";
	
	//-------------------------------------------------------------------------------------------------------------------------
	/**
	 * 状态统计报表
	 */
	public static final String statusReport = "staticReport";
	/**
	 * 状态统计报表iframe 
	 */
	public static final String staticReportFrame = "staticReportFrame";
	
	public static final String statusReportDefaltEquipmentState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/span[2]";
	
	public static final String statusReportAllState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[1]";

	public static final String statusReportTravelState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[2]";

	public static final String statusReportOfflineState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[3]";

	public static final String statusReportStaticState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[4]";

	public static final String statusReportSelectUserBtn = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[2]/div/div[1]/span/button";

	public static final String statusReportSearchUserInput = "search_user_text";

	public static final String statusReportSearchUserBtn = "search_user_btn";

	public static final String statusReportImeiTextarea  = "searchIMEI";

	public static final String statusReportSelectType = "mcTypeShow";
	
	public static final String statusReportExportAddTask = "addTaskBtn";
	
	public static final String statusReportExportTaskDownload = "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div[1]/li/div[2]/a";
	
	public static final String statusReportExportBaseInfo = "x,//*[@id=\"exportsModal\"]/div/div[1]/div/div[1]/div/label/div/input";

	public static final String statusReportLowerUser = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[5]/label/div/ins";

	public static final String statusReportSearchBtn= "x,//*[@id=\"OffLineFrom\"]/div[3]/div[6]/button[1]";

	public static final String statusReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/button";
	
	public static final String statusReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li";
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * 设备总览
	 */
	public static final String deviceReport = "deviceReport";
	/**
	 * 设备总览表单 iframe //*[@id=\"deviceReportFrame\"]
	 */
	public static final String deviceReportFrame = "//*[@id=\"deviceReportFrame\"]";
	
	public static final String deviceReportSelectUserBtn = "x,/html/body/div/div[2]/div[1]/form/div/div/div/div[1]/span/button";

	public static final String deviceReportSearchUserInput = "search_user_text";

	public static final String deviceReportSearchUserBtn = "search_user_btn";
	
	public static final String deviceReportUserSwith = "tree_1_switch";
	
	public static final String deviceReportCurSelectedNode = "tree_1_a";
	
	public static final String deviceReportLowerCustom = "x,//*[@id=\"deviceOverview\"]/div[1]/div[2]/div[1]/label/div/ins";
	
	public static final String deviceReportNewActiveChartLowerCus = "x,//*[@id=\"newActiveChart\"]/div/div[1]/label/div/ins";
	
	public static final String deviceReportRadioYear = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/label[1]/div/ins";
	
	public static final String deviceReportRadioMonth = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/label[2]/div/ins";
	
	public static final String deviceReportNewActiveChartDate = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/span/div/span[2]";
	
	public static final String deviceReportNewActiveChartDateLi = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/span/div/div/ul/li";
	
	//--------------------------------------------------------------------------------------------------------------------------
	/**
	 * 电量统计
	 */
	public static final String electricityReport = "electricityReport";
	/**
	 * 电量统计表单 iframe //*[@id="electricityReportFrame"]
	 */
	public static final String electricityReportFrame = "//*[@id=\"electricityReportFrame\"]";
	
	public static final String electricityReportSelectUserBtn = "x,//*[@id=\"ElectricFrom\"]/div/div[1]/div/div[1]/span/button";

	public static final String electricityReportSearchUserInput = "search_user_text";

	public static final String electricityReportSearchUserBtn = "search_user_btn";
	
	public static final String electricityReportUserSwith = "tree_1_switch";
	
	public static final String electricityReportCurSelectedNode = "tree_1_a";
	//电量低于等于:
	public static final String electricityReportElectricity = "x,//*[@id=\"ElectricFrom\"]/div/div[2]/div/span/div/span[2]";
	
	public static final String electricityReportElectricityLi = "x,//*[@id=\"ElectricFrom\"]/div/div[2]/div/span/div/div/ul/li";
	
	
	public static final String electricityReportDeviceType = "x,//*[@id=\"ElectricFrom\"]/div/div[3]/div/div/div/span[2]";
	
	public static final String electricityReportDeviceTypeLi = "x,//*[@id=\"ElectricFrom\"]/div/div[3]/div/div/div/div/ul/li";
	
	//包含下级
	public static final String electricityReportLowerCus = "x,//*[@id=\"newActiveChart\"]/div/div[1]/label/div/ins";
	
	public static final String electricityReportSearchBtn= "x,//*[@id=\"ElectricFrom\"]/div/div[5]/button";
	
	public static final String electricityReportDropdownToggle = "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div/div/button";
	
	/**
	 * 电量统计查询
	 * @throws InterruptedException 
	 */
	public void electricityReportQuery() throws InterruptedException {
		
		if (!super.getElement(electricityReportLowerCus).isSelected()) {
			super.clickElement(electricityReportLowerCus);
		} 
		super.clickElement(electricityReportElectricity);
		Thread.sleep(2000);
		List<WebElement> electricityLis = super.getElements(electricityReportElectricityLi);
		
		for (WebElement electricityLi : electricityLis) {
			
			electricityLi.click();
			
			Thread.sleep(2000);
			
			super.clickElement(electricityReportDeviceType);
			Thread.sleep(2000);
			List<WebElement> deviceTypeLis = super.getElements(electricityReportDeviceTypeLi);
			
			for (WebElement deviceTypeLi : deviceTypeLis) {
				
				deviceTypeLi.click();
				
				Thread.sleep(2000);
				
				super.clickElement(electricityReportSearchBtn);
				Thread.sleep(2000);
				super.clickElement(electricityReportDeviceType);
			}
			Thread.sleep(2000);
			super.clickElement(electricityReportElectricity);
			Thread.sleep(2000);
		}
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	/**
	 * 油感报表
	 */
	public static final String oilReport = "oilReport";
	/**
	 * 油感报表表单 iframe //*[@id="oilReportFrame"]
	 */
	public static final String oilReportFrame = "//*[@id=\"oilReportFrame\"]";
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * 告警总览
	 */
	public static final String alarmOverview = "alarmOverview";
	/**
	 * 告警总览表单 iframe //*[@id="alarmOverviewFrame"]
	 */
	public static final String alarmOverviewFrame = "//*[@id=\"alarmOverviewFrame\"]";
	
	public static final String alarmOverviewSelectUserBtn = "x,//*[@id=\"alarmForm\"]/div/div[3]/div/div[1]/span/button";

	public static final String alarmOverviewSearchUserInput = "search_user_text";

	public static final String alarmOverviewSearchUserBtn = "search_user_btn";
	
	public static final String alarmOverviewUserSwith = "tree_1_switch";
	
	public static final String alarmOverviewCurSelectedNode = "tree_1_a";
	
	public static final String alarmOverviewDefaltDate = "x,//*[@id=\"alarmForm\"]/div/div[1]/div/div/div/span[2]";
	
	public static final String alarmOverviewDateLi = "x,//*[@id=\"alarmForm\"]/div/div[1]/div/div/div/div/ul/li";
	
	public static final String alarmOverviewImeiSearchBtn = "x,//*[@id=\"alarmForm\"]/div/div[4]/div/div/div/div[1]/span/button";
	
	public static final String alarmOverviewImeiInput = "imeiInput_alarmOverview";
	
	public static final String alarmOverviewImeiUl = "dev_tree_alarmOverview_1_ul";
	
	public static final String alarmOverviewImeiSwitch = "dev_tree_alarmOverview_1_switch";
	
	public static final String alarmOverviewCheckAll= "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/label/div/input";
	
	public static final String alarmOverviewImeiSearchEnsure = "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/div/button[1]";
	
	public static final String alarmOverviewImeiSearchCancel = "x,//*[@id=\"treeModal_alarmOverview\"]/div[2]/div/button[2]";
	
	public static final String alarmOverviewDeviceType = "mcTypeShow";
	
	public static final String alarmOverviewDeviceTypeLi = "x,//*[@id=\"autocompleter-1\"]/ul/li";
	
	public static final String alarmOverviewLowerCustom = "x,//*[@id=\"alarmForm\"]/div/div[6]/div/label/div/ins";
	
	public static final String alarmOverviewStartTime = "startTime_alarmReport";
	
	public static final String alarmOverviewEndTime = "endTime_alarmReport";
	
	public static final String alarmOverviewSearchBtn = "x,//*[@id=\"alarmForm\"]/div/div[7]/button";
	
	public static final String alarmOverviewDropdownToggle= "x,/html/body/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/button";
	
	public static final String alarmOverviewDropdownToggleLi= "x,/html/body/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/ul/li";
	/**
	 * 告警总览查询
	 * @throws InterruptedException 
	 */
	public void alarmOverviewQuery() throws InterruptedException {
		
		super.clickElement(alarmOverviewDefaltDate);
		Thread.sleep(2000);
		if (!super.getElement(alarmOverviewLowerCustom).isSelected()) {
			super.clickElement(alarmOverviewLowerCustom);
		}
		Thread.sleep(2000);
		List<WebElement> dates = super.getElements(alarmOverviewDateLi);
		Thread.sleep(2000);
		for (WebElement date : dates) {
			date.click();
			Thread.sleep(2000);
			
			super.clickElement(alarmOverviewImeiSearchBtn);
			Thread.sleep(2000);
			if (super.isElementExist(alarmOverviewImeiUl)==false) {
				super.clickElement(alarmOverviewImeiSwitch);
			}
			Thread.sleep(2000);
			if (!super.getElement(alarmOverviewCheckAll).isSelected()) {
				super.clickElement(alarmOverviewCheckAll);
			}
			Thread.sleep(2000);
			super.clickElement(alarmOverviewImeiSearchEnsure);
			
			super.getElement(alarmOverviewDeviceType).clear();
			Thread.sleep(2000);
			List<WebElement> deviceTypes = super.getElements(alarmOverviewDeviceTypeLi);
			
			for (WebElement deviceType : deviceTypes) {
				
				super.getElement(alarmOverviewDeviceType).clear();
				Thread.sleep(2000);
				deviceType.click();
				Thread.sleep(2000);
				super.clickElement(alarmOverviewSearchBtn);
				Thread.sleep(2000);
				
				
			}
		}
		
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * 告警详情
	 */
	public static final String alarmDdetails = "alarmDdetails";
	/**
	 * 告警详情表单 iframe //*[@id="alarmDdetailsFrame"]
	 */
	public static final String alarmDdetailsFrame = "//*[@id=\"alarmDdetailsFrame\"]";
	
	public static final String alarmDdetailsImeiInput= "imeiInput_alarmDetail";
	
	public static final String alarmDdetailsImeiSearchBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span/button";
	
	public static final String alarmDdetailsSelectUserBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/span/button";

	public static final String alarmDdetailsSearchUserInput = "cusTreeKey2";

	public static final String alarmDdetailsSearchUserBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String alarmDdetailsUserSwith = "tree_1_switch";
	
	public static final String alarmDdetailsCurSelectedNode = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/ul/li";
	
	public static final String alarmDdetailsStatus = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/span[2]";
	
	public static final String alarmDdetailsStatusLi = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/ul/li";
	
	public static final String alarmDdetailsSearchBtn = "getAlertInfo_btn";
	
	public static final String alarmDdetailsDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String alarmDdetailsDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String alarmDdetailsPageNumLi = "alarm_info_paging";
	
	public static final String alarmDdetailsSelectAll = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	
	public static final String alarmDdetailsTableContent = "alarmTableContent";
	
	public static final String alarmDdetailsAllMarkReaded = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[1]";
	
	public static final String alarmDdetailsMarkReaded = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[2]";
	
	public static final String alarmDdetailsAllHandle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[3]";
	
	public static final String alarmDdetailsHandle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[4]";
	
	public static final String alarmDdetailsSerAlarmTypeModalAllCheck = "allCheck";
	
	public static final String alarmDdetailsSerAlarmTypeModalOnAlarm = "x,//*[@id=\"alarmTypeReport\"]/li[1]/label/div/input";
	
	public static final String alarmDdetailsSerAlarmTypeModalSave = "p,保存";
	
	public static final String alarmDdetailsSerAlarmTypeModalCancel = "p,取消";
	
	
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * OBD故障报表
	 */
	public static final String obdFailureReport = "obdFailureReport";
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * OBD行程报表
	 */
	public static final String obdTracelReport = "obdTracelReport";
	/**
	 * OBD行程报表表单 iframe //*[@id="obdTracelReportFrame"]
	 */
	public static final String obdTracelReportFrame = "//*[@id=\"obdTracelReportFrame\"]";
	
	//-------------------------------------------------------------------------------------------------------------------------
	/**
	 * OBD里程报表
	 */
	public static final String obdMileageReport = "obdMileageReport";
	/**
	 * OBD里程报表表单 iframe //*[@id="obdMileageReportFrame"]
	 */
	public static final String obdMileageReportFrame = "//*[@id=\"obdMileageReportFrame\"]";
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * OBD车况报表
	 */
	public static final String obdCarConditionReport = "obdCarConditionReport";
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * 导游播报统计
	 */
	public static final String guideMachineBroadcast = "guideMachineBroadcast";
	/**
	 * 导游播报统计表单 iframe //*[@id="guideMachineBroadcastFrame"]
	 */
	public static final String guideMachineBroadcastFrame = "//*[@id=\"guideMachineBroadcastFrame\"]";
	
	//------------------------------------------------------------------------------------------------------------------------
	/**
	 * 打卡报表
	 */
	public static final String punchTheClockReport = "punchTheClockReport";
	/**
	 * 打卡报表表单 iframe //*[@id="punchTheClockReportFrame"]
	 */
	public static final String punchTheClockReportFrame = "//*[@id=\"punchTheClockReportFrame\"]";
	
	//------------------------------------------------------------------------------------------------------------------------
				
	//-------------------------------------------------------------------------------------------------------------------------
	/**
	 * 运动总览
	 */
	public static final String sportOverview = "sportOverview";
	/**
	 * 运动总览表单 iframe //*[@id="sportOverviewFrame"]
	 */
	public static final String sportOverviewFrame = "//*[@id=\"sportOverviewFrame\"]";
	
	public static final String sportOverviewDefaltTime = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/span[2]";

	public static final String sportOverviewYestoday = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li[2]";

	public static final String sportOverviewThisWeek = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li[3]";

	public static final String sportOverviewLastWeek = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li[4]";

	public static final String sportOverviewThisMonth = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li[5]";

	public static final String sportOverviewLastMonth = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li[6]";

	public static final String sportOverviewUserSelect = "x,//*[@id=\"search_text\"]";
	// testjimi
	public static final String sportOverviewSearchUserInput = "x,//*[@id=\"search_user_text\"]";

	public static final String sportOverviewSearchUserBtn = "x,//*[@id=\"search_user_btn\"]";

	public static final String sportOverviewSelectSearchUser = "x,//*[@id=\"runForm\"]/div[3]/div/div[2]/div[1]/div/ul/li[1]";
	
	/**
	 * 运动总览搜索按钮元素
	 */
	public static final String sportOverviewSearchBtn = "x,//*[@id=\"runForm\"]/div[4]/button";
	/**
	 * 运动总览下拉菜单 
	 * /html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button
	 */
	public static final String tracelReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	/**
	 * 里程报表下拉菜单选项
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li
	 */
	public static final String mileageReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	/**
	 * 里程报表下拉菜单选项
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li
	 */
	public static final String dropdown_toggle_li = "x,/html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li";
	
	/**
	 * 导出
	 * //*[@id="Export"]
	 */
	public static final String Export = "Export";
	/**
	 * 导出模块 基本信息全选 //*[@id="exportsModal"]/div/div[1]/div[1]/div/label/div/ins
	 * 
	 */
	public static final String ExportModalBaseInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div/label/div/ins";
	/**
	 * 导出模块 客户信息全选 //*[@id="exportsModal"]/div/div[2]/div[1]/div/label/div/ins
	 */
	public static final String ExportModalCustomerInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[2]/div[1]/div/label/div/ins";
	/**
	 * 生成任务
	 */
	public static final String ExportModalAddTaskBtn = "addTaskBtn";
	/**
	 * 下载任务
	 * 
	 */
	public static final String ExportModalDownloadTask = "x,//*[@id=\"taskList\"]/div[1]/ul/li[1]/a";
	/**
	 * 总里程
	 */
	public static final String sportOverviewAllMileage = "allmileage";
	/**
	 * 总超速次数
	 */
	public static final String sportOverviewAlloverSpeedTimes = "alloverSpeedTimes";
	/**
	 * 总停留次数
	 */
	public static final String sportOverviewAllstopTimes = "allstopTimes";
	//-------------------------------------------------------------------------------------------------------------------------------
	
	//里程报表页面元素
	//-----------------------------------------------------------------------------------------------------------------------
	/**
	 * 里程报表
	 */
	public static final String mileageReport = "mileageReport";
	/**
	 * 里程报表表单 iframe //*[@id="mileageReportFrame"]
	 */
	public static final String mileageReportFrame = "//*[@id=\"mileageReportFrame\"]";
	/**
	 * 里程报表下拉菜单 
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/button
	 * 
	 */
	public static final String mileageReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/button";
	
	public static final String mileageReportDefaltDateSelect = "x,//*[@id=\"dateSelect_div\"]/div/span[2]";
	
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
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	//行程报表页面元素
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 行程报表
	 */
	public static final String tracelReport = "tracelReport";
	/**
	 * 行程报表表单 iframe //*[@id="tracelReportFrame"]
	 */
	public static final String tracelReportFrame = "//*[@id=\"tracelReportFrame\"]";
	/**
	 * 行程报表下拉菜单 /html/body/div[1]/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/button
	 */
	public static final String sportOverviewDropdownToggle = "x,/html/body/div[1]/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/button";
	
	public static final String tracelReportDateSelect= "x,//*[@id=\"dateSelect_div\"]/select";
	
	public static final String tracelReportDateSelectLi= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	public static final String tracelReportCheckDaySelect= "x,//*[@id=\"TravelFrom\"]/div[1]/div[3]/label[2]/div/ins";
	
	public static final String tracelReportCheckSegmentSelect= "x,//*[@id=\"TravelFrom\"]/div[1]/div[3]/label[3]/div/ins";
	
	public static final String tracelReportSelectUserBtn= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String tracelReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String tracelReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String tracelReportImeiInput= "x,//*[@id=\"imeiInput_travelReport\"]";
	
	public static final String tracelReportSearchBtn= "x,//*[@id=\"TravelFrom\"]/div[2]/div[3]/button";
	
	public static final String tracelReportSearchImeiBtn= "x,//*[@id=\"TravelFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String allmileageshours = "allmileageshours";
	
	public static final String tracelReportAllmileages= "allmileages";
	
	public static final String tracelReportDayAllmileages= "allmileages-day";
	
	
	public static final String tracelReportAllfuel= "allfuel";
	
	public static final String tracelReportCheckAll= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/label/div/ins";
	
	public static final String tracelReportImeiEnsure= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[1]";
	
	public static final String tracelReportRecalculateFuelBtn= "recalculateFuelBtn";
	//重新计算
	public static final String tracelReportFuelValue= "fuelvalue";
	
	/**
	 * 按里程统计方式来查询记录
	 * @throws InterruptedException 
	 */
	public void tracelReportMileagesCheak() throws InterruptedException {
		
		super.clickElement(tracelReportSearchImeiBtn);
		Thread.sleep(2000);
		super.clickElement(tracelReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(tracelReportImeiEnsure);
		
		Thread.sleep(2000);
		super.clickElement(tracelReportDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(tracelReportDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(tracelReportSearchBtn);
				Thread.sleep(2000);
				super.clickElement(tracelReportDateSelect);
				Thread.sleep(2000);
			}
			
		}
	}
	
	/**
	 * 按天统计方式来查询记录
	 * @throws InterruptedException 
	 */
	public void tracelReportDayCheak() throws InterruptedException {
		
		super.clickElement(tracelReportCheckDaySelect);
		Thread.sleep(2000);
		super.clickElement(tracelReportSearchImeiBtn);
		Thread.sleep(2000);
		super.clickElement(tracelReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(tracelReportImeiEnsure);
		Thread.sleep(2000);
		
		super.clickElement(tracelReportDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(tracelReportDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(tracelReportSearchBtn);
				Thread.sleep(2000);
				super.clickElement(tracelReportDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//停留报表页面元素
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 停留报表
	 */
	public static final String stayReport = "stayReport";
	/**
	 * 停留报表 iframe //*[@id="stayReportFrame"]
	 */
	public static final String stayReportFrame = "//*[@id=\"stayReportFrame\"]";
	/**
	 * 停留报表下拉菜单 
	 * /html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button
	 */
	public static final String stayReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String stayReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String stayReportDefaltDateSelect = "x,//*[@id=\"StopCarFrom\"]/div[1]/div[1]/div/div/select";
	
	public static final String stayReportSelectUserBtn ="x,//*[@id=\"StopCarFrom\"]/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String stayReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String stayReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String stayReportImeiInput= "imeiInput_stopCar";
	
	public static final String stayReportImeiSearchBtn= "x,//*[@id=\"StopCarFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String stayReportSearch = "x,//*[@id=\"StopCarFrom\"]/div[2]/div[3]/button";
	
	public static final String stayReportStartTimeInput = "startTime_stopCar";
	
	public static final String stayReportEndTimeInput = "endTime_stopCar";
	
	public static final String stayReportStayAllTimes = "stopCar-alltimes";
	
	public static final String stayReportCheckAll = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/label/div/ins";
	
	public static final String stayReportImeiEnsure = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[1]";
	
	public static final String stayReportImeiCancel = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[2]";
	
	public static final String stayReportDefaltDateSelectLi = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	/**
	 * 停留报表查询
	 * @throws InterruptedException 
	 * 
	 */
	public void stayReportCheak() throws InterruptedException {
		
		super.clickElement(stayReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(stayReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(stayReportImeiEnsure);
		Thread.sleep(2000);
		
		super.clickElement(stayReportDefaltDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(stayReportDefaltDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(stayReportSearch);
				Thread.sleep(2000);
				super.clickElement(stayReportDefaltDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
		
	}
	
	/**
	 * 停留报表下拉菜单
	 * 
	 */
	public void stayReportDropdownMenu() {
		
		this.selectDropdownToggle(stayReportDropdownToggle, stayReportDropdownToggleLi);
	}
	/**
	 * 停留报表获取总停留时间
	 * 
	 */
	public String getStayReportStayAlltimes() {
		
		return super.getText(stayReportStayAllTimes);
		
	}
	
	/**
	 * 停留报表导出
	 */
	public void stayReportExport() {

		super.clickElement(Export);

		super.clickElement(ExportModalBaseInfoAllSelect);

		super.clickElement(ExportModalCustomerInfoAllSelect);

		super.clickElement(ExportModalAddTaskBtn);
		// 隐性等待
		super.waitForElementToLoad(10, ExportModalDownloadTask);
		super.clickElement(ExportModalDownloadTask);
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public StatisticalReportPage(WebDriver dr) {
		super(dr);
		
	}

	/**
	 * 选择下拉菜单选项
	 */
	@SuppressWarnings("unused")
	public void selectDropdownToggle(String dropdown_toggle,String dropdown_toggle_li ) {

		super.clickElement(dropdown_toggle);

		List<WebElement> elements = super.getElements(dropdown_toggle_li);

		for (WebElement element : elements) {
			if (!element.isSelected()) {
				element.click();
			}

		}
	}

	/**
	 * 运动总览导出
	 */
	public void sportOverviewExport() {

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

		super.switch_to_frame(selector);
	}

	/**
	 * 运动总览查询
	 * 
	 * @throws InterruptedException
	 */
	public void sportOverviewSelect(String accouont) throws InterruptedException {
		// 昨天
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(1000);
		super.clickElement(sportOverviewYestoday);

		super.clickElement(sportOverviewUserSelect);

		super.operateInputElement(sportOverviewSearchUserInput, accouont);

		super.clickElement(sportOverviewSearchUserBtn);

		super.clickElement(sportOverviewSelectSearchUser);

		super.clickElement(sportOverviewSearchBtn);

		Thread.sleep(2000);
		// 本周
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(1000);
		super.clickElement(sportOverviewThisWeek);

		super.clickElement(sportOverviewSearchBtn);

		Thread.sleep(2000);
		// 上周
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(1000);
		super.clickElement(sportOverviewLastWeek);

		super.clickElement(sportOverviewSearchBtn);

		Thread.sleep(2000);
		// 本月
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(1000);
		super.clickElement(sportOverviewThisMonth);

		super.clickElement(sportOverviewSearchBtn);

		Thread.sleep(2000);
		// 上月
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(1000);
		super.clickElement(sportOverviewLastMonth);

		super.clickElement(sportOverviewSearchBtn);

		Thread.sleep(2000);
	}
	
	/**
	 * 获取总里程
	 * @return
	 */
	public String getAllMileage(String selector) {

		String AllMileage = super.getText(selector).trim();

		return AllMileage;
	}
	/**
	 * 获取运动总览总超速次数
	 * @return
	 */
	public String getSpoerOverviewAlloverSpeedTimes() {

		String AlloverSpeedTimes = super.getText(sportOverviewAlloverSpeedTimes).trim();

		return AlloverSpeedTimes;
	}
	/**
	 * 获取运动总览总停留次数
	 * @return
	 */
	public String getSpoerOverviewAllstopTimes() {

		String AllstopTimes = super.getText(sportOverviewAllstopTimes).trim();

		return AllstopTimes;
	}
	/**
	 * 里程报表查询
	 * //今天查询里程报表
	 */
	public void mileageReportTodaySelect(String imei) {
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
	 */
	public void mileageReportYestodaySelect(String imei) {
		
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
	 */
	public void mileageReportThisWeekSelect(String imei) {
		
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
	 */
	public void mileageReportLastWeekSelect(String imei) {
		
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
	 */
	public void mileageReportThisMonthSelect(String imei) {
		
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
	 */
	public void mileageReportLastMonthSelect(String imei) {
		
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
	 * 获取总油耗
	 */
	public String getAllFuel(String selector) {
		
		String allFuel = super.getText(selector).trim();
		return allFuel;
	}
	/**
	 * 里程报表重新计算油耗
	 */
	public void recalculateFuel(String value) {
		
		super.operateInputElement(mileageReportFuelValue, value);
		
		super.clickElement(mileageReportRecalculateFuelBtn);
	}
	
	public void checkRadio(String selector1,String selector2) {
		
		if (super.getElement(selector1).isSelected()) {
			super.clickElement(selector2);
		} else {
			super.clickElement(selector1);
		}
		
	}
	public void selectDate(String selector,String by,String value) {
		
		super.Select(selector, by, value);
	}
	/**
	 * 设备总览更改查看激活数日期
	 * @throws InterruptedException 
	 */
	public void deviceReportChangeNewActiveChartDate() throws InterruptedException {
		
		super.clickElement(deviceReportNewActiveChartDate);
		
		List<WebElement> elements = super.getElements(deviceReportNewActiveChartDateLi);
		
		for (WebElement element : elements) {
			element.click();
			Thread.sleep(2000);
			super.clickElement(deviceReportNewActiveChartDate);
		}
	}
	
	/**
	 * 设备总览显示
	 * @throws InterruptedException 
	 */
	public void deviceReportCheck() throws InterruptedException {
		
		super.clickElement(deviceReportLowerCustom);
		
		super.clickElement(deviceReportNewActiveChartLowerCus);
		
		this.checkRadio(deviceReportRadioYear, deviceReportRadioMonth);
		
		this.deviceReportChangeNewActiveChartDate();
		
		Thread.sleep(2000);
	}
	
	/**
	 * 获取总用时
	 */
	public String getAllMileagesHours(String selector) {

		return super.getText(selector);
	}	
}
