package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;

/***
 * 充值卡管理页面
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterRechargePage extends AutomateDriver {
	/**
	 * 用户账号
	 */
	public static final String USER_ACCONUT = "userAccount";
	/**
	 * 充值卡数量 Number of recharge cards
	 */
	public static final String RECHARGE_NUMBER = "userType";
	/**
	 * 购买记录 Purchase record
	 */
	public static final String PURCHASE_RECORD = "p,购买记录";
	/**
	 * 转移记录 Transfer record
	 */
	public static final String TRANSFER_RECORD = "p,转移记录";
	/**
	 * 充值记录
	 */
	public static final String RECHARGE_RECORD = "p,充值记录";
	/**
	 * 购买记录 默认全部
	 */
	public static final String PURCHASE_RECORD_DEFALT_ALL = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/span[2]";
	/**
	 * 购买记录 全部搜索
	 */
	public static final String PURCHASE_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[1]";
	/**
	 * 购买记录 成功搜索
	 */
	public static final String PURCHASE_RECORD_SECCESS_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[2]";
	/**
	 * 购买记录 失败搜索
	 */
	public static final String PURCHASE_RECORD_FAIL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[3]";
	/**
	 * 购买记录 处理中搜索
	 */
	public static final String PURCHASE_RECORD_HANDLE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[4]";
	/**
	 * 购买记录 搜索按钮
	 */
	public static final String PURCHASE_RECORD_SEARCH = "queryOrderBtn";
	/**
	 * 转移记录 搜索按钮
	 */
	public static final String TRANSFER_RECORD_SEARCH = "queryTransferBtn";
	/**
	 * 转移记录 默认全部
	 */
	public static final String TRANSFER_RECORD_DEFALT_ALL = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/span[2]";
	/**
	 * 转移记录 全部搜索
	 */
	public static final String TRANSFER_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[1]";
	/**
	 * 转移记录 转入搜索
	 */
	public static final String TRANSFER_RECORD_TO_CHANGE_INTO_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[2]";
	/**
	 * 转移记录 转出搜索
	 */
	public static final String TRANSFER_RECORD_TURN_OUT_SEARCH = "x,/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[3]";
	/**
	 * 充值记录 默认全部
	 */
	public static final String RECHARGE_RECORD_DEFALT_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/span[2]";
	/**
	 * 充值记录 全部搜索
	 */
	public static final String RECHARGE_RECORD_ALL_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[1]";
	/**
	 * 充值记录 年卡搜索 yearCard
	 */
	public static final String RECHARGE_RECORD_YEAR_CARD_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[2]";
	/**
	 * 充值记录 终身卡搜索 lifetimeCard
	 */
	public static final String RECHARGE_RECORD_LIFETIME_CARD_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[1]/div/div/ul/li[3]";
	/**
	 * 充值记录 IMEI号 搜索 searchIMEIs
	 */
	public static final String RECHARGE_RECORD_IMEIS_SEARCH = "searchIMEIs";

	/**
	 * 充值记录 默认时间搜索
	 */
	public static final String RECHARGE_RECORD_DEFALT_TIME_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/span[2]";
	/**
	 * 充值记录 充值时间搜索 Recharge time
	 */
	public static final String RECHARGE_RECORD_RECHARGE_TIME_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[1]";
	/**
	 * 充值记录 充值前设备到期时间 搜索 Expiration time of pre recharge
	 */
	public static final String RECHARGE_RECORD_EXPIRATION_TIME_OF_PRE_RECHARGE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[2]";

	/**
	 * 充值记录 充值后设备到期时间 搜索 expiration time after recharge
	 */
	public static final String RECHARGE_RECORD_EXPIRATION_TIME_AFTER_RECHARGE_SEARCH = "x,/html/body/div[6]/div/div[3]/div[3]/div[1]/div[3]/div/div/div/ul/li[3]";
	/**
	 * 转移记录 开始时间 start_time
	 */
	public static final String RECHARGE_RECORD_START_TIME_SEARCH = "start_time";
	/**
	 * 充值记录 结束时间 end_time
	 */
	public static final String RECHARGE_RECORD_END_TIME_SEARCH = "end_time";
	/**
	 * 充值记录 所属用户 Subordinate users
	 */
	public static final String RECHARGE_RECORD_SUBORDINATE_USERS_SEARCH = "account";
	/**
	 * 充值记录 搜索按钮
	 */
	public static final String RECHARGE_RECORD_SEARCH = "queryRechargeBtn";

	public AccountCenterRechargePage(WebDriver dr) {
		super(dr);

	}

	/**
	 *  获取我的账号
	 * @return
	 */
	public String getMyAccount() {

		return super.getElement(USER_ACCONUT).getAttribute("title");
	}

	/**
	 *  获取充值卡数量
	 * @return
	 */
	public String getRechargeCardNum() {

		return super.getElement(RECHARGE_NUMBER).getText();
	}
	
	/**
	 * 购买记录搜索  Purchase record
	 * @throws InterruptedException 
	 */
	public void  purchaseRecordSearch() throws InterruptedException {
		//点击购买记录
		super.clickElement(PURCHASE_RECORD);
		//点击购买记录搜索按钮
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//点击默认下拉菜单
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		//点击成功菜单
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_SECCESS_SEARCH);
		//点击购买记录搜索按钮
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//失败条件搜索购买记录
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_FAIL_SEARCH);
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		//处理中条件搜索购买记录
		super.clickElement(PURCHASE_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(PURCHASE_RECORD_HANDLE_SEARCH);
		super.clickElement(PURCHASE_RECORD_SEARCH);
		Thread.sleep(2000);
		
	}
	/**
	 * 转移记录搜索 TRANSFER_RECORD
	 * @throws InterruptedException 
	 */
	public void transferRecordSearch() throws InterruptedException {
		//点击转移记录
		super.clickElement(TRANSFER_RECORD);
		//点击转移记录搜索按钮
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
		//转入条件搜索转移记录  
		//点击默认下拉菜单
		super.clickElement(TRANSFER_RECORD_DEFALT_ALL);
		//   点击转入菜单
		Thread.sleep(1000);
		super.clickElement(TRANSFER_RECORD_TO_CHANGE_INTO_SEARCH);
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
		//转出条件搜索转移记录  
		super.clickElement(TRANSFER_RECORD_DEFALT_ALL);
		Thread.sleep(1000);
		super.clickElement(TRANSFER_RECORD_TURN_OUT_SEARCH);
		super.clickElement(TRANSFER_RECORD_SEARCH);
		Thread.sleep(2000);
	}
	
	/**
	 * 充值记录搜索
	 * RECHARGE_RECORD
	 * @throws InterruptedException 
	 */
	public void rechargeRecordSearch(String imei,String startTime,String endTime,String account) throws InterruptedException {
		//点击充值记录
		super.clickElement(RECHARGE_RECORD);
		//点击充值记录搜索按钮
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//按年卡条件搜索
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_YEAR_CARD_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//按终身卡条件搜索
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_LIFETIME_CARD_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//按imei号查询
		super.clickElement(RECHARGE_RECORD_DEFALT_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_ALL_SEARCH);
		
		super.operateInputElement(RECHARGE_RECORD_IMEIS_SEARCH, imei);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//充值前设备到期时间 搜索
		super.clickElement(RECHARGE_RECORD_DEFALT_TIME_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_EXPIRATION_TIME_OF_PRE_RECHARGE_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//充值后设备到期时间 搜索 
		super.clickElement(RECHARGE_RECORD_DEFALT_TIME_SEARCH);
		Thread.sleep(1000);
		super.clickElement(RECHARGE_RECORD_EXPIRATION_TIME_AFTER_RECHARGE_SEARCH);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//开始时间搜索
		super.operateInputElement(RECHARGE_RECORD_START_TIME_SEARCH, startTime);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//结束时间搜索
		super.operateInputElement(RECHARGE_RECORD_END_TIME_SEARCH, endTime);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
		//所属用户搜索
		super.operateInputElement(RECHARGE_RECORD_SUBORDINATE_USERS_SEARCH, account);
		
		super.clickElement(RECHARGE_RECORD_SEARCH);
		Thread.sleep(2000);
	}
}
