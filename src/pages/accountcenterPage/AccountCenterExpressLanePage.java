package pages.accountcenterPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 控制台快速通道模块
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterExpressLanePage extends AutomateDriver {

	public AccountCenterExpressLanePage(WebDriver dr) {
		super(dr);
	}

	/**
	 * 包含下级用户设备
	 * 
	 * @param selector
	 * @throws InterruptedException 
	 */
	public void clickLowerFlag(String selector) throws InterruptedException {
		Thread.sleep(2000);
		if (!super.checkboxIsSelector(selector)) {
			super.clickElement(selector);
		}
		
		Thread.sleep(2000);
	}
	
	public void inOrOutFrame(String selector) throws InterruptedException{
		
		super.switch_to_frame(selector);
		
		Thread.sleep(2000);
		
		
	}
	
	
	/**
	 * 点击刷新按钮
	 * 
	 * @param selector
	 * @throws InterruptedException 
	 */
	public void refreshFrame(String divId) throws InterruptedException {
		
		String selector = "x,//*[@id=\""+divId+"\"]/div/div/div[1]/span/i[1]";
		
		super.clickElement(selector);
		
		Thread.sleep(5000);
	}

	/**
	 * 删除模块
	 * 
	 * @param selector
	 * @throws InterruptedException 
	 */
	public void deleteModula(String divId) throws InterruptedException {
		
		String selector = "x,//*[@id=\""+divId+"\"]/div/div/div[1]/span/i[2]";
		super.clickElement(selector);
		
		Thread.sleep(2000);
	}

	/**
	 * 点击添加模块
	 * 
	 * @param selector
	 */
	public void clickAddModula() {
	//	/html/body/div[9]/div[3]/div/a
		super.clickElement("p,添加模块 ");
	}

	/**
	 * 添加模块
	 * 
	 * @param selector
	 * @throws InterruptedException
	 */
	public void AddModula() throws InterruptedException {
		// /html/body/div[9]/div[1]/div/a
		super.clickElement("p,添加模块 ");
		
		List<WebElement> elements = super.getElements("x,/html/body/div[13]/div[2]/div/div/div");
		int size = elements.size();
		System.out.println(elements);
		System.out.println(size);
		
//		for (WebElement element : elements) {
//			if (element.isSelected()) {
//				System.out.println(element);
//				continue;
//			} else {
//				element.click();
//				System.out.println(element);
//				Thread.sleep(2000);
//			}
//		}
		
			if (!super.getElement("stockStat").isSelected()) {
				
				super.clickElement("stockStat");
				String id = super.getElement("stockStat").getAttribute("id");
				System.out.println("id="+id);
			}
			Thread.sleep(2000);
			if (!super.getElement("statusStat").isSelected()) {
				super.clickElement("statusStat");
				String id1 = super.getElement("statusStat").getAttribute("id");
				System.out.println("id="+id1);
			}
			Thread.sleep(2000);
			if (!super.getElement("actStat").isSelected()) {
				super.clickElement("actStat");
				String id2 = super.getElement("actStat").getAttribute("id");
				System.out.println("id="+id2);
			}
			Thread.sleep(2000);
			if (!super.getElement("alarmStat").isSelected()) {
				super.clickElement("alarmStat");
				String id3 = super.getElement("alarmStat").getAttribute("id");
				System.out.println("id="+id3);
			}
			Thread.sleep(2000);
			if (!super.getElement("batchEdit").isSelected()) {
				super.clickElement("batchEdit");
				String id4 = super.getElement("batchEdit").getAttribute("id");
				System.out.println("id="+id4);
			}
			Thread.sleep(2000);
			if (!super.getElement("monitUser").isSelected()) {
				super.clickElement("monitUser");
				String id5 = super.getElement("monitUser").getAttribute("id");
				System.out.println("id="+id5);
			}
			Thread.sleep(2000);
			if (!super.getElement("tracking").isSelected()) {
				super.clickElement("tracking");
				String id6 = super.getElement("tracking").getAttribute("id");
				System.out.println("id="+id6);
			}
			Thread.sleep(2000);
			if (!super.getElement("devExpires").isSelected()) {
				super.clickElement("devExpires");
				String id7 = super.getElement("devExpires").getAttribute("id");
				System.out.println("id="+id7);	
			}

			Thread.sleep(2000);
			if (!super.getElement("actDevReport").isSelected()) {
				super.clickElement("actDevReport");
				String id8 = super.getElement("actDevReport").getAttribute("id");
				System.out.println("id="+id8);
			}
			Thread.sleep(2000);
			if (!super.getElement("fastSell").isSelected()) {
				super.clickElement("fastSell");
				String id9 = super.getElement("fastSell").getAttribute("id");
				System.out.println("id="+id9);
			}
			Thread.sleep(2000);
			if (!super.getElement("devIns").isSelected()) {
			    super.clickElement("devIns");
			    String id10 = super.getElement("devIns").getAttribute("id");
				System.out.println("id="+id10);
			}
			Thread.sleep(2000);
			
		super.clickElement("p,确定");
		super.waitForElementToLoad(10, "stockStatFrame");
		// super.clickElement("p,取消");
	}

	/**
	 * 下载模板
	 * @throws InterruptedException 
	 */

	public void downloadModula() throws InterruptedException {
		
		//super.switch_to_frame("batchEditFrame");

		super.clickElement("p,点我下载文件");
		Thread.sleep(5000);
		//super.switch_to_frame("");
	}

	/**
	 * 监控用户搜素
	 * @throws InterruptedException 
	 */
	public void treeSubUserSearch(String value) throws InterruptedException {
		// value:test1101  account_4
//		super.switch_to_frame("monitUserFrame");
		
		super.operateInputElement("x,//*[@id=\"treeSubUser_search_input\"]", value);
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeSubUser_search_btn\"]");
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/div/div[1]/div");
		Thread.sleep(2000);
	}

	/**
	 * 点击监控用户按钮
	 * @throws InterruptedException 
	 */
	public void clickMonitoringUsersBtn() throws InterruptedException {
		
		super.clickElement("x,/html/body/div/div[2]/div/div[6]/button");
		
		Thread.sleep(2000);
	}

	/**
	 * 编辑用户
	 * 
	 * @throws InterruptedException
	 */
	public void editorUser() throws InterruptedException {

		super.clickElement("x,//*[@id=\"editUser\"]/button");
		Thread.sleep(5000);
		// 切入编辑用户表单
		super.switch_to_frame("x,/html/body/div[15]/div[2]/iframe");
		Thread.sleep(2000);
		// 选择上级用户
		super.clickElement("x,//*[@id=\"treeDemo2_1_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_3_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_3_span\"]");
		Thread.sleep(1000);
		// 客户名称
		super.operateInputElement("nickName", "test911");
		Thread.sleep(1000);
		// 电话
		super.operateInputElement("phone", "6666666");
		Thread.sleep(1000);
		// 邮箱
		super.operateInputElement("email", "jimi123@qq.com");
		// 联系人
		super.operateInputElement("contact", "e中 2*_");
		// companyName
		super.operateInputElement("companyName", "Ac中 2*_");
		// 修改权限：web修改设备
		super.clickElement("x,//*[@id=\"updateDevFlag\"]");
		// 修改权限：app修改设备
		super.clickElement("x,//*[@id=\"appUpdateDevFlag\"]");

		super.switch_to_frame("");

		super.clickElement("p,保存");
		Thread.sleep(2000);
	}

	/**
	 * 重置编辑用户
	 * 
	 * @throws InterruptedException
	 */
	public void resetEditorUser() throws InterruptedException {
		// 点击编辑按钮
		super.clickElement("x,//*[@id=\"editUser\"]/button");
		// 切入编辑用户表单
		super.switch_to_frame("x,//*[@id=\"layui-layer5\"]/div[2]/iframe");

		super.clickElement("x,//*[@id=\"treeDemo2_1_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_1_span\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"updateDevFlag\"]");

		super.clickElement("x,//*[@id=\"appUpdateDevFlag\"]");

		super.switch_to_frame("");

		super.clickElement("p,保存");
		Thread.sleep(2000);

	}

	/**
	 * 通过IMEI号查看轨迹
	 * 
	 * @throws InterruptedException
	 */

	public void checkTrajectory(String imei, String handle) throws InterruptedException {
		// 切入查看轨迹追踪设备表单 IMEI号：866160035299002
		super.switch_to_frame("trackingFrame");
		// 输入IMEI
		super.operateInputElement("queryimei", imei);

		// String current_handle = super.getCurrentWindowHandle();
		// 点击查看轨迹按钮
		super.clickElement("x,/html/body/div/div[2]/button");

		super.switchToWindow(handle);

		// super.getCurrentUrl();
	}

	/**
	 * 追踪设备
	 * 
	 * @throws InterruptedException
	 */
	public void trackingEquipment(String imei, String handle) throws InterruptedException {
		// 切入查看轨迹追踪设备表单 IMEI号：866160035299002
		super.switch_to_frame("trackingFrame");
		// 输入IMEI
		super.operateInputElement("queryimei", imei);

		// String current_handle = super.getCurrentWindowHandle();
		// 点击追踪按钮
		super.clickElement("x,/html/body/div/div[3]/button");

		super.switchToWindow(handle);
	}

	/**
	 * 轨迹回放搜索
	 * 
	 * @throws InterruptedException
	 */
	public void trajectoryPlaybackSearch() throws InterruptedException {
		//点击轨迹回放
		super.clickElement("x,//*[@id=\"locus\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 上周
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[1]");
		// 定位方式
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// 全部
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[1]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 本周
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[2]");
		// 定位方式
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// 卫星定位
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[2]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 前天
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[3]");
		// 定位方式
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// 基站定位
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[3]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 昨天
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[4]");
		// 定位方式
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// WIFI定位
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[4]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 今天
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[5]");
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// 最近七天
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[6]");
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);

		// 行车记录
		super.clickElement("x,//*[@id=\"driving\"]");

		Thread.sleep(5000);

		super.close();
		
		Thread.sleep(2000);
	}

	/**
	 * 设备激活报表
	 * 
	 * @throws InterruptedException
	 */
	public void deviceActivationReport() throws InterruptedException {

		if (super.getElement("x,//*[@id=\"radio-year\"]").isSelected()) {
			super.clickElement("x,//*[@id=\\\"radio-month\\\"]");
		} else if (super.getElement("x,//*[@id=\"radio-month\"]").isSelected()) {
			super.clickElement("x,//*[@id=\"radio-year\"]");
		}
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/div/ul/li[6]");
		Thread.sleep(2000);

		super.clickElement("x,/html/body/div/div[1]/div/span/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/div/ul/li[11]");
		Thread.sleep(2000);

	}

	/**
	 * 快速销售模块 选择已有的用户进行快速销售 fastSellFrame
	 * 
	 * @throws InterruptedException
	 */
	public void selectUserFastSale() throws InterruptedException {
		// *[@id="fastSellFrame"]
		super.switch_to_frame("fastSellFrame");
		// 销售给用户对象
		super.clickElement("x,//*[@id=\"selectUserSalesName\"]");

		super.clickElement("x,//*[@id=\"ac_putDevice_custTree_1_switch\"]");

		super.clickElement("x,//*[@id=\"ac_putDevice_custTree_1_span\"]");
		// 追加设备
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", "866160035299002");
		// 点击添加按钮
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/button[1]");
		// 显性等待时间
		super.explicitWait("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");

		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");
		// 用户到期时间为半年
		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/div/ul/li[5]");
		// 点击销售按钮
		super.clickElement("x,/html/body/div/div/div/div/div[3]/button[3]");
		Thread.sleep(2000);
		// 重置
		super.clickElement("x,//*[@id=\"resetDevice\"]");
		Thread.sleep(2000);
		super.switch_to_frame("");
	}

	/**
	 * 快速销售模块 新增用户进行快速销售 fastSellFrame
	 * 
	 * @throws InterruptedException
	 */
	public void newUserFastSale(String nickName, String account) throws InterruptedException {
		// *[@id="fastSellFrame"]
		super.switch_to_frame("fastSellFrame");
		// 销售给用户对象 --点击新增用户
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[1]/div[2]/button");

		super.switch_to_frame("");
		// 进入新增用户表单

		super.explicitWait("x,/html/body/div[15]/div[2]/iframe");
		super.switch_to_frame("x,/html/body/div[15]/div[2]/iframe");

		super.operateInputElement("x,//*[@id=\"nickName\"]", nickName);

		super.operateInputElement("x,//*[@id=\"account\"]", account);

		super.clickElement("x,//*[@id=\"customer_webupdatedev_div\"]/label/div/ins");
		// *[@id="customer_isBatchSendIns"]/label/div/ins
		super.clickElement("x,//*[@id=\"customer_appupdatedev_div\"]/label/div/ins");

		super.switch_to_frame("");

		super.clickElement("p,保存");

		super.explicitWait("fastSellFrame");
		super.switch_to_frame("fastSellFrame");

		// 追加设备
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", "866160035299002");
		// 点击添加按钮
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/button[1]");
		// 显性等待时间
		super.explicitWait("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");

		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");
		// 用户到期时间为一年
		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/div/ul/li[6]");
		// 点击销售按钮
		super.clickElement("x,/html/body/div/div/div/div/div[3]/button[3]");
		Thread.sleep(2000);
		// 重置
		super.clickElement("x,//*[@id=\"resetDevice\"]");
		Thread.sleep(2000);
		super.switch_to_frame("");

	}
	  /**
	   * 设备指令模块
	   * //*[@id="searchIMEI"]  //*[@id="devInsFrame"]
	 * @throws InterruptedException 
	   */  
	public void deviceInstruction(String imei) throws InterruptedException {
		
		super.switch_to_frame("devInsFrame");
		
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", imei);
		
		super.clickElement("x,/html/body/div[1]/div/div/div/div/div[1]/div[1]/div/div/div[3]/button[1]");
		
		super.operateInputElement("x,//*[@id=\"text_0\"]", "9527");
		
		super.clickElement("x,//*[@id=\"ins_endTime\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"laydate_today\"]");
		
		super.clickElement("x,//*[@id=\"ins_startTime\"]");
		Thread.sleep(2000);
		//2018-04-08 20:15:00
		super.operateInputElement("x,//*[@id=\"ins_startTime\"]", "2018-04-08 20:15:00");
		
		super.clickElement("x,//*[@id=\"sendInsBtn\"]");
		
		super.dr.navigate().refresh();
		
		super.switch_to_frame("");
	}
}
