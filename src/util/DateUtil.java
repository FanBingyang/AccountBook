package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:范秉洋
 * @Date:2019/8/27 13:52
 */
public class DateUtil {

    /**
     * 将时间类型数据转换成值定格式的字符串
     * @param format 返回的时间字符串格式
     * @param date 要转换的时间
     * @return
     */
    public static String DateToString(String format,Date date)
    {
        try{
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            String time = formatter.format(date);
            return time;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 创建值定格式的时间字符穿
     * @param format
     * @return
     */
    public static String CreatStringTime(String format)
    {
        try{
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            String time = formatter.format(date);
            return time;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
