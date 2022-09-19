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
 * @Author:������
 * @Date:2019/8/26 13:11
 */
public class RegisterUser {

    public static void Register(UserMapper userMapper,JSONObject userInfoJSON){
        //�Ƚ����յ���Json����ת�浽�û�������
        //�����û�����
        User user = new User();
        //�����û�openid
        user.setOpenId(userInfoJSON.get("openId").toString());
        //�����û��ǳ�
        user.setNickName(userInfoJSON.get("nickName").toString());
        //�����û��Ա�1:��;2:Ů;0:δ֪��
        user.setGender(Integer.parseInt(userInfoJSON.get("gender").toString()));
        //�����û�ͷ��
        user.setAvatarurl(userInfoJSON.get("avatarUrl").toString());
        //�����û���ַ���Ƚ��е�ַ ������/ʡ��/���С�ƴ��
        String adress = userInfoJSON.get("country") + "/" + userInfoJSON.get("province") + "/" + userInfoJSON.get("city");
        user.setAddress(adress);
        //�����û���¼״̬
        user.setLoginStatus(1);

        //����һ��UserExample����
        UserExample userExample = new UserExample();
        //��������Ϊ ��openid���
        userExample.createCriteria().andOpenIdEqualTo(user.getOpenId());
        //������(openid)��ѯ�����
        List<User> userList = userMapper.selectByExample(userExample);
//        System.out.println(userList+"=="+userList.size()+"==="+userList.isEmpty()+"==="+(userList != null));

        //�������Ϊ�գ��򽫸��û�ע�ᵽ���ݿ�
        if(userList != null && userList.isEmpty()) {

            //�����û�ע��ʱ�䣬���ɵ�ǰʱ��
            Date date = new Date();
            user.setUserTime(date);

            //ע���û���Ϣ
            userMapper.insert(user);

        }
        //������ϲ�Ϊ�գ������û���Ϣ
        else
        {
            for (User u:userList) {
                //���������и���
                userMapper.updateByPrimaryKeySelective(u);
            }

        }
    }



}
