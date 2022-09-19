package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.YearlyBill;
import service.YearlyService;
import util.DateUtil;

import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/29 16:19
 */
@Controller
@RequestMapping(value = "/yearly")
public class YearlyController {

    @Autowired
    private YearlyService yearlyService;

    @RequestMapping(value = "/insert.do")
    public @ResponseBody
    int insertYearly(YearlyBill yearlyBill){
        return yearlyService.insertYearthly(yearlyBill);
    }

    @RequestMapping(value = "/selectById.do")
    public @ResponseBody
    YearlyBill selectById(Integer id){
        return yearlyService.selectById(id);
    }

    @RequestMapping(value = "/selectByExample.do")
    public @ResponseBody
    List<YearlyBill> selectByExample(YearlyBill yearlyBill){
        return yearlyService.selectByExample(yearlyBill);
    }

    @RequestMapping(value = "/compare.do")
    public @ResponseBody
    List<YearlyBill> compareYearly(Integer id_1,Integer id_2){
        return yearlyService.compareYearly(id_1,id_2);
    }

    /**每年的第一天零点创建年账单
     * 执行定时任务，
     */
    @Scheduled(cron = "0 0 0 1 1 *")
    public void creatYearly(){
        System.out.println(DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss"));
        yearlyService.creatYearly();
    }
}
