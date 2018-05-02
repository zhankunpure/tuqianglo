package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

/***
 * ��ֵ������ҳ��
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterRechargePage extends AutomateDriver {
	/**
	 * �û��˺�
	 */
	public static final String USER_ACCONUT = "userAccount";
	/**
	 * ��ֵ������ Number of recharge cards
	 */
	public static final String RECHARGE_NUMBER = "userType";
	/**
	 * �����¼ Purchase record
	 */
	public static final String PURCHASE_RECORD = "p,�����¼";
	/**
	 * ת�Ƽ�¼ Transfer record
	 */
	public static final String TRANSFER_RECORD = "p,ת�Ƽ�¼";
	/**
	 * ��ֵ��¼
	 */
	public static final String RECHARGE_RECORD = "p,��ֵ��¼";
	/**
	 * �����¼ Ĭ��ȫ��
	 */
	public static final String PURCHASE_RECORD_DEFALT_ALL = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/span[2]";
	/**
	 * �����¼ ȫ������
	 */
	public static final String PURCHASE_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[1]";
	/**
	 * �����¼ �ɹ�����
	 */
	public static final String PURCHASE_RECORD_SECCESS_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[2]";
	/**
	 * �����¼ ʧ������
	 */
	public static final String PURCHASE_RECORD_FAIL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[3]";
	/**
	 * �����¼ ����������
	 */
	public static final String PURCHASE_RECORD_HANDLE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[4]";
	/**
	 * �����¼ ������ť
	 */
	public static final String PURCHASE_RECORD_SEARCH = "queryOrderBtn";
	/**
	 * ת�Ƽ�¼ ������ť
	 */
	public static final String TRANSFER_RECORD_SEARCH = "queryTransferBtn";
	/**
	 * ת�Ƽ�¼ Ĭ��ȫ��
	 */
	public static final String TRANSFER_RECORD_DEFALT_ALL = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/span[2]";
	/**
	 * ת�Ƽ�¼ ȫ������
	 */
	public static final String TRANSFER_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[1]";
	/**
	 * ת�Ƽ�¼ ת������
	 */
	public static final String TRANSFER_RECORD_TO_CHANGE_INTO_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[2]";
	/**
	 * ת�Ƽ�¼ ת������
	 */
	public static final String TRANSFER_RECORD_TURN_OUT_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[3]";
	/**
	 * ��ֵ��¼ Ĭ��ȫ��
	 */
	public static final String RECHARGE_RECORD_DEFALT_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/span[2]";
	/**
	 * ��ֵ��¼ ȫ������
	 */
	public static final String RECHARGE_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[1]";
	/**
	 * ��ֵ��¼ �꿨���� yearCard
	 */
	public static final String RECHARGE_RECORD_YEAR_CARD_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[2]";
	/**
	 * ��ֵ��¼ �������� lifetimeCard
	 */
	public static final String RECHARGE_RECORD_LIFETIME_CARD_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[3]";
	/**
	 * ��ֵ��¼ IMEI�� ���� searchIMEIs
	 */
	public static final String RECHARGE_RECORD_IMEIS_SEARCH = "searchIMEIs";

	/**
	 * ��ֵ��¼ Ĭ��ʱ������
	 */
	public static final String RECHARGE_RECORD_DEFALT_TIME_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/span[2]";
	/**
	 * ��ֵ��¼ ��ֵʱ������ Recharge time
	 */
	public static final String RECHARGE_RECORD_RECHARGE_TIME_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[1]";
	/**
	 * ��ֵ��¼ ��ֵǰ�豸����ʱ�� ���� Expiration time of pre recharge
	 */
	public static final String RECHARGE_RECORD_EXPIRATION_TIME_OF_PRE_RECHARGE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[2]";

	/**
	 * ��ֵ��¼ ��ֵ���豸����ʱ�� ���� expiration time after recharge
	 */
	public static final String RECHARGE_RECORD_EXPIRATION_TIME_AFTER_RECHARGE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[3]";
	/**
	 * ת�Ƽ�¼ ��ʼʱ�� start_time
	 */
	public static final String RECHARGE_RECORD_START_TIME_SEARCH = "start_time";
	/**
	 * ��ֵ��¼ ����ʱ�� end_time
	 */
	public static final String RECHARGE_RECORD_END_TIME_SEARCH = "end_time";
	/**
	 * ��ֵ��¼ �����û� Subordinate users
	 */
	public static final String RECHARGE_RECORD_SUBORDINATE_USERS_SEARCH = "account";
	/**
	 * ��ֵ��¼ ������ť
	 */
	public static final String RECHARGE_RECORD_SEARCH = "queryRechargeBtn";

	public AccountCenterRechargePage(WebDriver dr) {
		super(dr);

	}

	/**
	 *  ��ȡ�ҵ��˺�
	 * @return
	 */
	public String getMyAccount() {

		return super.getElement(USER_ACCONUT).getAttribute("title");
	}

	/**
	 *  ��ȡ��ֵ������
	 * @return
	 */
	public String getRechargeCardNum() {

		return super.getElement(RECHARGE_NUMBER).getText();
	}
	
	/**
	 * �����¼����  Purchase record
	 * @throws InterruptedException 
	 */
	public void  purchaseRecordSearch() throws InterruptedException {
		//��������¼
		super.clickElement(PURCHASE_RECORD);
		//��������¼������ť
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//���Ĭ�������˵�
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		//����ɹ��˵�
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_SECCESS_SEARCH);
		//��������¼������ť
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//ʧ���������������¼
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_FAIL_SEARCH);
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//�������������������¼
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_HANDLE_SEARCH);
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		
	}
	/**
	 * ת�Ƽ�¼���� TRANSFER_RECORD
	 * @throws InterruptedException 
	 */
	public void transferRecordSearch() throws InterruptedException {
		//���ת�Ƽ�¼
		super.clickElement(TRANSFER_RECORD);
		//���ת�Ƽ�¼������ť
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
		//ת����������ת�Ƽ�¼  
		//���Ĭ�������˵�
		super.clickElement(TRANSFER_RECORD_DEFALT_ALL);
		//   ���ת��˵�
		Thread.sleep(1000);
		super.clickElement(TRANSFER_RECORD_TO_CHANGE_INTO_SEARCH);
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
		//ת����������ת�Ƽ�¼  
		super.clickElement(TRANSFER_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(TRANSFER_RECORD_TURN_OUT_SEARCH);
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
	}
	
	/**
	 * ��ֵ��¼����
	 * RECHARGE_RECORD
	 * @throws InterruptedException 
	 */
	public void rechargeRecordSearch(String imei,String startTime,String endTime,String account) throws InterruptedException {
		//�����ֵ��¼
		super.clickElement(RECHARGE_RECORD);
		//�����ֵ��¼������ť
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//���꿨��������
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_YEAR_CARD_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//��������������
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_LIFETIME_CARD_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//��imei�Ų�ѯ
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_ALL_SEARCH);
		
		super.operateInputElement(RECHARGE_RECORD_IMEIS_SEARCH, imei);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//��ֵǰ�豸����ʱ�� ����
		super.clickElement(RECHARGE_RECORD_DEFALT_TIME_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_EXPIRATION_TIME_OF_PRE_RECHARGE_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//��ֵ���豸����ʱ�� ���� 
		super.clickElement(RECHARGE_RECORD_DEFALT_TIME_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_EXPIRATION_TIME_AFTER_RECHARGE_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//��ʼʱ������
		super.operateInputElement(RECHARGE_RECORD_START_TIME_SEARCH, startTime);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//����ʱ������
		super.operateInputElement(RECHARGE_RECORD_END_TIME_SEARCH, endTime);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//�����û�����
		super.operateInputElement(RECHARGE_RECORD_SUBORDINATE_USERS_SEARCH, account);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
	}
}
