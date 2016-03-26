package com.fb.exam.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2015/12/31.
 */
public class VerifyUtil {

    /**
     * 手机号验证
     *
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    /**
     * 电话号码验证
     *
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isPhone(String str) {
        Pattern p1 = null,p2 = null;
        Matcher m = null;
        boolean b = false;
        p1 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$");  // 验证带区号的
        p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$");         // 验证没有区号的
        if(str.length() >9)
        {	m = p1.matcher(str);
            b = m.matches();
        }else{
            m = p2.matcher(str);
            b = m.matches();
        }
        return b;
    }

    /**
     * 判断时间格式 格式必须为“YYYY-MM-dd”
     * 2004-2-30 是无效的
     * 2003-2-29 是无效的
     * */
     public static boolean isValidDate(String value,String formatStr) {
     boolean convertSuccess=true;
     SimpleDateFormat format = new SimpleDateFormat(formatStr);// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
         try {
                // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            // format.setLenient(false);
             format.parse(value);
         } catch (ParseException e) {
             // e.printStackTrace();
             // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
                  convertSuccess=false;
         }
     return convertSuccess;
     }

    /**
     * 校验数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 校验数字
     * @param str
     * @return
     */
    public static boolean isPhoneAndTelePhone(String str)throws Exception{
        Pattern pattern = Pattern.compile("[0-9]-,*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 校验字符串属否为double类型
     * @param str
     * @return
     */
   public static boolean isDouble(String str)
    {
        try
        {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException ex){}
        return false;
    }

    /**
     * 校验是Array否重复
     * @param strs
     * @return
     */
    public static boolean isRepeat(String[] strs) {
        ArrayList search = new ArrayList();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if ("".equals(str)) {
                continue;
            }
            int find = Arrays.binarySearch(search.toArray(), str);
            if (find >= 0) {
                return true;
            }
            search.add(str);
        }
        return false;
    }

    /**
     *校验在下标中是否包含某个字符
     */
    public static boolean isLength(String str, int minlen, int maxlen) {
        int len = 0;
        if (str != null) {
            len = str.length();
        }
        if (len >= minlen && len <= maxlen) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 验证邮箱格式"^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$"//email地址
     */
    public static boolean isEmail(String str) {
        String regex = "^[\\w-]+(\\.[\\w-]+)*\\@([\\.\\w-]+)+$";
        boolean flg = Pattern.matches(regex, str);
        System.out.println(flg);
        return flg;
    }

    /**
     * 验证字符串是否在指定长度内
     * @param value
     * @param lengthh
     * @return
     */
    public static boolean idNoSupLength(String value,Integer lengthh){
        boolean flag=false;
        if (value.length()<lengthh){
            flag=true;
        }
        return flag;
    }

    /**
     * 是否包含特殊符号
     * @param s
     * @return
     */
    private static boolean isHasSpecificSymbol(String s){
        Pattern pattern = Pattern.compile("((?=[\\x21-\\x7e]+)[^A-Za-z0-9])");
        Matcher isNum = pattern.matcher(s);
        return isNum.matches();
    }
}
