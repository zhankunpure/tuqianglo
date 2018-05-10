package pages.base;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import data.comdata.ComData;

public class BasePage extends AutomateDriver {

	public static final String AdviseNewPwd = "newPwd_advise";

	public static final String AdviseRenewPwd = "renewPwd_advise";

	public static final String SaveNewPwd = "p,����";

	public static final String ModifyPwdSuccess = "p,ȷ��";

	public static final String ModifyPwdSuccessText = "x,/html/body/div[14]/div[2]";

	public static final String LoginErrorDialog = "x,/html/body/div[6]/div";

	public ComData comd = new ComData();

	public BasePage(WebDriver dr) {
		super(dr);

	}

	/**
	 * ��¼
	 * 
	 * @throws InterruptedException
	 */
	public void login() throws InterruptedException {
		super.navigateToPage(comd.baseUrl() + "/");
		super.explicitWait("logins");

		super.deleteCookie();

		super.operateInputElement("account", comd.baseUser()[2]);

		super.operateInputElement("password", comd.baseUser()[3]);

		if (super.checkboxIsSelector("x,//*[@id='checkbox']") == false) {
			super.clickElement("x,//*[@id='checkbox']");
		}

		super.clickElement("logins");

		super.waitForElementToLoad(10, "userCenter");
	}

	/**
	 * ����������¼
	 * 
	 * @param account
	 * @param password
	 * @throws InterruptedException
	 */
	public void resetPwdAfterLogin(String account, String password) throws InterruptedException {

		super.explicitWait("logins");

		super.deleteCookie();

		super.operateInputElement("account", account);

		super.operateInputElement("password", password);

		if (super.checkboxIsSelector("x,//*[@id='checkbox']") == false) {
			super.clickElement("x,//*[@id='checkbox']");
		}

		super.clickElement("logins");

		super.waitForElementToLoad(10, "userCenter");

	}

	/**
	 * �Ѿ���ס�ң���ֻ������¼��ť��ɵ�¼
	 * 
	 * @throws InterruptedException
	 */
	public void clickLoginBtn() throws InterruptedException {

		super.explicitWait("logins");
		super.clickElement("logins");

	}

	/**
	 * �޸����ú������
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public String modifyAdvisePwd() throws InterruptedException {

		super.explicitWait(AdviseNewPwd);

		super.operateInputElement(AdviseNewPwd, "jimi123");
		Thread.sleep(2000);
		super.operateInputElement(AdviseRenewPwd, "jimi123");

		super.clickElement(SaveNewPwd);

		String successText = super.getText(ModifyPwdSuccessText).trim();

		super.clickElement(ModifyPwdSuccess);

		return successText;

	}

	/**
	 * ������ҳ��ҳ��
	 * 
	 * @return
	 */
	public int thirdLastPageNum() {
		String ThirdLastPageNum = "return $('#msg_paging ul').find('li').eq(-3).find('span').text()";
		JavascriptExecutor js = (JavascriptExecutor) dr;
		Object rs = js.executeScript(ThirdLastPageNum);
		int i = Integer.parseInt(String.valueOf(rs));
		System.out.println("ThirdLastPageNum :" + i);
		return i;
	}

	/**
	 * ������һҳ
	 * 
	 * @throws InterruptedException
	 */
	public void clickLastPage() throws InterruptedException {
		String ThirdLastPageClick = "return $('#msg_paging ul').find('li').eq(-3).find('a').click()";
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript(ThirdLastPageClick);

	}

	/**
	 * ���������ҳ����ǩ��״̬
	 * 
	 * @return
	 */
	public String fiveLastPageStatus() {
		String FiveLastPageStatus = "return $('#msg_paging ul').find('li').eq(-5).attr('class)";
		JavascriptExecutor js = (JavascriptExecutor) dr;
		String rs = (String) js.executeScript(FiveLastPageStatus);
		// String i=String.valueOf(rs);
		System.out.println("FiveLastPageStatus :" + rs);
		return rs;

	}

	/**
	 * ���һҳ������
	 * 
	 * @return
	 */
	public int lastPageListNum() {
		String LastPageListNum = "return $('#msg_tbody tr').length";
		JavascriptExecutor js = (JavascriptExecutor) dr;
		Long rs = (Long) js.executeScript(LastPageListNum);
		int i = Integer.parseInt(String.valueOf(rs));
		System.out.println("LastPageListNum:" + i);
		return i;
	}

