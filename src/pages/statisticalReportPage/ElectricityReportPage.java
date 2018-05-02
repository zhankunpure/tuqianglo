package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * ����ͳ��ҳ��
 * @author ZhanKun
 *
 */
public class ElectricityReportPage extends AutomateDriver{
	
	public StatisticalReportPage srPage;

	public ElectricityReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * ����ͳ��
	 */
	public static final String ElectricityReport = "electricityReport";
	/**
	 * ����ͳ�Ʊ� iframe //*[@id="electricityReportFrame"]
	 */
	public static final String ElectricityReportFrame = "electricityReportFrame";
	
	public static final String ElectricityReportSelectUserBtn = "x,//*[@id=\"ElectricFrom\"]/div/div[1]/div/div[1]/span/button";

	public static final String ElectricityReportSearchUserInput = "search_user_text";

	public static final String ElectricityReportSearchUserBtn = "search_user_btn";
	
	public static final String ElectricityReportUserSwith = "tree_1_switch";
	
	public static final String ElectricityReportCurSelectedNode = "tree_1_a";
	//�������ڵ���:
	public static final String ElectricityReportElectricity = "x,//*[@id=\"ElectricFrom\"]/div/div[2]/div/span/div/span[2]";
	
	public static final String ElectricityReportElectricityLi = "x,//*[@id=\"ElectricFrom\"]/div/div[2]/div/span/div/div/ul/li";
	
	public static final String ElectricityReportExport= "Export";
	
	public static final String ElectricityReportDeviceType = "x,//*[@id=\"ElectricFrom\"]/div/div[3]/div/div/div/span[2]";
	
	public static final String ElectricityReportDeviceTypeLi = "x,//*[@id=\"ElectricFrom\"]/div/div[3]/div/div/div/div/ul/li";
	
	//�����¼�
	public static final String ElectricityReportLowerCus = "icheckContainSub";
	
	public static final String ElectricityReportSearchBtn= "x,//*[@id=\"ElectricFrom\"]/div/div[5]/button";
	
	public static final String ElectricityReportDefaultDropdownToggle= "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div/div/button";
	
	public static final String ElectricityReportDefaultDropdownToggleLi= "x,/html/body/div/div[2]/div[2]/div[1]/div[1]/div/div/ul/li";
	
	public static final String DefaultDropdownToggleLiLabelInput= "label/input";
	
	public static final String ExportBaseInfo= "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div[1]/div/label/div/ins";
	
	public static final String ExportCusInfo= "x,//*[@id=\"exportsModal\"]/div/div[1]/div[2]/div[1]/div/label/div/ins";
	
	public static final String AddTaskBtn= "addTaskBtn";
	//û�������¼!
	public static final String NoTaskRecord= "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div";
	
	public static final String ExportClose= "x,/html/body/div[3]/div[2]/span[1]/a";
	
	public static final String ExportIframe= "x,/html/body/div[3]/div[2]/iframe";
	
	public static final String NoExportData = "x,//*[@id=\"electricTableContent\"]/tbody/tr/td";
	/**
	 * ����ͳ�Ʋ�ѯ
	 * @throws InterruptedException 
	 */
	public void electricityReportQuery() throws InterruptedException {
		
//		if (super.checkboxIsSelector(ElectricityReportLowerCus)==false) {
			super.clickElement(ElectricityReportLowerCus);
//		}
		super.clickElement(ElectricityReportElectricity);
		Thread.sleep(2000);
		List<WebElement> electricityLis = super.getElements(ElectricityReportElectricityLi);
		
		for (WebElement electricityLi : electricityLis) {
			
			electricityLi.click();
			
			Thread.sleep(2000);
			
			super.clickElement(ElectricityReportDeviceType);
			Thread.sleep(2000);
			List<WebElement> deviceTypeLis = super.getElements(ElectricityReportDeviceTypeLi);
			
			for (WebElement deviceTypeLi : deviceTypeLis) {
				
				deviceTypeLi.click();
				
				Thread.sleep(2000);
				
				super.clickElement(ElectricityReportSearchBtn);
				Thread.sleep(2000);
				srPage.selectDropdownToggle(ElectricityReportDefaultDropdownToggle, ElectricityReportDefaultDropdownToggleLi);
				
				super.clickElement(ElectricityReportDeviceType);
				Thread.sleep(2000);
			}
			Thread.sleep(2000);
			super.clickElement(ElectricityReportElectricity);
			Thread.sleep(2000);
		}
		
	}
	
	/**
	 * OBD��̱�����
	 * @throws InterruptedException 
	 */
	public void ElectricityReportExport() throws InterruptedException {
		Thread.sleep(2000);
		srPage.intoFrame(ExportIframe);

		super.clickElement(ElectricityReportExport);
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
	
	public void toElectricityReportFrame(){
		
		srPage.intoFrame(ElectricityReportFrame);
	}
}
