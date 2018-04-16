package data.comdata.sqlDate;

import data.comdata.ComData;

public class SqlData {
	ComData comd= new ComData();
	public String[] fullParentIdAnduserId(){
		String [] fullParentIdAnduserId={"from user_info WHERE account='"+comd.baseUser()[0]+"';","fullParentId,userId"};
		return fullParentIdAnduserId;
	}
	/**
	 * 
	 * @param fullParentId
	 * @param userId
	 * readflag 0:鏈  1:宸茶
	 * type 1锛氳澶囧埌鏈�  2锛氳澶囩绾� 3锛氬娓告挱鎶�  4锛氱數閲忚繃浣� 
	 */
	public String[][] account_center_mess_number(String fullParentId,String userId){
		String [][] mess_number ={
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.readFlag='0';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.readFlag='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='2';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='3';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='4';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='2' AND um.readFlag='0';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='1' AND um.readFlag='0';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='3' AND um.readFlag='0';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='4' AND um.readFlag='0';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='2' AND um.readFlag='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='1' AND um.readFlag='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='3' AND um.readFlag='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.type='4' AND um.readFlag='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.imeis LIKE '%201708092122006%' AND um.type='2';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.imeis LIKE '%201708092122006%' AND um.type='1';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.imeis LIKE '%898120103682671%' AND um.type='4';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.imeis LIKE '%20170809%';","COUNT(*)"},
		{"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.imeis LIKE '%201708092122006201708092122006%';","COUNT(*)"},
		};
		return mess_number;
	}
	/**
	 * 账户中心消息未读
	 * @param fullParentId
	 * @param userId
	 * @return
	 */
	public String[] account_center_msg_unread(String fullParentId,String userId){
		String [] mess_number_unread={"FROM `user_message` AS um LEFT JOIN user_info AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') AND um.readFlag='0';","COUNT(*)"};
		return mess_number_unread;
	}
	/**
	 * 账号中心消息读取状态
	 * @param fullParentId
	 * @param userId
	 * @return
	 */
	public String[] accountCenterMsgReadStatus(String fullParentId,String userId){
		String [] msgReadStatus={"FROM `user_message` AS um LEFT JOIN  user_info  AS ui ON um.userId=ui.userId WHERE (ui.fullParentId LIKE '"+fullParentId+""+""+userId+""+"%' OR ui.userId='"+userId+"') ORDER BY um.creationDate DESC LIMIT 1;","readFlag"};
		return msgReadStatus;
	}
	
	public String [] accountCenterFictitiousAccountData(String account){
		String [] FictitiousAccountData={"FROM `user_fictitious` AS uf WHERE uf.parent=(SELECT ui.userId FROM user_info  AS ui WHERE ui.account='"+account+"') AND uf.enabledFlag='1';","uf.account"};
		return FictitiousAccountData;
	}
	public String[] accountCenterFicAccountGetAccount(String ID){
		String [] getAccount={"FROM `user_fictitious` AS uf WHERE uf.id='"+ID+"';","uf.account"};
		return getAccount;
	}
	public static void main(String[] args){
		SqlData sqld=new SqlData();
		String fullParentId="1,";
		String userId="12875";
		System.out.println(sqld.account_center_mess_number(fullParentId, userId)[1]);
	}

}
