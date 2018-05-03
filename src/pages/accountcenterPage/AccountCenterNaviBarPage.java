package pages.accountcenterPage;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

/***
 * �˻����ĵ���ҳ
 * @author ZhanKun
 *
 */
public class AccountCenterNaviBarPage extends AutomateDriver {

	public AccountCenterNaviBarPage(WebDriver dr) {
		super(dr);
		
	}

	
	/**
	 * ��ȡ��¼�û���
	 * @return HelloUser
	 * 
	 */
	public String getUserAccount(){
		super.waitForElementToLoad(10, "/html/body/header/div/div[2]/div[2]/div[1]/span/b");
		String HelloUser=super.getElement("x,/html/body/header/div/div[2]/div[2]/div[1]/span/b").getText();
		return HelloUser;
	}
	/**
	 * ��ȡ�����û���¼�û���
	 * @return HelloUser
	 * /html/body/div[1]/header/div/div[2]/div/div[1]/span/b
	 */
	public String getTasteUserAccount(){
		super.waitForElementToLoad(10, "/html/body/div[1]/header/div/div[2]/div/div[1]/span/b");
		String TasteUser=super.getElement("x,/html/body/div[1]/header/div/div[2]/div/div[1]/span/b").getText();
		return TasteUser;
	}
	//��ȡ�ǳ�
    public String getNickName(){
        String NickName = super.getElement("topusername").getText();
        return NickName;
    }
    //��ȡ�û��˺�
    public String getUserInfoAccount(){
        String UsrAccount = super.getElement("userAccount").getText();
        return UsrAccount;
    }
    //��ȡ�û�����
    public String getUserInfoType(){
        String UsrType = super.getElement("topusertype").getText();
        return UsrType;
    }
    //��ȡ�û��ֻ�
    public String getUserInfoPhone(){
        String UsrPhone = super.getElement("topuserphone").getText();
        return UsrPhone;
    }
    
    public String salesUsrServiceProvider(){
        String ServiceProviderAll = super.getElement(
            "x,/html/body/div[1]/div[5]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/ul/li[1]").getText();
        String ServiceProvider=ServiceProviderAll.split("??")[1];
        return ServiceProvider;
    }

    public String salesUsrServiceProviderConnect(){
        String ServiceProviderConnectAll = super.getElement(
            "x,/html/body/div[1]/div[5]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/ul/li[2]").getText();
        String ServiceProviderConnect=ServiceProviderConnectAll.split("??")[1];
        return ServiceProviderConnect;
    }

    public String sales_usr_service_provider_phone(){
        String service_provider_phone_all = super.getElement(
            "x,/html/body/div[1]/div[5]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/ul/li[3]").getText();
        String service_provider_phone=service_provider_phone_all.split("??")[1];
        return service_provider_phone;
    }

    public String ordinary_usr_service_provider(){
        String service_provider = super.getElement(
            "x,/html/body/div[1]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[2]/ul/li[1]").getText();
        return service_provider;
    }

    public String ordinary_usr_service_provider_connect(){
        String service_provider_connect = super.getElement(
            "x,/html/body/div[1]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[2]/ul/li[2]").getText();
        return service_provider_connect;
    }

    public String ordinary_usr_service_provider_phone(){
        String service_provider_phone = super.getElement(
            "x,/html/body/div[1]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[2]/ul/li[3]").getText();
        return service_provider_phone;
    }
    public void usr_logout() throws InterruptedException{
    	super.floatElement("x,//*[@id='userCenter']");
    	Thread.sleep(2000);
    	super.clickElement("p,�˳�ϵͳ");
    	Thread.sleep(1000);
    	String logout_text=super.getText("c,layui-layer-content");
    	System.out.println(logout_text);
    	super.clickElement("c,layui-layer-btn0");
    	Thread.sleep(1000);
    	
    }
    
