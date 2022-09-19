package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.MonthlyBill;
import service.MonthlyService;
import util.DateUtil;

import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/27 23:03
 */
@Controller
@RequestMapping(value = "/monthly")
public class MonthlyController{
    @Autowired
    private MonthlyService monthlyService;

    @RequestMapping(value = "/insert.do")
    public @ResponseBody
    int insertMonthly(MonthlyBill monthlyBill){
        return monthlyService.insertMonthly(monthlyBill);
    }

    @RequestMapping(value = "/selectById.do")
    public @ResponseBody
    MonthlyBill selectById(Integer id){
        return monthlyService.selectById(id);
    }

    @RequestMapping(value = "/selectByExample.do")
    public @ResponseBody
    List<MonthlyBill> selectByExample(MonthlyBill monthlyBill){
        return monthlyService.selectByExample(monthlyBill);
    }

    @RequestMapping(value = "/compare.do")
    public @ResponseBody
    List<MonthlyBill> compareMonthly(Integer id_1,Integer id_2){
        return monthlyService.compareMonthly(id_1,id_2);
    }

    /**
     * �ù���ʱ��ʱ���ܣ�ÿ���µĵ�һ���賿0�㣬�Ա��µ�����������д������˵�
     */
    /*
    * ʹ��spring�еĶ�ʱ����@Scheduled
    * ��һ����Ҫ��spring��xml�ļ������ã����https://blog.csdn.net/qq_33556185/article/details/51852537#
    *                                   ��https://blog.csdn.net/h2604396739/article/details/83658931
    * �ڶ�������Ҫ��ʱִ�е������ϼ�@Scheduledע�⣬����ָ����ʱʱ��
    * ���ڶ�ʱʱ��ĸ�ʽ�����https://www.jianshu.com/p/1defb0f22ed1
    *                    ��https://www.cnblogs.com/dyppp/p/7498457.html    * */
    @Scheduled(cron = "0 0 0 1 * ?")
    /*@Transactional��Spring�е�����ע�⣬��ϸ��https://www.cnblogs.com/xd502djj/p/10940627.html
                                         ��https://blog.csdn.net/jiangyu1013/article/details/84397366*/
    @Transactional
    public void creatMonthly(){
        System.out.println(DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss"));
        //�������˵�
        monthlyService.creatMonthly();
    }


}


