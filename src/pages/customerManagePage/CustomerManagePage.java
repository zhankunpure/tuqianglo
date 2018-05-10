package pages.customerManagePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automatedriver.AutomateDriver;
import pages.accountcenterPage.AccountCenterNaviBarPage;
import pages.base.BasePage;

public class CustomerManagePage extends AutomateDriver implements CustomerManagePageInterface {
	
	public BasePage page;
	
	public AccountCenterNaviBarPage nbPage;

	public CustomerManagePage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
		nbPage = new AccountCenterNaviBarPage(dr);
	}
	
	/**
	 * 新增客户
	 * @throws InterruptedException 
	 */
	@Override
	public void newAddCustomer() throws InterruptedException {
		
		super.clickElement(AddCustomer);
		
		super.switch_to_frame(CustomerManageIframe);
		
		//String text = super.getElement(CusSearchDiv).getAttribute("class").trim();
		//super.waitForElementToLoad(10, treeDemo2_cusTreeKey);
		//super.operateInputElement(treeDemo2_cusTreeKey, "jimitest");
		
//		if (text.equals("autocompleter autocompleter-closed")) {
//			
//			super.operateInputElement(treeDemo2_cusTreeKey, "jimitest");
//			
//		}
		// super.clickElement(treeDemo2_cusTreeSearchBtn);
		 
		// super.clickElement(CusSearchLi);
		 Thread.sleep(2000);
		
		 super.operateInputElement(PasswordOfNewAddCustomer, "");
		 Thread.sleep(2000);
		 
		 super.switch_to_frame("");
		 Thread.sleep(2000);
		 super.clickElement(Save);
		 
		 super.explicitWait(CustomerManageIframe);
		 super.switch_to_frame(CustomerManageIframe);
		 Thread.sleep(2000);
		 System.out.println(super.getText(NickNameError).trim());
		 Thread.sleep(2000);
		 System.out.println(super.getText(AccountError).trim());
		 Thread.sleep(2000);
		 System.out.println(super.getText(PasswordError).trim());
		 Thread.sleep(2000);
		 if (super.isElementExist(ConfirmPasswordDiv)) {
			
			 System.out.println(super.getText(ConfirmPasswordError).trim());
		}
		 Thread.sleep(2000);
		 
		 if (super.checkboxIsSelector(AgentOfNewAddCustomerTypeLabel+"/div/input")) {
			
			 super.clickElement(Mechanism);
			 
		} else if (super.checkboxIsSelector(MechanismOfNewAddCustomerTypeLabel+"/div/input")) {
			
			super.clickElement(Agent);
		}
		 
		 super.operateInputElement(CustomerName, "9527");
		 Thread.sleep(2000);
		 super.operateInputElement(AccountOfNewAddCustomer, "apple");
		 Thread.sleep(2000);
		 super.operateInputElement(PasswordOfNewAddCustomer, "jimidf");
		 Thread.sleep(2000);
		 System.out.println(super.getText(PasswordError).trim());
		 Thread.sleep(2000);
		 super.operateInputElement(PasswordOfNewAddCustomer, "123456");
		 Thread.sleep(2000);
		 System.out.println(super.getText(PasswordError).trim());
		 Thread.sleep(2000);
		 super.operateInputElement(PasswordOfNewAddCustomer, "jimi1");
		 Thread.sleep(2000);
		 System.out.println(super.getText(PasswordError).trim());
		 Thread.sleep(2000);
		 super.operateInputElement(PasswordOfNewAddCustomer, "jimi123");
		 Thread.sleep(2000);
		 super.operateInputElement(ConfirmPasswordInput, "jimi121");

		 Thread.sleep(2000);
		 Select select = super.getSelect(RoleTypesSelect);
		 
		 List<WebElement> elements = select.getOptions();
		 
		 int size = elements.size();
		 Thread.sleep(2000);
		 elements.get(size-1).click();
		 super.switch_to_frame("");
		 super.clickElement(Save);
		 
		 super.explicitWait(CustomerManageIframe);
		 super.switch_to_frame(CustomerManageIframe);
		 Thread.sleep(2000);
		 System.out.println(super.getText(ConfirmPasswordError).trim());
		 Thread.sleep(2000);
		 super.operateInputElement(ConfirmPasswordInput, "jimi123");
		 
		 super.switch_to_frame("");
		 Thread.sleep(2000);
		 super.clickElement(Save);
		 
		 System.out.println(super.getText(NewAddCustomerDialog));
		 
		 
	}

	
	/**
	 * 批量转移客户
	 */
	@Override
	public void batchTransCustomer() throws InterruptedException {
		
		super.operateInputElement(SearchAccount, "9527");
		
		super.clickElement(SearchCustomerButton);
		
		super.clickElement(SelectFirstCustomerRecord);
		
		super.clickElement(BatchTransCust);
		
		super.switch_to_frame(CustomerManageIframe);
		
//		super.explicitWait(treeDemo2_cusTreeKey);
//		super.operateInputElement(treeDemo2_cusTreeKey, "测试环境");
//		
//		super.clickElement(treeDemo2_cusTreeSearchBtn);
//		
//		super.clickElement(treeDemo2_1_ul_li);
		super.explicitWait(treeDemo2_11_span);
		super.clickElement(treeDemo2_11_span);
		
		super.switch_to_frame("");
		
		super.clickElement(Save);
		
		System.out.println(super.getText(TransCustomerDialog).trim());
		Thread.sleep(2000);
		System.out.println(super.getText(NickName).trim());
		Thread.sleep(2000);
		
		super.clickElement(TransCust);
		
		super.explicitWait(TransCustomerIframe);
		super.switch_to_frame(TransCustomerIframe);
		
		super.explicitWait(treeDemo2_1_span);
		super.clickElement(treeDemo2_1_span);
		
		super.switch_to_frame("");
		
		super.clickElement(Save);
		
		System.out.println(super.getText(TransCustomerDialog).trim());
		Thread.sleep(2000);
		System.out.println(super.getText(NickName).trim());
		Thread.sleep(2000);
	}
	
	/**
	 * 客户记录查询
	 * @return
	 * @throws InterruptedException
	 */
	public List<Integer> customerRecordQuery() throws InterruptedException {
		
		List<Integer> recordNumbers = new ArrayList<Integer>();
		
		super.clickElement(CustomerType);
		
		List<WebElement> elements = super.getElements(CustomerTypeLi);
		
		for (WebElement webElement : elements) {
			
			webElement.click();
			
			Thread.sleep(2000);
			
			super.clickElement(SearchCustomerButton);
			
			Thread.sleep(2000);
			
			int recordNumber = page.recordNumber(PageDivID, CustomerRecordLi, CustomerRecordTr);
			
			System.out.println(page.recordNumber(PageDivID, CustomerRecordLi, CustomerRecordTr));
			
			recordNumbers.add(recordNumber);
			
			Thread.sleep(2000);
			
			super.clickElement(CustomerType);
			
		}
		
		super.operateInputElement(SearchAccount, "9527");
		
		super.clickElement(CustomerType);
		
		List<WebElement> element1s = super.getElements(CustomerTypeLi);
		
		for (WebElement webElement : element1s) {
			
			webElement.click();
			
			Thread.sleep(2000);
			
			super.clickElement(SearchCustomerButton);
			
			Thread.sleep(2000);
			
			int recordNumber = page.recordNumber(PageDivID, CustomerRecordLi, CustomerRecordTr);
			
			recordNumbers.add(recordNumber);
			
			System.out.println(page.recordNumber(PageDivID, CustomerRecordLi, CustomerRecordTr));
			
			Thread.sleep(2000);
			
			super.clickElement(CustomerType);
			
			
		}
		return recordNumbers;
		
		
	}
	
	/**
	 * 删除客户
	 * @throws InterruptedException
	 */
	public void removeCustomer() throws InterruptedException{
		
		super.operateInputElement(SearchAccount, "9527");
		Thread.sleep(2000);
		super.clickElement(SearchCustomerButton);
		
		super.clickElement(Delete);
		
		super.clickElement(DeleteEnsure);
		
		System.out.println(super.getText(TransCustomerDialog).trim());
		
		
	}
	
	/**
	 * 重置密码
	 * @throws InterruptedException 
	 */
	public void resetPassword() throws InterruptedException{
		
		super.operateInputElement(SearchAccount, "9527");
		Thread.sleep(2000);
		super.clickElement(SearchCustomerButton);
		
		super.clickElement(ResetPassword);
		
		super.clickElement(ResetPasswordEnsure);
		
		System.out.println(super.getText(ResetPasswordDialog).trim());
		
		Thread.sleep(2000);
		page.logout();
		
		page.resetPwdAfterLogin("apple", "888888");
		
		System.out.println(page.modifyAdvisePwd());
		
		Thread.sleep(2000);
		page.resetPwdAfterLogin("apple", "jimi123");
		
		System.out.println(nbPage.getUserAccount());
		
	}
	
	/**
	 * 前往控制台
	 * @return
	 * @throws InterruptedException
	 */
	public String toConsole() throws InterruptedException{
		
		super.operateInputElement(SearchAccount, "9527");
		Thread.sleep(2000);
		super.clickElement(SearchCustomerButton);
		
		String handle = super.getCurrentWindowHandle();
		
		super.clickElement(Console);
		
		super.switchToWindow(handle);
		
		String url = super.getCurrentUrl();
		Thread.sleep(2000);
		return url;
		
	}
	
	/**
	 * 编辑客户
	 * @return 
	 */
	@Override
	public String editCustomer() throws InterruptedException {
		
		super.operateInputElement(SearchAccount, "9527");
		Thread.sleep(2000);
		super.clickElement(SearchCustomerButton);
		
		super.clickElement(Edit);
		
		super.switch_to_frame(CustomerManageIframe);
		Thread.sleep(2000);
		super.operateInputElement(PhoneOfEditCustomer, "18686868866");
		Thread.sleep(2000);
		super.operateInputElement(Email, "123456@qq.com");
		Thread.sleep(2000);
		super.operateInputElement(Contact, "唐老鸭");
		Thread.sleep(2000);
		super.operateInputElement(CompanyName, "迪士尼");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		
		super.clickElement(Save);
		
		return super.getText(EditCustomerDialog);
	}
	
	/**
	 * 点击客户树
	 * @throws InterruptedException
	 */
	public void clickCustomerTree() throws InterruptedException{
		
		if (super.isElementExist(treeDemo_1_ul)==false) {
			
			super.clickElement(treeDemo_1_switch);
		}
		List<WebElement> elements = super.getElements(treeDemo_1_ul_li);
		
		int size = elements.size();
		
		for (int i = 1; i <=size; i++) {
			
			super.clickElement(treeDemo_1_ul_li+"["+i+"]/a");
			
			System.out.println(page.recordNumber(PageDivID, CustomerRecordLi, CustomerRecordTr));
			
			Thread.sleep(2000);
		}
		
		
	}

}