    public void usr_logout_dismiss() throws InterruptedException{
    	super.floatElement("x,/html/body/div[1]/header/div/div[2]/div[2]/div[2]/span/a");
    	Thread.sleep(2000);
    	super.clickElement("p,�˳�ϵͳ");
    	Thread.sleep(1000);
    	super.clickElement("c,layui-layer-btn1");
    }
    public String per_data_account(){
    	return super.getText("edit-modal-account");
    }
    public String per_data_username(){
    	return super.getText("edit-modal-nickName");
    }
    public String per_data_phone(){
    	return super.getText("edit-modal-phone");
    }
    public String per_data_email(){
    	return super.getText("edit-modal-email");
    }
    public void float_to_setting() throws InterruptedException{
    	super.floatElement("x,/html/body/div[1]/header/div/div[2]/div[2]/div[2]/span/a");
    	Thread.sleep(2000);
    }
    public void click_mondify_info() throws InterruptedException{
    	super.clickElement("p,�޸�����");
    }
    public void click_mondify_password() throws InterruptedException{
    	super.clickElement("p,�޸�����");
    }
    /**
     * �޸��û�����
     * @param user_name
     * @param phone
     * @param email
     * @return
     * @throws InterruptedException
     */
    public String modify_usr_info(String user_name,String phone,String email) throws InterruptedException{
    	super.floatElement("x,//*[@id=\"userCenter\"]/a");
    	super.waitForElementToLoad(10, "x,//*[@id=\"userCenter\"]/div/ul/li[1]/a");
    	//�޸�����
    	super.clickElement("x,//*[@id=\"userCenter\"]/div/ul/li[1]/a");
    	//super.clickElement("p,�޸�����");
    	Thread.sleep(2000);
    	super.operateInputElement("edit-modal-nickName", user_name);
    	Thread.sleep(2000);
    	super.operateInputElement("edit-modal-phone", phone);
    	Thread.sleep(2000);
    	super.operateInputElement("edit-modal-email", email);
    	Thread.sleep(2000);
    	super.clickElement("c,layui-layer-btn0");
    	Thread.sleep(2000);
    	String save_status=super.getText("c,layui-layer-content");
    	System.out.println(save_status);
    	return save_status;
    }
    
    public String mondify_user_passwd(String oldPwd,String newPwd,String renewPwd) throws InterruptedException{
    	super.floatElement("x,//*[@id=\"userCenter\"]/a");
    	super.waitForElementToLoad(10, "x,//*[@id=\"userCenter\"]/div/ul/li[2]/a");
    	super.clickElement("x,//*[@id=\"userCenter\"]/div/ul/li[2]/a");
    	//super.clickElement("p,�޸�����");
    	super.operateInputElement("oldPwd", oldPwd);
    	
    	Thread.sleep(2000);
    	super.operateInputElement("newPwd", newPwd);
    	Thread.sleep(2000);
    	super.operateInputElement("renewPwd", renewPwd);
    	Thread.sleep(2000);
    	this.save_mondify_user_passwd();
    	String text = this.get_Mondify_user_passwd_content();
    	System.out.println(text);
    	Thread.sleep(2000);
    	this.click_confim_mondify_user_passwd();
    	return text;
    }
    
    public String get_title_mondify_user_passwd(){
    	return super.getText("x,//*[@id='layui-layer1']/div[1]");
    }
    public boolean close_mondify_user_passwd() throws InterruptedException{
    	super.clickElement("c,layui-layer-ico.layui-layer-close.layui-layer-close1");
    	return super.isElementExist("x,//*[@id='layui-layer1']/div[1]");
    }
    public boolean cancle_mondify_user_passwd() throws InterruptedException{
    	super.clickElement("c,layui-layer-btn1");
    	return super.isElementExist("x,//*[@id='layui-layer1']/div[1]");
    }
    public void click_confim_mondify_user_passwd() throws InterruptedException{
    	super.clickElement("c,layui-layer-btn0");
    }
    public String get_Mondify_user_passwd_content(){
    	return super.getText("c,layui-layer-content");
    }
    public void save_mondify_user_passwd() throws InterruptedException{
    	super.clickElement("c,layui-layer-btn0");
    }
    public String get_Mondify_OldPwd_Error(){
    	return super.getText("x,//*[@id=\"editpwd-form\"]/div[1]/div/label").trim();
    }
    public String get_Mondify_NewPwd_Error(){
    	return super.getText("x,//*[@id=\"editpwd-form\"]/div[2]/div/label").trim();
    }
    public String get_Mondify_RenewPwd_Error(){
    	return super.getText("x,//*[@id=\"editpwd-form\"]/div[3]/div/label").trim();
    }
  
    
    /**
     * ����˻�����
     * @throws InterruptedException 
     */
    public void click_account_center() throws InterruptedException {
    	super.waitForElementToLoad(10, "accountCenter");
    	super.clickElement("accountCenter");
    	
    }
    
