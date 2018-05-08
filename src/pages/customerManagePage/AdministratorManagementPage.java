package pages.customerManagePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

public class AdministratorManagementPage extends AutomateDriver implements AdministratorManagementInterface{
	
	public BasePage page;
	
	public AdministratorManagementPage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
	}
	
	/**
	 * 新增管理员
	 * @throws InterruptedException 
	 */
	@Override
	public String newAddAdministrator() throws InterruptedException {
		
		super.clickElement(AdministratorManagement);
		
		super.switch_to_frame(AdministratorManagementIframe);
		
		super.clickElement(NewAdministrator);
		
		super.operateInputElement(AdministratorAccount, "newtest2");
		
		super.operateInputElement(AdminstratorName, "newtest2");
		
		super.clickElement(Role);
		
		List<WebElement> webElements = super.getElements(RoleLi);
		
		int size = webElements.size();
		
		webElements.get(size-1).click();
		
		super.operateInputElement(Password, "jimi123");
		
		super.operateInputElement(ConfirmPassword, "jimi123");
		
		super.clickElement(Ensure);
		
		String dialogText = super.getText(Dialog).trim();
		
		return dialogText; 
	}
	/**
	 * 删除管理员
	 */
	@Override
	public String removeAdministrator() throws InterruptedException {
		
		page.selectLastPageLastRecord(AdministratorRecordLi,AdministratorRecordTr);
		
		super.clickElement(RemoveAdministrator);
		
		super.clickElement(YES);
		
		return super.getText(Dialog).trim();
	}
	
	/**
	 * 编辑管理员
	 */
	@Override
	public String editAdministrator() throws InterruptedException {
		
		super.clickElement(AdministratorManagement);
		
		super.switch_to_frame(AdministratorManagementIframe);

		page.selectLastPageLastRecord(AdministratorRecordLi,AdministratorRecordTr);
		
		super.clickElement(EditAdministrator);
		
		super.operateInputElement(AdminstratorName, "editAfter");
		
		super.operateInputElement(Phone, "18686868866");
		
		super.clickElement(Ensure);
		
		return super.getText(Dialog);
	}

}
