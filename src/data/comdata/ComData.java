package data.comdata;

public class ComData {
	public String baseUrl(){
		String[] BaseUrl={"http://tuqiangol.com","http://tujunsat.jimicloud.com"};
		return BaseUrl[1];
	}
	public String[] baseUser(){
		String [] BasUser= {"web_autotest","jimi123","testjimi","jimi123"};
		return BasUser;
	}
	
	public String BaseCSV_Path() {
		
		String csv_path = "E:\\workspace\\tuqiangol_test-master\\src\\data\\";
		
		return csv_path;
		
	}

}
