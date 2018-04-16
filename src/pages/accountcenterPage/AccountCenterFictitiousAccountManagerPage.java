package pages.accountcenterPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;
/***
 * 璐︽埛涓績铏氭嫙璐︽埛绠＄悊椤甸潰
 * @author Administrator
 *
 */
public class AccountCenterFictitiousAccountManagerPage extends AutomateDriver {

	public AccountCenterFictitiousAccountManagerPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	//杩涘叆铏氭嫙璐﹀彿椤�
	public void enterFictitiousAccountPage() throws InterruptedException{
		super.clickElement("x,.//*[@id='fictitiousaccount']/a");
		Thread.sleep(2000);
		super.switchToFrame("fictitiousaccountFrame");
		super.explicitWait(".//*[@id='virtualTableContent']");
	}
	//寰楀埌鎵�鏈夌殑铏氭嫙璐﹀彿鏁伴噺
	public int getAllFicAccountNum(){
		List<WebElement> getAllFicAccountTr =new ArrayList<WebElement>();
		getAllFicAccountTr=super.getElements("x,.//*[@id='fictitiousAccount_tbody']/tr");
		return getAllFicAccountTr.size();
	}
	//寰楀埌鎵�鏈夌殑铏氭嫙璐﹀彿
	public List<String> getAllFicAccount(){
		List<String> getText =new ArrayList<String>();
		for(int i=1;i<=this.getAllFicAccountNum();i++){
			String el=super.getText("x,.//*[@id='fictitiousAccount_tbody']/tr["+i+"]/td[2]");
			getText.add(el);
		}
		return getText;
	}
	//寰楀埌铏氭嫙璐﹀彿椤甸潰title
	public String getFicAccountTitle(){
		String title=super.getText("x,html/body/div/div[1]/div/b");
		return title;
	}
	//鍒ゆ柇鏈夋病鏈夎櫄鎷熻处鍙�
	public boolean ficAccountIsNull(){
		
		if(super.isElementExist("fictitiousAccount_nodata")){
			return true;
		}else{
			return false;
		}
	}
	//鐐瑰嚮铏氭嫙璐﹀彿娣诲姞鎸夐挳
	public void clickAddFicAccountBtn(){
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div/button");
		super.switchToDefaultContent();
		super.explicitWait(".//*[@id='layui-layer1']/div[1]");
	}
	
