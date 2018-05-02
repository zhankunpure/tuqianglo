package pages.setUpPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * �澯����ҳ��Ԫ�ض�λ�����뷽�� iframe id:alarmPushSetFrame alarmBasicSetFrame
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
	 * ����澯����ҳ��
	 */
	public void enterAlarmConfigPage() {

		super.floatElement("x,//*[@id='systemSetting']");
		super.clickElement("p,�澯����");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
	}

	// ����澯��������
	public void clickAlarmBasicSet() {

		super.clickElement("alarmBasicSet");
	}

	// ����澯��������
	public void clickAlarmPushSet() {

		super.clickElement("alarmPushSet");
	}

	// ������ŵ绰�澯����
	public void clickvsAlarmSetList() {

		super.clickElement("vsAlarmSetList");
	}

	/**
	 * �澯�������÷���
	 */
	public void alarmBaseSet() {

	}

	/**
	 * ���߸澯ʱ������
	 * 
	 * @param selector
	 * @param value
	 */
	public void offlineAlarmTimeInput(String selector, String value) {

		// super.getElement("offlineAlarmTime").sendKeys(value);
		super.getElement(selector).sendKeys(value);
	}

	/**
	 * ���߸澯ʱ��,ͣ���澯ʱ��,�¼��豸�澯 checkboxѡ�� ���߸澯ʱ��ͬ�����¼�
	 * id��offlineTimeSynchroLowerUserFlag xpath :
	 * "x,//*[@id='offlineTimeSynchroLowerUserFlag']" ͣ���澯ʱ��ͬ�����¼� id
	 * ��stayTimeSynchroLowerUserFlag xpath:
	 * "x,//*[@id='stayTimeSynchroLowerUserFlag']" �¼��豸�澯 id:lowerLevelFlag xpath:
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
	 * ͣ���澯ʱ������
	 * 
	 * @param selector
	 * @param value
	 */
	public void stayAlertTimeInput(String selector, String value) {

		super.getElement(selector).sendKeys(value);
	}

	// ����澯����
	public void saveAlarmSet() {

		super.clickElement("saveBtn");

	}
	//////////////////////////////////
	/////////////// *********************
	///////////////
	////////////// ****************��������*****************
	//////////////////////////////

	/**
	 * �澯����������Ŀ��
	 */
	public int alartPushSetNumber() {

		// *[@id="alarm_appSet_tbody"]/tr[44]/td[3]/label/div/input
		List<WebElement> elements = super.getElements("x,//*[@id='alarm_appSet_tbody']/tr[44]/td[3]/label/div/input");

		int size = elements.size();
		return size;

	}

	/**
	 * �澯��������
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
	 * ȫ�������ʼ�����
	 */
	public void allSetMailSend(String value) {
		// *[@id="alarmEmailModal"]/div/div/ul/li/input
		// *[@id="alarmEmailModal"]/div/div/ul/li[2]/input
		super.clickElement("p,ȫ�������ʼ�����");

		super.getElement("n,emailSet").sendKeys(value);

	}

	// ����ʼ�
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

	// �����ʼ�
	public void reduceSetMail() {
		// *[@id="alarmEmailModal"]/div/div/ul/li[2]/button

		super.clickElement(reduce_path);

	}

	// �����ʼ�
	public void mailModalInput() {

		// *[@id="alarmEmailModal"]/div/div/ul/li/input
		super.getElement(mail_input);

	}

	// �رո澯�ʼ�����ģʽ
	public void closeAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/span[1]/a");
	}

	// ����澯�ʼ�����ģʽ
	public void saveAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/div[3]/a[1]");

	}

	// ȡ���澯�ʼ�����ģʽ
	public void cancelAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer3\"]/div[3]/a[2]");

	}

	// ���������ʼ�
	public void clickSingleSetMail() {

		super.clickElement("x,//*[@id=\"alarm_appSet_tbody\"]/tr[1]/td[4]/a");

	}

	/**
	 * �����������䲢����
	 * 
	 * @param value
	 */
	public void SingleSetMail(String value) {

		super.clickElement("x,//*[@id=\"alarm_appSet_tbody\"]/tr[1]/td[4]/a");

		super.getElement("x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li/input").clear();

		super.getElement("x,//*[@id=\"alarmEmailModal\"]/div/div/ul/li/input").sendKeys(value);

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[1]");
	}

	// �رյ����澯�ʼ�����ģʽ
	public void closeSingleAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/span[1]/a");
	}

	// ���浥���澯�ʼ�����ģʽ
	public void saveSingleAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[1]");

	}

	// ȡ�������澯�ʼ�����ģʽ
	public void canceSinglelAlarmEmailModal() {

		super.clickElement("x,//*[@id=\"layui-layer4\"]/div[3]/a[2]");

	}

	// **
	// *
	// * ���ŵ绰�澯����
	// * �澯�������� id��alarmSetName �澯��ʽ xpath
	// :/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]
	// *ȫ���澯 xpath ��/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[1]
	// �绰�澯 xpath��/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[2]
	// ���Ÿ澯 xpath��/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[3]
	// �澯���� id��alarmTypeNames
	// //*[@id="alarmTypeTable"]/tbody/tr[2]/td[1]/label/div/input
	// ȫѡ id��selectAll ȷ�� id��selBtn ȡ�� id��cnBtn ���� id��qryBtn ��� id��clearBtn
	// �����澯���� :p,�����澯���� iframe id��layui-layer-iframe2 �澯�������� name��alarmSetName
	// xpath��//*[@id="alarmSetForm"]/div[1]/div/input
	// checkbox ȫѡ id��allCheck �澯��Ϣ������
	// xpath��//*[@id="alarmSetForm"]/div[3]/div[1]/input
	// ����豸����� id��key2 ����豸������ť id��deviceTreeSearchBtn Ĭ����
	// ȫѡid��ud_deviceTree_1_check �¼�ѡ�� id��ud_deviceTree_2_check
	// ������ťid��ud_deviceTree_1_switch
	// "p,����" "p,���沢��������" "p,ȡ��" �ر����ø澯 xpath��//*[@id="layui-layer2"]/span[1]/a ul
	// ://*[@id="ud_deviceTree_1_ul"]
	/// html/body/script[8]

	/**
	 * ���ŵ绰�澯����
	 * Ĭ�������澯����
	 */
	public void alarmDefaultSetSearch() {

		super.clickElement("qryBtn");

	}

	// ���
	public void clearInputContent() {

		super.clickElement("clearBtn");
	}

	/**
	 * �������߶����������
	 * ���ŵ绰�澯����
	 * @throws InterruptedException
	 */
	public void alarmSetSearch(String value) throws InterruptedException {

		super.switch_to_frame("x,//*[@id='vsAlarmSetListFrame']");
		// ���ݸ澯�豸��������
		super.getElement("alarmSetName").sendKeys(value);

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// ���ݵ绰�澯��������
		super.clickElement("clearBtn");

		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[2]");

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// ���ݶ��Ÿ澯��������
		super.clickElement("clearBtn");

		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,/html/body/div/div[2]/div[1]/form/div[2]/div/div/div/ul/li[3]");

		super.clickElement("qryBtn");

		Thread.sleep(2000);
		// ���ݸ澯������������
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
		// ������ä������
		super.clickElement("alarmTypeNames");

		super.clickElement("x,//*[@text='������ä������']");

		super.clickElement("selBtn");

		super.clickElement("qryBtn");

		Thread.sleep(2000);

		super.clickElement("clearBtn");
		// �������Χ��
		super.clickElement("alarmTypeNames");

		super.clickElement("x,//*[@text='�������Χ��']");

		super.clickElement("selBtn");

		super.clickElement("qryBtn");

		// �˳�iframe��
		super.switch_to_frame("");
		Thread.sleep(2000);
	}

	/**
	 * �༭�澯����
	 * @param key1
	 * @param key2
	 */
	 
	public void editorAlarmSet(String key1,String key2) {
		//����༭
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[1]");
		//����༭��
		super.switch_to_frame("x,//*[@id='layui-layer-shade3']");
		//�澯���ͣ�Խ��澯
		////*[@id="alarmSetForm"]/div[2]/div/div/ul/li[8]/label/div/ins
		super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[1]/label/div/ins");
		//�澯��Ϣ�����ţ�
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input", key1);
		//����豸�������豸���ƻ���IMEI��
		super.operateInputElement("x,//*[@id=\"key2\"]", key2);
		//�������豸������ť
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_switch\"]");
		//ѡ��Ĭ����ȫѡ
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
		//�������
		super.clickElement("p,����");
		//�˳���
		super.switch_to_frame("");
		//ˢ��
		super.refresh();
		
	}
	
	/**
	 * ���ŵ绰�澯����
	 * �༭����
	 */
	public void editorAlarmReset() {
		//����༭
				super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[1]");
				//����༭��
				super.switch_to_frame("x,//*[@id='layui-layer-shade3']");
				//�澯���ͣ�Խ��澯
				////*[@id="alarmSetForm"]/div[2]/div/div/ul/li[8]/label/div/ins
				super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[1]/label/div/ins");
				//�澯��Ϣ�����ţ�
				super.clearOperateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input");
				//����豸�������豸���ƻ���IMEI��
				super.clearOperateInputElement("x,//*[@id=\"key2\"]");
				//�������豸������ť
				super.clickElement("x,//*[@id=\"ud_deviceTree_1_switch\"]");
				//ѡ��Ĭ����ȫѡ
				super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
				//�������
				super.clickElement("p,����");
				//�˳���
				super.switch_to_frame("");
				//ˢ��
				super.refresh();
		
	}
	
	/**
	 * /html/body/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/a
	 * ɾ���澯����
	 */
	public void deleteAlarmSet() {
		//���ɾ��
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//���ȡ��
		super.clickElement("p,ȡ��");
		//���ɾ��
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//����ر�
		super.clickElement("x,//*[@id=\"layui-layer6\"]/span[1]/a");
		//���ɾ��
		super.clickElement("x,//*[@id=\"alarm_body\"]/tr[1]/td[7]/a[2]");
		//���ȷ��
		super.clickElement("p,ȷ��");
	}
	
	/**
	 * �����澯����
	 * ���沢�������� super.clickElement("p,���沢��������");
	 */
	public void addAlarmSetup(String key1,String key2,String key3) {
		//������ŵ绰�澯���ñ�
		super.switch_to_frame("x,//*[@id=\"vsAlarmSetListFrame\"]");
		//��������澯����
		super.clickElement("p,������������");
		//���������澯���ñ�
		super.switch_to_frame("x,//*[@id=\"layui-layer-iframe1\"]");
		//����澯��������
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[1]/div/input", key1);
		//ѡ��澯����
		super.clickElement("x,//*[@id=\"alarmSetForm\"]/div[2]/div/div/ul/li[7]/label/div/ins");
		//�澯��Ϣ�����ţ��������
		super.operateInputElement("x,//*[@id=\"alarmSetForm\"]/div[3]/div[1]/input", key2);
		//�����豸�Ż���IMEI��       �豸�ţ� NF509-99002  IMEI�ţ�866160035299002
		super.operateInputElement("x,//*[@id=\"key2\"]", " NF509-99002");
		//������ذ�ť
		super.clickElement("x,//*[@id=\"deviceTreeSearchBtn\"]");
		
		super.clearOperateInputElement("x,//*[@id=\"key2\"]");
		//�����豸�Ż���IMEI��       �豸�ţ� NF509-99002  IMEI�ţ�866160035299002
		super.operateInputElement("x,//*[@id=\"key2\"]", " 866160035299002");
		//������ذ�ť
		super.clickElement("x,//*[@id=\"deviceTreeSearchBtn\"]");
		//ѡ���豸
		super.clickElement("x,//*[@id=\"ud_deviceTree_1_check\"]");
		
		super.clickElement("p,����");
		
//		super.clickElement("p,ȡ��");
	}
	
}
