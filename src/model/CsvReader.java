package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.comdata.ComData;  
  
  
public class CsvReader {  
	
    private InputStreamReader fr = null;  
    private BufferedReader br = null;  
    private ComData data = new ComData();
    
    public  CsvReader(String modelName,String csv_fileName) throws IOException { 
    	String f = data.BaseCSV_Path()+modelName+"\\"+csv_fileName;
        fr = new InputStreamReader(new FileInputStream(f),"UTF-8");  
    }  
  
   /**
    * 读取csv文件
    * @return
    * @throws Exception
    */
    public List<List<String>> readCSVFile() throws Exception

    
    {  
        br = new BufferedReader(fr);  
        
        String rec = null;// ???  
        String str;// ????????  
        List<List<String>> listFile = new ArrayList<List<String>>();  
        try {  
            // ??????  
            while ((rec = br.readLine()) != null) {  
                int index=0;  
                Pattern pCells = Pattern  
                        .compile("(\"[^\"]*(\"{2})*[^\"]*\")*[^,]*,");  
                Matcher mCells = pCells.matcher(rec);  
                List<String> cells = new ArrayList<String>();// ??��?????list  
                // ???????????  
                while (mCells.find()) {  
                    str = mCells.group();  
                    str = str.replaceAll(  
                            "(?sm)\"?([^\"]*(\"{2})*[^\"]*)\"?.*,", "$1");  
                    str = str.replaceAll("(?sm)(\"(\"))", "$2");  
                    cells.add(str);  
                    index = mCells.end();  
                }  
                cells.add(rec.substring(index));  
                listFile.add(cells); 
                System.out.println(listFile);
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (fr != null) {  
                fr.close();  
            }  
            if (br != null) {  
                br.close();  
            }  
        }  
        return listFile; 
        
    }
//    public static void main(String[] args) throws Exception{
//    	String f="D:\\workplace\\tuqiangol_test\\src\\data\\account_center\\message_search_data.csv";
//    	CsvReader csv=new CsvReader(modelName,csv_fileName);
//    	System.out.println(csv.readCSVFile());
//    }
}