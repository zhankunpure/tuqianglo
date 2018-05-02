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
	 */
	public void enterDefaultWebPage() {
		
		super.floatElement("x,//*[@id='systemSetting']");
		super.clickElement("p,Ĭ����ҳ");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
	}
	/**
	 * ����Ĭ�Ͽ���̨
	 */
	public void setUpConsole() {
		//*[@id="defaultPageList_tbody"]/tr[1]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[1]/td[2]/a");
	}
	/**
	 * ����Ĭ�Ͽͻ�����
	 */
	public void setUpCustomer() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[2]/td[2]/a");
	}
	/**
	 * ����Ĭ���豸����
	 */
	public void setUpEquipment() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[3]/td[2]/a");
	}
	/**
	 * ����Ĭ��ͳ�Ʊ���
	 */
	public void setUpReport() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[4]/td[2]/a");
	}
	/**
	 * ����Ĭ�Ϲ���̨
	 */
	public void setUpAccountCenter() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[5]/td[2]/a");
	}
	/**
	 * ����Ĭ�ϰ�ȫ����
	 */
	public void setUpSafeZone() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[6]/td[2]/a");
	}
	/**
	 * ����Ĭ���豸�ֲ�
	 */
	public void setUpDistributtonMap() {
		//*[@id="defaultPageList_tbody"]/tr[2]/td[2]/a
		super.clickElement("x,//*[@id=\"defaultPageList_tbody\"]/tr[7]/td[2]/a");
	}
	
	
	
	
		
	
}
