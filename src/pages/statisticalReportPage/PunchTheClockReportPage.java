package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class PunchTheClockReportPage extends AutomateDriver{

	public PunchTheClockReportPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * �򿨱���
	 */
	public static final String punchTheClockReport = "punchTheClockReport";
	/**
	 * �򿨱���� iframe //*[@id="punchTheClockReportFrame"]
	 */
	public static final String punchTheClockReportFrame = "//*[@id=\"punchTheClockReportFrame\"]";

}
