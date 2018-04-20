package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * ͣ������ҳ��
 * @author Administrator
 *
 */
public class StayReportPage extends AutomateDriver{
	
	private StatisticalReportPage srPage;

	public StayReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * ͣ������
	 */
	public static final String stayReport = "stayReport";
	/**
	 * ͣ������ iframe //*[@id="stayReportFrame"]
	 */
	public static final String stayReportFrame = "//*[@id=\"stayReportFrame\"]";
	/**
	 * ͣ�����������˵� 
	 * /html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button
	 */
	public static final String stayReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
	
	public static final String stayReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String stayReportDefaltDateSelect = "x,//*[@id=\"StopCarFrom\"]/div[1]/div[1]/div/div/select";
	
	public static final String stayReportSelectUserBtn ="x,//*[@id=\"StopCarFrom\"]/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String stayReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String stayReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String stayReportImeiInput= "imeiInput_stopCar";
	
	public static final String stayReportImeiSearchBtn= "x,//*[@id=\"StopCarFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String stayReportSearch = "x,//*[@id=\"StopCarFrom\"]/div[2]/div[3]/button";
	
	public static final String stayReportStartTimeInput = "startTime_stopCar";
	
	public static final String stayReportEndTimeInput = "endTime_stopCar";
	
	public static final String stayReportStayAllTimes = "stopCar-alltimes";
	
	public static final String stayReportCheckAll = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/label/div/ins";
	
	public static final String stayReportImeiEnsure = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[1]";
	
	public static final String stayReportImeiCancel = "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[2]";
	
	public static final String stayReportDefaltDateSelectLi = "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	/**
	 * ͣ�������ѯ
	 * @throws InterruptedException 
	 * 
	 */
	public void stayReportCheak() throws InterruptedException {
		
		super.clickElement(stayReportImeiSearchBtn);
		Thread.sleep(2000);
		super.clickElement(stayReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(stayReportImeiEnsure);
		Thread.sleep(2000);
		
		super.clickElement(stayReportDefaltDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(stayReportDefaltDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(stayReportSearch);
				Thread.sleep(2000);
				super.clickElement(stayReportDefaltDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
		
	}
	
	/**
	 * ͣ�����������˵�
	 * @throws InterruptedException 
	 * 
	 */
	public void stayReportDropdownMenu() throws InterruptedException {
		
		srPage.selectDropdownToggle(stayReportDropdownToggle, stayReportDropdownToggleLi);
	}
	/**
	 * ͣ�������ȡ��ͣ��ʱ��
	 * 
	 */
	public String getStayReportStayAlltimes() {
		
		return super.getText(stayReportStayAllTimes);
		
	}
	
	
	
	/**
	 * ͣ��������
	 */
	public void stayReportExport() {

		super.clickElement(srPage.Export);

		super.clickElement(srPage.ExportModalBaseInfoAllSelect);

		super.clickElement(srPage.ExportModalCustomerInfoAllSelect);

		super.clickElement(srPage.ExportModalAddTaskBtn);
		// ���Եȴ�
		super.waitForElementToLoad(10, srPage.ExportModalDownloadTask);
		super.clickElement(srPage.ExportModalDownloadTask);
	}

}
