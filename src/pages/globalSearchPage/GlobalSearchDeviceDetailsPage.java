package pages.globalSearchPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import pages.deviceManagePage.DeviceManagePage;
import pages.statisticalReportPage.AlarmDdetailsPage;

public class GlobalSearchDeviceDetailsPage extends AutomateDriver {

	public GlobalSearchDeviceDetailsPage(WebDriver dr) {

		super(dr);
	}

	/**
	 * 客户关系
	 * 
	 */
	public static final String DeviceDetailsFrame = "x,//iframe[@scrolling=\"auto\"]";

	public static final String DeviceRelation = "p,客户关系";

	public static final String DeviceInfo = "p,设备信息";

	public static final String DeviceTransfer = "p,设备转移";

	public static final String DeviceInstruction = "p,设备指令";

	public static final String ComeBaceBtn = "x,/html/body/div[3]/div[2]/div[1]/button";

	public static final String trajectory = "p,轨迹";

	public static final String Track = "p,追踪";

	public static final String LookAtTheAlarm = "p,查看告警";

	public static final String ViewLocation = "p,查看位置";

	public static final String Console = "p,控制台";

	public static final String LookAt = "p,查看";

	public static final String DeviceImei = "x,//*[@id='complex_device_detail_tbody']/tr/td[3]";

	public static final String TrackReplayPageDriverName = "driverName";

	public static final String TrackReplayPageDriverImei = "x,/html/body/div[1]/div/div/div[1]/div[1]/div/span[1]/span";
	// 实时追踪
	public static final String TrackingPageDriverName = "driverName";

	public static final String TrackingPageDriverImei = "imeiHead";

	public static final String ConsolePageImeiInput = "key2";

	public static final String NickName = "x,/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[2]";

	public static final String UserType = "x,/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[3]/div";

	public static final String Account = "x,/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[4]";

	public static final String Phone = "x,/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[5]";

	public static final String dialogMessage = "x,/html/body/div[13]/div[2]/iframe/html/body/div[11]";

	/**
	 * 设备信息
	 * 
	 */

	public static final String BaseInfo = "p,基本信息";

	public static final String DeviceInfoIframe = "complex_editDevice_iframe";

	public static final String CustomInfo = "p,客户信息 ";
	/**
	 * 设备分组
	 */
	public static final String DeviceGrouping = "x,/html/body/form/div[1]/fieldset[1]/div[3]/div[1]/span/div/span[2]";
	/**
	 * 设备分组li
	 */
	public static final String DeviceGroupingLi = "x,/html/body/form/div[1]/fieldset[1]/div[3]/div[1]/span/div/div/ul/li";

	/**
	 * 使用范围
	 */
	public static final String ScopeOfUseLi = "x,/html/body/form/div[1]/fieldset[1]/div[4]/div[1]/ul/li";
	/**
	 * 超速
	 */
	public static final String OverSpeedInput = "n,overSpeed";
	/**
	 * 超速时间
	 */
	public static final String OverSecond = "n,overSecond";

	public static final String OverSecondError = "x,//*[@id=\"speedinfodiv\"]/div/div[3]/label";

	public static final String ReMark = "reMark";
	// 立方体
	public static final String Cube = "x,/html/body/form/div[1]/div/fieldset/div[1]/div/label[1]/div/input";
	// 卧式
	public static final String Horizontal = "x,/html/body/form/div[1]/div/fieldset/div[1]/div/label[2]/div/input";
	// 不规则
	public static final String Irregular = "x,/html/body/form/div[1]/div/fieldset/div[1]/div/label[3]/div/input";
	// 保存按钮
	public static final String SaveBtn = "x,/html/body/form/div[3]/div/button";

	public static final String DriverName = "n,driverName";

	public static final String DriverPhone = "n,driverPhone";

	public static final String VehicleNumber = "n,vehicleNumber";

	public static final String IDCard = "n,idCard";

	public static final String IDCardError = "x,/html/body/form/div[2]/fieldset/div[2]/div[2]/label";

	public static final String SN = "n,sn";

	public static final String CarFrame = "n,carFrame";

	public static final String EngineNumber = "n,engineNumber";

	public static final String SalesMan = "n,salesMan";

	public static final String TotalKm = "n,totalKm";

	public static final String TotalKmError = "x,/html/body/form/div[2]/fieldset/div[4]/div[1]/label";

	public static final String VehicleColor = "vehicleColor";

	public static final String InstallCompany = "n,installCompany";

	public static final String InstallAddress = "n,installAddress";

	public static final String InstallPosition = "n,installPosition";

	public static final String InstallPersonnel = "n,installPersonnel";

