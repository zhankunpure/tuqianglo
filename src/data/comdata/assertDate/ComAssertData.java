package data.comdata.assertDate;

public class ComAssertData {
	
	public String account_center_msg_center_title(){
		String title="��Ϣ����";
		return title;
	}
	public String accountCenterMsgCenterGetFirstReadStatus(){
		String getFirstReadStatus="�Ѷ�";
		return getFirstReadStatus;
	}
	public String accountCenterMsgCenterGetSetReadStatusText(){
		String  getSetReadStatusText="�����ɹ�";
		return getSetReadStatusText;
		}
	public String accountCenterMsgSetReadStatusTextWhileNumIsNull(){
		String  textWhileNumIsNull="û����Ϣ";
		return textWhileNumIsNull;
	}
	public String accountCenterFictitiousAccountTitle(){
		String  fictitiousAccountTitle="�����˺Ź���";
		return fictitiousAccountTitle;
	}
	public String accountCenterFictitiousAccountTip(){
		String  FictitiousAccountTip="�˺�ֻ�ܰ������ġ����֡���ĸ���»��ߡ�@";
		return FictitiousAccountTip;
	}
	public String accountCenterFictitiousPaawordTip(){
		String  FictitiousPasswordTip="�����ʽ���󣬱���Ϊ��ĸ�����ֵ����";
		return FictitiousPasswordTip;
	}
	public String accountCenterFictitiousRePaawordTip(){
		String  FictitiousRePasswordTip="������������벻һ��";
		return FictitiousRePasswordTip;
	}
	/**
	 * ��֤�û�����
	 * @param types
	 * @return
	 */
	public String getUserType(String types) {
			String type = null;
	        if (types == "8") {
	            type = "������";
	        }
	        else if( types == "9") {
	            type = "�û�";
	        }
	        else if( types =="11") {
	        	type = "����";
	        }
	            
	        else if (types == "3") {
	            type = "�û�";
	        }
		
		return type;
	}
}
