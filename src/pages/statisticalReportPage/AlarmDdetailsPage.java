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
	public static final String AlarmDdetails = "alarmDdetails";
	/**
	 * 告警详情表单 iframe //*[@id="alarmDdetailsFrame"]
	 */
	public static final String AlarmDdetailsFrame = "alarmDdetailsFrame";
	
	public static final String AlarmDdetailsImeiInput= "imeiInput_alarmDetail";
	
	public static final String AlarmDdetailsImeiSearchBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span/button";
	
	public static final String AlarmDdetailsSelectUserBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/span/button";

	public static final String AlarmDdetailsSearchUserInput = "cusTreeKey2";

	public static final String AlarmDdetailsSearchUserBtn = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String AlarmDdetailsUserSwith = "tree_1_switch";
	
	public static final String AlarmDdetailsCurSelectedNode = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/ul/li";
	
	public static final String AlarmDdetailsStatus = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/span[2]";
	
	public static final String AlarmDdetailsStatusLi = "x,/html/body/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/ul/li";
	
	public static final String AlarmDdetailsSearchBtn = "getAlertInfo_btn";
	
	public static final String AlarmDdetailsDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String AlarmDdetailsDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String AlarmDdetailsPageNumLi = "alarm_info_paging";
	
	public static final String AlarmDdetailsSelectAll = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	
	public static final String AlarmDdetailsTableContent = "alarmTableContent";
	
	public static final String AlarmDdetailsAllMarkReaded = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[1]";
	
	public static final String AlarmDdetailsMarkReaded = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[2]";
	
	public static final String AlarmDdetailsAllHandle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[3]";
	
	public static final String AlarmDdetailsHandle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/button[4]";
	
	public static final String AlarmDdetailsSerAlarmTypeModalAllCheck = "allCheck";
	
	public static final String AlarmDdetailsSerAlarmTypeModalOnAlarm = "x,//*[@id=\"alarmTypeReport\"]/li[1]/label/div/input";
	
	public static final String AlarmDdetailsSerAlarmTypeModalSave = "p,保存";
	
	public static final String AlarmDdetailsSerAlarmTypeModalCancel = "p,取消";
	
	public void toAlarmDdetailsFrame(){
		
		super.switch_to_frame(AlarmDdetailsFrame);
	}
}
