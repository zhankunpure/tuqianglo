package pages.deviceManagePage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class DeviceManagePage extends AutomateDriver{

	public DeviceManagePage(WebDriver dr) {
		super(dr);
		
	}
	
	public static final String NickName = "user_account";
	/**
	 * �˺�
	 */
	public static final String  UserAccount = "userAccount";
	/**
	 * �ͻ�����
	 */
	public static final String  UserType= "userType";
	/**
	 * �ֻ�
	 */
	public static final String UserPhone = "user_phone";
	/**
	 * ����û�
	 */
	public static final String  MonitorUser = "monitorUser";
	/**
	 * IMEI�������
	 */
	public static final String  SearchImeiInput = "searchIMEI";
	/**
	 * �༭�û�
	 */
	public static final String EditUser = "x,//*[@id=\"editUserFast\"]/button";
	/**
	 * ȫ���û�
	 */
	public static final String AllUser = "allUser";
	/**
	 * �����û�
	 */
	public static final String ExpirationUser = "expirationUser";
	/**
	 * ������ͻ������˺�
	 */
	public static final String DeviceManage_cusTreeKey = "deviceManage_cusTreeKey";
	/**
	 * �ͻ������˺�������ť
	 */
	public static final String DeviceManage_cusTreeSearchBtn = "deviceManage_cusTreeSearchBtn";
	/**
	 * �豸�ͺ�
	 */
	public static final String TypeShow = "mcTypeShow";
	
	public static final String TypeShowLi = "x,//*[@id=\"autocompleter-1\"]/ul/li";
	/**
	 * �豸���
	 * 
	 */
	public static final String DeviceType = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/span[2]";
	/**
	 * �豸���Li
	 */
	public static final String DeviceTypeLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/div/ul/li";
	/**
	 * ������ť
	 */
	public static final String  DeviceSearchButton = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/button";
	/**
	 * ����
	 */
	public static final String MoreButton  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/div/button";
	
	public static final String  MoreOptionIsDisplay = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]";
	/**
	 * �豸����
	 */
	public static final String  DeviceName  = "n,deviceName";
	/**
	 * ���ƺ�
	 */
	public static final String  VehicleNumber = "n,vehicleNumber";
	/**
	 * ���ܺ�
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
	 * ����ʱ��
	 */
	public static final String AliveTime  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/span[2]";
	
	public static final String AliveTimeLi  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/div/ul/li";
	
	public static final String StartTime_input  = "startTime_input";
	
	public static final String EndTime_input  = "endTime_input";
	/**
	 * ʹ�÷�Χ
	 */
	public static final String ScopeOfUse  = "x,//*[@id=\"deviceManage_device_icon_ul\"]/li";
	
	
}
