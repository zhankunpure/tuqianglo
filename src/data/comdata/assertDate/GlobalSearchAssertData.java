package data.comdata.assertDate;

public class GlobalSearchAssertData {
	
	public static String trackReplayURL(String imei){
		
		String  TrackReplayURL= "http://tujunsat.jimicloud.com/trackreplay/locus?imei="+imei;
		return TrackReplayURL;
		
	}
	
	public static String trackingURL(String imei){
		String TrackingURL = "http://tujunsat.jimicloud.com/trackpreset/tracking/"+imei+"?isTracking=0";
		return TrackingURL;
	}
	
	public static String consoleURL(){
		
		String ConsoleURL = "http://tujunsat.jimicloud.com/console";
		return ConsoleURL;
	}
	 
	public static String statisticalReportURL(){
		
		String StatisticalReportURL = "http://tujunsat.jimicloud.com/deviceReport/statisticalReport";
		return StatisticalReportURL;
	}
	
	public static String deviceManageURL(){
		
		String DeviceManageURL = "http://tujunsat.jimicloud.com/device/toDeviceManage";
		return DeviceManageURL;
	}
	
	public static String idCardNunberIsNotCorrect = "���֤�����ʽ����ȷ";
	
	public static String totalKmIsNotCorrect = "������0 ~ 9999999.99֮��";
	
	public static String totalKmNeedForNumbers = "����Ϊ����(��ౣ����λС��)";
	
	
}
