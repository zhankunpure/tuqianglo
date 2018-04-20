package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class OilReportPage extends AutomateDriver{

	public OilReportPage(WebDriver dr) {
		super(dr);
		
	}
	
	/**
	 * 油感报表
	 */
	public static final String oilReport = "oilReport";
	/**
	 * 油感报表表单 iframe //*[@id="oilReportFrame"]
	 */
	public static final String oilReportFrame = "//*[@id=\"oilReportFrame\"]";

}