	public void thirdClickAddAccountBtn(){
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div/button");
		super.switchToDefaultContent();
		super.explicitWait(".//*[@id='layui-layer3']/div[1]");
	
	}
	//寰楀埌娣诲姞铏氭嫙璐﹀彿椤祎itle
	public String getAddFicAccountLayuiTitle(){
		String title=super.getText("x,.//*[@id='layui-layer1']/div[1]");
		return title;
	}
	//鐐瑰嚮鍙栨秷娣诲姞铏氭嫙璐﹀彿
	public void clickCancelAddFicAccount() throws InterruptedException{
		super.clickElement("x,.//*[@id='layui-layer1']/span[1]/a");
		Thread.sleep(2000);
		super.switchToFrame("fictitiousaccountFrame");
		super.explicitWait("html/body/div/div[1]/div/b");
	}
	//鐐瑰嚮鍙栨秷娣诲姞铏氭嫙璐﹀彿鎸夐挳
	public void clickCancelAddFicAccountBtn() throws InterruptedException{
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div/button");
		Thread.sleep(2000);
		super.switchToDefaultContent();
		super.explicitWait(".//*[@id='layui-layer2']/div[1]");
		super.clickElement("x,.//*[@id='layui-layer2']/div[3]/a[2]");
		Thread.sleep(2000);
		super.switchToFrame("fictitiousaccountFrame");
		super.explicitWait("html/body/div[1]/div[1]/div/b");
	}
	//鍒ゆ柇铏氭嫙璐﹀彿鏄惁瀛樺湪
	public boolean ficAccountManagerIsExist(){
		if(super.isElementExist("x,html/body/div/div[1]/div/b")){
			return true;
		}else{
			return false;
		}
	}
	//娣诲姞铏氭嫙璐﹀彿鍔熻兘
	public void addFicAccount(String FicAccount,String FicAccountPassword,String ReFicAccountPassword,String EditData,String SendIns){
		super.operateInputElement("x,.//*[@id='fictitiousAccountForm']/div[1]/div/input", FicAccount);
		super.operateInputElement("fictitious_password", FicAccountPassword);
		super.operateInputElement("password", ReFicAccountPassword);
		if(EditData.equals("enableEditData")){
			super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input");
		}else{
			
		}
		if(SendIns.equals("enableSendIns")){
			super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input");
		}else{
			
		}
		super.clickElement("x,.//*[@id='layui-layer3']/div[3]/a[1]");
		}
	public void addFicAccountSuccess(String FicAccount,String FicAccountPassword,String ReFicAccountPassword,String EditData,String SendIns){
		this.addFicAccount(FicAccount, FicAccountPassword, ReFicAccountPassword, EditData, SendIns);
	}
	//娓呴櫎娣诲姞妗嗕俊鎭�
	public void clearFicAccountInfo(){
		super.clearElementInfo("x,.//*[@id='fictitiousAccountForm']/div[1]/div/input");
		super.clearElementInfo("fictitious_password");
		super.clearElementInfo("password");
	}
	//寰楀埌娣诲姞铏氭嫙璐﹀彿鎻愮ず璐﹀彿淇℃伅
	public String getFicAccountAccountTip(){
		String tip=super.getText("x,.//*[@id='fictitiousAccountForm']/div[1]/div/label");
		return tip;
	}
	//寰楀埌娣诲姞铏氭嫙璐﹀彿鎻愮ず瀵嗙爜淇℃伅
	public String getFicAccountPasswordTip(){
		String tip=super.getText("x,.//*[@id='fictitiousAccountForm']/div[2]/div/label");
		return tip;
	}
	//寰楀埌娣诲姞铏氭嫙璐﹀彿鎻愮ず鍐嶆杈撳叆瀵嗙爜淇℃伅
	public String getFicAccountRePasswordTip(){
		String tip=super.getText("x,.//*[@id='fictitiousAccountForm']/div[3]/div/label");
		return tip;
	}
	//寰楀埌娣诲姞铏氭嫙璐﹀彿鎴愬姛淇℃伅
	public String getAddFicAccountSuccessLayui(){
		super.switchToFrame("fictitiousaccountFrame");
		String AddFicAccountSuccessLayui=super.getText("x,.//*[@id='layui-layer4']/div");
		return AddFicAccountSuccessLayui;
	}
	//寰楀埌璐﹀彿缂栬緫鎸夐挳鍏冪礌
	public WebElement getFicAccountElementEditBtn(String FicAccount){
		List<String> AllFicAccount =new ArrayList<String>();
		AllFicAccount=this.getAllFicAccount();
		for(int i=0;i<AllFicAccount.size();i++){
			if(AllFicAccount.get(i).equals(FicAccount)){
				return super.getElement("x,.//*[@id='fictitiousAccount_tbody']/tr["+i+"]/td[4]/a[1]");
			}
		}
		return null;
	}
	//鐐瑰嚮铏氭嫙璐﹀彿缂栬緫鎸夐挳
	public void clickEditBtn(String FicAccount){
		this.getFicAccountElementEditBtn(FicAccount);
		super.switchToDefaultContent();
		super.explicitWait(".//*[@id='fictitiousAccountForm']");
	}
	//寰楀埌铏氭嫙璐﹀彿id
	public String getFicAccountId(){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("$('#fictitiousAccountForm').find('input').prop('type','yy');");
		Object o=js.executeScript("return $('#fictitiousAccountForm').find('input').attr('value');");
		return String.valueOf(o);
	}
	public String getFicAccountId1(){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("return $('#fictitiousAccountForm').find('input').prop('type','yy');");
		String getId=super.getElement("x,.//*[@id='fictitiousAccountForm']/input").getAttribute("value");
		return getId;
	}
	//寰楀埌铏氭嫙璐﹀彿淇敼鏁版嵁鍕鹃�夋鏄惁鍕鹃��
	public boolean getEditFicAccountEditDateSelectStatus(){
		if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input")==true){
			return true;
		}else{
			return false;
		}
	}
	//寰楀埌铏氭嫙璐﹀彿涓嬪彂鎸囦护妗嗘槸鍚﹀嬀閫�
	public boolean getEditFicAccountSendInsSelectStatus(){
		if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input")==true){
			return true;
		}else{
			return false;
		}
	}
	public void switchToFicFrame(){
		super.switchToFrame("fictitiousaccountFrame");
		super.explicitWait("html/body/div/div[1]/div/b");
	}
	//寰楀埌褰撳墠铏氭嫙璐﹀彿
	public String getFicAccountAccount(){
		String getFicAccountAccount=super.getText("x,.//*[@id='fictitiousAccount_tbody']/tr[1]/td[2]");
		return getFicAccountAccount;
	}
	//鐐瑰嚮缂栬緫铏氭嫙璐﹀彿
	public void clickEditFicAccountBtn(){
		
		super.clickElement("x,.//*[@id='fictitiousAccount_tbody']/tr[1]/td[4]/a[1]");
		super.switchToDefaultContent();
		//super.explicitWait(".//*[@id='layui-layer1']");
	}
	//缂栬緫铏氭嫙璐﹀彿
	public void editFicAccount(String FicAccountPassword,String ReFicAccountPassword,String EditData,String SendIns){
		
		super.operateInputElement("fictitious_password", FicAccountPassword);
		super.operateInputElement("password", ReFicAccountPassword);
		if(EditData.equals("enableEditData")){
			if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input")==true){
				
			}else{
				super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input");
			}
		}else{
			if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input")==true){
				super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[1]/label/div/input");
				}else{
					
				}
			
		}
		if(SendIns.equals("enableSendIns")){
			if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input")==true){
				
			}else{
				super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input");
			}
		}else{
			if(super.checkboxIsSelector("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input")==true){
				super.clickCheckbox("x,.//*[@id='fictitiousAccountForm']/div[4]/div/ul/li[2]/label/div/input");
				}else{
					
			}
			
		}
		super.clickElement("x,.//*[@id='layui-layer1']/div[3]/a[1]");
		}
	//寰楀埌缂栬緫铏氭嫙璐﹀彿鎴愬姛layui
	public String getEditFicAccountOperateSuccTitle(){
		super.explicitWait(".//*[@id='layui-layer2']");
		return super.getText("x,.//*[@id='layui-layer2']/div");
		
	}
	//鍒囨崲鍒拌櫄鎷熻处鍙烽〉闈rame
	public void switchToFicAccountPage(){
		super.switchToFrame("fictitiousaccountFrame");
	}
	public void clickFicAccountDelBtn(){
		super.clickElement("x,.//*[@id='fictitiousAccount_tbody']/tr[1]/td[2]");
		super.explicitWait(".//*[@id='layui-layer1']");
	}
	
	public void canlceDelFicAccount(){
		super.clickElement("x,.//*[@id='layui-layer1']/span[1]/a");
		super.explicitWait("html/body/div[1]/div[1]/div/b");
	}
	public void canlceDelFicAccountBtn(){
		super.clickElement("x,.//*[@id='layui-layer2']/div[3]/a[2]");
		super.explicitWait("html/body/div[1]/div[1]/div/b");
	}
	public void clickDelFicAccountBtn(){
		super.clickElement("x,.//*[@id='layui-layer3']/div[3]/a[1]");
		super.explicitWait("html/body/div[1]/div[1]/div/b");
	}
	
}



