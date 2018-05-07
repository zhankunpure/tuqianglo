package pages.customerManagePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

public class RoleManagementPage extends AutomateDriver implements RoleManagementInterface {

	public RoleManagementPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 新增角色
	 */
	@Override
	
	public void createRole() throws InterruptedException {

		super.clickElement(RoleManagement);

		super.switch_to_frame(RoleManagementIframe);

		super.clickElement(NewRole);

		super.clickElement(CreateRoleEnsure);

		System.out.println(super.getText(Dialog));

		List<WebElement> elements = super.getSelect(RoleType).getOptions();

		for (WebElement element : elements) {

			element.click();

			Thread.sleep(2000);

			String text = element.getAttribute("value").trim();
			System.out.println(text);
			Thread.sleep(2000);
			if (text.equals("1") ) {

				super.operateInputElement(RoleName, "newCustomer");
				System.out.println(super.getElement(RoleName).getAttribute("id"));
				Thread.sleep(2000);
			} else if (text.equals("2")) {
				super.operateInputElement(RoleName, "newAdministrators");
				Thread.sleep(2000);
			}
			
			this.rolePermission();

			super.clickElement(CreateRoleEnsure);
			
			System.out.println(super.getText(OperationDialog));
		}

	}

	/**
	 * 删除角色
	 */
	@Override
	public void removeRole() throws InterruptedException {
		
		super.clickElement(RoleManagement);
		
		super.switch_to_frame(RoleManagementIframe);
		
		if (super.checkboxIsSelector(SelectedFirstRoleRecord)==false) {
			
			super.clickElement(SelectedFirstRoleRecord);
		}
		
		super.clickElement(RemoveRole);
		
		super.clickElement(Ensure);
		
		System.out.println(super.getText(OperationDialog));
		
	}	
	/**
	 * 角色权限
	 * @throws InterruptedException
	 */
	public void rolePermission () throws InterruptedException{
		
		/**
		 * 展开第一级
		 */
		List<WebElement> webElements = super.getElements(RolePermission);

		int size = webElements.size();
		System.out.println(size);
		for (int i = 1; i <= size; i++) {

			String classValue = super.getElement(RolePermission + "[" + i + "]/span[1]").getAttribute("class")
					.trim();
			Thread.sleep(1000);

			if (classValue.equals("button level0 switch noline_close")) {

				super.clickElement(RolePermission + "[" + i + "]/span[1]");
				Thread.sleep(1000);

			} else if (classValue.equals("button level0 switch noline_docu")) {

//				if (super.checkboxIsSelector(RolePermission + "[" + i + "]/span[2]")==false) {
//
//					super.clickElement(RolePermission + "[" + i + "]/span[2]");
//
//				}
				continue;
			}
				if (super.isElementExist(RolePermission + "[" + i + "]/ul")) {
					/**
					 * 展开第二级
					 */
					List<WebElement> webElement1s = super.getElements(RolePermission + "[" + i + "]/ul/li");

					int size1 = webElement1s.size();

					for (int j = 1; j <= size1; j++) {

						String classValue1 = super.getElement(
								RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/span[1]").getAttribute("class")
										.trim();
						Thread.sleep(1000);

						if (classValue1.equals("button level1 switch noline_close")) {

							super.clickElement(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/span[1]");
							Thread.sleep(1000);

						} else if (classValue1.equals("button level1 switch noline_docu")) {

//							if (super.checkboxIsSelector(
//									RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/span[2]")==false) {
//								
//								super.clickElement(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/span[2]");
//								System.out.println(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/a/span[2]");
//								
//							}
							continue;
						}

						if (super.isElementExist(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/ul")) {
							/**
							 * 展开第三级
							 */
							List<WebElement> webElement2s = super.getElements(
									RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/ul/li");

							int size2 = webElement2s.size();
							
							System.out.println(size2);
							
							for (int k = 1; k <= size2; k++) {

								String classValue2 = super.getElement(RolePermission + "[" + i + "]/ul/li" + "[" + j
										+ "]/ul/li" + "[" + k + "]/span[1]").getAttribute("class").trim();
								Thread.sleep(1000);
								
								if (classValue2.equals("button level2 switch noline_close")) {

									super.clickElement(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/ul/li"
											+ "[" + k + "]/span[1]");
									
									System.out.println(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/ul/li"
											+ "[" + k + "]/span[1]");
									Thread.sleep(2000);

								} else if (classValue2.equals("button level2 switch noline_docu")) {

//									if (super.checkboxIsSelector(RolePermission + "[" + i + "]/ul/li" + "[" + j
//											+ "]/ul/li" + "[" + k + "]/span[2]")==false) {
//
//										super.clickElement(RolePermission + "[" + i + "]/ul/li" + "[" + j
//												+ "]/ul/li" + "[" + k + "]/span[2]");
//
//										
//									}
									continue;
								}
															//ul/li[5]/ul/li[6]/ul/li/ul
								if (super.isElementExist(RolePermission + "[" + i + "]/ul/li" + "[" + j + "]/ul/li"
										+ "[" + k + "]/ul")) {
									/**
									 * 展开第四级
									 */
									List<WebElement> webElement3s = super.getElements(RolePermission + "[" + i
											+ "]/ul/li" + "[" + j + "]/ul/li" + "[" + k + "]/ul/li");

									int size3 = webElement3s.size();
									System.out.println(size3);
//									for (int l = 1; l <= size3; l++) {
//
//										if (super.checkboxIsSelector(RolePermission + "[" + i + "]/ul/li" + "[" + j
//												+ "]/ul/li" + "[" + k + "]/ul/li" + "[" + l + "]/span[2]")==false)
//
//										{
//
//											super.clickElement(RolePermission + "[" + i + "]/ul/li" + "[" + j
//													+ "]/ul/li" + "[" + k + "]/ul/li" + "[" + l + "]/span[2]");
//
//											
//
//										}
//
//									}

								}

							}

						}
					}
				}
			

		}
		
	}
	/**
	 * 编辑角色
	 */
	@Override
	public void editRole() throws InterruptedException {
		
		super.clickElement(RoleManagement);
		
		super.switch_to_frame(RoleManagementIframe);
		
		super.clickElement(EditRole);
		
		System.out.println(super.getText(OperationDialog));
		
		if (super.checkboxIsSelector(SelectedFirstRoleRecord)==false) {
			
			super.clickElement(SelectedFirstRoleRecord);
		}
		
		super.clickElement(EditRole);
		
		super.operateInputElement(RoleName, "9527");
		
		this.rolePermission();
		
		super.clickElement(EditRoleEnsure);
		
		super.clickElement(Ensure);
	}
	
}
