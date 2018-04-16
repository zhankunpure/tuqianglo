package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

/**
 * ��������
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
	 * ���������������� //*[@id="orderNo"]
	 * @throws InterruptedException 
	 */
	public void orderNoSearch(String orderNo) throws InterruptedException {

		super.operateInputElement("x,//*[@id=\"orderNo\"]", orderNo);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);

	}

	/**
	 * ����Ʒ������������ //*[@id="productName"]
	 * @throws InterruptedException 
	 */
	public void productNameSearch(String productName) throws InterruptedException {
		
		super.clickElement("p.���");

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
	 * ������������������ //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * �����ײ�
	 * @throws InterruptedException 
	 */
	public void orderTypeMsgSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * ������������������ //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * �绰�ײ�
	 * @throws InterruptedException 
	 */
	public void orderTypePhoneSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * ������״̬�������� //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * δ֧��
	 * @throws InterruptedException 
	 */
	public void orderStatusNoPaySearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * ������״̬�������� //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * ��֧��
	 * @throws InterruptedException 
	 */
	public void orderStatusPaySearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * ��֧����ʽ�������� //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * ֧����
	 * @throws InterruptedException 
	 */
	public void paymentMethodZhiFuBaoSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	/**
	 * ��֧����ʽ�������� //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * ΢��
	 * @throws InterruptedException 
	 */
	public void paymentMethodWeiXinSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
	}
	
	/**
	 * ������ʱ������������  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 * @throws InterruptedException 
	 */
	public void creationTimeSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[1]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
		
	}
	/**
	 * ��֧��ʱ������������  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 * @throws InterruptedException 
	 */
	public void paymentTimeSearch() throws InterruptedException {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
		Thread.sleep(2000);
		
	}
	
	public void platformOrderSearch() throws InterruptedException {
		
		super.clickElement("p.���");
		
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
	//ƽ̨��������
	public void orderExport() throws InterruptedException {
		
		super.clickElement("p,����");
		
		Thread.sleep(5000);
	}
}
