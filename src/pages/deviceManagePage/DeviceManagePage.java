package pages.deviceManagePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import pages.accountcenterPage.AccountCenterNaviBarPage;

public class DeviceManagePage extends AutomateDriver implements DeviceManagePageInterface {

	public AccountCenterNaviBarPage nbPage;

	public DeviceManagePage(WebDriver dr) {
		super(dr);
		nbPage = new AccountCenterNaviBarPage(dr);
	}

	/**
	 * ����ѡ���豸��¼
	 * 
	 * @throws InterruptedException
	 */
	@Override
	public void selectDeviceRecordsInTurn() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> elements = super.getElements(DeviceTableContentTr);
		Thread.sleep(1000);
		int size = elements.size();

		for (int i = 1; i <= size; i++) {

			if (!super.getElement(DeviceTableContentTr + "[" + i + "]/td/input").isSelected()) {

				super.clickElement(DeviceTableContentTr + "[" + i + "]/td/input");

				Thread.sleep(1000);
			}
		}
	}

	/**
	 * ���β鿴�ͻ�
	 */
	@Override
	public void lookAtTheCustomerInTurn() {

		try {
			this.clickMainSwitch();
			this.clickSubSwitch();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clickSubSwitch() throws InterruptedException {

		List<WebElement> webElements = super.getElements(treeDemo_deviceManage_1_li);
		Thread.sleep(1000);
		int size = webElements.size();
		Thread.sleep(2000);
		for (int i = 1; i <= size; i++) {
			Thread.sleep(1000);
			String classValue = super.getElement(treeDemo_deviceManage_1_li + "[" + i + "]/span").getAttribute("class")
					.trim();
			Thread.sleep(1000);
			if (classValue.equals("button level1 switch noline_close")) {

				super.clickElement(treeDemo_deviceManage_1_li + "[" + i + "]/span");
				Thread.sleep(1000);
			}
		}

	}

	/**
	 * ���ȫ���û�����ť
	 * 
	 * @throws InterruptedException
	 */
	public void clickMainSwitch() throws InterruptedException {

		if (super.isElementExist(treeDemo_deviceManage_1_ul) == false) {
			Thread.sleep(2000);
			super.clickElement(treeDemo_deviceManage_1_switch);
			Thread.sleep(2000);
		}
	}

	/**
	 * ������ఴť
	 */
	@Override
	public void clickMoreButton() throws InterruptedException {

		if (!super.isElementExist(MoreOptionIsDisplay)) {

			Thread.sleep(2000);
			super.clickElement(MoreButton);
			Thread.sleep(2000);
		}

	}

	/**
	 * �����ϴ�ͼƬ
	 */
	@Override
	public void uploadImage() throws InterruptedException {

		super.clickElement(BatchUploadImage);

		super.clickElement(ImageUploadButton);

		System.out.println(super.getText(Dialog));
		Thread.sleep(2000);
		super.clickElement(ImageUploadCancelButton);

	}

	/**
	 * ��������
	 */
	@Override
	public void batchSale() throws InterruptedException {

		this.selectDeviceRecordsInTurn();

		super.clickElement(BatchSale);

		super.clickElement(SaleButton);

		System.out.println(super.getText(Dialog));

		super.clickElement(SaleCancelButton);

	}

	/**
	 * �������ÿͻ�����ʱ��
	 * 
	 * @throws InterruptedException
	 */
	public void batchSetUpCustomExpires(String imei) throws InterruptedException {

		// 201805024565236
		super.clickElement(BatchMaturity);

		super.operateInputElement(sale_imei_user_device_expires_id, imei);

		super.clickElement(AddImeiButton);

		super.clickElement(CustomExpiresTime);

		List<WebElement> webElements = super.getElements(CustomExpiresTimeLi);

		for (WebElement webElement : webElements) {

			webElement.click();
			Thread.sleep(2000);
			super.clickElement(CustomExpiresTime);
		}

		super.clickElement(CustomExpiresEnsure);

		System.out.println(super.getText(PromptDialog));
	}

	/**
	 * �������ÿͻ�����
	 */
	@Override
	public void batchSetUpCustomExpires() throws InterruptedException {

		this.selectDeviceRecordsInTurn();

		super.clickElement(BatchMaturity);

		super.clickElement(CustomExpiresTime);

		List<WebElement> webElements = super.getElements(CustomExpiresTimeLi);

		for (WebElement webElement : webElements) {

			webElement.click();
			Thread.sleep(2000);
			super.clickElement(CustomExpiresTime);
		}

		super.clickElement(CustomExpiresEnsure);

		System.out.println(super.getText(PromptDialog));

	}

	/**
	 * �豸���鵼��
	 */
	@Override
	public void DeviceInfoExport() throws InterruptedException {

		super.clickElement(Export);

		super.clickElement(ExportBaseInfo);

		super.clickElement(ExportSIMCordInfo);

		super.clickElement(ExportOilTankInfo);

		super.clickElement(ExportCustomerInfo);

		super.clickElement(ExportInstallInfo);

		super.clickElement(ExportAnimalInfo);

		super.clickElement(ExportPersonalInfo);

		super.clickElement(AddTaskBtn);

		super.waitForElementToLoad(10, Dialog);

		System.out.println(super.getText(Dialog));

		super.clickElement(DeviceDetailsDownload);
	}

	/**
	 * �豸��������
	 * 
	 * @throws InterruptedException
	 */
	public void deviceNameSearch() throws InterruptedException {

		this.clickMoreButton();

		super.operateInputElement(DeviceName, "BD220-00008");

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * ���ƺ�����
	 * 
	 * @throws InterruptedException
	 */
	public void vehicleNumberSearch() throws InterruptedException {

		this.clickMoreButton();

		super.operateInputElement(VehicleNumber, "��B��SB110");

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * ���ܺ�����
	 * 
	 * @throws InterruptedException
	 */
	public void carFrameSearch() throws InterruptedException {

		this.clickMoreButton();

		super.operateInputElement(CarFrame, "542155");

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * SN����
	 * 
	 * @throws InterruptedException
	 */
	public void deviceSNSearch() throws InterruptedException {

		this.clickMoreButton();

		super.operateInputElement(SN, "75487441");

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * SIM����
	 * 
	 * @throws InterruptedException
	 */
	public void deviceSIMSearch() throws InterruptedException {

		this.clickMoreButton();

		super.operateInputElement(SIM, "8986061708005756354");

		super.clickElement(DeviceSearchButton);
	}

	/**
	 * ʱ������
	 * 
	 * @throws InterruptedException
	 */
	public void timeSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(AliveTime);

		List<WebElement> webElements = super.getElements(AliveTimeLi);

		for (WebElement webElement : webElements) {

			webElement.click();

			super.clickElement(DeviceSearchButton);

			super.clickElement(AliveTime);

		}

	}

	/**
	 * ���ݿ�ʼʱ��ͽ���ʱ������
	 * 
	 * @throws InterruptedException
	 */
	public void startTimeAndEndTimeSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(StartTime_input);

		super.clickElement(StartTimeBackMonth);

		super.clickElement(StartTimeEnsure);

		super.clickElement(EndTime_input);

		super.clickElement(TimeNow);

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * ���ʹ�÷�Χͼ��
	 * 
	 * @throws InterruptedException
	 */
	public void clickScopeOfUse() throws InterruptedException {

		this.clickMoreButton();

		List<WebElement> elements = super.getElements(ScopeOfUse);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

		}
	}

	/**
	 * ����״̬����
	 * 
	 * @throws InterruptedException
	 */
	public void expiresStateSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(Past_due);

		List<WebElement> elements = super.getElements(Past_due_Li);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(Past_due);

		}
	}

	/**
	 * ����״̬����
	 * 
	 * @throws InterruptedException
	 */
	public void activationStateSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(ActivationState);

		List<WebElement> elements = super.getElements(ActivationStateLi);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(ActivationState);

		}

	}

	/**
	 * ��״̬����
	 * 
	 * @throws InterruptedException
	 */
	public void boundStateSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(BoundState);

		List<WebElement> elements = super.getElements(BoundStateLi);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(BoundState);

		}

	}

	/**
	 * �豸��������
	 * 
	 * @throws InterruptedException
	 */
	public void deviceTypeSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(DeviceType);

		List<WebElement> elements = super.getElements(DeviceTypeLi);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(DeviceType);

		}

	}

	/**
	 * �豸��������
	 * 
	 * @throws InterruptedException
	 */
	public void deviceGroupingSearch() throws InterruptedException {

		this.clickMoreButton();

		super.clickElement(DeviceGrouping);

		List<WebElement> elements = super.getElements(DeviceGroupingLi);

		for (WebElement webElement : elements) {

			webElement.click();

			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(DeviceGrouping);

		}

	}

	/**
	 * IMEI������
	 * 
	 * @param imei
	 * @throws InterruptedException
	 */
	public void deviceImeiSearch(String imei) throws InterruptedException {

		super.operateInputElement(DeviveImeiInput, imei);

		super.clickElement(DeviceSearchButton);

	}

	/**
	 * �����ͺ�������
	 * @throws InterruptedException
	 */
	public void typeSearch() throws InterruptedException{
		
		super.clickElement(TypeShow);
		
		List<WebElement> elements = super.getElements(TypeShowLi);
		
		for (WebElement webElement : elements) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(DeviceSearchButton);
			
			super.clickElement(TypeShow);
		}
	}
	/**
	 * �����豸�������
	 * 
	 * @throws InterruptedException
	 */
	public void deviceCategorySearch() throws InterruptedException {

		super.clickElement(DeviceCategory);

		List<WebElement> elements = super.getElements(DeviceCategoryLi);

		for (WebElement webElement : elements) {

			webElement.click();
			Thread.sleep(2000);

			super.clickElement(DeviceSearchButton);

			super.clickElement(DeviceCategory);
		}

	}
	/**
	 * ��������¼��豸
	 * @throws InterruptedException
	 */
	public void clickLowerFlag() throws InterruptedException{
		
		super.waitForElementToLoad(10, LowerFlagInputMark);
		
		if (!super.getElement(LowerFlagInputMark).isSelected()) {
			
			super.clickElement(LowerFlag);
		}
	}
	/**
	 * ѡ�з���ָ��
	 */
	@Override
	public void sendInstruction() throws InterruptedException {
		
		super.operateInputElement(TypeShow, "ET200");
		
		Thread.sleep(1000);
		
		super.clickCheckbox(DeviceSearchButton);
		
		super.clickElement(SelectAll);
		
		super.clickElement(AllSendIns);
		
		
		super.clickElement(InsType);
		
		List<WebElement> elements = super.getElements(InsTypeLi);
		
		int size = elements.size();
		/**
		 *��� SOS����
		 */
		elements.get(0).click();
		
		super.operateInputElement(Phone1, "10000");
		
		super.operateInputElement(Phone2, "10010");
		
		super.operateInputElement(Phone3, "10086");
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		super.clickElement(DeleteSOS);
		
		super.clickElement(DeletePhone3);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 *��� λ�Ʊ���
		 */
		elements.get(1).click();
		
		super.operateInputElement(DisplacementRadius, "200");
		
		super.clickElement(DisplacementAlarmUploadType);
		
		List<WebElement> element1s = super.getElements(DisplacementAlarmUploadTypeLi);
		
		for (WebElement webElement : element1s) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(SendIns);
			
			System.out.println(super.getText(Dialog));
			
			Thread.sleep(2000);
			
			super.clickElement(DisplacementAlarmUploadType);
		}
		
		super.clickElement(CloseDisplacementAlarm);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 *��� �ϵ籨��
		 */
		elements.get(2).click();
		
		super.clickElement(PowerOffAlarmUploadType);
		
		List<WebElement> element2s = super.getElements(PowerOffAlarmUploadTypeLi);
		
		for (WebElement webElement : element2s) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(SendIns);
			
			System.out.println(super.getText(Dialog));
			
			Thread.sleep(2000);
			
			super.clickElement(PowerOffAlarmUploadType);
		}
		
		super.clickElement(ClosePowerOffAlarm);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 *����͵籨��
		 */
		elements.get(3).click();
		
		super.clickElement(LowElectricAlarmUploadType);
		
		List<WebElement> element3s = super.getElements(LowElectricAlarmUploadTypeLi);
		
		for (WebElement webElement : element3s) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(SendIns);
			
			System.out.println(super.getText(Dialog));
			
			Thread.sleep(2000);
			
			super.clickElement(LowElectricAlarmUploadType);
		}
		
		super.clickElement(CloseLowElectricAlarm);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 *�����������
		 */
		elements.get(4).click();
		
		super.clickElement(VibrationSensitivity);
		
		List<WebElement> element4s = super.getElements(VibrationSensitivityLi);
		
		for (WebElement webElement : element4s) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(SendIns);
			
			System.out.println(super.getText(Dialog));
			
			Thread.sleep(2000);
			
			super.clickElement(LowElectricAlarmUploadType);
		}
		
		/**
		 *�������ͳ���
		 */
		elements.get(5).click();
		Thread.sleep(2000);
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		super.clickElement(Withdrawing);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 * ���ģʽ
		 */
		elements.get(6).click();
		
		if (!super.getElement(ManualInputMark).isSelected()) {
			
			super.clickElement(Manual);
		}
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		if (!super.getElement(AutomaticInputMark).isSelected()) {
			
			super.clickElement(Automatic);
		}
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 * Զ�̿���
		 */
		elements.get(7).click();
		
		super.operateInputElement(OilBreakingElectricityPwdInput, "666888");
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		super.clickElement(RecoveryOfOilAndElectricity);
		
		super.operateInputElement(RecoveryOfOilAndElectricityPwdInput, "666666");
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 * ���ĺ���
		 */
		elements.get(8).click();
		
		super.operateInputElement(CenterNumberInput, "12580");
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		super.clickElement(DeleteCenterNumber);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 * �𶯱���
		 */
		elements.get(9).click();
		
		super.clickElement(ShockAlarmUploadType);
		
		List<WebElement> element5s = super.getElements(ShockAlarmUploadTypeLi);
		
		for (WebElement webElement : element5s) {
			
			webElement.click();
			Thread.sleep(2000);
			
			super.clickElement(SendIns);
			
			System.out.println(super.getText(Dialog));
			
			Thread.sleep(2000);
			
			super.clickElement(ShockAlarmUploadType);
		}
		
		super.clickElement(CloseShockAlarm);
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		/**
		 * �Զ�ָ��
		 */
		elements.get(10).click();
		
		super.operateInputElement(CustomInstruction, "����ʮ����");
		
		super.clickElement(SendIns);
		
		System.out.println(super.getText(Dialog));
		
		Thread.sleep(2000);
		
		super.clickElement(CloseSendInsModal);
	}

}
