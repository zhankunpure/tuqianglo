package pages.accountcenterPage;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

/***
 * 账户中心导航页
 * @author ZhanKun
 *
 */
public class AccountCenterNaviBarPage extends AutomateDriver {

	public AccountCenterNaviBarPage(WebDriver dr) {
		super(dr);
		
	}

	
	/**
	 * 获取登录用户名
	 * @return HelloUser
	 * 
	 */
	public String getUserAccount(){
		super.waitForElementToLoad(10, "/html/body/header/div/div[2]/div[2]/div[1]/span/b");
		String HelloUser=super.getElement("x,/html/body/header/div/div[2]/div[2]/div[1]/span/b").getText();
		return HelloUser;
	}
	/**
	 * 获取体验用户登录用户名
	 * @return HelloUser
	 * /html/body/div[1]/header/div/div[2]/div/div[1]/span/b
	 */
	public String getTasteUserAccount(){
		super.waitForElementToLoad(10, "/html/body/div[1]/header/div/div[2]/div/div[1]/span/b");
		String TasteUser=super.getElement("x,/html/body/div[1]/header/div/div[2]/div/div[1]/span/b").getText();
		return TasteUser;
	}
	//获取昵称
    public String getNickName(){
        String NickName = super.getElement("topusername").getText();
        return NickName;
    }
    //获取用户账号
    public String getUserInfoAccount(){
        String UsrAccount = super.getElement("userAccount").getText();
        return UsrAccount;
    }
    //获取用户类型
    public String getUserInfoType(){
        String UsrType = super.getElement("topusertype").getText();
        return UsrType;
    }
    //获取用户手机
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
    	super.clickElement("p,退出系统");
    	Thread.sleep(1000);
    	String logout_text=super.getText("c,layui-layer-content");
    	System.out.println(logout_text);
    	super.clickElement("c,layui-layer-btn0");
    	Thread.sleep(1000);
    	
    }
    
    public void usr_logout_dismiss() throws InterruptedException{
    	super.floatElement("x,/html/body/div[1]/header/div/div[2]/div[2]/div[2]/span/a");
    	Thread.sleep(2000);
    	super.clickElement("p,退出系统");
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
    public void click_mondify_info(){
    	super.clickElement("p,修改资料");
    }
    public void click_mondify_password(){
    	super.clickElement("p,修改密码");
    }
    /**
     * 修改用户资料
     * @param user_name
     * @param phone
     * @param email
     * @return
     * @throws InterruptedException
     */
    public String modify_usr_info(String user_name,String phone,String email) throws InterruptedException{
    	super.floatElement("x,//*[@id=\"userCenter\"]/a");
    	super.waitForElementToLoad(10, "x,//*[@id=\"userCenter\"]/div/ul/li[1]/a");
    	//修改资料
    	super.clickElement("x,//*[@id=\"userCenter\"]/div/ul/li[1]/a");
    	//super.clickElement("p,修改资料");
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
    	//super.clickElement("p,修改密码");
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
    public boolean close_mondify_user_passwd(){
    	super.clickElement("c,layui-layer-ico.layui-layer-close.layui-layer-close1");
    	return super.isElementExist("x,//*[@id='layui-layer1']/div[1]");
    }
    public boolean cancle_mondify_user_passwd(){
    	super.clickElement("c,layui-layer-btn1");
    	return super.isElementExist("x,//*[@id='layui-layer1']/div[1]");
    }
    public void click_confim_mondify_user_passwd(){
    	super.clickElement("c,layui-layer-btn0");
    }
    public String get_Mondify_user_passwd_content(){
    	return super.getText("c,layui-layer-content");
    }
    public void save_mondify_user_passwd(){
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
     * 点击账户中心
     * @throws InterruptedException 
     */
    public void click_account_center() throws InterruptedException {
    	
    	super.clickElement("x,//*[@id=\"accountCenter\"]");
    	
    }
    
    //点击设备管理
    public void click_DeviceManage() {
    	
    	super.clickElement("x,//*[@id='device']");
    }
    
    //点击客户管理
    public void click_CustomerManage() {
    	
    	super.clickElement("x,//*[@id='customer']");
    }
    
    //点击统计报表
    public void click_StatisticalReport() {
    	
    	super.clickElement("x,//*[@id='reportsManagement']");
    }
    
    //点击安全区域
    public void click_SafeArea() {
    	
    	super.clickElement("x,//*[@id='geozone']");
    }
    
    //点击设备分布
    public void click_DeviceDistribution() {
    	
    	super.clickElement("x,//*[@id='deviceDistribution']");
    }
    
    //点击全局搜索
    public void click_GlobalSearch() {
    	
    	super.clickElement("x,//*[@id='globalSearch']");
    }
    
    //点击订单管理
    public void clickOrderManager() {
    	
    	super.clickElement("ordermanagerBtn");
    }
    
    //点击账单管理
    public void clickBillManager() {
    	
    	super.clickElement("billmanagerBtn");
    }
    
   //点击购买充值卡
    public void clickBuyCard() {
    	
    	super.clickElement("buycardbtn");
    }
   //点击设备充值
    public void clickRecharge() {
    	
    	super.clickElement("rechargebtn");
    }
   //点击充值卡管理
    public void clickRechargeManager() {
    	
    	super.clickElement("rechargemanagerbtn");
    }
    
  //正常购买充值卡
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
    	super.clickElement("p,提交");
    	Thread.sleep(2000);
    	super.clickElement("c,layui-layer-btn0");
    	Thread.sleep(2000);
    }
    //异常购买充值卡
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
    	
    	
    	super.clickElement("p,提交");
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
       	
    	super.clickElement("p,取消");
    	return errors;
  
    }
    
  //年卡设备充值
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
    	//添加
    	super.clickElement("x,//*[contains(@text(),'添加')]");
    	
    	Thread.sleep(2000);
    	super.clickElement("p,删除");
    	Thread.sleep(2000);
    	super.operateInputElement("searchIMEI", imei);
    	Thread.sleep(2000);
    	super.clickElement("p,添加");
    	Thread.sleep(2000);
    	super.clickElement("p,续费");
    	Thread.sleep(2000);
    	super.clickElement("p,确定充值");
    	Thread.sleep(2000);
    	//String text = super.getElement("x,/html/body/div[14]/div[2]/div/form/div[3]/div/table/tbody/tr/td[2]").getText();
    	
//    	if (text.trim().equals("该设备已经是终身,不需要充值")) {
//			super.clickElement("x,/html/body/div[14]/span[1]/a");
//		}
    	//super.clickElement("p,重置");
    }
    //终身卡设备充值
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
    	super.clickElement("p,添加");
    	Thread.sleep(2000);
    	super.clickElement("p,续费");
    	Thread.sleep(2000);
    	super.clickElement("p,确定充值");
    	Thread.sleep(2000);
//    	String text = super.getElement("x,/html/body/div[14]/div[2]/div/form/div[3]/div/table/tbody/tr/td[2]").getText();
//    	
//    	if (text.trim().equals("该设备已经是终身,不需要充值")) {
//			super.clickElement("x,/html/body/div[14]/span[1]/a");
//		}
    	
    }
    
}
