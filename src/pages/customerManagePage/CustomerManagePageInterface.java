package pages.customerManagePage;

public interface CustomerManagePageInterface {
	
	String CustomerManage = "p,客户管理";
	
	String NickName = "user_account";
	
	String Account = "userAccount";
	
	String UserType = "userType";
	
	String Phone = "user_phone";
	
	String MonitorUser = "monitorUser";
	
	String EditUserFast = "editUserFast";
	
	String CustomerNameInput = "treeDemo_cusTreeKey";
	
	String SearchAccount = "searchaccount";
	
	String CustomerType = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/span[2]";
	
	String CustomerTypeLi = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/ul/li";
	
	String SearchCustomerButton = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[3]/button";
	
	String AddCustomer = "AddCustomer";
	/**
	 * 批量转移
	 */
	String BatchTransCust = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/button[2]";
	
	String DropdownToggle = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div/button";
	
	String DropdownToggleLi = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div/ul/li";
	
	String treeDemo_cusTreeSearchBtn = "treeDemo_cusTreeSearchBtn";
	
	String treeDemo_1_switch = "treeDemo_1_switch";
	
	String treeDemo_1  = "treeDemo_1";
	
	String treeDemo_1_a = "treeDemo_1_a";
	
	String treeDemo_1_ul = "treeDemo_1_ul";
	
	String treeDemo_1_ul_li = "x,//*[@id=\"treeDemo_1_ul\"]/li";
	
	/**
	 * 代理商
	 */
	String Agent = "x,//*[@id=\"labelDistributor\"]/div/ins";
	/**
	 * 机构
	 */
	String Mechanism = "x,//*[@id=\"labelUser1\"]/div/ins";
	/**
	 * 客户名称
	 */
	String CustomerName = "nickName";
	/**
	 * 用户名和账户输入框
	 */
	String treeDemo_cusTreeKey = "treeDemo_cusTreeKey";
	/**
	 * 客户类型  AgentLabel
	 */
	String AgentOfNewAddCustomerTypeLabel = "x,//*[@id=\"labelDistributor\"]";
	/**
	 * 客户类型 MechanismLabel
	 */
	String MechanismOfNewAddCustomerTypeLabel = "x,//*[@id=\"labelUser1\"]";
	/**
	 * 客户账号
	 */
	String AccountOfNewAddCustomer = "account";
	
	String PasswordOfNewAddCustomer = "password";
	
	String ConfirmPasswordDiv = "markPswAgain";
	
	String ConfirmPasswordInput = "pswAgain";
	
	String ConfirmPasswordError = "x,//*[@id=\"markPswAgain\"]/div/label";
	/**
	 * 新增客户 用户名和账户输入框
	 */
	//String treeDemo2_cusTreeKey = "x,/html/body/div/div/form/div/div/div[1]/input";
	String treeDemo2_cusTreeKey = "treeDemo2_cusTreeKey";
	
	//String treeDemo2_cusTreeSearchBtn = "x,/html/body/div/div/form/div/div/div[1]/i";
	String treeDemo2_cusTreeSearchBtn = "treeDemo2_cusTreeSearchBtn";
	
	String CusSearchDiv = "x,//*[@id=\"treeRoleBox\"]/div[1]/div";
	
	String CusSearchLi = "x,/html/body/div/div/form/div/div/div[1]/div/ul/li[1]";
	//String CusSearchLi = "x,//*[@id=\"treeRoleBox\"]/div[1]/div/ul/li[1]";
	
	String treeDemo2_1_ul = "treeDemo2_1_ul";
	
	String treeDemo2_1_switch = "treeDemo2_1_switch";
	
	String treeDemo2_1_ul_li = "x,//*[@id=\"treeDemo2_1_ul\"]/li";
	
	String treeDemo2_1_a = "treeDemo2_1_a";
	
	String treeDemo2_1_span = "treeDemo2_1_span";
	
	String treeDemo2_11_span = "treeDemo2_11_span";
	
	String Save= "p,保存";
	
	String Cancel = "p,取消";
	
	String AllSelect = "x,/html/body/div[1]/div[6]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	
	//String CustomerManageIframe = "x,//iframe[@scrolling=\"no\"]";
	String CustomerManageIframe = "x,/html/body/div[6]/div[2]/iframe";
	
	String TransCustomerIframe = "x,/html/body/div[7]/div[2]/iframe";
	
	String NewAddCustomerDialog = "x,/html/body/div[6]/div";
	
	String ResetPasswordDialog = "x,/html/body/div[6]/div";
	
	String TransCustomerDialog = "x,/html/body/div[6]/div";
	
	String EditCustomerDialog = "x,/html/body/div[6]/div";
	
	String NickNameError = "x,/html/body/div/div/form/div[3]/div/label";
	
	String AccountError = "x,/html/body/div/div/form/div[4]/div/label";
	
	String PasswordError = "x,/html/body/div/div/form/div[5]/div[1]/div/label";
	
	/**
	 * 角色类型
	 */
	String RoleTypesSelect= "userRoleId";
	
	String SelectFirstCustomerRecord = "x,//*[@id=\"customertablecontent\"]/tbody/tr/td[1]/input";
	
	String CustomerRecordTr = "x,//*[@id=\"customertablecontent\"]/tbody/tr";
	
	String CustomerRecordLi =  "x,//*[@id=\"pagingCustomer\"]/ul/li";
	
	String PageDivID = "pagingCustomer";
	
	String Console = "x,//*[@id=\"customertablecontent\"]/tbody/tr[1]/td[9]/a[1]";
	
	String Edit = "x,//*[@id=\"customertablecontent\"]/tbody/tr[1]/td[9]/a[2]";
	
	String Delete = "x,//*[@id=\"customertablecontent\"]/tbody/tr[1]/td[9]/a[3]";
	
	String ResetPassword = "x,//*[@id=\"customertablecontent\"]/tbody/tr[1]/td[9]/a[4]";
	//转移客户
	String TransCust = "x,//*[@id=\"customertablecontent\"]/tbody/tr[1]/td[9]/a[5]";
	
	String DeleteEnsure = "p,确定";
	
	String DeleteCancel = "p,取消";
	
	String ResetPasswordEnsure = "p,确定";
	
	String ResetPasswordCancel = "p,取消";
	
	String Dialog = "x,/html/body/div[8]/div";
	
	String PhoneOfEditCustomer = "phone";
	
	String Email = "email";
	
	String Contact = "contact";
	
	String CompanyName = "companyName";
	
	void newAddCustomer() throws InterruptedException;
	
	void batchTransCustomer() throws InterruptedException;
	
	String editCustomer() throws InterruptedException;
}
