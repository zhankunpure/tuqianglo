package pages.setUpPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 告警设置页面元素定位操作与方法 iframe id:alarmPushSetFrame alarmBasicSetFrame
 * vsAlarmSetListFrame
 * 
 * @author Administrator
 *
 */
public class AlarmConfigPage extends AutomateDriver {

	public String reduce_path;

	public AlarmConfigPage(WebDriver dr) {
		super(dr);

	}

	public static final String ALARMCONFIGPAGEURL = "http://tujunsat.jimicloud.com/alarmPushSet/alarmConfig";

	/**
	 * 进入告警设置页面
	 */
	public void enterAlarmConfigPage() {

		super.floatElement("x,//*[@id='systemSetting']");
		super.clickElement("p,告警设置");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
	}

	// 点击告警基本设置
	public void clickAlarmBasicSet() {

		super.clickElement("alarmBasicSet");
	}

	// 点击告警推送设置
	public void clickAlarmPushSet() {

		super.clickElement("alarmPushSet");
	}

	// 点击短信电话告警设置
	public void clickvsAlarmSetList() {

		super.clickElement("vsAlarmSetList");
	}

	/**
	 * 告警基本设置方法
	 */
	public void alarmBaseSet() {

	}

	/**
	 * 离线告警时间设置
	 * 
	 * @param selector
	 * @param value
	 */
	public void offlineAlarmTimeInput(String selector, String value) {

		// super.getElement("offlineAlarmTime").sendKeys(value);
		super.getElement(selector).sendKeys(value);
	}

	/**
	 * 离线告警时间,停留告警时间,下级设备告警 checkbox选择 离线告警时间同步到下级
	 * id：offlineTimeSynchroLowerUserFlag xpath :
	 * "x,//*[@id='offlineTimeSynchroLowerUserFlag']" 停留告警时间同步到下级 id
	 * ：stayTimeSynchroLowerUserFlag xpath:
	 * "x,//*[@id='stayTimeSynchroLowerUserFlag']" 下级设备告警 id:lowerLevelFlag xpath:
	 * "x,//*[@id='lowerLevelFlag']"
	 * 
	 * @param selector
	 */
	public void offlineTimeAndStayTimeAndLowerLevelFlagSelect(String selector) {

		if (super.checkboxIsSelector(selector) == false) {

			super.clickElement(selector);
		}
	}

	/**
	 * 停留告警时间设置
	 * 
	 * @param selector
	 * @param value
	 */
	public void stayAlertTimeInput(String selector, String value) {

		super.getElement(selector).sendKeys(value);
	}

	// 保存告警设置
	public void saveAlarmSet() {

		super.clickElement("saveBtn");

	}
	//////////////////////////////////
	/////////////// *********************
	///////////////
	////////////// ****************推送设置*****************
	//////////////////////////////

	/**
	 * 告警推送设置条目数
	 */
	public int alartPushSetNumber() {

		// *[@id="alarm_appSet_tbody"]/tr[44]/td[3]/label/div/input
		List<WebElement> elements = super.getElements("x,//*[@id='alarm_appSet_tbody']/tr[44]/td[3]/label/div/input");

		int size = elements.size();
		return size;

	}

	/**
	 * 告警推送设置
	 * 
	 * @throws InterruptedException
	 */
	public void alartPushSet() throws InterruptedException {

		List<WebElement> elements = super.getElements("x,//*[@id='alarm_appSet_tbody']/tr[44]/td[3]/label/div/input");

		for (WebElement element : elements) {

			String value = element.getAttribute("value");
			if (value == "0") {
				element.click();
			} else {
				element.click();
			}
			Thread.sleep(2000);
			if (value == "0") {
				element.click();
			} else {
				element.click();
			}
		}

	}

	/**
	 * 全部设置邮件发送
	 */
	public void allSetMailSend(String value) {
		// *[@id="alarmEmailModal"]/div/div/ul/li/input
		// *[@id="alarmEmailModal"]/div/div/ul/li[2]/input
		super.clickElement("p,全部设置邮件发送");

		super.getElement("n,emailSet").sendKeys(value);

	}

	// 添加邮件
	int i = 1;

	public void addSetMail() {
		// *[@id="alarmEmailModal"]/div/div/ul/li/button
		// *[@id="alarmEmailModal"]/div/div/ul/li[2]/button
		String path = "x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li/button";
		super.clickElement(path);
		i = i + 1;
		reduce_path = "x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li[" + i + "]/button";
		mail_input = "x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li[" + i + "]/input";
	}

