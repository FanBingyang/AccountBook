package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Expense;
import pojo.PageInfo;
import service.ExpenseService;

import java.util.List;

/**
 * @Author:·¶±üÑó
 * @Date:2019/8/27 12:07
 */
@Controller
@RequestMapping(value = "/expense")
public class ExpenseController{

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping(value = "/insert.do")
    public @ResponseBody
    int insertExpense(Expense expense){
        return expenseService.insertExpense(expense);
    }

    @RequestMapping(value = "/delete.do")
    public @ResponseBody
    int deleteExpense(Integer id){
        return expenseService.deleteExpense(id);
    }

    @RequestMapping(value = "/update.do")
    public @ResponseBody
    Expense updateExpenseById(Expense expense){
        return expenseService.updateExpenseById(expense);
    }

    @RequestMapping(value = "/selectById.do")
    public @ResponseBody
    Expense selectExpenseById(Integer expenseId){
        return expenseService.selectExpenseById(expenseId);
    }

    @RequestMapping(value = "/selectByLimit.do")
    public @ResponseBody
    List<Expense> selectExpenseByLimit(PageInfo pageInfo){
        return expenseService.selectExpenseByLimit(pageInfo);
    }

    @RequestMapping(value = "/select.do")
    public @ResponseBody
    List<Expense> selectExpenseByExample(Expense expense){
        return expenseService.selectExpenseByExample(expense);
    }


    @RequestMapping(value = "/selectTotal.do")
    public @ResponseBody
    float selectTotal(String openId){
        return expenseService.selectTotal(openId);
    }

}
