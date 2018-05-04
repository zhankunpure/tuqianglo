package pages.deviceManagePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

public class DeviceManageExpirePage extends AutomateDriver implements DeviceManageExpirePageInterface  {

	public DeviceManageExpirePage(WebDriver dr) {
		super(dr);
	}

	@Override
	public void checkExpirationDevice() throws InterruptedException {
		
		super.clickElement(Expire);
		
		List<WebElement> webElements = super.getElements(ExpireLi);
		
		for (WebElement webElement : webElements) {
			
			webElement.click();
			Thread.sleep(2000);
			super.clickElement(Overdue);
			
			List<WebElement> webElement1s = super.getElements(OverdueLi);
			
			for (WebElement webElement1 : webElement1s) {
				
				webElement1.click();
				Thread.sleep(2000);
				super.clickElement(Cycle);
				
				List<WebElement> webElement2s = super.getElements(CycleLi);	
				
				for (WebElement webElement2 : webElement2s) {
					
					Thread.sleep(2000);
					webElement2.click();
			
					Thread.sleep(2000);
					
					if (super.isElementExist(NoData)) {
						
						System.out.println(super.getText(NoDataText));
						Thread.sleep(2000);
						super.clickElement(Cycle);
						
						continue;
					}
					else if (super.isElementExist(treeDemo_expiration_1_ul) == false && super.isElementExist(TreeDemo_expirationUL)==true) {
						Thread.sleep(2000);
						super.clickElement(treeDemo_expiration_1_switch);
						
					}
					
					List<WebElement> webElement3s = super.getElements(treeDemo_expiration_1_li);
					Thread.sleep(1000);
					int size = webElement3s.size();
					Thread.sleep(2000);
					for (int i = 1; i <= size; i++) {
						Thread.sleep(1000);
						String classValue = super.getElement(treeDemo_expiration_1_li + "[" + i + "]/span").getAttribute("class")
								.trim();
						Thread.sleep(1000);
						if (classValue.equals("button level1 switch noline_close")) {

							super.clickElement(treeDemo_expiration_1_li + "[" + i + "]/span");
							
							super.clickElement(treeDemo_expiration_1_li + "[" + i + "]/a");
							
						}else if(classValue.equals("button level1 switch noline_docu")){
							
							super.clickElement(treeDemo_expiration_1_li + "[" + i + "]/a");
						}
					}
					
					super.clickElement(Cycle);
				}
				
				super.clickElement(Overdue);
			
			}	
			super.clickElement(Expire);
		
		}
	}

}
