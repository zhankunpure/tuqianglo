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
		// TODO Auto-generated constructor stub
	}
	public void enterMsgCenter() throws InterruptedException{
		super.clickElement("x,.//*[@id='usermessage']/a");
		Thread.sleep(10000);
		super.switchToFrame("usermessageFrame");
		super.explicitWait(".//*[@id='remainSearchDeviceInput']");
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
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[1]/div/span[3]");
		Thread.sleep(1000);
		if(message_type.equals("offline")){
			super.clickElement("x,html/body/div/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[2]");
		}else if(message_type.equals("expire")){
			super.clickElement("x,html/body/div/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[3]");
		}else if(message_type.equals("guide")){
			super.clickElement("x,html/body/div/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[4]");
		}else if(message_type.equals("lowpower")){
			super.clickElement("x,html/body/div/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[5]");
		}else{
			
		}
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[2]/div/span[3]");
		Thread.sleep(1000);
		if(status.equals("unread")){
			super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[2]");
		}else if(status.equals("readed")){
			super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[3]");
		}else{
			
		}
		super.clickElement("x,html/body/div/div[2]/div[1]/form/div[2]/button");
		Thread.sleep(15000);
		super.explicitWait(".//*[@id='msg_paging']");
		super.clearOperateInputElement("remainSearchDeviceInput");
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[1]/div/span[3]");
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[1]/div/div/ul/li[1]");
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[2]/div/span[3]");
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[2]/span[2]/div/div/ul/li[1]");
	}
	//寰楀埌娑堟伅涓績鏈鏁伴噺
	public int unreadMessNumber(){
		super.switchToDefaultContent();
		super.explicitWait(".//*[@id='unReadTotal']");
		String UnreadMessNumber= super.getText("unReadTotal");
		int number=Integer.parseInt(UnreadMessNumber);
		return number;
	}
	//寰楀埌娑堟伅涓績title
	public String mess_center_title(){
		String title=super.getText("x,html/body/div/div[1]/div/b");
		return title;
	}
	//鍕鹃�夋湭璇昏缃负宸茶
	public void clickFirstCheckboxUnreadAndSetRead(){
		super.clickCheckbox("x,.//*[@id='msg_tbody']/tr[1]/td[1]/label/div/input");
		super.checkboxIsSelector("x,.//*[@id='msg_tbody']/tr[1]/td[1]/label/div/input");
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[1]/button[1]");
		super.explicitWait(".//*[@id='msg_paging']");
	}
	//获取设置读取消息状态的文本
	public String getSetReadStatusText(){
		String StatusText=super.getText("x,.//*[@id='layui-layer1']/div");
		return StatusText;
	}
	//获取状态列表文本
	public String getStatusListText(){
		String StatusListText=super.getText("x,.//*[@id='msg_tbody']/tr[1]/td[2]");
		return StatusListText;
	}
	//点击全选
	public void clickSetreadedToAll(){
		super.clickElement("x,html/body/div[1]/div[2]/div[1]/form/div[1]/button[2]");
		
	}
	//消息条目不为空的等待时间
	public void waitWhileMegNumIsNotNull(){
		super.explicitWait(".//*[@id='layui-layer2']/div");
	}
	//寰楀埌鍏ㄩ儴璁剧疆涓哄凡璇诲悗鐨勬枃鏈唴瀹�
	public String getSetReadToAllStatusText(){
		String statusText=super.getText("x,.//*[@id='layui-layer2']/div");
		return statusText;
		}
	//娑堟伅涓虹┖ 鍏ㄩ儴璁剧疆涓哄凡璇�
	public String getStatusListTextWhileNumIsNull(){
		String SatusListTextWhileNumIsNull=this.getText("x,.//*[@id='layui-layer1']/div");
		return SatusListTextWhileNumIsNull;
	}
	public void waitWhileMegNumIsNull(){
		super.explicitWait(".//*[@id='layui-layer1']/div");
	}

}
