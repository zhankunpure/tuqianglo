package pages.statisticalReportPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

public class StaticReportPage extends AutomateDriver{

	public StaticReportPage(WebDriver dr) {
		super(dr);
	}
	
	/**
	 * 状态统计报表
	 */
	public static final String statusReport = "staticReport";
	/**
	 * 状态统计报表iframe 
	 */
	public static final String staticReportFrame = "staticReportFrame";
	
	public static final String statusReportDefaltEquipmentState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/span[2]";
	
	public static final String statusReportAllState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[1]";

	public static final String statusReportTravelState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[2]";

	public static final String statusReportOfflineState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[3]";

	public static final String statusReportStaticState = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[1]/div/div/div/div/ul/li[4]";

	public static final String statusReportSelectUserBtn = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[2]/div/div[1]/span/button";

	public static final String statusReportSearchUserInput = "search_user_text";

	public static final String statusReportSearchUserBtn = "search_user_btn";

	public static final String statusReportImeiTextarea  = "searchIMEI";

	public static final String statusReportSelectType = "mcTypeShow";
	
	public static final String statusReportExportAddTask = "addTaskBtn";
	
	public static final String statusReportExportTaskDownload = "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div[1]/li/div[2]/a";
	
	public static final String statusReportExportBaseInfo = "x,//*[@id=\"exportsModal\"]/div/div[1]/div/div[1]/div/label/div/input";

	public static final String statusReportLowerUser = "x,//*[@id=\"OffLineFrom\"]/div[3]/div[5]/label/div/ins";

	public static final String statusReportSearchBtn= "x,//*[@id=\"OffLineFrom\"]/div[3]/div[6]/button[1]";

	public static final String statusReportDropdownToggle = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/button";
	
	public static final String statusReportDropdownToggleLi = "x,/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li";


}
