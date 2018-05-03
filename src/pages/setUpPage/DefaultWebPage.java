package pages.setUpPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
/***
 * ϵͳ������Ĭ����ҳ��pageԪ�ض�λ�����뷽��
 * @author ZhanKun
 *
 */
public class DefaultWebPage extends AutomateDriver {
	
	/**
	 * Ĭ����ҳURL
	 */
	public static final String  DEfAUltWEBPAGEURL = "http://tujunsat.jimicloud.com/customer/sendDefaulPage";
	
	public DefaultWebPage(WebDriver dr) {
		super(dr);
		
	}
	
	
	/**
	 * ����Ĭ����ҳҳ��
	 * @throws InterruptedException 
	 */
	public void enterDefaultWebPage() throws InterruptedException {
		
		super.floatElement("x,//*[@id='systemSetting']");
		super.clickElement("p,Ĭ����ҳ");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
	}
	/**
	 * ����Ĭ�Ͽ���̨
	 * @throws InterruptedException 
	 */
	public void setUpConsole() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[1]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[1]/td[2]/a");
	}
	/**
	 * ����Ĭ�Ͽͻ�����
	 * @throws InterruptedException 
	 */
	public void setUpCustomer() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[2]/td[2]/a");
	}
	/**
	 * ����Ĭ���豸����
	 * @throws InterruptedException 
	 */
	public void setUpEquipment() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[3]/td[2]/a");
	}
	/**
	 * ����Ĭ��ͳ�Ʊ���
	 * @throws InterruptedException 
	 */
	public void setUpReport() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[4]/td[2]/a");
	}
	/**
	 * ����Ĭ�Ϲ���̨
	 * @throws InterruptedException 
	 */
	public void setUpAccountCenter() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[5]/td[2]/a");
	}
	/**
	 * ����Ĭ�ϰ�ȫ����
	 * @throws InterruptedException 
	 */
	public void setUpSafeZone() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[6]/td[2]/a");
	}
	/**
	 * ����Ĭ���豸�ֲ�
	 * @throws InterruptedException 
	 */
	public void setUpDistributtonMap() throws InterruptedException {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[7]/td[2]/a");
	}
	
	
	
	
		
	
}
