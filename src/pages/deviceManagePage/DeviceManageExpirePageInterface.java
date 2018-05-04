package pages.deviceManagePage;

public interface DeviceManageExpirePageInterface {
					
	String Expire = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[1]/div/span[2]";
	
	String ExpireLi = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[1]/div/div/ul/li";
	
	String PlatformMaturity = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[1]/div/div/ul/li[1]";
	
	String CustomerMaturity = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[1]/div/div/ul/li[2]";
	
	String Overdue = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[2]/div/span[2]";
	
	String OverdueLi = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[2]/div/div/ul/li";
	
	String Cycle = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[3]/div/span[2]";
	
	String CycleLi = "x,/html/body/div[2]/div[7]/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[3]/div/div/ul/li";
	
	String NoData = "noData";
	
	String NoDataText = "x,//*[@id=\"noData\"]/div/span";
	
	String TreeDemo_expirationUL = "treeDemo_expiration";
	
	String ExpiraTableContent = "expiraTableContent";
	
	String NoRecordsFound = "x,//*[@id=\"expiraTableContent\"]/tbody/tr/td";
	
	String treeDemo_expiration_1_switch = "treeDemo_expiration_1_switch";
	
	String treeDemo_expiration_1_ul = "treeDemo_expiration_1_ul";
	
	String treeDemo_expiration_1_li = "x,//*[@id=\"treeDemo_expiration_1_ul\"]/li";
	
	
	
	void checkExpirationDevice() throws InterruptedException;

}