	public void DeviceCustomInfo() throws InterruptedException {

		super.clickElement(CustomInfo);
		Thread.sleep(2000);
		super.operateInputElement(DriverName, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(DriverPhone, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(VehicleNumber, "\"\"");
		Thread.sleep(2000);
		// 身份证号码特殊字符
		super.operateInputElement(IDCard, "\"\"");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 大于身份证号码长度18
		super.operateInputElement(IDCard, "3408251971082734160");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));

		// 小于身份证号码长度18
		super.operateInputElement(IDCard, "34082519710827341");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 18位身份证号码最后一位为X
		super.operateInputElement(IDCard, "34082519710827341X");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 中文
		super.operateInputElement(IDCard, "分降低非得");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 英文
		super.operateInputElement(IDCard, "tryhtt");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 非纯数字字符组合
		super.operateInputElement(IDCard, "@中788_w");
		Thread.sleep(2000);
		System.out.println(super.getText(IDCardError));
		// 为空
		super.operateInputElement(IDCard, "");
		Thread.sleep(2000);
		super.operateInputElement(SN, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(CarFrame, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(EngineNumber, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(SalesMan, "\"\"");
		Thread.sleep(2000);
		// 总里程 特殊字符 必须为数字(最多保留两位小数)
		super.operateInputElement(TotalKm, "\"\"");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 英文 必须为数字(最多保留两位小数)
		super.operateInputElement(TotalKm, "rererec");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 中文 必须为数字(最多保留两位小数)
		super.operateInputElement(TotalKm, "个天然太热他");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 保留多于两位小数 必须为数字(最多保留两位小数)
		super.operateInputElement(TotalKm, "9999.666");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 特殊字符和数字组合 必须为数字(最多保留两位小数)
		super.operateInputElement(TotalKm, "9999.");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 小于最小值 必须在0 ~ 9999999.99之间
		super.operateInputElement(TotalKm, "-0.9");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 大于最大值 必须在0 ~ 9999999.99之间
		super.operateInputElement(TotalKm, "10000000");
		Thread.sleep(2000);
		System.out.println(super.getText(TotalKmError));
		// 为空
		super.operateInputElement(TotalKm, "");
		Thread.sleep(2000);
		

		super.operateInputElement(VehicleColor, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(InstallAddress, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(InstallCompany, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(InstallPosition, "\"\"");
		Thread.sleep(2000);
		super.operateInputElement(SalesMan, "\"\"");
		Thread.sleep(2000);
		super.clickElement(SaveBtn);
		Thread.sleep(2000);
		System.out.println(super.getText(dialogMessage));
		Thread.sleep(2000);
	}

	public void DeviceBaseInfo() throws InterruptedException {

		super.clickElement(DeviceGrouping);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(DeviceGroupingLi);
		Thread.sleep(2000);
		for (WebElement element : elements) {

			element.click();

			Thread.sleep(2000);

			List<WebElement> element1s = super.getElements(ScopeOfUseLi);

			for (WebElement webElement : element1s) {

				webElement.click();
				Thread.sleep(2000);
			}

			super.operateInputElement(OverSpeedInput, "100000");

			super.operateInputElement(OverSecond, "1");
			Thread.sleep(2000);
			super.getText(OverSecondError);
			Thread.sleep(2000);
			super.operateInputElement(OverSecond, "100000");
			Thread.sleep(2000);
			super.operateInputElement(ReMark, "世界那么大，我想去看看");
			Thread.sleep(2000);
			super.clickElement(Cube);
			Thread.sleep(2000);
			super.clickElement(Horizontal);
			Thread.sleep(2000);
			super.clickElement(Irregular);
			Thread.sleep(2000);
			super.clickElement(SaveBtn);
			Thread.sleep(2000);
			System.out.println(super.getText(dialogMessage));
			Thread.sleep(2000);
			super.clickElement(DeviceGrouping);
			Thread.sleep(2000);

		}
	}

	/**
	 * 设备转移
	 * 
	 */
	public static final String SaleImeiInput = "sale_imei_complexAllot";

	public static final String CustomerExpirationTime = "x,//*[@id=\"complex_user_sale_complexAllot\"]/div[3]/div[1]/div/div/span[2]";

	public static final String CustomerExpirationTimeLi = "x,//*[@id=\"complex_user_sale_complexAllot\"]/div[3]/div[1]/div/div/div/ul/li";

	public static final String SaleImeiReset = "x,//*[@id=\"complex_user_sale_complexAllot\"]/div[3]/div[1]/button";

	public static final String SaleCount = "sale_count_complexAllot";

	public static final String Transfer = "salesDevice";

	public static final String GlobalSearchAccountInput = "complexAllot_globalSearch_input";

	public static final String GlobalSearchAccountBtn = "complexAllot_globalSearch_btn";

	public static final String GlobalSearchAccountLi = "x,/html/body/div[3]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[1]/div/ul/li";
	
	public static final String AddDeviceBtn = "x,//*[@id=\"complex_user_sale_complexAllot\"]"
			+ "/div[1]/div/div[1]/div/div[3]/button[1]";
	
	public static final String CancelDeviceBtn = "x,//*[@id=\"complex_user_sale_complexAllot\"]/div[1]/div/div[1]/div/div[3]/button[2]";
	
	public void equipmentTransfer() throws InterruptedException{
		
		super.clickElement(DeviceTransfer);
		Thread.sleep(2000);
		super.operateInputElement(SaleImeiInput, "868120124071496");
		Thread.sleep(2000);
		super.clickElement(AddDeviceBtn);
		Thread.sleep(2000);
		super.clickElement(CustomerExpirationTime);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(CustomerExpirationTimeLi);
		Thread.sleep(2000);
		for (WebElement element : elements) {
			
			element.click();
			
			Thread.sleep(2000);
			
			super.operateInputElement(GlobalSearchAccountInput, "转移设备");
			Thread.sleep(2000);
			super.clickElement(GlobalSearchAccountBtn);
			Thread.sleep(2000);
			super.clickElement(GlobalSearchAccountLi);
			Thread.sleep(2000);
			super.clickElement(Transfer);
			Thread.sleep(2000);
			System.out.println(super.getText(dialogMessage));
			Thread.sleep(2000);
		}
	}
	
	/**
	 * 设备指令
	 */
	//指令类型 Select
	public static final String TaxonomyOfVehicleSystemSelect = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]/div/div[1]/div/div/span[2]";
	//车系分类
	public static final String TaxonomyOfVehicleSystemLi1 = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]/div/div[1]/div/div/div/ul/li[1]";
	//设防/撤防
	public static final String TaxonomyOfVehicleSystemLi2 = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]/div/div[1]/div/div/div/ul/li[2]";
	//自定义
	public static final String TaxonomyOfVehicleSystemLi3 = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]/div/div[1]/div/div/div/ul/li[3]";
	
	public static final String DeviveInstructionMessage = "x,/html/body/div[11]";
	

	public static final String CarSystem = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]"
			+ "/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]";

	public static final String CarSystemLi = "x,/html/body/div[3]/div[2]/div[2]/div[4]/div/form/div[2]/div[2]/div/div[2]/"
			+ "div/div[3]/div[1]/div/div[1]/div/div/div/ul/li";

	public static final String InstructionSendBtn = "instruction-send-btn";

	public static final String Instruction_IMEI = "instruction_IMEI";
	
	public void deviceInstruction(){
		
		
		
		
		
	}
	
	

	public List<String> getUserInfo() {
		String nickname = super.getText(NickName).trim();
		String usertype = super.getText(UserType).trim();
		String account = super.getText(Account).trim();
		String phone = super.getText(Phone).trim();
		List<String> infos = new ArrayList<String>();

		infos.add(nickname);
		infos.add(usertype);
		infos.add(account);
		infos.add(phone);

		System.out.println(infos);
		return infos;
	}

	public List<String> clickLookAt() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(LookAt);
		Thread.sleep(2000);
		super.switchToWindow(currentHandle);
		Thread.sleep(2000);
		String url = super.getCurrentUrl();

		List<String> userInfos = new ArrayList<String>();

		String nickName = super.getText(DeviceManagePage.NickName).trim();
		Thread.sleep(2000);
		String account = super.getText(DeviceManagePage.UserAccount).trim();
		Thread.sleep(2000);
		String userType = super.getText(DeviceManagePage.UserType).trim();
		Thread.sleep(2000);
		String phone = super.getText(DeviceManagePage.UserPhone).trim();
		Thread.sleep(2000);
		userInfos.add(nickName);

		userInfos.add(userType);

		userInfos.add(account);

		userInfos.add(phone);
		System.out.println(userInfos);
		Thread.sleep(2000);
		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);

		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);
		return userInfos;

	}

	public String clickConsole() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(Console);
		Thread.sleep(2000);
		super.switchToWindow(currentHandle);
		Thread.sleep(2000);
		String url = super.getCurrentUrl();

		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);

		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);

		return url;
	}

	public String toConsolePage() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(ViewLocation);
		Thread.sleep(2000);
		super.switchToWindow(currentHandle);
		Thread.sleep(2000);

		String imei = super.getElement(ConsolePageImeiInput).getAttribute("value").trim();

		Thread.sleep(2000);
		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);

		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);
		return imei;

	}

	public String toTrackingPage() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(Track);
		Thread.sleep(2000);
		super.switchToWindow(currentHandle);
		Thread.sleep(2000);

		String imei = super.getText(TrackingPageDriverImei).trim();

		Thread.sleep(2000);
		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);

		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);
		return imei;

	}

	public String toTrackReplayPage() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(trajectory);
		Thread.sleep(2000);
		super.switchToWindow(currentHandle);
		Thread.sleep(2000);
		String text = super.getText(TrackReplayPageDriverImei);
		String imei = text.split(":")[1].trim();
		Thread.sleep(2000);
		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);

		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);
		return imei;
	}

	public String lookAtTheAlarm() throws InterruptedException {

		String currentHandle = super.getCurrentWindowHandle();

		super.clickElement(LookAtTheAlarm);

		super.switchToWindow(currentHandle);

		AlarmDdetailsPage adPage = new AlarmDdetailsPage(dr);
		Thread.sleep(2000);
		adPage.toAlarmDdetailsFrame();
		Thread.sleep(2000);
		String imei = adPage.getElement(AlarmDdetailsPage.AlarmDdetailsImeiInput).getAttribute("value");
		Thread.sleep(2000);
		super.close();
		Thread.sleep(2000);
		super.getCurrentWindow(currentHandle);
		Thread.sleep(2000);
		super.switch_to_frame(DeviceDetailsFrame);
		Thread.sleep(2000);
		return imei;
	}

}
