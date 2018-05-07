package pages.customerManagePage;

public interface RoleManagementInterface {
	
	String RoleManagement = "p,��ɫ����";
	//��ɫ����Iframe
	String RoleManagementIframe = "x,//*[@id=\"roleManagement\"]/iframe";
	//������ɫ
	String NewRole = "newRole";
	//ɾ��
	String RemoveRole = "remove";
	//�༭
	String EditRole = "edit";
	//ȫѡ
	String AllSelect = "x,/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	//��ɫ����
	String RoleType = "roleType";
	//��ɫ����
	String RoleName = "roleName";
	//����
	String Remark = "remark";
	//��ɫȨ��
	String RolePermission = "x,//*[@id=\"treeDemo\"]/li";
	
	String CreateRoleEnsure = "p,ȷ��";
	
	String CreateRoleCancel = "p,ȡ��";
	//������ʾ
	String Dialog = "x,/html/body/div[5]/div";
	//������ʾ
	String OperationDialog = "/html/body/div[3]/div";
	
	String SelectedFirstRoleRecord = "x,//*[@id=\"roleTableContent\"]/tbody/tr[1]/td[1]/input";
	
	String Ensure = "p,��";
	
	String Cancel = "p,��";
	
	String EditRoleEnsure = "p,ȷ��";
	
	String EditRoleCancel = "p,ȡ��";

	void createRole() throws InterruptedException;
	
	void removeRole() throws InterruptedException;
	
	void editRole() throws InterruptedException;

}
