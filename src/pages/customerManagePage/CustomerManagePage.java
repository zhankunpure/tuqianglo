package pages.customerManagePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

public class CustomerManagePage extends AutomateDriver implements CustomerManagePageInterface {
	
	public BasePage page;

	public CustomerManagePage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
	}
	
	/**
	 * 新增客户
	 * @throws InterruptedException 
	 */
	@Override
	public void newAddCustomer() throws InterruptedException {
		
		super.clickElement(AddCustomer);
		
		super.switch_to_frame(CustomerManageIframe);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
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
		
		// super.operateInputElement(PasswordOfNewAddCustomer, "");
		 super.switch_to_frame("");
		 Thread.sleep(2000);
		 super.clickElement(NewAddCustomerSave);
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
		 
		 if (super.checkboxIsSelector(AgentOfNewAddCustomerTypeLabel+"/div")) {
			
			 super.clickElement(Mechanism);
			 
		} else {
			
			super.clickElement(Agent);
		}
		 
		 super.operateInputElement(CustomerName, "apple");
		 Thread.sleep(2000);
		 super.operateInputElement(AccountOfNewAddCustomer, "newtest");
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
		 System.out.println(super.getText(ConfirmPasswordError).trim());
		 Thread.sleep(2000);
		 super.operateInputElement(ConfirmPasswordInput, "jimi123");
		 Thread.sleep(2000);
		 Select select = super.getSelect(RoleTypesSelect);
		 
		 List<WebElement> elements = select.getOptions();
		 
		 int size = elements.size();
		 Thread.sleep(2000);
		 elements.get(size-1).click();
		 super.switch_to_frame("");
		 super.clickElement(NewAddCustomerSave);
		 
		 System.out.println(super.getText(Dialog));
		 
		 
		 
		 
	}

	
	/**
	 * 批量转移客户
	 */
	@Override
	public void BatchTransCustomer() throws InterruptedException {
		
		super.operateInputElement(SearchAccount, "9527");
		
		super.clickElement(SearchCustomerButton);
		
		super.clickElement(SelectFirstCustomerRecord);
		
		super.clickElement(BatchTransCust);
		
		super.switch_to_frame(CustomerManageIframe);
		
		super.operateInputElement(treeDemo2_cusTreeKey, "测试环境");
		
		super.clickElement(treeDemo2_cusTreeSearchBtn);
		
		super.clickElement(treeDemo2_1_ul_li);
		
		super.switch_to_frame("");
		
		super.clickElement(TransCustomerSave);
		
		System.out.println(super.getText(TransCustomerDialog).trim());
		
		System.out.println(super.getText(NickName).trim());
		
		
	}
	

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

}
