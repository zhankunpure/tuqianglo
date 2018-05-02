package pages.accountcenterPage;


import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

/***
 * 消息中心页面元素定位操作和方法
 * @author ZhanKun
 *
 */
public class AccountCenterMsgCenterPage extends AutomateDriver {

	public AccountCenterMsgCenterPage(WebDriver dr) {
		super(dr);
		
	}
	public void enterMsgCenter() throws InterruptedException{
		
		super.clickElement("x,//*[@id=\"systemTools\"]/a");
		Thread.sleep(10000);
//		super.switchToFrame("usermessageFrame");
		super.explicitWait("//*[@id='remainSearchDeviceInput']");
		}
	public int messageNumber() throws InterruptedException{
		BasePage basep=new BasePage(dr);
		return basep.pageNumber("msg_paging", "msg_tbody");
	}
	//消息中心参数输入
	public void msgCenterParamInput(String imei,String message_type,String status) throws InterruptedException{
		System.out.println(imei);
		if(imei==null||imei.length()==0){
			super.operateInputElement("remainSearchDeviceInput", null);
		}else{
			super.operateInputElement("remainSearchDeviceInput", imei);
		}
		//消息类型		
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/span[2]");
		Thread.sleep(1000);
		if(message_type.equals("offline")){
			
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[2]");
		}else if(message_type.equals("expire")){
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[3]");
		}else if(message_type.equals("guide")){
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[4]");
		}else if(message_type.equals("lowpower")){
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[5]");
		}else{
			
		}
		//读取状态
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[2]/div/span[2]");
		Thread.sleep(1000);
		if(status.equals("unread")){
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[2]");
		}else if(status.equals("readed")){
			super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[3]");
		}else{
			
		}
		//搜索按钮
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/button");
		Thread.sleep(15000);
		super.explicitWait("//*[@id='msg_paging']");
		super.clearOperateInputElement("remainSearchDeviceInput");
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/span[2]");
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[1]");
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[2]/div/span[2]");
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[1]");
	}
	//未读消息条数
	public int unreadMessNumber(){
		
		super.explicitWait("//*[@id='unReadTotal']");
		String UnreadMessNumber= super.getText("unReadTotal");
		int number=Integer.parseInt(UnreadMessNumber);
		return number;
	}
	//消息中心title
	public String mess_center_title(){
		String title=super.getText("x,html/body/div/div[1]/div/b");
		return title;
	}
	//勾选第一个未读消息设为已读
	public void clickFirstCheckboxUnreadAndSetRead(){
		//*[@id="msg_tbody"]/tr[1]/td[1]/label/div/input
		super.clickCheckbox("x,//*[@id='msg_tbody']/tr[1]/td[1]/label/div/input");
		super.checkboxIsSelector("x,//*[@id='msg_tbody']/tr[1]/td[1]/label/div/input");
		super.clickElement("x,/html/body/div[6]/div[2]/div[1]/form/div[1]/button[1]");
		
		super.explicitWait("//*[@id='msg_paging']");
	}
	//获取设置已读消息状态的文本
	public String getAfterSetReadStatusText(int uMessNum){
		
		int UnreadMessNumber= Integer.parseInt(super.getText("unReadTotal"));
		System.out.println(UnreadMessNumber);
		if (UnreadMessNumber==uMessNum-1) {
			return "已读";
		} else {
			return "未读";
		}
		
		
	}
	//获取状态列表文本
	//*[@id="msg_nodata"]/div/span/text()[2]
	public String getStatusListText(){
		String StatusListText=super.getText("x,//*[@id='msg_tbody']/tr[1]/td[2]");
		return StatusListText;
	}
	//点击全选
	public void clickSetreadedToAll(){
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[1]/button[2]");
		
	}
	//消息条目不为空的等待时间
	public void waitWhileMegNumIsNotNull(){
		super.explicitWait("//*[@id='layui-layer2']/div");
	}
	//获取全部设为已读状态文本
	public String getSetReadToAllStatusText(){
		String statusText=super.getText("x,//*[@id='layui-layer2']/div");
		return statusText;
		}
	//获取条数为空的状态文本
	public String getStatusListTextWhileNumIsNull(){
		String SatusListTextWhileNumIsNull=this.getText("x,//*[@id='layui-layer1']/div");
		return SatusListTextWhileNumIsNull;
	}
	//条目为空的等待时间
	public void waitWhileMegNumIsNull(){
		super.explicitWait("//*[@id='layui-layer1']/div");
	}

}
