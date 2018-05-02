package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class GuideMachineBroadcastPage extends AutomateDriver{

	public GuideMachineBroadcastPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * 导游播报统计
	 */
	public static final String guideMachineBroadcast = "guideMachineBroadcast";
	/**
	 * 导游播报统计表单 iframe //*[@id="guideMachineBroadcastFrame"]
	 */
	public static final String guideMachineBroadcastFrame = "//*[@id=\"guideMachineBroadcastFrame\"]";

}
