package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class PunchTheClockReportPage extends AutomateDriver{

	public PunchTheClockReportPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * 打卡报表
	 */
	public static final String punchTheClockReport = "punchTheClockReport";
	/**
	 * 打卡报表表单 iframe //*[@id="punchTheClockReportFrame"]
	 */
	public static final String punchTheClockReportFrame = "//*[@id=\"punchTheClockReportFrame\"]";

}
