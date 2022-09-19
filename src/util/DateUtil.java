package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:������
 * @Date:2019/8/27 13:52
 */
public class DateUtil {

    /**
     * ��ʱ����������ת����ֵ����ʽ���ַ���
     * @param format ���ص�ʱ���ַ�����ʽ
     * @param date Ҫת����ʱ��
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
     * ����ֵ����ʽ��ʱ���ַ���
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
