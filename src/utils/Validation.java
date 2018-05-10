package utils;


import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
 
/**
 * ��֤������
 * @author admin
 *
 */
public class Validation {  
    //------------------��������  
    /** 
     * Email������ʽ="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
     */
    //public static final String EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";;  
    public static final String EMAIL = "\\w+(\\.\\w+)*@\\w+(\\.\\w+)+";
    /** 
     * �绰����������ʽ= (^(\d{2,4}[-_����]?)?\d{3,8}([-_����]?\d{3,8})?([-_����]?\d{1,7})?$)|(^0?1[35]\d{9}$)  
     */
    public static final String PHONE = "(^(\\d{2,4}[-_����]?)?\\d{3,8}([-_����]?\\d{3,8})?([-_����]?\\d{1,7})?$)|(^0?1[35]\\d{9}$)" ;  
    /** 
     * �ֻ�����������ʽ=^(13[0-9]|14[0-9]|15[0-9]|17[0-9]|18[0-9])\d{8}$
     */
    public static final String MOBILE ="^(13[0-9]|14[0-9]|15[0-9]|17[0-9]|18[0-9])\\d{8}$";  
  
    /** 
     * Integer������ʽ ^-?(([1-9]\d*$)|0) 
     */
    public static final String  INTEGER = "^-?(([1-9]\\d*$)|0)";  
    /** 
     * ������������ʽ >=0 ^[1-9]\d*|0$ 
     */
    public static final String  INTEGER_NEGATIVE = "^[1-9]\\d*|0$";  
    /** 
     * ������������ʽ <=0 ^-[1-9]\d*|0$ 
     */
    public static final String  INTEGER_POSITIVE = "^-[1-9]\\d*|0$";      
    /** 
     * Double������ʽ ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$ 
     */
    public static final String  DOUBLE ="^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$";  
    /** 
     * ��Double������ʽ >=0  ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$�� 
     */
    public static final String  DOUBLE_NEGATIVE ="^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0$";  
    /** 
     * ��Double������ʽ <= 0  ^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$ 
     */
    public static final String  DOUBLE_POSITIVE ="^(-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*))|0?\\.0+|0$";   
    /** 
     * ����������ʽ ^(?:[1-9][0-9]?|1[01][0-9]|120)$ ƥ��0-120�� 
     */
    public static final String  AGE="^(?:[1-9][0-9]?|1[01][0-9]|120)$";  
    /** 
     * �ʱ�������ʽ  [0-9]\d{5}(?!\d) ����6λ�ʱ� 
     */
    public static final String  CODE="[0-9]\\d{5}(?!\\d)";    
    /** 
     * ƥ�������֡�26��Ӣ����ĸ�����»�����ɵ��ַ��� ^\w+$ 
     */
    public static final String STR_ENG_NUM_="^\\w+$";  
    /** 
     * ƥ�������ֺ�26��Ӣ����ĸ��ɵ��ַ��� ^[A-Za-z0-9]+$  
     */
    public static final String STR_ENG_NUM="^[A-Za-z0-9]+";  
    /** 
     * ƥ����26��Ӣ����ĸ��ɵ��ַ���  ^[A-Za-z]+$ 
     */
    public static final String STR_ENG="^[A-Za-z]+$";  
    /** 
     * ���������ַ������� 
     * regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]";  
     */
    public static final String STR_SPECIAL="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]";  
    /*** 
     * �������� ֧�֣� 
     *  YYYY-MM-DD  
     *  YYYY/MM/DD  
     *  YYYY_MM_DD  
     *  YYYYMMDD 
     *  YYYY.MM.DD����ʽ 
     */
    public static final String DATE_ALL="((^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._]?)(10|12|0?[13578])([-\\/\\._]?)(3[01]|[12][0-9]|0?[1-9])$)" +  
            "|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._]?)(11|0?[469])([-\\/\\._]?)(30|[12][0-9]|0?[1-9])$)" +  
            "|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._]?)(0?2)([-\\/\\._]?)(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$)|(^([3579][26]00)" +  
            "([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$)" +  
            "|(^([1][89][0][48])([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$)|(^([2-9][0-9][0][48])([-\\/\\._]?)" +  
            "(0?2)([-\\/\\._]?)(29)$)" +  
            "|(^([1][89][2468][048])([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$)|(^([2-9][0-9][2468][048])([-\\/\\._]?)(0?2)" +  
            "([-\\/\\._]?)(29)$)|(^([1][89][13579][26])([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$)|" +  
            "(^([2-9][0-9][13579][26])([-\\/\\._]?)(0?2)([-\\/\\._]?)(29)$))";  
    /*** 
     * �������� ֧�֣� 
     *  YYYY-MM-DD  
     */
    public static final String DATE_FORMAT1="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
     
