package pages.customerManagePage;

public interface AdministratorManagementInterface {
	
	String AdministratorManagement = "p,管理员管理";
	
	String NewAdministrator = "newRole";
	
	String RemoveAdministrator = "remove";
	
	String EditAdministrator = "edit";
	
	String AllSelect = "x,/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	
	String AdministratorManagementIframe = "x,//*[@id=\"sendUserManager\"]/iframe";
	
	String SelectFirstAdministratorRecord = "x,//*[@id=\"table\"]/tbody/tr[1]/td[1]/input";
	
	String AdministratorRecordTr = "x,//*[@id=\"table\"]/tbody/tr";
	
	String AdministratorRecordLi = "x,//*[@id=\"paging\"]/ul/li";
	
	String Dialog = "x,/html/body/div[3]/div";
	
	String AdministratorAccount = "x,//*[@id=\"newRoleForm\"]/div[1]/div/input";
	
	String AdminstratorName = "x,//*[@id=\"newRoleForm\"]/div[2]/div/input";
	
	String Role = "x,//*[@id=\"newRoleForm\"]/div[3]/div/div/div/span[2]";
	
	String RoleLi = "x,//*[@id=\"newRoleForm\"]/div[3]/div/div/div/div/ul/li";
	
	String Phone = "phone";
	
	String Password = "password";
	
	String ConfirmPassword = "confirmPassword";
	
	String Ensure = "p,确认";
	
	String Cancel = "p,取消";
	
	String YES = "p,是";
	
	String NO = "p,否";
	
	String ErrorDialog = "x,/html/body/div[5]/div";
	
	String AdministratorAccountError = "x,//*[@id=\"newRoleForm\"]/div[1]/div/label";
	
	String AdministratorNameError = "x,//*[@id=\"newRoleForm\"]/div[2]/div/label";
	
	String PasswordError = "x,//*[@id=\"newRoleForm\"]/div[5]/div/label";
	
	String ConfirmPasswordError = "x,//*[@id=\"newRoleForm\"]/div[6]/div/label";
	
	String PageID = "paging";
	
	String newAddAdministrator() throws InterruptedException;
	
	String removeAdministrator() throws InterruptedException;
	
	String editAdministrator() throws InterruptedException;

}
