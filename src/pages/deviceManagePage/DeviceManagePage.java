package pages.deviceManagePage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class DeviceManagePage extends AutomateDriver{

	public DeviceManagePage(WebDriver dr) {
		super(dr);
		
	}
	
	public static final String NickName = "user_account";
	/**
	 * 账号
	 */
	public static final String  UserAccount = "userAccount";
	/**
	 * 客户类型
	 */
	public static final String  UserType= "userType";
	/**
	 * 手机
	 */
	public static final String UserPhone = "user_phone";
	/**
	 * 监控用户
	 */
	public static final String  MonitorUser = "monitorUser";
	/**
	 * IMEI号输入框
	 */
	public static final String  SearchImeiInput = "searchIMEI";
	/**
	 * 编辑用户
	 */
	public static final String EditUser = "x,//*[@id=\"editUserFast\"]/button";
	/**
	 * 全部用户
	 */
	public static final String AllUser = "allUser";
	/**
	 * 到期用户
	 */
	public static final String ExpirationUser = "expirationUser";
	/**
	 * 请输入客户名和账号
	 */
	public static final String DeviceManage_cusTreeKey = "deviceManage_cusTreeKey";
	/**
	 * 客户名和账号搜索按钮
	 */
	public static final String DeviceManage_cusTreeSearchBtn = "deviceManage_cusTreeSearchBtn";
	/**
	 * 设备型号
	 */
	public static final String TypeShow = "mcTypeShow";
	
	public static final String TypeShowLi = "x,//*[@id=\"autocompleter-1\"]/ul/li";
	/**
	 * 设备类别
	 * 
	 */
	public static final String DeviceType = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/span[2]";
	/**
	 * 设备类别Li
	 */
	public static final String DeviceTypeLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/div/ul/li";
	/**
	 * 搜索按钮
	 */
	public static final String  DeviceSearchButton = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/button";
	/**
	 * 更多
	 */
	public static final String MoreButton  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/div/button";
	
	public static final String  MoreOptionIsDisplay = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]";
	/**
	 * 设备名称
	 */
	public static final String  DeviceName  = "n,deviceName";
	/**
	 * 车牌号
	 */
	public static final String  VehicleNumber = "n,vehicleNumber";
	/**
	 * 车架号
	 */
	public static final String CarFrame  = "n,carFrame";
	/**
	 * SN
	 */
	public static final String SN  = "n,sn";
	/**
	 * SIM
	 */
	public static final String SIM  = "n,sim";
	/**
	 * 激活时间
	 */
	public static final String AliveTime  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/span[2]";
	
	public static final String AliveTimeLi  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/div/ul/li";
	
	public static final String StartTime_input  = "startTime_input";
	
	public static final String EndTime_input  = "endTime_input";
	/**
	 * 使用范围
	 */
	public static final String ScopeOfUse  = "x,//*[@id=\"deviceManage_device_icon_ul\"]/li";
	
	
}
