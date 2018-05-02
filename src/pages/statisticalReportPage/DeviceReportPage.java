package pages.statisticalReportPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * 设备总览页面
 * @author Administrator
 *
 */
public class DeviceReportPage extends AutomateDriver{
	
	private StatisticalReportPage srPage;

	public DeviceReportPage(WebDriver dr) {
		super(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	/**
	 * 设备总览
	 */
	public static final String deviceReport = "deviceReport";
	/**
	 * 设备总览表单 iframe //*[@id=\"deviceReportFrame\"]
	 */
	public static final String deviceReportFrame = "//*[@id=\"deviceReportFrame\"]";
	
	public static final String deviceReportSelectUserBtn = "x,/html/body/div/div[2]/div[1]/form/div/div/div/div[1]/span/button";

	public static final String deviceReportSearchUserInput = "search_user_text";

	public static final String deviceReportSearchUserBtn = "search_user_btn";
	
	public static final String deviceReportUserSwith = "tree_1_switch";
	
	public static final String deviceReportCurSelectedNode = "tree_1_a";
	
	public static final String deviceReportLowerCustom = "x,//*[@id=\"deviceOverview\"]/div[1]/div[2]/div[1]/label/div/ins";
	
	public static final String deviceReportNewActiveChartLowerCus = "x,//*[@id=\"newActiveChart\"]/div/div[1]/label/div/ins";
	
	public static final String deviceReportRadioYear = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/label[1]/div/ins";
	
	public static final String deviceReportRadioMonth = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/label[2]/div/ins";
	
	public static final String deviceReportNewActiveChartDate = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/span/div/span[2]";
	
	public static final String deviceReportNewActiveChartDateLi = "x,//*[@id=\"newActiveChart\"]/div/div[1]/div/span/div/div/ul/li";

	/**
	 * 设备总览更改查看激活数日期
	 * @throws InterruptedException 
	 */
	public void deviceReportChangeNewActiveChartDate() throws InterruptedException {
		
		super.clickElement(deviceReportNewActiveChartDate);
		
		List<WebElement> elements = super.getElements(deviceReportNewActiveChartDateLi);
		
		for (WebElement element : elements) {
			element.click();
			Thread.sleep(2000);
			super.clickElement(deviceReportNewActiveChartDate);
		}
	}
	
	/**
	 * 设备总览显示
	 * @throws InterruptedException 
	 */
	public void deviceReportCheck() throws InterruptedException {
		
		super.clickElement(deviceReportLowerCustom);
		
		super.clickElement(deviceReportNewActiveChartLowerCus);
		
		srPage.checkRadio(deviceReportRadioYear, deviceReportRadioMonth);
		
		this.deviceReportChangeNewActiveChartDate();
		
		Thread.sleep(2000);
	}
	
}
