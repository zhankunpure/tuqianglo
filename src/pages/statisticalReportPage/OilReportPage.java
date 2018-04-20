package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class OilReportPage extends AutomateDriver{

	public OilReportPage(WebDriver dr) {
		super(dr);
		
	}
	
	/**
	 * �͸б���
	 */
	public static final String oilReport = "oilReport";
	/**
	 * �͸б���� iframe //*[@id="oilReportFrame"]
	 */
	public static final String oilReportFrame = "//*[@id=\"oilReportFrame\"]";

}
