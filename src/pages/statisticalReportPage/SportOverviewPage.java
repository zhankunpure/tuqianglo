package pages.statisticalReportPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 运动总览页面
 * @author ZhanKun
 *
 */
public class SportOverviewPage extends AutomateDriver{
	
	private StatisticalReportPage srPage;
	
	public SportOverviewPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}

	/**
	 * 运动总览
	 */
	public static final String sportOverview = "sportOverview";
	/**
	 * 运动总览表单 iframe //*[@id="sportOverviewFrame"]
	 */
	public static final String sportOverviewFrame = "sportOverviewFrame";
	
	public static final String sportOverviewDefaltTime = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/span[2]";
	
	public static final String sportOverviewDefaltTimeLi = "x,//*[@id=\"runForm\"]/div[1]/div/div/div/div/ul/li";

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
	 * 运动总览查询
	 * 
	 * @throws InterruptedException
	 */
	public List<List<String>> sportOverviewSelect() throws InterruptedException {
		
		List<List<String>> datas = new ArrayList<List<String>>();
		List<String> data = new ArrayList<String>();
		
		super.clickElement(sportOverviewDefaltTime);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(sportOverviewDefaltTimeLi);
		
		for (WebElement element : elements) {
			
			element.click();
			Thread.sleep(2000);
			super.clickElement(sportOverviewSearchBtn);
			Thread.sleep(2000);
			String AllMileage = this.getAllMileage(sportOverviewAllMileage);
			
			String AlloverSpeedTimes = this.getSpoerOverviewAlloverSpeedTimes();
			
			String AllstopTimes = this.getSpoerOverviewAllstopTimes();
			
			data.add(AllMileage);
			
			data.add(AlloverSpeedTimes);
			
			data.add(AllstopTimes);
			
			datas.add(data);
			data.clear();
			Thread.sleep(2000);
			super.clickElement(sportOverviewDefaltTime);
			
			Thread.sleep(2000);
		}
		
		return datas;
	}
	
	/**
	 * 获取运动总览总超速次数
	 * @return
	 */
	public String getSpoerOverviewAlloverSpeedTimes() {

		return super.getText(sportOverviewAlloverSpeedTimes).trim();
	}
	/**
	 * 获取运动总览总停留次数
	 * @return
	 */
	public String getSpoerOverviewAllstopTimes() {

		return super.getText(sportOverviewAllstopTimes).trim();
	}
	
	/**
	 * 获取总里程
	 * @return
	 */
	public String getAllMileage(String selector) {

		return super.getText(selector).trim();
	}
	
	

}
