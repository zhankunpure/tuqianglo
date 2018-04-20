package pages.statisticalReportPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
/**
 * OBD���ϱ���ҳ��
 * @author ZhanKun
 *
 */
public class OBDFailureReportPage extends AutomateDriver{
	
	public StatisticalReportPage srPage;

	public OBDFailureReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * OBD���ϱ���
	 */
	public static final String OBDFailureReport = "obdFailureReport";
	/**
	 * OBD���ϱ����
	 */
	public static final String OBDFailureReportFrame = "obdFailureReportFrame";
	
	
	public static final String OBDFailureReportDateSelect= "x,//*[@id=\"dateSelect_div\"]/div/span[2]";
	
	public static final String OBDFailureReportDateSelectLi= "x,//*[@id=\"dateSelect_div\"]/div/div/ul/li";
	
	public static final String StartTimeInput= "startTime_travel";
	
	public static final String EndTimeInput= "endTime_travel";
	
	public static final String DeviceName = "deviceName";
	
	public static final String ImeiInput_travelReport= "imeiInput_travelReport";
	
	public static final String ImeiSearchBtn= "x,//*[@id=\"MileageFrom\"]/div[1]/div[4]/div/div/div/div[1]/span/button";
	
	public static final String ImeiCheckAll= "x,//*[@id=\"treeModal_travelReport\"]/div[2]/label/div/ins";
	
	public static final String ImeiSearchEnsure= "x,//*[@id=\"treeModal_travelReport\"]/div[2]/div/button[1]";
	
	public static final String ImeiSearchCancel= "x,//*[@id=\"treeModal_travelReport\"]/div[2]/div/button[2]";
	
	public static final String OBDFailureReportSearchBtn= "x,//*[@id=\"MileageFrom\"]/div[1]/div[5]/button";
	
	public static final String OBDFailureReportExport= "Export";
	/**
	 * �ۼ����(KM)
	 */
	public static final String AccumulatedMileage= "accumulatedMileage";
	/**
	 * ƽ���ͺ�(L)
	 */
	public static final String AverageFuelConsumption = "averageFuelConsumption";
	/**
	 * ƽ���ٶ�(KM/H)
	 */
	public static final String AverageSpeed= "averageSpeed";
	/**
	 * ���ͺ�(L)
	 */
	public static final String TotalFuel= "totalFuel";
	/**
	 *OBD��̱����б�
	 */
	public static final String List= "x,/html/body/div[1]/div[2]/div[2]/div[1]/ul/li[1]/a";
	/**
	 * OBD��̱�������ͼ
	 */
	public static final String Diagram= "x,/html/body/div[1]/div[2]/div[2]/div[1]/ul/li[2]/a";
	
	public static final String OBDFailureReportDefaultDropdownToggle= "x,/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/button";
	
	public static final String OBDFailureReportDefaultDropdownToggleLi= "x,/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/ul/li";
	
	public static final String DefaultDropdownToggleLiLabelInput= "label/input";
	
	public static final String ExportBaseInfo= "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div[1]/div/label/div/ins";
	
	public static final String ExportCusInfo= "x,//*[@id=\"exportsModal\"]/div/div[1]/div[2]/div[1]/div/label/div/ins";
	
	public static final String AddTaskBtn= "addTaskBtn";
	//û�������¼!
	public static final String NoTaskRecord= "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div";
	
	public static final String ExportClose= "x,/html/body/div[3]/div[2]/span[1]/a";
	
	public static final String ExportIframe= "x,/html/body/div[3]/div[2]/iframe";
	/**
	 * ������
	 */
	public static final String ExportResize= "x,/html/body/div[3]/div[2]/span[2]";
	
	/**
	 * ��������
	 */
	public static final String no_records_found = "x,//*[@id=\"travelDayTableContent\"]/tbody/tr/td";
	
	/**
	 *OBD��̱����ѯ
	 * @throws InterruptedException 
	 */
	public List<List<String>> obdFailureReportQuery(String imei) throws InterruptedException{
		List<List<String>> OBDFailureData = null;
		String startTime;
		String endTime;
		String accumulatedMileage;
		String averageFuelConsumption;
		String averageSpeed;
		String totalFuel;
		String deviceName;
		Thread.sleep(2000);
		super.clickElement(OBDFailureReportDateSelect);
		
		List<WebElement> elements = super.getElements(OBDFailureReportDateSelectLi);
		System.out.println(elements.size());
		System.out.println(elements);
		for (WebElement element : elements) {
			
			element.click();
			Thread.sleep(2000);
			startTime = super.getElement(StartTimeInput).getAttribute("value");
			
			endTime = super.getElement(EndTimeInput).getAttribute("value");
			
			super.operateInputElement(ImeiInput_travelReport, imei);
			Thread.sleep(2000);
			super.clickElement(ImeiSearchBtn);
			Thread.sleep(2000);
			super.clickElement(ImeiSearchCancel);
			Thread.sleep(2000);
			super.clickElement(OBDFailureReportSearchBtn);
			Thread.sleep(5000);
			
			deviceName = super.getText(DeviceName).trim();
			
			accumulatedMileage = super.getText(AccumulatedMileage).trim();
			
			averageFuelConsumption = super.getText(AverageFuelConsumption).trim();
			
			averageSpeed = super.getText(AverageSpeed).trim();
			
			totalFuel = super.getText(TotalFuel).trim();
			
			List<String> data = new ArrayList<String>();
			
			data.add(startTime);
			
			data.add(endTime);
			
			data.add(deviceName);
			
			data.add(accumulatedMileage);
			
			data.add(averageFuelConsumption);
			
			data.add(averageSpeed);
			
			data.add(totalFuel);
			
			OBDFailureData = new ArrayList<List<String>>();
			
			OBDFailureData.add(data);
			System.out.println(OBDFailureData);
			data.clear();
			System.out.println(data);
			Thread.sleep(2000);
			super.clickElement(Diagram);
			Thread.sleep(2000);
			super.clickElement(List);
			Thread.sleep(2000);
			srPage.selectDropdownToggle(OBDFailureReportDefaultDropdownToggle, OBDFailureReportDefaultDropdownToggleLi);
			Thread.sleep(2000);
			super.clickElement(OBDFailureReportDateSelect);
			Thread.sleep(2000);
		}
		return OBDFailureData;
		
	}
	
	/**
	 * OBD��̱�����
	 * @throws InterruptedException 
	 */
	public void obdFailureReportExport() throws InterruptedException {
		Thread.sleep(2000);
		srPage.intoFrame(ExportIframe);

		super.clickElement(OBDFailureReportExport);
		Thread.sleep(2000);
		super.clickElement(ExportBaseInfo);

		super.clickElement(ExportCusInfo);
		Thread.sleep(2000);
		super.clickElement(AddTaskBtn);
		Thread.sleep(5000);
		if (super.getText(NoTaskRecord).trim().equals("û�������¼!")) {
			srPage.intoFrame("");
			super.clickElement(ExportClose);
		} else {
			// ���Եȴ�
			super.waitForElementToLoad(10, srPage.ExportModalDownloadTask);
			super.clickElement(srPage.ExportModalDownloadTask);
		}
		

	}
	
	public void toOBDFailureReportFrame(){
		
		srPage.intoFrame(OBDFailureReportFrame);
	}

}
