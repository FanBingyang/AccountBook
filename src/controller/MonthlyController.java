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
 * @Author:范秉洋
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
     * 该功能时定时功能，每个月的第一天凌晨0点，对本月的消费情况进行创建月账单
     */
    /*
    * 使用spring中的定时任务@Scheduled
    * 第一步需要在spring的xml文件中配置，详见https://blog.csdn.net/qq_33556185/article/details/51852537#
    *                                   和https://blog.csdn.net/h2604396739/article/details/83658931
    * 第二部在需要定时执行的任务上加@Scheduled注解，并且指定定时时间
    * 关于定时时间的格式，详见https://www.jianshu.com/p/1defb0f22ed1
    *                    和https://www.cnblogs.com/dyppp/p/7498457.html    * */
    @Scheduled(cron = "0 0 0 1 * ?")
    /*@Transactional是Spring中的事务注解，详细见https://www.cnblogs.com/xd502djj/p/10940627.html
                                         和https://blog.csdn.net/jiangyu1013/article/details/84397366*/
    @Transactional
    public void creatMonthly(){
        System.out.println(DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss"));
        //创建月账单
        monthlyService.creatMonthly();
    }


}