    //����豸����
    public void click_DeviceManage() throws InterruptedException {
    	super.waitForElementToLoad(10, "device");
    	super.clickElement("device");
    	Thread.sleep(2000);
    }
    
    //����ͻ�����
    public void click_CustomerManage() throws InterruptedException {
    	super.waitForElementToLoad(10, "customer");
    	super.clickElement("x,//*[@id='customer']");
    	Thread.sleep(2000);
    }
    
    //���ͳ�Ʊ���
    public void click_StatisticalReport() throws InterruptedException {
    	super.waitForElementToLoad(10, "reportsManagement");
    	super.clickElement("reportsManagement");
    	
    	Thread.sleep(5000);
    	
    }
    
    //�����ȫ����
    public void click_SafeArea() throws InterruptedException {
    	super.waitForElementToLoad(10, "geozone");
    	super.clickElement("x,//*[@id='geozone']");
    	Thread.sleep(2000);
    }
    
    //����豸�ֲ�
    public void click_DeviceDistribution() throws InterruptedException {
    	super.waitForElementToLoad(10, "deviceDistribution");
    	super.clickElement("x,//*[@id='deviceDistribution']");
    	Thread.sleep(2000);
    }
    
    //���ȫ������
    public void click_GlobalSearch() throws InterruptedException {
    	super.waitForElementToLoad(10, "globalSearch");
    	super.clickElement("globalSearch");
    	Thread.sleep(2000);
    }
    
    //�����������
    public void clickOrderManager() throws InterruptedException {
    	super.waitForElementToLoad(10, "ordermanagerBtn");
    	super.clickElement("ordermanagerBtn");
    	Thread.sleep(2000);
    }
    
    //����˵�����
    public void clickBillManager() throws InterruptedException {
    	super.waitForElementToLoad(10, "billmanagerBtn");
    	super.clickElement("billmanagerBtn");
    	Thread.sleep(2000);
    }
    
   //��������ֵ��
    public void clickBuyCard() throws InterruptedException {
    	super.waitForElementToLoad(10, "buycardbtn");
    	super.clickElement("buycardbtn");
    }
   //����豸��ֵ
    public void clickRecharge() throws InterruptedException {
    	super.waitForElementToLoad(10, "rechargebtn");
    	super.clickElement("rechargebtn");
    }
   //�����ֵ������
    public void clickRechargeManager() throws InterruptedException {
    	super.waitForElementToLoad(10, "rechargemanagerbtn");
    	super.clickElement("rechargemanagerbtn");
    }
    