    /** 
     * URL������ʽ 
      * ƥ�� http www ftp 
     */
    public static final String URL = "^(http|www|ftp|)?(://)?(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*((:\\d+)?)(/(\\w+(-\\w+)*))*(\\.?(\\w)*)(\\?)?" +  
                                    "(((\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*(\\w*%)*(\\w*\\?)*" +  
                                    "(\\w*:)*(\\w*\\+)*(\\w*\\.)*" +  
                                    "(\\w*&)*(\\w*-)*(\\w*=)*)*(\\w*)*)$";   
  
    /** 
     * ���֤������ʽ 
     */
    public static final String IDCARD="((11|12|13|14|15|21|22|23|31|32|33|34|35|36|37|41|42|43|44|45|46|50|51|52|53|54|61|62|63|64|65)[0-9]{4})" +  
                                        "(([1|2][0-9]{3}[0|1][0-9][0-3][0-9][0-9]{3}" +  
                                        "[Xx0-9])|([0-9]{2}[0|1][0-9][0-3][0-9][0-9]{3}))";
     
    /**
     * ��������
     */
    public static final String JIGOU_CODE = "^[A-Z0-9]{8}-[A-Z0-9]$";
     
    /**
     * ƥ��������ɵ��ַ���  ^[0-9]+$ 
     */
    public static final String STR_NUM = "^[0-9]+$";  
       
////------------------��֤����       
    /** 
     * �ж��ֶ��Ƿ�Ϊ�� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static synchronized boolean StrisNull(String str) {  
        return null == str || str.trim().length() <= 0 ? true : false ;  
    }  
    /** 
     * �ж��ֶ��Ƿǿ� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean StrNotNull(String str) {  
        return !StrisNull(str) ;  
    }  
    /** 
     * �ַ���nullת�� 
     * @param str 
     * @return boolean 
     */
    public static  String nulltoStr(String str) {
        return StrisNull(str)?"":str;  
    }     
    /** 
     * �ַ���null��ֵĬ��ֵ  
     * @param str    Ŀ���ַ��� 
     * @param defaut Ĭ��ֵ 
     * @return String 
     */
    public static  String nulltoStr(String str,String defaut) {  
        return StrisNull(str)?defaut:str;  
    }  
    /** 
     * �ж��ֶ��Ƿ�ΪEmail ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isEmail(String str) {  
        return Regular(str,EMAIL);  
    }  
    /** 
     * �ж��Ƿ�Ϊ�绰���� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isPhone(String str) {  
        return Regular(str,PHONE);  
    }  
    /** 
     * �ж��Ƿ�Ϊ�ֻ����� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isMobile(String str) {  
        return Regular(str,MOBILE);  
    }  
    /** 
     * �ж��Ƿ�ΪUrl ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isUrl(String str) {  
        return Regular(str,URL);  
    }     
    /**  
     * �ж��ֶ��Ƿ�Ϊ���� �������� ���������� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isNumber(String str) {  
        return Regular(str,DOUBLE);  
    }  
    /** 
     * �ж��ֶ��Ƿ�ΪINTEGER  ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isInteger(String str) {  
        return Regular(str,INTEGER);  
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ������������ʽ >=0 ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isINTEGER_NEGATIVE(String str) {  
        return Regular(str,INTEGER_NEGATIVE);  
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ������������ʽ <=0 ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isINTEGER_POSITIVE(String str) {  
        return Regular(str,INTEGER_POSITIVE);  
    }     
    /** 
     * �ж��ֶ��Ƿ�ΪDOUBLE ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isDouble(String str) {  
        return Regular(str,DOUBLE);  
    }  
    /**  
     * �ж��ֶ��Ƿ�Ϊ��������������ʽ >=0 ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isDOUBLE_NEGATIVE(String str) {  
        return Regular(str,DOUBLE_NEGATIVE);  
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ��������������ʽ <=0 ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isDOUBLE_POSITIVE(String str) {  
        return Regular(str,DOUBLE_POSITIVE);  
    }     
    /** 
     * �ж��ֶ��Ƿ�Ϊ���� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isDate(String str) {  
        return Regular(str,DATE_ALL);  
    }  
    /**
     * ��֤2010-12-10
     * @param str
     * @return
     */
    public static  boolean isDate1(String str) {  
        return Regular(str,DATE_FORMAT1);  
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ���� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isAge(String str) {  
        return Regular(str,AGE) ;  
    }  
    /** 
     * �ж��ֶ��Ƿ񳬳� 
     * �ִ�Ϊ�շ���fasle, ��������{leng}����ture ��֮����false 
     * @param str 
     * @param leng 
     * @return boolean 
     */
    public static  boolean isLengOut(String str,int leng) {       
        return StrisNull(str)?false:str.trim().length() > leng ;  
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ���֤ ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isIdCard(String str) {  
        if(StrisNull(str)) return false ;  
        if(str.trim().length() == 15 || str.trim().length() == 18) {  
                return Regular(str,IDCARD);  
        }else {  
            return false ;  
        }  
           
    }  
    /** 
     * �ж��ֶ��Ƿ�Ϊ�ʱ� ���Ϸ���ture 
     * @param str 
     * @return boolean 
     */
    public static  boolean isCode(String str) {  
        return Regular(str,CODE) ;  
    }  
    /** 
     * �ж��ַ����ǲ���ȫ����Ӣ����ĸ 
     * @param str 
     * @return boolean 
     */
    public static boolean isEnglish(String str) {  
        return Regular(str,STR_ENG) ;  
    }  
    /** 
     * �ж��ַ����ǲ���ȫ����Ӣ����ĸ+���� 
     * @param str 
     * @return boolean 
     */
    public static boolean isENG_NUM(String str) {  
        return Regular(str,STR_ENG_NUM) ;  
    }  
    /** 
     * �ж��ַ����ǲ���ȫ����Ӣ����ĸ+����+�»��� 
     * @param str 
     * @return boolean 
     */
    public static boolean isENG_NUM_(String str) {  
        return Regular(str,STR_ENG_NUM_) ;  
    }  
    /** 
     * ���������ַ��� ���ع��˺���ַ��� 
     * @param str 
     * @return boolean 
     */
    public static  String filterStr(String str) {  
        Pattern p = Pattern.compile(STR_SPECIAL);  
        Matcher m = p.matcher(str);  
        return   m.replaceAll("").trim();  
    }
     
    /**
     * У����������ʽ
     * @return
     */
    public static boolean isJigouCode(String str){
        return Regular(str,JIGOU_CODE) ;  
    }
     
    /** 
     * �ж��ַ����ǲ���������� 
     * @param str 
     * @return boolean 
     */
    public static boolean isSTR_NUM(String str) {  
        return Regular(str,STR_NUM) ;  
    } 
     
    /** 
     * ƥ���Ƿ����������ʽpattern ƥ�䷵��true 
     * @param str ƥ����ַ��� 
     * @param pattern ƥ��ģʽ 
     * @return boolean 
     */
    private static  boolean Regular(String str,String pattern){  
        if(null == str || str.trim().length()<=0)  
            return false;           
        Pattern p = Pattern.compile(pattern);  
        Matcher m = p.matcher(str);  
        return m.matches();  
    }  
     
}  