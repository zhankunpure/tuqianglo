package pages.setUpPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
/***
 * 系统设置中默认网页中page元素定位操作与方法
 * @author ZhanKun
 *
 */
public class DefaultWebPage extends AutomateDriver {
	
	/**
	 * 默认网页URL
	 */
	public static final String  DEfAUltWEBPAGEURL = "http://tujunsat.jimicloud.com/customer/sendDefaulPage";
	
	public DefaultWebPage(WebDriver dr) {
		super(dr);
		
	}
	
	
	/**
	 * 进入默认网页页面
	 */
	public void enterDefaultWebPage() {
		
		super.floatElement("x,//*[@id='systemSetting']");
		super.clickElement("p,默认首页");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
	}
	/**
	 * 设置默认控制台
	 */
	public void setUpConsole() {
		//*[@id="defaultPageList_tbody"]/tr[1]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[1]/td[2]/a");
	}
	/**
	 * 设置默认客户管理
	 */
	public void setUpCustomer() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[2]/td[2]/a");
	}
	/**
	 * 设置默认设备管理
	 */
	public void setUpEquipment() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[3]/td[2]/a");
	}
	/**
	 * 设置默认统计报表
	 */
	public void setUpReport() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[4]/td[2]/a");
	}
	/**
	 * 设置默认工作台
	 */
	public void setUpAccountCenter() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[5]/td[2]/a");
	}
	/**
	 * 设置默认安全区域
	 */
	public void setUpSafeZone() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[6]/td[2]/a");
	}
	/**
	 * 设置默认设备分布
	 */
	public void setUpDistributtonMap() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[7]/td[2]/a");
	}
	
	
	
	
		
	
}
