package tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**Common tools in applications
 * @author Larry
 */
public class mytools {
    public static final Scanner sc = new Scanner(System.in);
    /**
     * @param input: input string
     * @return true id the first character in input is "T" or '1' or 'y'
     */
    public static boolean parseBoolean(String input){
        input = input.trim().toUpperCase();//chuan hoa chuoi nhap
        char c = input.charAt(0);//Lấy ký tự đầu chuỗi nhập
        return c=='T' || c=='1' || c=='Y';//tra trị true nếu ký tự này là T,1,Y
    }
    /** Normalizing a date string: Using '-' to separate date parts only
 * @param dateStr: input date string
 * @return new string
 */
//"7 ... --- 2 /// 2023    " ---> "1-2-2013"
    public static String normalizeDateStr (String dateStr){
        // Loại bỏ tất cả các khoảng trống trong chuỗi nhập. Dùng replaceAll() với
        // regex phù hợp "7 ... ---  2 //// 2023" --> "7..---2////2023"
        String result = dateStr.replaceAll("[\\s]+", "");
        // Thay thế tất cả các nhómký tự trong chuỗi nhập. Dùng replaceAll() với regex phù hợp
        // "7...---2/////2023"-->"7-2-2023" rồi trả kết quả sau khi xử lly1
        result=result.replaceAll("[./-]+", "-");
        return result;
    }
    /**Parsing the input string to date data
     * @param inputStr: date string input.
     * @param DateFormat: chosen date format.
     * @return Date object if successful and null if failed
     */
    public static Date parseDate(String inputStr, String DateFormat){
        inputStr = normalizeDateStr(inputStr);// chuẩn hóa chuỗi ngày tháng
        DateFormat formatter = new  SimpleDateFormat(DateFormat);
        try {// dung formatter parse chuỗi nhập rồi trả kết quả
            return formatter.parse(inputStr);
        } catch (ParseException e) {
            System.err.println(e);
        }
        return null; // ko phân tích thành công thì trả về null
    }

    /** Covert a Date object to string using a given date format
         * @param date: Date object
         * @param dateFormat : chosen date format
         * @return date string in the given format
         */
    public String toString(Date date, String dateFormat) {
        if (date==null) return "";
        DateFormat formater = new SimpleDateFormat(dateFormat);
        return formater.format(date);
    }
/**getting year of date data
 * @param d: Date data
 * @param calendarPart: date part is declared in the class Calendar
 * @return year in date data
 */    
    public static int getPart(Date d, int calendarPart){
        Calendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(calendarPart);
    }
    //--- METHODS FOR READING DATA FORM KEYBOARD
    //** Reading a boolean data*/
    public static boolean readBoolean (String prompt){
        System.out.println(prompt+":");
        return parseBoolean(sc.nextLine());
    }
    /**Reading a string using a pre-define pattern
     * @param prompt:prompt will be print before inputting
     * @param pattern: pre-define pattern of input
     * @return an input string which matches the pattern.
     */
    public static String readStr (String prompt, String pattern){
        String input;
        boolean valid =false;
        do {            
            System.out.println(prompt +"");
            input = sc.nextLine().trim();
            valid = input.matches(pattern);
        } while (valid==false);
        return input;
    }
    /** Reading a date using a pre-difine date format
     * dd-MM-yyyy / MM-dd-yyyy/ yyyy-MM-dd
     * @param prompt: prompt will be printed befor inputting.
     * @param pattern:
     */
}

