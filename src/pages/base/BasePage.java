package pages.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import data.comdata.ComData;

public class BasePage extends AutomateDriver {
	
	public ComData comd=new ComData();
	
	public BasePage(WebDriver dr) {
		super(dr);
		
	}
	/**
	 * ��¼
	 */
	public void login(){
		super.navigateToPage(comd.baseUrl()+"/");
		super.explicitWait("//*[@id='logins']");
		
		super.deleteCookie();
		
		super.operateInputElement("account", comd.baseUser()[2]);
		
		super.operateInputElement("password", comd.baseUser()[3]);
		
		if(super.checkboxIsSelector("x,//*[@id='checkbox']")==false) {
			super.clickElement("x,//*[@id='checkbox']");
		}
		
		super.clickElement("logins");
		
		super.waitForElementToLoad(10, "userCenter");
	}
	/**
	 * �����¼��ť
	 */
	public void clickLoginBtn() {
		
		super.clickElement("logins");
		
		super.waitForElementToLoad(10, "//*[@id=\"userCenter\"]/a");
	}
	
	/**
	 * ������ҳ��ҳ��
	 * @return
	 */
	public int thirdLastPageNum(){
		String ThirdLastPageNum="return $('#msg_paging ul').find('li').eq(-3).find('span').text()";
		JavascriptExecutor js=(JavascriptExecutor)dr;
		Object rs=js.executeScript(ThirdLastPageNum);
		int i=Integer.parseInt(String.valueOf(rs));
		System.out.println("ThirdLastPageNum :"+i);
		return i;
	}
	/**
	 * ������һҳ
	 * @throws InterruptedException
	 */
	public void clickLastPage() throws InterruptedException{
		String ThirdLastPageClick="return $('#msg_paging ul').find('li').eq(-3).find('a').click()";
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript(ThirdLastPageClick);
	
	}
	/**
	 * ���������ҳ����ǩ��״̬
	 * @return
	 */
	public String fiveLastPageStatus(){
		String FiveLastPageStatus="return $('#msg_paging ul').find('li').eq(-5).attr('class)";
		JavascriptExecutor js=(JavascriptExecutor)dr;
		String rs=(String)js.executeScript(FiveLastPageStatus);
		//String i=String.valueOf(rs);
		System.out.println("FiveLastPageStatus :"+rs);
		return rs;
		
	}
	/**
	 * ���һҳ������
	 * @return
	 */
	public int lastPageListNum(){
		String LastPageListNum="return $('#msg_tbody tr').length";
		JavascriptExecutor js=(JavascriptExecutor)dr;
		Long rs=(Long)js.executeScript(LastPageListNum);
		int i=Integer.parseInt(String.valueOf(rs));
		System.out.println("LastPageListNum:"+i);
		return i;
	}
	/**
	 * ��¼������
	 * @param selector_ul
	 * @param selector_tr
	 * @return
	 * @throws InterruptedException
	 */
	public int pageNumber(String selector_ul,String selector_tr) throws InterruptedException{
		if(super.isElementExist("msg_nodata")){
			return 0;
		}else{
			if(this.thirdLastPageNum1(selector_ul)<10){
				this.clickLastPage1(selector_ul);
				super.explicitWait("//*[@id='"+selector_ul+"']/ul");
				int pageNumber=(this.thirdLastPageNum1(selector_ul)-1)*10+this.lastPageListNum1(selector_tr);
				return pageNumber;
			}else{
				for(int j=0;j<10000;j++){
					if(!this.fiveLastPageStatus().equals("disabled")){
						break;
						}else{
							this.clickLastPage1(selector_ul);
							}
					
					super.explicitWait("//*[@id='"+selector_ul+"']/ul");
		}
				int pageNumber=(this.thirdLastPageNum1(selector_ul)-1)*10+this.lastPageListNum1(selector_tr);
				return pageNumber;
			}
		}

	}
	/**
	 * ��ȡ��������ҳ��ҳ��
	 * @param selector_ul
	 * @return
	 */
	public int thirdLastPageNum1(String selector_ul){
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		String ThirdLastPageText=ThirdLastPageLi.get(ThirdLastPageLi.size()-3).getText();
		int i=Integer.parseInt(ThirdLastPageText);
		return i;
	}
	/**
	 * ������һҳ
	 * @param selector_ul
	 * @return 
	 */
	public int clickLastPage1(String selector_ul){
		int LastPageNumber = 0;
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		String NextPageClassValue = ThirdLastPageLi.get(ThirdLastPageLi.size()-2).getAttribute("class");
		if (NextPageClassValue=="current next") {
			
			LastPageNumber = Integer.parseInt(ThirdLastPageLi.get(ThirdLastPageLi.size()-3).getText());
			

		} else {
			
			ThirdLastPageLi.get(ThirdLastPageLi.size()-3).click();
		}
		return LastPageNumber;
		
		
	}
	/**
	 * ��ȡ���һҳ������
	 * @param selector_tr
	 * @return
	 */
	public int lastPageListNum1(String selector_tr){
		List<WebElement> LastPageListTr=new ArrayList<WebElement>();
		LastPageListTr=super.getElements("x,//*[@id='"+selector_tr+"']/tr");
		int LastPageListNum=LastPageListTr.size();
		return LastPageListNum;
		
	}
	
	/**
	 * ��¼������
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
	 * ��ȡ��������ҳ��ҳ��
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
	 * ������һҳ
	 * @param selector_ul
	 * @return 
	 */
	public void clickLastPage(String selector_ul){
		
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		
		ThirdLastPageLi.get(ThirdLastPageLi.size()-3).click();
		
	}
	/**
	 * ��ȡ���һҳ������
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
	 * ��һҳ�İ�ť״̬
	 * @param selector_ul
	 * @return
	 */
	
	public String nextPageStutas(String selector_ul){
		
		List<WebElement> ThirdLastPageLi=new ArrayList<WebElement>();
		ThirdLastPageLi=super.getElements("x,//*[@id='"+selector_ul+"']/ul/li");
		String NextPageClassValue = ThirdLastPageLi.get(ThirdLastPageLi.size()-2).getAttribute("class");
		
		return NextPageClassValue;
		
	}

	/**
	 * �˳�ϵͳ
	 */
	public void logout() {
		
		super.floatElement("x,//*[@id='userCenter']");
    	try {
			Thread.sleep(2000);
			super.clickElement("p,�˳�ϵͳ");
	    	Thread.sleep(1000);
	    	String logout_text=super.getText("c,layui-layer-content");
	    	System.out.println(logout_text);
	    	super.clickElement("c,layui-layer-btn0");
	    	Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		
	}
}
