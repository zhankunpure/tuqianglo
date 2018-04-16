package data.comdata.assertDate;

public class LoginPageAssertData {

	public String loginButtonText() {
		String text = "登录";
		return text;
	}

	public String cyberpoliceURL() {
		String URL = "http://www.cyberpolice.cn/wfjb/";
		return URL;
	}

	public String reportingCenterURL() {
		String URL = "http://www.12377.cn/";
		return URL;
	}

	public String networkSafeURL() {
		String URL = "http://www.500wan.com/pages/info/about/wangan/index.htm";
		return URL;
	}

	public String networkSupervisorURL() {
		String URL = "https://szcert.ebs.org.cn/2a950f00-00fb-495c-8e30-5a04100f9b17";
		return URL;
	}

	public String usernameOrPasswordNotNull() {

		return "用户名或密码不能为空";
	}

	public String passwordError() {

		return "密码错误";
	}

	public String accountNon_existent() {

		return "账号不存在";
	}

	
}
