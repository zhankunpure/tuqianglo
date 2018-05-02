package data.comdata;

public class ComData {
	public String baseUrl(){
		String[] BaseUrl={"http://tuqiangol.com","http://tujunsat.jimicloud.com","http://172.16.0.116:8691"};
		return BaseUrl[2];
	}
	public String[] baseUser(){
		String [] BasUser= {"web_autotest","jimi123","jimitest","jimi123"};
		return BasUser;
	}
	
	public String BaseCSV_Path() {
		
		String csv_path = "E:\\workspace\\tuqiangolAuto\\tuqiangolAuto\\src\\data\\";
		
		return csv_path;
		
	}

}