	/**
	 * ��¼������
	 * 
	 * @param selector_ul
	 * @param selector_tr
	 * @return
	 * @throws InterruptedException
	 */
	public int pageNumber(String selector_ul, String selector_tr) throws InterruptedException {
		if (super.isElementExist("msg_nodata")) {
			return 0;
		} else {
			if (this.thirdLastPageNum1(selector_ul) < 10) {
				this.clickLastPage1(selector_ul);
				// super.explicitWait("//*[@id='"+selector_ul+"']/ul");
				int pageNumber = (this.thirdLastPageNum1(selector_ul) - 1) * 10 + this.lastPageListNum1(selector_tr);
				return pageNumber;
			} else {
				for (int j = 0; j < 10000; j++) {
					if (!this.fiveLastPageStatus().equals("disabled")) {
						break;
					} else {
						this.clickLastPage1(selector_ul);
					}

					// super.explicitWait("//*[@id='"+selector_ul+"']/ul");
				}
				int pageNumber = (this.thirdLastPageNum1(selector_ul) - 1) * 10 + this.lastPageListNum1(selector_tr);
				return pageNumber;
			}
		}

	}

	/**
	 * ��ȡ��������ҳ��ҳ��
	 * 
	 * @param selector_ul
	 * @return
	 */
	public int thirdLastPageNum1(String selector_ul) {
		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();
		ThirdLastPageLi = super.getElements("x,//*[@id='" + selector_ul + "']/ul/li");
		String ThirdLastPageText = ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).getText();
		int i = Integer.parseInt(ThirdLastPageText);
		return i;
	}

	/**
	 * ������һҳ
	 * 
	 * @param selector_ul
	 * @return
	 */
	public int clickLastPage1(String selector_ul) {
		int LastPageNumber = 0;
		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();
		ThirdLastPageLi = super.getElements("x,//*[@id='" + selector_ul + "']/ul/li");
		String NextPageClassValue = ThirdLastPageLi.get(ThirdLastPageLi.size() - 2).getAttribute("class");
		if (NextPageClassValue == "current next") {

			LastPageNumber = Integer.parseInt(ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).getText());

		} else {

			ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).click();
		}
		return LastPageNumber;

	}

	/**
	 * ��ȡ���һҳ������
	 * 
	 * @param selector_tr
	 * @return
	 */
	public int lastPageListNum1(String selector_tr) {
		List<WebElement> LastPageListTr = new ArrayList<WebElement>();
		LastPageListTr = super.getElements("x,//*[@id='" + selector_tr + "']/tr");
		int LastPageListNum = LastPageListTr.size();
		return LastPageListNum;

	}

	/**
	 * ��¼������
	 * 
	 * @param selector_ul
	 * @param selector_tr
	 * @return
	 * @throws InterruptedException
	 */
	public int pageNumber(String nodataID, String selector_ul, String selector_tr) throws InterruptedException {
		if (super.isElementExist(nodataID)) {
			return 0;
		} else {
			if (this.thirdLastPageNum(selector_ul) < 10) {
				this.clickLastPage(selector_ul);

				int pageNumber = (this.thirdLastPageNum(selector_ul) - 1) * 10 + this.lastPageListNum(selector_tr);
				return pageNumber;
			} else {
				for (int j = 0; j < 10000; j++) {
					if (this.nextPageStutas(selector_ul).equals("current next")) {
						break;
					} else {
						this.clickLastPage(selector_ul);
						Thread.sleep(2000);
					}

				}
				int pageNumber = (this.thirdLastPageNum(selector_ul) - 1) * 10 + this.lastPageListNum(selector_tr);
				return pageNumber;
			}
		}

	}

	/**
	 * ��¼������
	 * 
	 * @param selector_ul
	 * @param selector_tr
	 * @return
	 * @throws InterruptedException
	 */
	public int recordNumber(String PageID, String selector_ul, String selector_tr) throws InterruptedException {
		if (!super.isElementExist(PageID)) {
			return 0;
		} else {
			if (this.getThirdLastPageNum(selector_ul) < 10) {
				this.ClickLastPage(selector_ul);
				super.explicitWait(selector_ul);
				int recordNumber = (this.getThirdLastPageNum(selector_ul) - 1) * 10
						+ this.getLastPageListNum(selector_tr);
				return recordNumber;
			} else {
				for (int j = 0; j < 1000; j++) {
					if (this.isZero(selector_ul)) {

						this.ClickLastPage(selector_ul);
						Thread.sleep(2000);

					} else {
						this.ClickLastPage(selector_ul);
						break;
					}

					super.explicitWait(selector_ul);
				}
				
				int recordNumber = (this.getThirdLastPageNum(selector_ul) - 1) * 10
						+ this.getLastPageListNum(selector_tr);
				return recordNumber;
			}
		}

	}

	/**
	 * ��ȡ��������ҳ��ҳ�� "//*[@id='"+selector_ul+"']/ul/li"
	 * 
	 * @param selector_ul
	 * @return
	 */
	public int thirdLastPageNum(String selector_ul) {
		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();
		super.explicitWait("//*[@id='" + selector_ul + "']/ul/li");
		ThirdLastPageLi = super.getElements("x,//*[@id='" + selector_ul + "']/ul/li");
		System.out.println(ThirdLastPageLi.size());
		String ThirdLastPageText = ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).getText();
		int i = Integer.parseInt(ThirdLastPageText);
		return i;
	}

	/**
	 * ��ȡ��������ҳ��ҳ�� selector_ul
	 * 
	 * @param selector_ul
	 * @return
	 */
	public int getThirdLastPageNum(String selector_ul) {
		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();
		super.explicitWait(selector_ul);
		ThirdLastPageLi = super.getElements(selector_ul);
		System.out.println("selector_ul_li��" + ThirdLastPageLi.size());
		String ThirdLastPageText = ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).getText();
		int i = Integer.parseInt(ThirdLastPageText);
		System.out.println("���һҳ��ҳ����" + i);
		return i;
	}

	public Boolean isZero(String selector_ul) {

		String LastPageNum = String.valueOf(this.getThirdLastPageNum(selector_ul));

		String regex = "^[1-9]\\d*0$";

		return Pattern.matches(regex, LastPageNum);
	}

	/**
	 * ������һҳ "x,//*[@id='"+selector_ul+"']/ul/li"
	 * 
	 * @param selector_ul
	 * @return
	 */
	public void clickLastPage(String selector_ul) {

		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();

		ThirdLastPageLi = super.getElements("x,//*[@id='" + selector_ul + "']/ul/li");

		ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).click();

	}

	/**
	 * ������һҳ selector_ul
	 * 
	 * @param selector_ul
	 */
	public void ClickLastPage(String selector_ul) {

		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();

		ThirdLastPageLi = super.getElements(selector_ul);

		ThirdLastPageLi.get(ThirdLastPageLi.size() - 3).click();

	}

	/**
	 * ��ȡ���һҳ������
	 * 
	 * @param selector_tr
	 * @return
	 */
	public int lastPageListNum(String selector_tr) {
		List<WebElement> LastPageListTr = new ArrayList<WebElement>();
		LastPageListTr = super.getElements("x,//*[@id='" + selector_tr + "']/tr");
		int LastPageListNum = LastPageListTr.size();
		return LastPageListNum;

	}

	/**
	 * ��ȡ���һҳ������
	 * 
	 * @param selector_tr
	 * @return
	 */
	public int getLastPageListNum(String selector_tr) {
		List<WebElement> LastPageListTr = new ArrayList<WebElement>();
		LastPageListTr = super.getElements(selector_tr);
		int LastPageListNum = LastPageListTr.size();
		System.out.println("LastPageListNum=" + LastPageListNum);
		return LastPageListNum;

	}

	/**
	 * ѡ�����һҳ���һ����¼
	 * 
	 * @param selector_tr
	 * @throws InterruptedException
	 */
	public void selectLastPageLastRecord(String selector_ul, String selector_tr) throws InterruptedException {

		this.ClickLastPage(selector_ul);

		super.explicitWait(selector_ul);

		int recordNumber = this.getLastPageListNum(selector_tr);

		String LastRecordXpath = selector_tr + "[" + recordNumber + "]/td/input";

		super.clickElement(LastRecordXpath);

	}

	/**
	 * ��һҳ�İ�ť״̬
	 * 
	 * @param selector_ul
	 * @return
	 */

	public String nextPageStutas(String selector_ul) {

		List<WebElement> ThirdLastPageLi = new ArrayList<WebElement>();
		ThirdLastPageLi = super.getElements(selector_ul);

		String NextPageClassValue = ThirdLastPageLi.get(ThirdLastPageLi.size() - 2).getAttribute("class").trim();
		System.out.println("NextPageClassValue=" + NextPageClassValue);
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
			String logout_text = super.getText("c,layui-layer-content");
			System.out.println(logout_text);
			super.clickElement("c,layui-layer-btn0");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
