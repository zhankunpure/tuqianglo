package pages.loginPage;

import automatedriver.AutomateDriver;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import data.comdata.ComData;

/***
 * ;ǿ��¼ҳ��
 * 
 * @author zhankun
 *
 */
public class LoginPage extends AutomateDriver {

	public String currentUrl;

	public LoginPage(WebDriver dr) {
		super(dr);

	}

	public ComData comd = new ComData();

	/**
	 * �򿪵�¼ҳ��
	 */
	public void openLoginPage() {
		super.navigate(comd.baseUrl(), "/");
	}

	/**
	 * �����û��˺�
	 * 
	 * @param account
	 */
	public void account_input(String account) {
		super.operateInputElement("account", account);
	}

	/**
	 * ��������
	 * 
	 * @param password
	 */
	public void password_input(String password) {
		super.operateInputElement("password", password);
	}

	/**
	 * �����¼��ť
	 */
	public void login_button_click() {
		super.clickElement("logins");
	}

	/**
	 * ѡ�м�ס��
	 */
	public void remember_me() {
		super.clickElement("checkbox");
	}

	/**
	 * ��ס���Ƿ���ѡ��
	 * 
	 * @return
	 */
	public boolean check_remeber_me() {
		boolean box_status = super.getElement("checkbox").isSelected();
		return box_status;
	}

	/**
	 * �����������
	 */
	public void forget_password() {
		super.clickElement("x,html/body/div[1]/div/div[3]/span[1]/a[1]");
	}

	/**
	 * ��Ҫ�����¼
	 */
	public void taste_user_login() {

		super.clickElement("x,//a[@title='��Ҫ����']");
	}

	/**
	 * �һ������û�����
	 * 
	 * @param forgetPasswdAccount
	 */
	public void forget_passwd_account(String forgetPasswdAccount) {
		super.operateInputElement("x,//*[@id='validmessage-form']/div[1]/div/input", forgetPasswdAccount);
	}

	/**
	 * �һ������û��ֻ�����
	 * 
	 * @param forgetPasswdPhone
	 */
	public void forget_passwd_phone(String forgetPasswdPhone) {
		super.operateInputElement("x,//*[@id='validmessage-form']/div[2]/div/input", forgetPasswdPhone);
	}

	/**
	 * ��ȡ������������Ĵ��ڵ��ı���Ϣ�����ڶ����Ƿ�ɹ�
	 * 
	 * @return
	 */
	public String get_text_after_forget_password() {

		String text = super.getText("x,//*[@id='RetrievePasswordModal']/div/div/div[1]/h4");
		return text;
	}

	/**
	 * ȡ���������봰��
	 */
	public void dismiss_forget_password() {
		super.clickElement("x,//*[@id='RetrievePasswordModal']/div/div/div[3]/button[3]");
	}

	/**
	 * ��ȡ��¼��ť���ı�
	 * 
	 * @return
	 */
	public String login_button_text() {
		String login_button_text = super.getText("logins");
		return login_button_text;
	}

	/**
	 * �û���¼����
	 * 
	 * @param account
	 * @param password
	 * @throws InterruptedException
	 */
	public void user_login(String account, String password) throws InterruptedException {
		this.account_input(account);
		Thread.sleep(2000);
		this.password_input(password);
		Thread.sleep(2000);
		this.login_button_click();
		Thread.sleep(2000);
	}
	/**
	 * ��ס�û���¼����
	 * 
	 * @param account
	 * @param password
	 * @throws InterruptedException
	 */
	public void user_login_with_remember_me(String account, String password) throws InterruptedException {
		this.account_input(account);
		this.password_input(password);
		if (this.check_remeber_me()==false) {
			this.remember_me();
		} 
		this.login_button_click();
		Thread.sleep(2000);
	}
	
	/**
	 * ��ȡ��¼�쳣�ı�
	 */
	
	public String getLoginExceptionText() {
		
		String text = super.getElement("x,//*[@id=\"tipsmsg\"]").getText().trim();
		
		return text;
	}

	/**
	 * �л���֧�ֵ�����
	 * 
	 * @param language
	 * @return
	 * @throws InterruptedException
	 */
	public String change_language(String language) throws InterruptedException {
		if (language.equals("zh")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[1]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else if (language.equals("English")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[2]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else if (language.equals("Espana")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[3]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else if (language.equals("Portugal")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[4]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else if (language.equals("Polska")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[5]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else if (language.equals("Deutschland")) {
			super.clickElement("x,html/body/footer/div[1]/ul/li[6]/a");
			Thread.sleep(3000);
			String login_button_text = this.login_button_text();
			return login_button_text;
		} else {
			return null;
		}
	}

	/**
	 * �򿪵�������ַ
	 * 
	 * @param web_name
	 * @return
	 * @throws InterruptedException
	 */
	public String enter_third_party_website(String web_name, String tuqiang_handle) throws InterruptedException {
		if (web_name.equals("trustWeb")) {
			super.clickElement("x,/html/body/footer/div[2]/a[1]");

			Set<String> handles = new HashSet<String>();
			handles = super.getAllWindowHandles();
			for (String handle : handles) {
				if (!handle.equals(tuqiang_handle)) {
					super.switchToWindow(handle);
					currentUrl = super.getCurrentUrl();
					Thread.sleep(1000);
					super.close();
				}
			}

		} else if (web_name.equals("cybercop")) {
			super.clickElement("x,/html/body/footer/div[2]/a[2]");

			Set<String> handles = new HashSet<String>();
			handles = super.getAllWindowHandles();
			for (String handle : handles) {
				if (!handle.equals(tuqiang_handle)) {
					super.switchToWindow(handle);
					currentUrl = super.getCurrentUrl();
					Thread.sleep(1000);
					super.close();
				}
			}

		} else if (web_name.equals("safeMonitor")) {
			super.clickElement("x,/html/body/footer/div[2]/a[3]");

			Set<String> handles = new HashSet<String>();
			handles = super.getAllWindowHandles();
			for (String handle : handles) {
				if (!handle.equals(tuqiang_handle)) {
					super.switchToWindow(handle);
					currentUrl = super.getCurrentUrl();
					Thread.sleep(1000);
					super.close();
				}
			}

		} else if (web_name.equals("badInfo")) {
			super.clickElement("x,/html/body/footer/div[2]/a[4]");

			Set<String> handles = new HashSet<String>();
			handles = super.getAllWindowHandles();
			for (String handle : handles) {
				if (!handle.equals(tuqiang_handle)) {
					super.switchToWindow(handle);
					currentUrl = super.getCurrentUrl();
					Thread.sleep(1000);
					super.close();
				}
			}

		}
		return currentUrl;

	}

}
