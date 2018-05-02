package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * �г̱���ҳ��
 * @author Administrator
 *
 */
public class TracelReportPage extends AutomateDriver{
	
	public StatisticalReportPage srPage;

	public TracelReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * �г̱���
	 */
	public static final String tracelReport = "tracelReport";
	/**
	 * �г̱���� iframe //*[@id="tracelReportFrame"]
	 */
	public static final String tracelReportFrame = "tracelReportFrame";
	/**
	 * �г̱��������˵� /html/body/div[1]/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/button
	 */
	public static final String sportOverviewDropdownToggle = "x,/html/body/div[1]/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/button";
	
	public static final String tracelReportDateSelect= "x,//*[@id=\"dateSelect_div\"]/select";
	
	public static final String tracelReportDateSelectLi= "x,/html/body/div[1]/div[2]/div[1]/form/div[1]/div[1]/div/div/div/div/ul/li";
	
	public static final String tracelReportCheckDaySelect= "x,//*[@id=\"TravelFrom\"]/div[1]/div[3]/label[2]/div/ins";
	
	public static final String tracelReportCheckSegmentSelect= "x,//*[@id=\"TravelFrom\"]/div[1]/div[3]/label[3]/div/ins";
	
	public static final String tracelReportSelectUserBtn= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[1]/div/div[1]/span/button";
	
	public static final String tracelReportSearchUserText= "x,//*[@id=\"search_user_text\"]";
	
	public static final String tracelReportSearchUserBtn= "x,//*[@id=\"search_user_btn\"]";
	
	public static final String tracelReportImeiInput= "x,//*[@id=\"imeiInput_travelReport\"]";
	
	public static final String tracelReportSearchBtn= "x,//*[@id=\"TravelFrom\"]/div[2]/div[3]/button";
	
	public static final String tracelReportSearchImeiBtn= "x,//*[@id=\"TravelFrom\"]/div[2]/div[2]/div/div/div/div[1]/span/button";
	
	public static final String allmileageshours = "allmileageshours";
	
	public static final String tracelReportAllmileages= "allmileages";
	
	public static final String tracelReportDayAllmileages= "allmileages-day";
	
	
	public static final String tracelReportAllfuel= "allfuel";
	
	public static final String tracelReportCheckAll= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/label/div/ins";
	
	public static final String tracelReportImeiEnsure= "x,/html/body/div[1]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button[1]";
	
	public static final String tracelReportRecalculateFuelBtn= "recalculateFuelBtn";
	//���¼���
	public static final String tracelReportFuelValue= "fuelvalue";
	
	/**
	 * �����ͳ�Ʒ�ʽ����ѯ��¼
	 * @throws InterruptedException 
	 */
	public void tracelReportMileagesCheak() throws InterruptedException {
		
		super.clickElement(tracelReportSearchImeiBtn);
		Thread.sleep(2000);
		super.clickElement(tracelReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(tracelReportImeiEnsure);
		
		Thread.sleep(2000);
		super.clickElement(tracelReportDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(tracelReportDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(tracelReportSearchBtn);
				Thread.sleep(2000);
				super.clickElement(tracelReportDateSelect);
				Thread.sleep(2000);
			}
			
		}
	}
	
	/**
	 * ����ͳ�Ʒ�ʽ����ѯ��¼
	 * @throws InterruptedException 
	 */
	public void tracelReportDayCheak() throws InterruptedException {
		
		super.clickElement(tracelReportCheckDaySelect);
		Thread.sleep(2000);
		super.clickElement(tracelReportSearchImeiBtn);
		Thread.sleep(2000);
		super.clickElement(tracelReportCheckAll);
		Thread.sleep(2000);
		super.clickElement(tracelReportImeiEnsure);
		Thread.sleep(2000);
		
		super.clickElement(tracelReportDateSelect);
		Thread.sleep(2000);
		List<WebElement> dateLis = super.getElements(tracelReportDateSelectLi);
		
		
		int size = dateLis.size();
		for (int i =0;i<size;i++) {
			if (i ==0) {
				continue;
			} else {
				WebElement dateLi = dateLis.get(i);
				Thread.sleep(2000);
				dateLi.click();
				
				super.clickElement(tracelReportSearchBtn);
				Thread.sleep(2000);
				super.clickElement(tracelReportDateSelect);
				Thread.sleep(2000);
			}
			
		}
		
	}
	
	/**
	 * ��ȡ����ʱ
	 */
	public String getAllMileagesHours(String selector) {

		return super.getText(selector);
	}	
	

	/**
	 * ��ȡ�����
	 * @return
	 */
	public String getAllMileage(String selector) {

		String AllMileage = super.getText(selector).trim();

		return AllMileage;
	}
	/**
	 * ��ȡ���ͺ�
	 */
	
	public String getAllfuel(String selector){
		
		return super.getText(selector);
	}
}

