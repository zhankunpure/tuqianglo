package pages.loginPage;

import automatedriver.AutomateDriver;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import data.comdata.ComData;

/***
 * 途强登录页面
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
	 * 打开登录页面
	 */
	public void openLoginPage() {
		super.navigate(comd.baseUrl(), "/");
	}

	/**
	 * 输入用户账号
	 * 
	 * @param account
	 */
	public void account_input(String account) {
		super.operateInputElement("account", account);
	}

	/**
	 * 输入密码
	 * 
	 * @param password
	 */
	public void password_input(String password) {
		super.operateInputElement("password", password);
	}

	/**
	 * 点击登录按钮
	 */
	public void login_button_click() {
		super.clickElement("logins");
	}

	/**
	 * 选中记住我
	 */
	public void remember_me() {
		super.clickElement("checkbox");
	}

	/**
	 * 记住我是否已选中
	 * 
	 * @return
	 */
	public boolean check_remeber_me() {
		boolean box_status = super.getElement("checkbox").isSelected();
		return box_status;
	}

	/**
	 * 点击忘记密码
	 */
	public void forget_password() {
		super.clickElement("x,html/body/div[1]/div/div[3]/span[1]/a[1]");
	}

	/**
	 * 我要体验登录
	 */
	public void taste_user_login() {

		super.clickElement("x,//a[@title='我要体验']");
	}

	/**
	 * 找回密码用户输入
	 * 
	 * @param forgetPasswdAccount
	 */
	public void forget_passwd_account(String forgetPasswdAccount) {
		super.operateInputElement("x,//*[@id='validmessage-form']/div[1]/div/input", forgetPasswdAccount);
	}

	/**
	 * 找回密码用户手机输入
	 * 
	 * @param forgetPasswdPhone
	 */
	public void forget_passwd_phone(String forgetPasswdPhone) {
		super.operateInputElement("x,//*[@id='validmessage-form']/div[2]/div/input", forgetPasswdPhone);
	}

	/**
	 * 获取点击忘记密码后的窗口的文本信息，用于断言是否成功
	 * 
	 * @return
	 */
	public String get_text_after_forget_password() {

		String text = super.getText("x,//*[@id='RetrievePasswordModal']/div/div/div[1]/h4");
		return text;
	}

	/**
	 * 取消忘记密码窗口
	 */
	public void dismiss_forget_password() {
		super.clickElement("x,//*[@id='RetrievePasswordModal']/div/div/div[3]/button[3]");
	}

	/**
	 * 获取登录按钮的文本
	 * 
	 * @return
	 */
	public String login_button_text() {
		String login_button_text = super.getText("logins");
		return login_button_text;
	}

	/**
	 * 用户登录方法
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
	 * 记住用户登录方法
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
	 * 获取登录异常文本
	 */
	
	public String getLoginExceptionText() {
		
		String text = super.getElement("x,//*[@id=\"tipsmsg\"]").getText().trim();
		
		return text;
	}

	/**
	 * 切换所支持的语言
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
	 * 打开第三方网址
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
