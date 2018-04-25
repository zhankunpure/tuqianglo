package pages.globalSearchPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;


public class GlobalSearchPage extends AutomateDriver{
	
	//public BasePage page;

	public GlobalSearchPage(WebDriver dr) {
		super(dr);
		//page = new BasePage(dr);
	}
	//  /html/body/div[14]/div[2]/iframe
	//iframe[contains(@scrolling,'auto')]
	public static final String GlobalSearchFrame = "x,//iframe[@scrolling=\"auto\"]";
	
	public static final String ImeiOrAccountOrAPPInput = "x,/html/body/div[1]/div[1]/div[1]/div/input";
	
	public static final String DeviceBasicQueryBtn = "x,/html/body/div[1]/div[1]/div[1]/div/div/button";
	
	public static final String AdvancedSearchBtn = "x,/html/body/div[1]/div[1]/div[1]/div/div/div/button";
	
	public static final String UserBasicQueryBtn = "x,/html/body/div[1]/div[1]/div[1]/div/button[1]";
	
	public static final String MobileUserBasicQueryBtn = "x,/html/body/div[1]/div[1]/div[1]/div/button[2]";
	
	public static final String DeviceBasicQueryOrderNumberTr = "complex_device_tbody";
	
	public static final String DeviceBasicQueryPageNumberLi = "complex_paging_device";
	
	public static final String DeviceDetail= "x,//*[@id=\"complex_device_tbody\"]/tr[1]/td[9]/a[1]";
	
	public static final String trajectory= "x,//*[@id=\"complex_device_tbody\"]/tr[1]/td[9]/a[2]";
	
	public static final String Track= "x,//*[@id=\"complex_device_tbody\"]/tr[1]/td[9]/a[3]";
	
	public static final String LookAtTheAlarm= "x,//*[@id=\"complex_device_tbody\"]/tr[1]/td[9]/a[4]";
	
	public static final String DeviceBaseQueryNoData = "x,//*[@id=\"complex_device_table_nodata\"]/div/span/i";
	
	public static final String CloseBaseQuery = "x,/html/body/div[13]/span[1]/a";
	
	/**
	 * 记录的条数
	 * @param selector_ul
	 * @param selector_tr
	 * @return
	 * @throws InterruptedException
	 */
	public int pageNumber(String nodataID,String selector_ul,String selector_tr) throws InterruptedException{
		if(super.isElementExist(nodataID)){
			return 0;
		}else{
			if(this.thirdLastPageNum(selector_ul)<10){
				this.clickLastPage(selector_ul);
				super.explicitWait("//*[@id='"+selector_ul+"']/ul");
				int pageNumber=(this.thirdLastPageNum(selector_ul)-1)*10+this.lastPageListNum(selector_tr);
				return pageNumber;
			}else{
				for(int j=0;j<10000;j++){
					if(this.nextPageStutas(selector_ul).equals("current next")){
						break;
						}else{
							this.clickLastPage(selector_ul);
							Thread.sleep(2000);
							}
					
					super.explicitWait("//*[@id='"+selector_ul+"']/ul");
		}
				int pageNumber=(this.thirdLastPageNum(selector_ul)-1)*10+this.lastPageListNum(selector_tr);
				return pageNumber;
			}
		}

	}
	/**
	 * 获取倒数第三页的页数
	 * @param selector_ul
	 * @return
	 */
	public int thirdLastPageNum(String selector_ul){
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		super.explicitWait("//*[@id='"+selector_ul+"']/ul/li");
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		System.out.println(ThirdLastPageLi.size());
		String ThirdLastPageText=ThirdLastPageLi.get(ThirdLastPageLi.size()-3).getText();
		int i=Integer.parseInt(ThirdLastPageText);
		return i;
	}
	/**
	 * 点击最后一页
	 * @param selector_ul
	 * @return 
	 */
	public void clickLastPage(String selector_ul){
		
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		
		ThirdLastPageLi.get(ThirdLastPageLi.size()-3).click();
		
	}
	/**
	 * 获取最后一页的条数
	 * @param selector_tr
	 * @return
	 */
	public int lastPageListNum(String selector_tr){
		List<WebElement> LastPageListTr=new ArrayList<WebElement>();
		LastPageListTr=super.getElements("x,//*[@id='"+selector_tr+"']/tr");
		int LastPageListNum=LastPageListTr.size();
		return LastPageListNum;
		
	}
	/**
	 * 下一页的按钮状态
	 * @param selector_ul
	 * @return
	 */
	
	public String nextPageStutas(String selector_ul){
		
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		String NextPageClassValue = ThirdLastPageLi.get(ThirdLastPageLi.size()-2).getAttribute("class");
		
		return NextPageClassValue;
		
	}
	
	public void clickDeviceDetail(){
		
		super.clickElement(DeviceDetail);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
