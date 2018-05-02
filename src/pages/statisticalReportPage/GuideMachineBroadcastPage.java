package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class GuideMachineBroadcastPage extends AutomateDriver{

	public GuideMachineBroadcastPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * ���β���ͳ��
	 */
	public static final String guideMachineBroadcast = "guideMachineBroadcast";
	/**
	 * ���β���ͳ�Ʊ� iframe //*[@id="guideMachineBroadcastFrame"]
	 */
	public static final String guideMachineBroadcastFrame = "//*[@id=\"guideMachineBroadcastFrame\"]";

}
