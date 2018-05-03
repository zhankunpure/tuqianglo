package pages.deviceManagePage;

public interface DeviceManagePageInterface {
	
	public static final String NickName = "user_account";
	/**
	 * 账号
	 */
	public static final String  UserAccount = "userAccount";
	/**
	 * 客户类型
	 */
	public static final String  UserType= "userType";
	/**
	 * 手机
	 */
	public static final String UserPhone = "user_phone";
	/**
	 * 监控用户
	 */
	public static final String  MonitorUser = "monitorUser";
	/**
	 * IMEI号输入框
	 */
	public static final String  SearchImeiInput = "searchIMEI";
	/**
	 * 编辑用户
	 */
	public static final String EditUser = "x,//*[@id=\"editUserFast\"]/button";
	/**
	 * 全部用户
	 */
	public static final String AllUser = "allUser";
	/**
	 * 到期用户
	 */
	public static final String ExpirationUser = "expirationUser";
	
	public static final String DeviveImeiInput ="searchIMEI";
	
	public static final String treeDemo_deviceManage_1_switch = "treeDemo_deviceManage_1_switch";
	
	public static final String treeDemo_deviceManage_1_span = "treeDemo_deviceManage_1_span";
	
	public static final String treeDemo_deviceManage_1_ul = "treeDemo_deviceManage_1_ul";
	
	public static final String treeDemo_deviceManage_1_li = "x,//*[@id=\"treeDemo_deviceManage_1_ul\"]/li";
	
	/**
	 * 请输入客户名和账号
	 */
	public static final String DeviceManage_cusTreeKey = "deviceManage_cusTreeKey";
	/**
	 * 客户名和账号搜索按钮
	 */
	public static final String DeviceManage_cusTreeSearchBtn = "deviceManage_cusTreeSearchBtn";
	/**
	 * 设备型号
	 */
	public static final String TypeShow = "mcTypeShow";
	
	public static final String TypeShowLi = "x,//*[@id=\"autocompleter-1\"]/ul/li";
	/**
	 * 设备类别
	 * 
	 */
	public static final String DeviceCategory = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/span[2]";
	/**
	 * 设备类别Li
	 */
	public static final String DeviceCategoryLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div/div/ul/li";
	
	/**
	 * 搜索按钮
	 */
	public static final String  DeviceSearchButton = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/button";
	/**
	 * 更多
	 */
	public static final String MoreButton  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/div/div/button";
	
