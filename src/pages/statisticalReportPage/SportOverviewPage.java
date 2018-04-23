package pages.statisticalReportPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * �˶�����ҳ��
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
	 * �˶�����
	 */
	public static final String sportOverview = "sportOverview";
	/**
	 * �˶������� iframe //*[@id="sportOverviewFrame"]
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
	 * �˶�����������ťԪ��
	 */
	public static final String sportOverviewSearchBtn = "x,//*[@id=\"runForm\"]/div[4]/button";
	/**
	 * �˶����������˵� 
	 * /html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button
	 */
	public static final String tracelReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	/**
	 * ��̱��������˵�ѡ��
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li
	 */
	public static final String mileageReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	/**
	 * ��̱��������˵�ѡ��
	 * /html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li
	 */
	public static final String dropdown_toggle_li = "x,/html/body/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li";
	
	/**
	 * ����
	 * //*[@id="Export"]
	 */
	public static final String Export = "Export";
	/**
	 * ����ģ�� ������Ϣȫѡ //*[@id="exportsModal"]/div/div[1]/div[1]/div/label/div/ins
	 * 
	 */
	public static final String ExportModalBaseInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div/label/div/ins";
	/**
	 * ����ģ�� �ͻ���Ϣȫѡ //*[@id="exportsModal"]/div/div[2]/div[1]/div/label/div/ins
	 */
	public static final String ExportModalCustomerInfoAllSelect = "x,//*[@id=\"exportsModal\"]/div/div[2]/div[1]/div/label/div/ins";
	/**
	 * ��������
	 */
	public static final String ExportModalAddTaskBtn = "addTaskBtn";
	/**
	 * ��������
	 * 
	 */
	public static final String ExportModalDownloadTask = "x,//*[@id=\"taskList\"]/div[1]/ul/li[1]/a";
	/**
	 * �����
	 */
	public static final String sportOverviewAllMileage = "allmileage";
	/**
	 * �ܳ��ٴ���
	 */
	public static final String sportOverviewAlloverSpeedTimes = "alloverSpeedTimes";
	/**
	 * ��ͣ������
	 */
	public static final String sportOverviewAllstopTimes = "allstopTimes";
	
	/**
	 * �˶���������
	 */
	public void sportOverviewExport() {

		super.clickElement(Export);

		super.clickElement(ExportModalBaseInfoAllSelect);

		super.clickElement(ExportModalCustomerInfoAllSelect);

		super.clickElement(ExportModalAddTaskBtn);
		// ���Եȴ�
		super.waitForElementToLoad(10, ExportModalDownloadTask);
		super.clickElement(ExportModalDownloadTask);
		
	}
	
	/**
	 * �˶�������ѯ
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
	 * ��ȡ�˶������ܳ��ٴ���
	 * @return
	 */
	public String getSpoerOverviewAlloverSpeedTimes() {

		return super.getText(sportOverviewAlloverSpeedTimes).trim();
	}
	/**
	 * ��ȡ�˶�������ͣ������
	 * @return
	 */
	public String getSpoerOverviewAllstopTimes() {

		return super.getText(sportOverviewAllstopTimes).trim();
	}
	
	/**
	 * ��ȡ�����
	 * @return
	 */
	public String getAllMileage(String selector) {

		return super.getText(selector).trim();
	}
	
	

}
