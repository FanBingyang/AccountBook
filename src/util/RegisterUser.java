package util;

import mapper.UserMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/26 13:11
 */
public class RegisterUser {

    public static void Register(UserMapper userMapper,JSONObject userInfoJSON){
        //先将接收到的Json数据转存到用户对象中
        //创建用户对象
        User user = new User();
        //设置用户openid
        user.setOpenId(userInfoJSON.get("openId").toString());
        //设置用户昵称
        user.setNickName(userInfoJSON.get("nickName").toString());
        //设置用户性别，1:男;2:女;0:未知。
        user.setGender(Integer.parseInt(userInfoJSON.get("gender").toString()));
        //设置用户头像
        user.setAvatarurl(userInfoJSON.get("avatarUrl").toString());
        //设置用户地址，先进行地址 “国家/省份/城市”拼接
        String adress = userInfoJSON.get("country") + "/" + userInfoJSON.get("province") + "/" + userInfoJSON.get("city");
        user.setAddress(adress);
        //设置用户登录状态
        user.setLoginStatus(1);

        //创建一个UserExample对象
        UserExample userExample = new UserExample();
        //设置条件为 和openid相等
        userExample.createCriteria().andOpenIdEqualTo(user.getOpenId());
        //按条件(openid)查询出结果
        List<User> userList = userMapper.selectByExample(userExample);
//        System.out.println(userList+"=="+userList.size()+"==="+userList.isEmpty()+"==="+(userList != null));

        //如果集合为空，则将该用户注册到数据库
        if(userList != null && userList.isEmpty()) {

            //设置用户注册时间，生成当前时间
            Date date = new Date();
            user.setUserTime(date);

            //注册用户信息
            userMapper.insert(user);

        }
        //如果集合不为空，更新用户信息
        else
        {
            for (User u:userList) {
                //按主键进行跟新
                userMapper.updateByPrimaryKeySelective(u);
            }

        }
    }



}