	public static final String  MoreOptionIsDisplay = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]";
	/**
	 * 设备名称
	 */
	public static final String  DeviceName  = "n,deviceName";
	/**
	 * 车牌号
	 */
	public static final String  VehicleNumber = "n,vehicleNumber";
	/**
	 * 车架号
	 */
	public static final String CarFrame  = "n,carFrame";
	/**
	 * SN
	 */
	public static final String SN  = "n,sn";
	/**
	 * SIM
	 */
	public static final String SIM  = "n,sim";
	/**
	 * 激活时间
	 */
	public static final String AliveTime  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/span[2]";
	
	public static final String AliveTimeLi  = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[4]/div[1]/div/div/div/ul/li";
	
	public static final String StartTime_input  = "startTime_input";
	
	public static final String EndTime_input  = "endTime_input";
	/**
	 * 使用范围
	 */
	public static final String ScopeOfUse  = "x,//*[@id=\"deviceManage_device_icon_ul\"]/li";
	/**
	 * 包含下级设备
	 */
	public static final String LowerFlag  = "x,//*[@id=\"lowerFlag\"]/div/ins";
	
	public static final String LowerFlagInputMark  = "x,//*[@id=\"lowerFlag\"]/div/input";
	/**
	 * 清空
	 */
	public static final String ClearButton = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[5]/button";
	/**
	 * 过期状态
	 */
	public static final String Past_due = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[1]/div/div/div/span[2]";
	
	public static final String Past_due_Li = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[1]/div/div/div/div/ul/li";
	/**
	 * 激活状态
	 */
	public static final String ActivationState = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[2]/div/div/div/span[2]";
	
	public static final String ActivationStateLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[2]/div/div/div/div/ul/li";
	/**
	 * 绑定状态
	 */
	public static final String BoundState = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[3]/div/div/div/span[2]";
	
	public static final String BoundStateLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[3]/div/div/div/div/ul/li";
	/**
	 * 设备类型
	 */
	public static final String DeviceType = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[4]/div/div/div/span[2]";
	
	public static final String DeviceTypeLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[4]/div/div/div/div/ul/li";
	/**
	 * 设备分组
	 */
	public static final String DeviceGrouping = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[5]/div/div/div/span[2]";
	
	public static final String DeviceGroupingLi = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[6]/div[5]/div[5]/div/div/div/div/ul/li";
	/**
	 * 批量编辑
	 */
	public static final String BatchEditing = "batchEditing";
	/**
	 * 批量上传图片
	 */
	public static final String BatchUploadImage = "uploadimagesinbulk";
	/**
	 * 批量销售
	 */
	public static final String BatchSale = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[3]";
	/**
	 * 批量设置用户到期
	 */
	public static final String BatchMaturity = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[4]";
	/**
	 * 导出
	 */
	public static final String Export = "listExport";
	/**
	 * 选中发送指令
	 */
	public static final String SelectedSendIns = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[6]";
	/**
	 * 本次查询全部发送指令
	 */
	public static final String AllSendIns = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[7]";
	/**
	 * 选中设置工作模式
	 */
	public static final String SelectTheSetUpWorkPattern = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[8]";
	/**
	 * 本次查询全部设置工作模式
	 */
	public static final String AllSetUpWorkPattern = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[9]";
	/**
	 * 选中关机
	 */
	public static final String SelectShutdown = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[10]";
	/**
	 * 全部选中关机
	 */
	public static final String AllSelectShutdown = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[11]";
	/**
	 * 选中开机
	 */
	public static final String SelectBoot = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[12]";
	/**
	 * 全部选中开机
	 */
	public static final String AllSelectBoot = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[13]";
	/**
	 * 增加播放次数
	 */
	public static final String BroadcastTimesSet = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[14]";
	/**
	 * 查询当前播放次数
	 */
	public static final String SearchBroadcastTimes = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/button[14]";
	/**
	 * 批量移动到组
	 */
	public static final String BatchMoveGroup = "batchMoveGroup";
	
	public static final String DataToggleDropdown= "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/button";
	
	public static final String DataToggleDropdownLi= "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/ul/li";
	//全选
	public static final String SelectAll = "x,/html/body/div[2]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	/**
	 * 设备记录Tr
	 */
	public static final String DeviceTableContentTr = "x,//*[@id=\"deviceTableContent\"]/tbody/tr";
	/**
	 * 设备记录页数Li
	 */
	public static final String PagingDevLi = "x,//*[@id=\"paging-dev\"]/ul/li";
	/**
	 * 第一条记录编辑
	 */
	public static final String Editing = "x,//*[@id=\"deviceTableContent\"]/tbody/tr[1]/td[13]/a[1]";
	/**
	 * 第一条记录销售
	 */
	public static final String Sale = "x,//*[@id=\"deviceTableContent\"]/tbody/tr[1]/td[13]/a[2]";
	/**
	 * 第一条记录查看位置
	 */
	public static final String ViewLocation = "x,//*[@id=\"deviceTableContent\"]/tbody/tr[1]/td[13]/a[3]";
	/**
	 *第一条记录 更多
	 */
	public static final String More = "x,//*[@id=\"deviceTableContent\"]/tbody/tr[1]/td[13]/a[4]";
	/**
	 * 选中第一个设备
	 */
	public static final String SelectFirstDevice = "x,//*[@id=\"deviceTableContent\"]/tbody/tr[1]/td/input";
	
	public static final String Dialog = "x,/html/body/div[33]/div";
	
	public static final String PromptDialog = "x,/html/body/div[32]/div";
	/**
	 * 上传图片 上传
	 */
	public static final String ImageUploadButton = "x,/html/body/div[7]/div[3]/a[1]";
	/**
	 * 上传图片 取消
	 */
	public static final String ImageUploadCancelButton = "x,/html/body/div[7]/div[3]/a[2]";
	/**
	 * 批量销售 -销售按钮
	 */
	public static final String SaleButton = "x,/html/body/div[9]/div[2]/div/div/div[3]/div[2]/button[3]";
	/**
	 * 批量销售-取消按钮
	 */
	public static final String SaleCancelButton = "x,/html/body/div[9]/div[2]/div/div/div[3]/div[2]/button[1]";
	/**
	 * 客户到期imei号输入框
	 */
	public static final String sale_imei_user_device_expires_id = "sale_imei_user_device_expires_id";
	
	public static final String AddImeiButton = "x,/html/body/div[10]/div[2]/div/div/div[1]/div/div[1]/div/div[3]/button[1]";
	
	public static final String AddImeiCancelButton = "x,/html/body/div[10]/div[2]/div/div/div[1]/div/div[1]/div/div[3]/button[2]";
	/**
	 * 客户到期时间
	 */
	public static final String CustomExpiresTime = "x,/html/body/div[10]/div[2]/div/div/div[2]/div[1]/span/div/span[2]";
	
	public static final String CustomExpiresTimeLi = "x,/html/body/div[10]/div[2]/div/div/div[2]/div[1]/span/div/div/ul/li";
	/**
	 * 设置客户到期时间确定
	 */
	public static final String CustomExpiresEnsure = "x,/html/body/div[10]/div[2]/div/div/div[2]/div[2]/button[3]";
	/**
	 * 设置客户到期时间取消
	 */
	public static final String CustomExpiresCancel = "x,/html/body/div[10]/div[2]/div/div/div[2]/div[2]/button[1]";
	//基本信息												
	public static final String ExportBaseInfo = "x,//*[@id=\"exportsModal\"]/div/div[1]/div[1]/div/label/div/ins";
	//SIM卡信息
	public static final String ExportSIMCordInfo = "x,//*[@id=\"exportsModal\"]/div/div[2]/div[1]/div/label/div/ins";
	//油箱信息
	public static final String ExportOilTankInfo = "x,//*[@id=\"exportsModal\"]/div/div[3]/div[1]/div/label/div/ins";
	//客户信息
	public static final String ExportCustomerInfo = "x,//*[@id=\"exportsModal\"]/div/div[4]/div[1]/div/label/div/ins";
	//安装信息
	public static final String ExportInstallInfo = "x,//*[@id=\"exportsModal\"]/div/div[5]/div[1]/div/label/div/ins";
	//动物信息
	public static final String ExportAnimalInfo = "x,//*[@id=\"exportsModal\"]/div/div[6]/div[1]/div/label/div/ins";
	//个人信息
	public static final String ExportPersonalInfo = "x,//*[@id=\"exportsModal\"]/div/div[7]/div[1]/div/label/div/ins";
	
	public static final String AddTaskBtn = "addTaskBtn";
	
	public static final String DeviceDetailsDownload = "x,/html/body/div[30]/div[2]/div/div/div[9]/div[2]/div[1]/ul/li/a";
	
	public static final String CloseExportModal = "x,/html/body/div[30]/span[1]/a";
	
	public static final String NoRecordsFound = "x,//*[@id=\"deviceTableContent\"]/tbody/tr/td";
	
	public static final String StartTimeBackMonth = "x,/html/body/div[31]/div[1]/div[1]/i[2]";
	
	public static final String StartTimeClear = "x,/html/body/div[31]/div[2]/div/span[1]";
	
	public static final String TimeNow = "x,/html/body/div[31]/div[2]/div/span[2]";
	
	public static final String StartTimeEnsure = "x,/html/body/div[31]/div[2]/div/span[3]";
	/**
	 * 指令类型
	 */
	public static final String InsType = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[1]/div/div/span[2]";
	/**
	 * 指令类型Li
	 */
	public static final String InsTypeLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[1]/div/div/div/ul/li";
	
	public static final String SetSOS = "p,SOS设置";
	
	public static final String DeleteSOS = "p,删除SOS号码";
	
	public static final String Phone1 = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div/input[2]";
	
	public static final String Phone2 = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div/input[2]";
	
	public static final String Phone3 = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div/input[2]";
	
	public static final String DeletePhone3 = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/label[3]/div/ins";
	
	public static final String SendIns = "p,发送指令";
	
	public static final String CancelSendIns = "p,取消";
	
	public static final String DisplacementAlarm = "p,位移报警";
	
	public static final String CloseDisplacementAlarm = "p,关闭位移报警";
	/**
	 * 位移半径
	 */
	public static final String DisplacementRadius = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div/input[2]";
	/**
	 * 位移报警上传方式											
	 */
	public static final String DisplacementAlarmUploadType = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div/div/span[2]";
	
	public static final String DisplacementAlarmUploadTypeLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div/div/div/ul/li";
	
	public static final String PowerOffAlarm = "p,断电报警";
	
	public static final String ClosePowerOffAlarm = "p,关闭断电报警";
	/**
	 * 断电报警上传方式
	 */
	public static final String PowerOffAlarmUploadType = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]";
	
	public static final String PowerOffAlarmUploadTypeLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/div/ul/li";
	
	public static final String LowElectricAlarm = "p,低电报警";
	
	public static final String CloseLowElectricAlarm = "p,关闭低电报警";
	/**
	 * 低电报警上传方式
	 */
	public static final String LowElectricAlarmUploadType = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]";
	
	public static final String LowElectricAlarmUploadTypeLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/div/ul/li";
	/**
	 * 震动灵敏度
	 */
	public static final String VibrationSensitivity = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]";
	
	public static final String VibrationSensitivityLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/div/ul/li";
	/**
	 * 设防
	 */
	public static final String Fortification = "p,设防";
	/**
	 * 撤防
	 */
	public static final String Withdrawing = "p,撤防";
	/**
	 * 手动
	 */
	public static final String ManualInputMark = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/label[1]/div/input";
	
	public static final String Manual = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/label[1]/div/ins";
	/**
	 * 自动
	 */
	public static final String AutomaticInputMark = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/label[2]/div/input";
	
	public static final String Automatic = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/label[2]/div/ins";
	
	public static final String OilBreakingElectricity = "p,断油电";
	
	public static final String RecoveryOfOilAndElectricity = "p,恢复油电";
	
	public static final String OilBreakingElectricityPwdInput = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[2]/div/input";
	
	public static final String RecoveryOfOilAndElectricityPwdInput = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[2]/div/input";
	
	public static final String CenterNumber = "p,中心号码";
	
	public static final String DeleteCenterNumber = "p,删除中心号码";
	
	public static final String CenterNumberInput = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/input[2]";
	/**
	 * 震动报警
	 */
	public static final String ShockAlarm = "p,震动报警";
	/**
	 * 关闭震动报警
	 */
	public static final String CloseShockAlarm = "p,关闭震动报警";
	
	public static final String ShockAlarmUploadType = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]";
	
	public static final String ShockAlarmUploadTypeLi = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/div/ul/li";
	
	public static final String CustomInstruction  = "x,/html/body/div[26]/div[2]/div/div/fieldset[1]/div/form/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/input[2]";
	
	public static final String CloseSendInsModal = "x,/html/body/div[26]/span[1]/a";
	
	public void selectDeviceRecordsInTurn() throws InterruptedException;
	
	public void lookAtTheCustomerInTurn();
	
	public void clickMoreButton() throws InterruptedException;
	
	public void uploadImage() throws InterruptedException;
	
	public void batchSale() throws InterruptedException;
	
	public void batchSetUpCustomExpires() throws InterruptedException;

	public void DeviceInfoExport() throws InterruptedException;
	
	void sendInstruction() throws InterruptedException;
}
