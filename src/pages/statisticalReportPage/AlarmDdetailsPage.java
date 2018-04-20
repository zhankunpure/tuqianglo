package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

/**
 * 告警详情页面
 * @author Administrator
 *
 */
public class AlarmDdetailsPage extends AutomateDriver{

	public AlarmDdetailsPage(WebDriver dr) {
		super(dr);
		
	}
	
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
	

}