	// *[@id="alarmEmailModal"]/div/div/ul/li/input
	// *[@id="alarmEmailModal"]/div/div/ul/li[2]/input
	String mail_input = "x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li[1]/input";

	// 减少邮件
	public void reduceSetMail() {
		// *[@id="alarmEmailModal"]/div/div/ul/li[2]/button

		super.clickElement(reduce_path);

	}

	// 输入邮件
	public void mailModalInput() {

		// *[@id="alarmEmailModal"]/div/div/ul/li/input
		super.getElement(mail_input);

	}

	// 关闭告警邮件推送模式
	public void closeAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/span[1]/a");
	}

	// 保存告警邮件推送模式
	public void saveAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/div[3]/a[1]");

	}

	// 取消告警邮件推送模式
	public void cancelAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/div[3]/a[2]");

	}

	// 单个设置邮件
	public void clickSingleSetMail() {

		super.clickElement("x,//*[@id=\"alarm_appSet_tbody\"]/tr[1]/td[4]/a");

	}

	/**
	 * 单个设置邮箱并保存
	 * 
	 * @param value
	 */
	public void SingleSetMail(String value) {

		super.clickElement("x,//*[@id=\"alarm_appSet_tbody\"]/tr[1]/td[4]/a");

		super.getElement("x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li/input").clear();

		super.getElement("x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li/input").sendKeys(value);

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[1]");
	}

	// 关闭单个告警邮件推送模式
	public void closeSingleAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/span[1]/a");
	}

	// 保存单个告警邮件推送模式
	public void saveSingleAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[1]");

	}

	// 取消单个告警邮件推送模式
	public void canceSinglelAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[2]");

	}

	// **
	// *
	// * 短信电话告警设置
	// * 告警设置名称 id：alarmSetName 告警方式 xpath
	// :/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]
	// *全部告警 xpath ：/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[1]
	// 电话告警 xpath：/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[2]
	// 短信告警 xpath：/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[3]
	// 告警类型 id：alarmTypeNames
	// //*[@id="alarmTypeTable"]/tbody/tr[2]/td[1]/label/div/input
	// 全选 id：selectAll 确认 id：selBtn 取消 id：cnBtn 搜索 id：qryBtn 清空 id：clearBtn
	// 新增告警设置 :p,新增告警设置 iframe id：layui-layer-iframe2 告警设置名称 name：alarmSetName
	// xpath：//*[@id="alarmSetForm"]/div[1]/div/input
	// checkbox 全选 id：allCheck 告警消息防打扰
	// xpath：//*[@id="alarmSetForm"]/div[3]/div[1]/input
	// 添加设备输入框 id：key2 添加设备搜索按钮 id：deviceTreeSearchBtn 默认组
	// 全选id：ud_deviceTree_1_check 下级选中 id：ud_deviceTree_2_check
	// 下拉按钮id：ud_deviceTree_1_switch
	// "p,保存" "p,保存并继续新增" "p,取消" 关闭设置告警 xpath：//*[@id="layui-layer2"]/span[1]/a ul
	// ://*[@id="ud_deviceTree_1_ul"]
	/// html/body/script[8]

	/**
	 * 短信电话告警设置
	 * 默认搜索告警设置
	 */
	public void alarmDefaultSetSearch() {

		super.clickElement("qryBtn");

	}

	// 清空
	public void clearInputContent() {

		super.clickElement("clearBtn");
	}

	/**
	 * 单个或者多个条件搜索
	 * 短信电话告警设置
	 * @throws InterruptedException
	 */
	public void alarmSetSearch(String value) throws InterruptedException {

		super.switch_to_frame("x,//*[@id='vsAlarmSetListFrame']");
		// 根据告警设备名称搜索
		super.getElement("alarmSetName").sendKeys(value);

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// 根据电话告警条件搜索
		super.clickElement("clearBtn");

		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[2]");

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// 根据短信告警条件搜索
		super.clickElement("clearBtn");

		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[3]");

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// 根据告警类型条件搜索
		super.clickElement("clearBtn");

		super.clickElement("alarmTypeNames");

		super.clickElement("selectAll");

		super.clickElement("cnBtn");

		Thread.sleep(2000);

		super.clickElement("alarmTypeNames");

		super.clickElement("selectAll");

		super.clickElement("selBtn");

		super.clickElement("qryBtn");

		Thread.sleep(2000);

		super.clickElement("clearBtn");
		// 进卫星盲区报警
		super.clickElement("alarmTypeNames");

		super.clickElement("x,//*[@text='进卫星盲区报警']");

		super.clickElement("selBtn");

		super.clickElement("qryBtn");

		Thread.sleep(2000);

		super.clickElement("clearBtn");
		// 进入电子围栏
		super.clickElement("alarmTypeNames");

		super.clickElement("x,//*[@text='进入电子围栏']");

		super.clickElement("selBtn");

		super.clickElement("qryBtn");

		// 退出iframe表单
		super.switch_to_frame("");
		Thread.sleep(2000);
	}

	/**
	 * 编辑告警设置
	 * @param key1
	 * @param key2
	 */
	 
	public void editorAlarmSet(String key1,String key2) {
		//点击编辑
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[1]");
		//切入编辑表单
		super.switch_to_frame("x,//*[@id='layui-layer-shade3']");
		//告警类型：越界告警
		////*[@id="alarmSetForm"]/div[2]/div/div/ul/li[8]/label/div/ins
		super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[1]/label/div/ins");
		//告警消息防打扰：
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input", key1);
		//添加设备：输入设备名称或者IMEI号
		super.operateInputElement("x,//*[@id=\"key2\"]", key2);
		//点击添加设备下拉按钮
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_switch\"]");
		//选择默认组全选
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
		//点击保存
		super.clickElement("p,保存");
		//退出表单
		super.switch_to_frame("");
		//刷新
		super.refresh();
		
	}
	
	/**
	 * 短信电话告警设置
	 * 编辑重置
	 */
	public void editorAlarmReset() {
		//点击编辑
				super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[1]");
				//切入编辑表单
				super.switch_to_frame("x,//*[@id='layui-layer-shade3']");
				//告警类型：越界告警
				////*[@id="alarmSetForm"]/div[2]/div/div/ul/li[8]/label/div/ins
				super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[1]/label/div/ins");
				//告警消息防打扰：
				super.clearOperateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input");
				//添加设备：输入设备名称或者IMEI号
				super.clearOperateInputElement("x,//*[@id=\"key2\"]");
				//点击添加设备下拉按钮
				super.clickElement("x,//*[@id=\"ud_deviceTree_1_switch\"]");
				//选择默认组全选
				super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
				//点击保存
				super.clickElement("p,保存");
				//退出表单
				super.switch_to_frame("");
				//刷新
				super.refresh();
		
	}
	
	/**
	 * /html/body/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/a
	 * 删除告警设置
	 */
	public void deleteAlarmSet() {
		//点击删除
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//点击取消
		super.clickElement("p,取消");
		//点击删除
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//点击关闭
		super.clickElement("x,//*[@id=\"layui-layer6\"]/span[1]/a");
		//点击删除
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//点击确定
		super.clickElement("p,确定");
	}
	
	/**
	 * 新增告警设置
	 * 保存并继续新增 super.clickElement("p,保存并继续新增");
	 */
	public void addAlarmSetup(String key1,String key2,String key3) {
		//切入短信电话告警设置表单
		super.switch_to_frame("x,//*[@id=\"vsAlarmSetListFrame\"]");
		//点击新增告警设置
		super.clickElement("p,新增警告设置");
		//切入新增告警设置表单
		super.switch_to_frame("x,//*[@id=\"layui-layer-iframe1\"]");
		//输入告警设置名称
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[1]/div/input", key1);
		//选择告警类型
		super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[7]/label/div/ins");
		//告警信息防打扰：输入分钟
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input", key2);
		//输入设备号或者IMEI号       设备号： NF509-99002  IMEI号：866160035299002
		super.operateInputElement("x,//*[@id=\"key2\"]", " NF509-99002");
		//点击搜素按钮
		super.clickElement("x,//*[@id=\"deviceTreeSearchBtn\"]");
		
		super.clearOperateInputElement("x,//*[@id=\"key2\"]");
		//输入设备号或者IMEI号       设备号： NF509-99002  IMEI号：866160035299002
		super.operateInputElement("x,//*[@id=\"key2\"]", " 866160035299002");
		//点击搜素按钮
		super.clickElement("x,//*[@id=\"deviceTreeSearchBtn\"]");
		//选中设备
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
		
		super.clickElement("p,保存");
		
//		super.clickElement("p,取消");
	}
	
}
