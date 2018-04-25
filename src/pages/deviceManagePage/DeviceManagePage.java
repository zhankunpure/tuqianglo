package pages.deviceManagePage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class DeviceManagePage extends AutomateDriver{

	public DeviceManagePage(WebDriver dr) {
		super(dr);
		
	}
	
	public static final String NickName = "user_account";
	
	public static final String  UserAccount = "userAccount";
	
	public static final String  UserType= "userType";
	
	public static final String UserPhone = "user_phone";
	
	public static final String  MonitorUser = "monitorUser";
	
	public static final String  SearchImeiInput = "searchIMEI";

}
