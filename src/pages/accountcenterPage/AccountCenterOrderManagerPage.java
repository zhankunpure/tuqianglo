package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

/**
 * 订单管理
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterOrderManagerPage extends AutomateDriver {
	public BasePage page;

	@SuppressWarnings("unused")
	public AccountCenterOrderManagerPage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
	}
	
	public void clickOrderManager() {
		
		super.waitForElementToLoad(10, "ordermanagerBtn");
		
		super.clickElement("ordermanagerBtn");
	}

	/**
	 * 按订单号搜索订单 //*[@id="orderNo"]
	 * @throws InterruptedException 
	 */
	public void orderNoSearch(String orderNo) throws InterruptedException {

		super.operateInputElement("x,//*[@id=\"orderNo\"]", orderNo);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);

	}

	/**
	 * 按商品名称搜索订单 //*[@id="productName"]
	 * @throws InterruptedException 
	 */
	public void productNameSearch(String productName) throws InterruptedException {
		
		super.clickElement("p.清空");

		super.operateInputElement("x,//*[@id=\"productName\"]", productName);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);

	}
	
	public void startTimeeSearch(String value) throws InterruptedException {
		
		super.operateInputElement("startTime_order", value);
		
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	public void endTimeSearch(String value) throws InterruptedException {
		
		super.operateInputElement("endTime_order", value);
		
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	public void orderInfoSearch() {
		
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * 按订单类型搜索订单 //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * 短信套餐
	 * @throws InterruptedException 
	 */
	public void orderTypeMsgSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * 按订单类型搜索订单 //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * 电话套餐
	 * @throws InterruptedException 
	 */
	public void orderTypePhoneSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * 按订单状态搜索订单 //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * 未支付
	 * @throws InterruptedException 
	 */
	public void orderStatusNoPaySearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * 按订单状态搜索订单 //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * 已支付
	 * @throws InterruptedException 
	 */
	public void orderStatusPaySearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * 按支付方式搜索订单 //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * 支付宝
	 * @throws InterruptedException 
	 */
	public void paymentMethodZhiFuBaoSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * 按支付方式搜索订单 //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * 微信
	 * @throws InterruptedException 
	 */
	public void paymentMethodWeiXinSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * 按创建时间来搜索订单  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 * @throws InterruptedException 
	 */
	public void creationTimeSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[1]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
		
	}
	/**
	 * 按支付时间来搜索订单  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 * @throws InterruptedException 
	 */
	public void paymentTimeSearch() throws InterruptedException {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
		
	}
	
	public void platformOrderSearch() throws InterruptedException {
		
		super.clickElement("p.清空");
		
		super.operateInputElement("x,//*[@id=\"orderNo\"]", "TQ201801121824530520");
		
		super.operateInputElement("x,//*[@id=\"productName\"]", "10");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");
		
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		Thread.sleep(5000);
	}
	//平台订单导出
	public void orderExport() throws InterruptedException {
		
		super.clickElement("p,导出");
		
		Thread.sleep(5000);
	}
}