  //���������ֵ��
    public void normalBuyCard(String yearCard,String lifetimeCard,String payer,String payerPhone,String payerAccount) throws InterruptedException {
    	
    	super.clickElement("buycardbtn");
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[2]/div/input", yearCard);
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[3]/div/input", lifetimeCard);
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[4]/div/input", payer);
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[5]/div/input", payerPhone);
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[6]/div/input", payerAccount);
    	Thread.sleep(2000);
    	super.clickElement("p,�ύ");
    	Thread.sleep(2000);
    	super.clickElement("c,layui-layer-btn0");
    	Thread.sleep(2000);
    }
    //�쳣�����ֵ��
    @SuppressWarnings("unused")
	public List<String> abnormalBuyCard(String yearCard,String lifetimeCard,String payer,String payerPhone,String payerAccount) throws InterruptedException {
    	super.waitForElementToLoad(10, "buycardbtn");
    	super.clickElement("buycardbtn");
    	Thread.sleep(2000);
    	
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[2]/div/input", yearCard);
    	
    	Thread.sleep(2000);
    	
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[3]/div/input", lifetimeCard);
   
    	Thread.sleep(2000);
    	
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[4]/div/input", payer);
   
    	Thread.sleep(2000);
    	
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[5]/div/input", payerPhone);
    	
    	Thread.sleep(2000);
    	super.operateInputElement("x,//*[@id=\"modalApply\"]/div/form/div[6]/div/input", payerAccount);
    	
    	Thread.sleep(2000);
    	
    	
    	super.clickElement("p,�ύ");
    	String yearCard_error = super.getElement("x,//*[@id=\"modalApply\"]/div/form/div[2]/div/label").getText().trim();
    	String lifetimeCard_error = super.getElement("x,//*[@id=\"modalApply\"]/div/form/div[3]/div/label").getText().trim();
    	String payer_error = super.getElement("x,//*[@id=\"modalApply\"]/div/form/div[4]/div/label").getText().trim();
    	String payerPhone_error = super.getElement("x,//*[@id=\"modalApply\"]/div/form/div[5]/div/label").getText().trim();
    	String payerAccount_error = super.getElement("x,//*[@id=\"modalApply\"]/div/form/div[6]/div/label").getText().trim();
    	List<String> errors = new ArrayList<String>();
    	
    	errors.add(yearCard_error);
    	errors.add(lifetimeCard_error);
    	errors.add(payer_error);
    	errors.add(payerPhone_error);
    	errors.add(payerAccount_error);
    	System.out.println(errors);
       	
    	super.clickElement("p,ȡ��");
    	return errors;
  
    }
    
  //�꿨�豸��ֵ
    public void yearCardRecharge(String imei) throws InterruptedException {
    	// 201801080951079
    	super.waitForElementToLoad(10, "rechargebtn");
    	super.clickElement("rechargebtn");
    	Thread.sleep(2000);
    	
    	super.clickElement("x,/html/body/div[13]/div[2]/div/div/form/div[2]/div/div/div/span[2]");
    	Thread.sleep(2000);
    	super.clickElement("x,/html/body/div[13]/div[2]/div/div/form/div[2]/div/div/div/div/ul/li[1]");
    	Thread.sleep(2000);
    	// imei : 121201235207113
    	super.operateInputElement("searchIMEI", imei);
    	Thread.sleep(5000);
    	//���
    	super.clickElement("x,//*[contains(@text(),'���')]");
    	
    	Thread.sleep(2000);
    	super.clickElement("p,ɾ��");
    	Thread.sleep(2000);
    	super.operateInputElement("searchIMEI", imei);
    	Thread.sleep(2000);
    	super.clickElement("p,���");
    	Thread.sleep(2000);
    	super.clickElement("p,����");
    	Thread.sleep(2000);
    	super.clickElement("p,ȷ����ֵ");
    	Thread.sleep(2000);
    	//String text = super.getElement("x,/html/body/div[14]/div[2]/div/form/div[3]/div/table/tbody/tr/td[2]").getText();
    	
//    	if (text.trim().equals("���豸�Ѿ�������,����Ҫ��ֵ")) {
//			super.clickElement("x,/html/body/div[14]/span[1]/a");
//		}
    	//super.clickElement("p,����");
    }
    //�����豸��ֵ
    public void lifeTimeRecharge(String imei) throws InterruptedException {
    	//  201801081118001
    	super.clickElement("rechargebtn");
    	Thread.sleep(2000);
    	super.clickElement("x,/html/body/div[13]/div[2]/div/div/form/div[2]/div/div/div/span[2]");
    	Thread.sleep(2000);
    	
    	super.clickElement("x,/html/body/div[13]/div[2]/div/div/form/div[2]/div/div/div/div/ul/li[1]");
    	// imei : 121201235207113
    	super.operateInputElement("searchIMEI", imei);
    	Thread.sleep(2000);
    	super.clickElement("p,���");
    	Thread.sleep(2000);
    	super.clickElement("p,����");
    	Thread.sleep(2000);
    	super.clickElement("p,ȷ����ֵ");
    	Thread.sleep(2000);
//    	String text = super.getElement("x,/html/body/div[14]/div[2]/div/form/div[3]/div/table/tbody/tr/td[2]").getText();
//    	
//    	if (text.trim().equals("���豸�Ѿ�������,����Ҫ��ֵ")) {
//			super.clickElement("x,/html/body/div[14]/span[1]/a");
//		}
    	
    }
    
}
