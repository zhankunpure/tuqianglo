package pages.setUpPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
import pages.base.BasePage;
import pages.statisticalReportPage.StatisticalReportPage;

/**
 * ָ�����ҳ��
 * 
 * @author ZhanKun
 *
 */
public class InstructionManagementPage extends AutomateDriver {

	public BasePage page;
	
	public StatisticalReportPage srPage;

	public InstructionManagementPage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
		srPage = new StatisticalReportPage(dr);
	}
	
	public static final String InstructionManagementURL = "http://172.16.0.116:8691/custom/toTemplate";
	//public static final String InstructionManagementURL = "http://tujunsat.jimicloud.com/custom/toTemplate";
	/**
	 * ����ģʽģ�����
	 */
	public static final String TemplateList = "templateList_li";

	public void clickWorkPatternTemplateManagement() throws InterruptedException {

		super.clickElement(TemplateList);
	}

	/**
	 * ����ģ��
	 */
	public static final String CreateInstructionRules = "create-instructionRules";

	/**
	 * �������ģ��
	 * @throws InterruptedException 
	 */
	public void clickCreateInsModel() throws InterruptedException {

		super.clickElement(CreateInstructionRules);
	}

	/**
	 * 
	 * ָ��ģ��Iframe
	 */
	public static final String customInstructionsModalIframe = "tmplateEdit";

	/**
	 * 
	 * ����ָ��ģ��Iframe
	 */
	public void toInstructionsModalIframe() {

		super.switch_to_frame(customInstructionsModalIframe);
	}

	/**
	 * ָ��ģ������
	 */
	public static final String InstructionsModalNameInput = "tempName";

	public static final String InstructionsModalNameInputError = "x,//*[@id=\"tmpform\"]/div[1]/div[1]/label";
	/**
	 * ����Զ���ģ��
	 */
	public static final String AddInstructionsModal = "x,/html/body/div/div/div/form/div[1]/div[2]/button";
	/**
	 * �ϱ�����, ��ʱģʽ
	 */
	public static final String TimingPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[1]/ul/li[1]/a";
	/**
	 * �ϱ�����, ����ģʽ
	 */
	public static final String WeekPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[1]/ul/li[2]/a";
	/**
	 * �ϱ�����, ��ͨģʽ
	 */
	public static final String CommonPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[1]/ul/li[3]/a";
	/**
	 * �ϱ����� ��
	 */
	public static final String NumberOfReportsForDay = "x,/html/body/div/div/div/form/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/span/div/span[2]";
	/**
	 * �ϱ����� ��Li
	 */
	public static final String NumberOfReportsForDayLi = "x,/html/body/div/div/div/form/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/span/div/div/ul/li";
	/**
	 * �ϱ����� ��
	 */
	public static final String NumberOfReportsForTimes = "x,/html/body/div/div/div/form/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div[2]/span/div/span[2]";
	/**
	 * �ϱ����� ��Li
	 */
	public static final String NumberOfReportsForTimesLi = "x,/html/body/div/div/div/form/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div[2]/span/div/div/ul/li";
	/**
	 * ��1���ϱ�ʱ��
	 */
	public static final String TimeOfReports = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/ul/li/input";

	public static final String TimeOfReportsError = "x,//*[@id=\"stageList\"]/div/div/div/div/div[2]/div[1]/div/div[2]/div/ul/li/label";
	/**
	 * ��ʱ����
	 */
	public static final String TimeLimitCycle = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[1]/div/div[3]/div/label[1]/div/input";
	/**
	 * ��������
	 */
	public static final String UnlimitedPeriod = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[1]/div/div[3]/div/label[2]/div/input";
	/**
	 * ��ʱ���������
	 */
	public static final String TimeLimitCycleInput = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[1]/div/div[3]/div/input";

	public static final String TimeLimitCycleInputError = "x,//*[@id=\"stageList\"]/div/div/div/div/div[2]/div[1]/div/div[3]/div/label[2]";
	/**
	 * ɾ��
	 */
	public static final String DeleteModel = "x,/html/body/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/a";
	/**
	 * �������
	 */
	public static final String SaveRules = "x,/html/body/div[6]/div[3]/a[1]";
	/**
	 * ȡ��
	 */
	public static final String CancelRules = "x,/html/body/div[6]/div[3]/a[2]";

	/**
	 * �ϱ�ʱ�� ����
	 */ 
	public static final String WeekDayOfWeekPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li";

	public static final String WeekDayOfWeekPatternError = "x,//*[@id=\"stageList\"]/div/div/div/div/div[2]/div[2]/div/div[1]/div/label";
	/**
	 * �ϱ�ʱ��
	 */
	public static final String TimeOfWeekPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/input";

	public static final String TimeOfWeekPatternError = "x,//*[@id=\"stageList\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/label";

	public static final String TimeLimitCycleOfWeekPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/label[1]/div/ins";

	public static final String UnlimitedPeriodOfWeekPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/label[2]/div/ins";

	public static final String TimeLimitCycleOfWeekPatternInut = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/input";

	public static final String TimeLimitCycleOfWeekPatternInutError = "x,//*[@id=\"stageList\"]/div/div/div/div/div[2]/div[2]/div/div[3]/div/label[2]";
	
	public static final String TemplateTr = "templateBody";
	
	public static final String TemplatePagingLi = "templatePaging";
	
	public static final String TemplateNoData = "templateNoData";

	/**
	 * ����ָ�ʱģʽģ��
	 * 
	 * @throws InterruptedException
	 */
	public void CreateTimingPattern() throws InterruptedException {
		
		System.out.println(page.pageNumber(TemplateNoData, TemplatePagingLi, TemplateTr));
		Thread.sleep(2000);
		this.clickCreateInsModel();
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(InstructionsModalNameInputError));

		System.out.println(super.getText(TimeOfReportsError));

		System.out.println(super.getText(TimeLimitCycleInputError));

		super.operateInputElement(TimeLimitCycleInput, "tewqr");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleInput, "���������");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleInput, "3434@-");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleInput, "91");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleInput, "0");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleInput, "-0.1");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleInputError));
		Thread.sleep(2000);

		super.operateInputElement(InstructionsModalNameInput, "����");
		Thread.sleep(2000);
		super.clickElement(TimingPattern);
		Thread.sleep(2000);
		super.clickElement(NumberOfReportsForDay);
		Thread.sleep(2000);
		List<WebElement> webElements = super.getElements(NumberOfReportsForDayLi);

		for (WebElement webElement : webElements) {

			webElement.click();
			Thread.sleep(2000);

			super.clickElement(NumberOfReportsForDay);
			Thread.sleep(2000);

		}
		super.clickElement(NumberOfReportsForTimes);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(NumberOfReportsForTimesLi);
		for (WebElement element : elements) {

			element.click();
			Thread.sleep(2000);
			super.clickElement(NumberOfReportsForTimes);
			Thread.sleep(2000);
		}

		super.clickElement(TimeOfReports);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
