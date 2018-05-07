package pages.customerManagePage;

public interface RoleManagementInterface {
	
	String RoleManagement = "p,角色管理";
	//角色管理Iframe
	String RoleManagementIframe = "x,//*[@id=\"roleManagement\"]/iframe";
	//新增角色
	String NewRole = "newRole";
	//删除
	String RemoveRole = "remove";
	//编辑
	String EditRole = "edit";
	//全选
	String AllSelect = "x,/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	//角色类型
	String RoleType = "roleType";
	//角色名称
	String RoleName = "roleName";
	//描述
	String Remark = "remark";
	//角色权限
	String RolePermission = "x,//*[@id=\"treeDemo\"]/li";
	
	String CreateRoleEnsure = "p,确认";
	
	String CreateRoleCancel = "p,取消";
	//错误提示
	String Dialog = "x,/html/body/div[5]/div";
	//操作提示
	String OperationDialog = "/html/body/div[3]/div";
	
	String SelectedFirstRoleRecord = "x,//*[@id=\"roleTableContent\"]/tbody/tr[1]/td[1]/input";
	
	String Ensure = "p,是";
	
	String Cancel = "p,否";
	
	String EditRoleEnsure = "p,确认";
	
	String EditRoleCancel = "p,取消";

	void createRole() throws InterruptedException;
	
	void removeRole() throws InterruptedException;
	
	void editRole() throws InterruptedException;

}
