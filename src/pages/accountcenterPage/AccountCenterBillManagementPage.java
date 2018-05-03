package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
/**
 * �˵�����ҳ�� BillManagementPage
 * @author ZhanKun
 *
 */
public class AccountCenterBillManagementPage extends AutomateDriver {
	/**
	 * �˵�����  Ĭ��ʱ������
	 */
	public static final String BILL_DEFALT_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/span[2]";
	/**
	 * �˵�����  ����ʱ������
	 */
	public static final String BILL_TODAY_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[1]";
	/**
	 * �˵�����  ����ʱ������
	 */
	public static final String BILL_THIS_WEEK_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[2]";
	/**
	 * �˵�����  ����ʱ������
	 */
	public static final String BILL_THIS_MONTH_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[3]";
	/**
	 * �˵�����  ����ʱ������
	 */
	public static final String BILL_LAST_MONTH_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[4]";
	/**
	 * �˵�����  �Զ���ʱ������
	 */
	public static final String BILL_CUSTOM_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[5]";
	/**
	 * �˵�����  �澯�豸IMEI����
	 */
	public static final String BILL_ALARM_DEVICE_IMEI_ELEMENT = "x,//*[@id=\"imei\"]";
	/**
	 * �˵�����  ���ո澯�绰
	 */
	public static final String BILL_RECEIVING_ALARM_PHONE_ELEMENT = "x,//*[@id=\"phone\"]";
	/**
	 * �˵�����  Ĭ�Ͻ��ո澯��ʽ
	 */
	public static final String BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/span[2]";
	/**
	 * �˵�����  ���н��ո澯��ʽ
	 */
	public static final String BILL_ALL_RECEPTION_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[1]";
	/**
	 * �˵�����  �绰�澯��ʽ
	 */
	public static final String BILL_PHONE_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[2]";
	/**
	 * �˵�����  ���Ÿ澯��ʽ
	 */
	public static final String BILL_MESSAGE_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[3]";
	/**
	 * �˵�����  Ĭ�ϴ�����
	 */
	public static final String BILL_DEFALT_PROCESSING_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/span[2]";
	/**
	 * �˵�����  ���д�����
	 */
	public static final String BILL_ALL_PROCESSING_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[1]";
	/**
	 * �˵�����  �ɹ�������
	 */
	public static final String BILL_SUCCESS_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[2]";
	/**
	 * �˵�����  ʧ�ܴ�����
	 */
	public static final String BILL_FAIL_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[3]";
	/**
	 * �˵�����  ������ťԪ��
	 */
	public static final String BILL_SEARCH_ELEMENT = "x,//*[@id=\"qryBtn\"]";
	/**
	 * �˵�����  ��հ�ťԪ��
	 */
	public static final String BILL_CLEAR_ELEMENT = "x,//*[@id=\"clearBtn\"]";
	/**
	 * �˵�����  �б�Ԫ��
	 */
	public static final String BILL_LIST_ELEMENT = "x,//*[@id=\"switchList\"]";
	/**
	 * �˵����� ����ͼԪ��
	 */
	public static final String BILL_DIAGRAM_ELEMENT = "x,//*[@id=\"switchCurve\"]";
	/**
	 * �˵����� ������ťԪ��
	 */
	public static final String BILL_EXPORT_ELEMENT = "x,//*[@id=\"curveExport\"]/button";
	
	public static final String BILL_MANAGER_BTN = "billmanagerBtn";
	
	public static final String BILL_MANAGER_START_TIME ="startTime";
	
	public static final String BILL_MANAGER_END_TIME ="endTime";
	
	public AccountCenterBillManagementPage(WebDriver dr) {
		super(dr);
		
	}
	
	public void startTimeSearch(String value) throws InterruptedException {
		super.operateInputElement(BILL_MANAGER_START_TIME, value);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	public void endTimeSearch(String value) throws InterruptedException {
		
		super.operateInputElement(BILL_MANAGER_END_TIME, value);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * �����˵�����ҳ��
	 * @throws InterruptedException 
	 */
	public void clickBillManagerBtn() throws InterruptedException {
		
		super.waitForElementToLoad(10, BILL_MANAGER_BTN);
		
		super.clickElement(BILL_MANAGER_BTN);
		
	}
	
	public void exportBill() throws InterruptedException {
		
		super.clickElement(BILL_EXPORT_ELEMENT);
	}
	
	public void switchList() throws InterruptedException {
		
		super.clickElement(BILL_DIAGRAM_ELEMENT);
	}
	
	public void switchCurve() throws InterruptedException {
		
		super.clickElement(BILL_LIST_ELEMENT);
	}
	
	/**
	 * Ĭ���˵�����
	 * @throws InterruptedException 
	 */
	public void defaltBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		Thread.sleep(2000);
	}
	/**
	 * ���������������˵�
	 * @throws InterruptedException 
	 */
	public void thisWeekBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_THIS_WEEK_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		Thread.sleep(2000);
	}
	/**
	 * ���������������˵�
	 * @throws InterruptedException 
	 */
	public void thisMonthBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_THIS_MONTH_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		Thread.sleep(2000);
	}
	/**
	 * ���������������˵�
	 * @throws InterruptedException 
	 */
	public void lastMonthBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_LAST_MONTH_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		Thread.sleep(2000);
	}
	/**
	 * ���Զ���ʱ�����������˵�
	 * @throws InterruptedException 
	 */
	public void customTimeBillSearch(String startTime,String endTime) throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_CUSTOM_TIME_ELEMENT);
		
		super.operateInputElement(BILL_MANAGER_START_TIME, startTime);
		
		super.operateInputElement(BILL_MANAGER_END_TIME, endTime);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		Thread.sleep(2000);
	}
	/**
	 * ���澯�豸imei�����˵�
	 * @throws InterruptedException 
	 */
	public void alarmDeviceIMEIBillSearch(String imei) throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.operateInputElement(BILL_ALARM_DEVICE_IMEI_ELEMENT, imei);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	
	/**
	 * �����ո澯�绰�����˵�
	 * @throws InterruptedException 
	 */
	public void receivingAlarmPhoneBillSearch(String phone) throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.operateInputElement(BILL_RECEIVING_ALARM_PHONE_ELEMENT, phone);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	
	/**
	 * �����н��ո澯��ʽ�����˵�
	 * @throws InterruptedException 
	 */
	public void allReceptionAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_ALL_RECEPTION_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	/**
	 * ���绰�澯��ʽ�����˵�
	 * @throws InterruptedException 
	 */
	public void phoneAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_PHONE_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	/**
	 * �����Ÿ澯��ʽ�����˵�
	 * @throws InterruptedException 
	 */
	public void messageAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_MESSAGE_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	/**
	 * �����д����������˵�
	 * @throws InterruptedException 
	 */
	public void allProcessingResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_ALL_PROCESSING_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	
	/**
	 * ���ɹ������������˵�
	 * @throws InterruptedException 
	 */
	public void successResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_SUCCESS_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
	
	/**
	 * ��ʧ�ܴ����������˵�
	 * @throws InterruptedException 
	 */
	public void failResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_FAIL_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
		Thread.sleep(2000);
	}
}