//		if (super.getElement(TimeLimitCycle).isSelected()) {
//			Thread.sleep(2000);
//			super.clickElement(UnlimitedPeriod);
//		} else {
//			Thread.sleep(2000);
//			super.clickElement(TimeLimitCycle);
//		}
//		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleInput, "7");
		Thread.sleep(2000);
		super.clickElement(AddInstructionsModal);
		Thread.sleep(2000);
		super.clickElement(DeleteModel);
		Thread.sleep(2000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
	}

	/**
	 * ��������ģʽָ��ģ��
	 * 
	 * @throws InterruptedException
	 */
	public void CreateWeekPattern() throws InterruptedException {
		
		System.out.println(page.pageNumber(TemplateNoData, TemplatePagingLi, TemplateTr));
		Thread.sleep(2000);
		
		this.clickCreateInsModel();
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		super.clickElement(WeekPattern);
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(InstructionsModalNameInputError));
		Thread.sleep(2000);
		System.out.println(super.getText(WeekDayOfWeekPatternError));
		Thread.sleep(2000);
		System.out.println(super.getText(TimeOfWeekPatternError));
		Thread.sleep(2000);
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "tewqr");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "���������");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "3434@-");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "91");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "0");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "-0.1");
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		System.out.println(super.getText(TimeLimitCycleOfWeekPatternInutError));
		Thread.sleep(2000);

		super.operateInputElement(InstructionsModalNameInput, "zhongguo");
		Thread.sleep(2000);
		this.selectWeekDayOfWeekPattern();
		Thread.sleep(2000);
		super.clickElement(TimeOfWeekPattern);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "7");
		Thread.sleep(2000);
		
		srPage.checkRadio(TimeLimitCycleOfWeekPattern, UnlimitedPeriodOfWeekPattern);
		
		if (super.getElement(TimeLimitCycleOfWeekPattern).isSelected()) {
			super.clickElement(UnlimitedPeriodOfWeekPattern);
		} else {
			super.clickElement(TimeLimitCycleOfWeekPattern);
		}
		Thread.sleep(2000);
		super.clickElement(AddInstructionsModal);
		Thread.sleep(2000);
		super.clickElement(DeleteModel);
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		
		Thread.sleep(2000);
	}

	/**
	 * ��ͨģʽ ����ʱ��
	 */
	public static final String WakeUpTime = "x,/html/body/div/div/div/form/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div/div[1]/div/input";
	/**
	 * ��ͨģʽ ����ʱ��
	 */
	public static final String Now = "x,/html/body/div/div/div/form/div[2]/div/div[2]/div[2]/button[1]";
	/**
	 * ��ͨģʽ �ϴ����ʱ��
	 */
	public static final String UploadIntervalTime = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/span[2]";
	/**
	 * ��ͨģʽ �ϴ����ʱ��Li
	 */
	public static final String UploadIntervalTimeLi = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/ul/li";
	/**
	 * ѭ���ϱ�ʱ�� ѭ������
	 */
	public static final String TimeLimitCycleOfCommonPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[3]/div/label[1]/div/ins";

	/**
	 * ѭ���ϱ�ʱ�� ��������
	 */
	public static final String UnlimitedPeriodOfCommonPattern = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[3]/div/label[2]/div/ins";

	/**
	 * ѭ���ϱ�ʱ��
	 */
	public static final String TimeLimitCycleOfCommonPatternInut = "x,/html/body/div/div/div/form/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[3]/div/input";

	/**
	 * ������ͨģʽָ��ģ��
	 * 
	 * @throws InterruptedException
	 */
	public void createInsCommonPattern() throws InterruptedException {
		
		System.out.println(page.pageNumber(TemplateNoData, TemplatePagingLi, TemplateTr));
		Thread.sleep(2000);
		
		this.clickCreateInsModel();
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		super.clickElement(CommonPattern);
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		
		super.operateInputElement(InstructionsModalNameInput, "ty4532&");
		Thread.sleep(2000);
		super.clickElement(WakeUpTime);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.clickElement(UploadIntervalTime);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(UploadIntervalTimeLi);
		Thread.sleep(2000);
		for (WebElement element : elements) {

			element.click();
			Thread.sleep(2000);
			super.clickElement(UploadIntervalTime);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		super.clickElement(UploadIntervalTime);
		
		srPage.checkRadio(TimeLimitCycleOfCommonPattern, UnlimitedPeriodOfCommonPattern);
		
		super.operateInputElement(TimeLimitCycleOfCommonPatternInut, "3");
		Thread.sleep(2000);
		super.clickElement(AddInstructionsModal);
		Thread.sleep(2000);
		super.clickElement(DeleteModel);
		Thread.sleep(2000);
		
		super.switch_to_frame("");
		Thread.sleep(2000);
		
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		super.clickElement(Modify);
		Thread.sleep(2000);
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		super.operateInputElement(InstructionsModalNameInput, "�޸Ĳ���");
		Thread.sleep(2000);
		super.clickElement(WakeUpTime);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleOfCommonPatternInut, "5");
		Thread.sleep(2000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		super.clickElement(Instructions);
		Thread.sleep(2000);
	}

	public static final String CloseInstructionsModal = "x,/html/body/div[6]/span[1]/a";

	public static final String Modify = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[5]/a[1]";

	public static final String Instructions = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[5]/a[2]";

	public static final String Delete = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[5]/a[3]";

	public static final String SearchTemplateIMEI = "searchTemplateIMEI";

	public static final String AddIMEIBtn = "x,/html/body/div[3]/div[2]/div/div/form/div/div/div[1]/div/div[3]/button[1]";

	public static final String CancelAddIMEI = "x,/html/body/div[3]/div[2]/div/div/form/div/div/div[1]/div/div[3]/button[2]";

	public static final String DeleteEnsure = "p,ȷ��";

	public static final String DeleteCancel = "p,ȡ��";

	public static final String SendInstructions = "x,/html/body/div[3]/div[2]/div/div/form/div/div/div[3]/button";
	/**
	 * ��һ����¼ģ������
	 */
	public static final String FirstRecordInstructionsModalName = "x,//*[@id=\"templateBody\"]/tr[1]/td[2]";
	
	/**
	 * ��ʱģʽ��һ����¼�޸�
	 * @throws InterruptedException
	 */
	public String InsTimingPatternFirstRecordModify() throws InterruptedException{
		
		super.clickElement(Modify);
		Thread.sleep(2000);
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		super.operateInputElement(InstructionsModalNameInput, "��ʱģʽ��һ����¼�޸ĳɹ�");
		Thread.sleep(2000);
		super.clickElement(TimeOfReports);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleInput, "3");
		Thread.sleep(2000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		String modifySuccess =  super.getText(FirstRecordInstructionsModalName).trim();
		return modifySuccess;		
	}
	/**
	 * ����ģʽ��һ����¼�޸�
	 * @throws InterruptedException
	 */
	public String InsWeekPatternFirstRecordModify() throws InterruptedException{
		
		super.clickElement(Modify);
		Thread.sleep(2000);
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		super.operateInputElement(InstructionsModalNameInput, "����ģʽ��һ����¼�޸ĳɹ�");
		Thread.sleep(2000);
		super.clickElement(TimeOfWeekPattern);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleOfWeekPatternInut, "1");
		Thread.sleep(2000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		super.clickElement(SaveRules);
		Thread.sleep(2000);
				
		String modifySuccess =  super.getText(FirstRecordInstructionsModalName).trim();
		return modifySuccess;	
	}
	
	/**
	 * ��ͨģʽ��һ����¼�޸�
	 * @throws InterruptedException
	 */
	public String InsCommonPatternFirstRecordModify() throws InterruptedException{
		
		super.clickElement(Modify);
		Thread.sleep(2000);
		this.toInstructionsModalIframe();
		Thread.sleep(2000);
		super.operateInputElement(InstructionsModalNameInput, "��ͨģʽ��һ����¼�޸ĳɹ�");
		Thread.sleep(2000);
		super.clickElement(WakeUpTime);
		Thread.sleep(2000);
		super.clickElement(Now);
		Thread.sleep(2000);
		super.operateInputElement(TimeLimitCycleOfCommonPatternInut, "7");
		Thread.sleep(2000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		super.clickElement(SaveRules);
		Thread.sleep(2000);
		
		String modifySuccess =  super.getText(FirstRecordInstructionsModalName).trim();
		return modifySuccess;			
	}

	/**
	 * ��һ��ģ�巢��ָ��
	 * 
	 * @param imei
	 * @throws InterruptedException
	 */
	public void sendInstructions(String imei) throws InterruptedException {

		super.clickElement(Instructions);
		Thread.sleep(2000);
		super.operateInputElement(SearchTemplateIMEI, imei);
		Thread.sleep(2000);
		super.clickElement(AddIMEIBtn);
		Thread.sleep(2000);
		super.clickElement(SendInstructions);
		Thread.sleep(2000);
	}

	// ============================================================================================================================
	/**
	 * �·�����ģʽ�������
	 */
	public static final String IssuedTemplateList = "issuedTemplateList_li";
	/**
	 * ���κ�
	 */
	public static final String IssuedTemplateId = "issuedTemplateId";
	/**
	 * ģ������
	 */
	public static final String IssuedTemplateName = "issuedTemplateName";

	public static final String SearchIssuedTemplateBtn = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[2]/div[2]/form/div[3]/button";

	public static final String IssuedTemplateTr = "issuedTemplateBody";

	public static final String IssuedTemplatePagingLi = "issuedTemplatePaging";
	// ��������
	public static final String IssuedTemplateNoData = "issuedTemplateNoData";

	public static final String LookAtDevice = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[2]/div[4]/table/tbody/tr[1]/td[6]/a";

	public void workModelTaskManager() throws InterruptedException {

		super.clickElement(IssuedTemplateList);
		Thread.sleep(2000);
		super.clickElement(SearchIssuedTemplateBtn);
		Thread.sleep(2000);
		int number = page.pageNumber(IssuedTemplateNoData, IssuedTemplatePagingLi, IssuedTemplateTr);
		System.out.println(number);
		Thread.sleep(2000);
		super.operateInputElement(IssuedTemplateId, "20180202144247151");
		Thread.sleep(2000);
		super.clickElement(SearchIssuedTemplateBtn);
		Thread.sleep(2000);
		super.operateInputElement(IssuedTemplateId, "");
		Thread.sleep(2000);
		super.operateInputElement(IssuedTemplateName, "33333");
		Thread.sleep(2000);
		super.clickElement(SearchIssuedTemplateBtn);
		Thread.sleep(2000);
		super.clickElement(LookAtDevice);
		Thread.sleep(2000);
	}

	// ======================================================================================================================================

	/**
	 * �·�����ģʽ����
	 */
	public static final String IssuedStage = "issuedStageLi";

	public static final String IssuedTemplateBatchId = "issuedTemplateBatchId";

	public static final String SearchIssuedTemplateIMEI = "searchIssuedTemplateIMEI";

	public static final String AddIssuedTemplateIMEI = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[4]/div/div/div[2]/button[1]";

	public static final String StateOfExecution = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/span/div/span[2]";

	public static final String StateOfExecutionLi = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/span/div/div/ul/li";

	public static final String Status = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[3]/div/span/div/span[2]";

	public static final String StatusLi = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[3]/div/span/div/div/ul/li";

	public static final String SearchIssuedStageBtn = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[5]/button";
	/**
	 * ѡ��ȡ��ָ��
	 */
	public static final String SelectTheCancellationInstruction = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[6]/button[1]";
	/**
	 * ���β�ѯȫ��ȡ��ָ��
	 */
	public static final String AllCancellAtionsOfThisQuery = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[6]/button[2]";
	/**
	 * �鿴��һ����¼
	 */
	public static final String LookAt = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[1]/td[9]/a";

	public static final String CloseLookAt = "x,/html/body/div[2]/span[1]/a";

	public static final String IssuedStageTr = "issuedStageBody";

	public static final String IssuedStegePagingLi = "issuedStegePaging";
	// ��������
	public static final String IssuedStageNoData = "issuedStageNoData";
	// ������ִ��״̬
	public static final String ToBeSentStatus = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/span/div/div/ul/li[2]";

	public static final String DefaultState = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[3]/div[2]/form/div[3]/div/span/div/div/ul/li[1]";

	public static final String AllCheck = "x,//*[@id=\"issuedStageTableHeader\"]/thead/tr/th[1]/span/div/input";

	/**
	 * �·�����ģʽ�����ѯ����
	 * 
	 * @throws InterruptedException
	 *             //imei�� 888001234567894 ���κţ�20171127012810390
	 */
	public void workModelManager() throws InterruptedException {

		super.clickElement(IssuedStage);
		// Ĭ�ϲ�ѯȫ��
		Thread.sleep(2000);
		super.clickElement(SearchIssuedStageBtn);
		Thread.sleep(2000);

		int number = page.pageNumber(IssuedStageNoData, IssuedStegePagingLi, IssuedStageTr);
		Thread.sleep(2000);
		// �鿴��һ����¼
		super.clickElement(LookAt);
		Thread.sleep(2000);
		super.clickElement(CloseLookAt);
		Thread.sleep(2000);
		// ����imei�Ų�ѯ
		super.operateInputElement(SearchIssuedTemplateIMEI, "888001234567894");
		Thread.sleep(2000);
		super.clickElement(AddIssuedTemplateIMEI);
		Thread.sleep(2000);
		super.clickElement(SearchIssuedStageBtn);
		Thread.sleep(2000);
		// �������κŲ�ѯ
		super.operateInputElement(IssuedTemplateBatchId, "20171127012810390");
		Thread.sleep(2000);
		super.operateInputElement(SearchIssuedTemplateIMEI, "");
		Thread.sleep(2000);
		super.clickElement(SearchIssuedStageBtn);
		Thread.sleep(2000);
		super.operateInputElement(IssuedTemplateBatchId, "");
		Thread.sleep(2000);
		// ����ִ��״̬�� ����״̬����ѯ
		super.clickElement(StateOfExecution);
		Thread.sleep(2000);
		List<WebElement> elements = super.getElements(StateOfExecutionLi);
		Thread.sleep(2000);
		for (WebElement element : elements) {

			element.click();
			Thread.sleep(2000);

			super.clickElement(Status);
			Thread.sleep(2000);
			List<WebElement> webElements = super.getElements(StatusLi);

			for (WebElement webElement : webElements) {

				webElement.click();
				Thread.sleep(2000);
				super.clickElement(SearchIssuedStageBtn);
				Thread.sleep(2000);
				super.clickElement(Status);
				Thread.sleep(2000);
			}
			super.clickElement(StateOfExecution);
			Thread.sleep(2000);
		}

		super.clickElement(ToBeSentStatus);
		Thread.sleep(2000);
		super.clickElement(Status);
		Thread.sleep(2000);
		super.clickElement(DefaultState);
		Thread.sleep(2000);
		super.clickElement(SearchIssuedStageBtn);
		Thread.sleep(2000);
		if (super.isElementExist(IssuedStageNoData) == false) {

			if (!super.getElement(AllCheck).isSelected()) {

				super.clickElement(AllCheck);
			}
			Thread.sleep(2000);
			super.clickElement(SelectTheCancellationInstruction);
		}

	}

	// =====================================================================================================================================
	/**
	 * �·�ָ���������
	 */
	public static final String BatchInsTaskList = "batchInsTaskList_li";

	public static final String TaskId = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[4]/div[2]/form/div[1]/input";

	public static final String InsName = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[4]/div[2]/form/div[2]/input";

	public static final String SearchBatchInsTask = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[4]/div[2]/form/div[3]/button";

	public static final String PagingBatchInsTaskTr = "paging-batchInsTask";

	public static final String BatchInsTaskLi = "batchInsTask-tbody";
	
	public static final String BatchInsTaskNoData = "markNull-batchInsTask";

	public static final String ShowTaskInfo = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[4]/div[4]/table/tbody/tr[1]/td[9]/a";
	/**
	 * �·�ָ����������ѯ
	 * @throws InterruptedException
	 */
	public List<String> instructionsTaskManagementQuery() throws InterruptedException{
		
		super.clickElement(BatchInsTaskList);
		Thread.sleep(2000);
		//Ĭ������ȫ��
		super.clickElement(SearchBatchInsTask);
		
		int number = page.pageNumber(BatchInsTaskNoData, BatchInsTaskLi, PagingBatchInsTaskTr);
		String InsNumber = String.valueOf(number);
		System.out.println("InsNumber="+InsNumber);
		//�������κŲ�ѯ
		super.operateInputElement(TaskId, "13908132999649028");
		
		super.clickElement(SearchBatchInsTask);
		//����ָ�����Ʋ�ѯ
		super.operateInputElement(TaskId, "");
		
		super.operateInputElement(InsName, "SOS����");
		
		super.clickElement(SearchBatchInsTask);
		
		//�������κź�ָ�����ƾ�ȷ��ѯ��¼
		
		super.operateInputElement(TaskId, "157102208007566");
		
		super.operateInputElement(InsName, "ɾ��SOS����");
		
		super.clickElement(SearchBatchInsTask);
		
		super.clickElement(ShowTaskInfo);
		
		String batchNumber = super.getElement(BatchNumber).getAttribute("value").trim();
		List<String> taskData = new ArrayList<String>();
		
		taskData.add(InsNumber);
		taskData.add(batchNumber);
		
		return taskData;
		
	}
	
	// ===========================================================================================================================================

	/**
	 * �·�ָ�����
	 */
	public static final String BatchInsList = "batchInsList_li";
	//imei�����
	public static final String SearchImeis = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[1]/div/textarea";
	//���imei��ť
	public static final String AddImeis = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[1]/div/div/div[2]/button[1]";
	//���κ������
	public static final String BatchNumber = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[2]/input";
	//	״̬
	public static final String InsStatus = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[3]/div/span/div/span[2]";

	public static final String InsStatusLi = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[3]/div/span/div/div/ul/li";
	//������ť
	public static final String SearchBatchInsLogsBtn = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[4]/button";
	//ѡ��ȡ��ָ��
	public static final String SelectCancelIns = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[5]/button[1]";
	//ȫ��ȡ��ָ��
	public static final String SearchAllCancelIns = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[5]/button[2]";
	//����������������sos
	public static final String ImportSosAndFamilyNum = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[5]/button[3]";
	//����
	public static final String Export = "Export";
	//����������Ϣȫѡ
	public static final String ExportBaseInfoAllCheck = "x,//*[@id=\"exportsModal\"]/div/div[1]/div/div[1]/div/label/div/input";
	//��������
	public static final String AddTaskBtn = "addTaskBtn";
	//����
	public static final String TaskDownLoad = "x,//*[@id=\"exportsModal\"]/div/div[3]/div[2]/ul/div/li/div[2]/a";
	//�رյ���
	public static final String CloseExportModel = "x,/html/body/div[11]/span[1]/a";
	//����iframe
	public static final String ExportIframe = "x,/html/body/div[11]/div[2]/iframe";
	//��ǰҳָ���¼ȫѡ
	public static final String SelectAll = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[3]/div[1]/div[2]/div[2]/table/thead/tr/th[1]/div[1]/input";
	
	public static final String DropdownToggle = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]/div/button";

	public static final String DropdownToggleLi = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]/div/ul/li";
	
	public static final String DownloadImportmodelBtn = "x,/html/body/div[5]/div[2]/div/div/a";
	
	public static final String ensureUpdateData = "p,ȷ��";
	
	public static final String CancelUpdateData = "p,ȡ��";
	
	public static final String InsRecordTr = "x,//*[@id=\"batchInsLogsTableContent\"]/tbody";
	
	public static final String ImportUpdateFileBtn = "x,/html/body/div[5]/div[2]/div/div/form/button";
	
	public static final String CloseImportModel = "x,/html/body/div[5]/span/a";
	
	public static final String ToBeSent = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[2]/form/div[3]/div/span/div/div/ul/li[7]";
	
	public static final String SelectFirstRecord = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[3]/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[1]/input";
	
	public static final String NoRecordFound = "x,/html/body/div[1]/div[6]/div/div/div[2]/div[5]/div[3]/div[1]/div[2]/div[3]/table/tbody/tr/td";
	
	public static final String MarkNullBatchInsLogs = "markNull-batchInsLogs";
	
	/**
	 *  �·�ָ�����
	 * @throws InterruptedException
	 */
	public void batchInsManagement() throws InterruptedException{
		
		super.clickElement(BatchInsList);
		
		super.clickElement(SearchBatchInsLogsBtn);
		
		super.clickElement(InsStatus);
		
		srPage.selectDropdownToggle(DropdownToggle, DropdownToggleLi);
		
		this.batchInsMamagementExport();
		
		List<WebElement> elements = super.getElements(InsStatusLi);
		
		for (WebElement element : elements) {
			
			element.click();
			
			super.clickElement(SearchBatchInsLogsBtn);
			
			srPage.selectDropdownToggle(DropdownToggle, DropdownToggleLi);
			
			this.batchInsMamagementExport();
			
			super.clickElement(InsStatus);
		}
		
		super.operateInputElement(SearchImeis, "351609080199717");
		
		super.clickElement(AddImeis);
		
		super.clickElement(SearchBatchInsLogsBtn);
		
		super.operateInputElement(SearchImeis, "");
		
		super.operateInputElement(BatchNumber, "14097136183512627");
		
		super.clickElement(SearchBatchInsLogsBtn);
		
		super.operateInputElement(BatchNumber, "");
		
		this.SelectCancelIns();
		
		this.SearchAllCancelIns();
	}
	/**
	 * ѡ��ȡ��ָ��
	 * @throws InterruptedException
	 */
	public void SelectCancelIns() throws InterruptedException{
		
		super.clickElement(InsStatus);
		Thread.sleep(2000);
		super.clickElement(ToBeSent);
		Thread.sleep(2000);
		super.clickElement(SearchBatchInsLogsBtn);
		Thread.sleep(2000);
		if (super.isElementExist(MarkNullBatchInsLogs)==true) {
			Thread.sleep(2000);
			super.clickElement(SelectFirstRecord);
			Thread.sleep(2000);
			super.clickElement(SelectCancelIns);
			Thread.sleep(2000);
			super.clickElement(ensureUpdateData);
			Thread.sleep(2000);
		} 
		
	}
	/**
	 * ���β�ѯȫ��ȡ��ָ��
	 * @throws InterruptedException
	 */
	public void SearchAllCancelIns() throws InterruptedException{
		
		super.clickElement(InsStatus);
		Thread.sleep(2000);
		super.clickElement(ToBeSent);
		Thread.sleep(2000);
		super.clickElement(SearchBatchInsLogsBtn);
		Thread.sleep(2000);
		if (super.isElementExist(MarkNullBatchInsLogs)==true) {
			Thread.sleep(2000);
			super.clickElement(SelectAll);
			Thread.sleep(2000);
			super.clickElement(SearchAllCancelIns);
			Thread.sleep(2000);
			super.clickElement(ensureUpdateData);
			Thread.sleep(2000);
		} 
		
	}
	
	//����������������SOS
	public void ImportSosAndFamilyNum() throws InterruptedException{
		
		super.clickElement(ImportSosAndFamilyNum);
		Thread.sleep(2000);
		super.clickElement(DownloadImportmodelBtn);
		Thread.sleep(2000);
		super.clickElement(ensureUpdateData);
		Thread.sleep(2000);
		super.clickElement(CloseImportModel);
	}
	//�·�ָ�������
	public void batchInsMamagementExport() throws InterruptedException{
		Thread.sleep(2000);
		super.clickElement(Export);
		Thread.sleep(2000);
		super.switch_to_frame(ExportIframe);
		Thread.sleep(2000);
		super.clickElement(ExportBaseInfoAllCheck);
		Thread.sleep(2000);
		super.clickElement(AddTaskBtn);
		Thread.sleep(2000);
		super.clickElement(TaskDownLoad);
		Thread.sleep(3000);
		super.switch_to_frame("");
		Thread.sleep(2000);
		super.clickElement(CloseExportModel);
		Thread.sleep(2000);
	}
	
	
	public void selectWeekDayOfWeekPattern() throws InterruptedException {

		List<WebElement> elements = super.getElements(WeekDayOfWeekPattern);
		int size = elements.size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {

			if (!super.getElement(WeekDayOfWeekPattern + "[" + i + "]/a/label/div/input").isSelected()) {
				Thread.sleep(2000);
				super.clickElement(WeekDayOfWeekPattern + "[" + i + "]/a/label/div/ins");
				Thread.sleep(2000);
			}
		}
	}

	/**
	 * ����ָ�����ҳ��
	 * @throws InterruptedException 
	 */
	public String enterInstructionManagementPage() throws InterruptedException {

		super.explicitWait("//*[@id=\"systemSetting\"]");
		super.floatElement("systemSetting");
		Thread.sleep(2000);
		super.clickElement("p,ָ�����");
		String current_url = super.getCurrentUrl();
		System.out.println(current_url);
		Thread.sleep(2000);
		return current_url;
	}

}
