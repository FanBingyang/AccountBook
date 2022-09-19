package controller;

import mapper.UserMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.HttpRequest;		//�Զ���ķ�������Ĺ�����
import util.RegisterUser;		//�Զ����ע��Ĺ�����
import util.AesCbcUtil;			//�Զ����AES���ܹ�����

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:������
 * @Date:2019/8/25 17:00
 */
@Controller
public class WXLoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/login.do")
    @ResponseBody
    public Map decodeUserInfo(String encryptedData,String iv,String code){
        Map map = new HashMap();

        //��¼ƾ֤����Ϊ��
        if(code == null || code.length() == 0)
        {
            map.put("status",0);
            map.put("msg","code����Ϊ��");
            return map;
        }

        //С����Ψһ��ʶ(��΢��С��������̨��ȡ)
        String wxspAppid = "wxd837a802c37e57a0";
        //С�����app secret(��΢��С��������̨��ȡ)
        String wxspSecret = "e00973b33c699abc6bf002bb3186af7e";
        //��Ȩ(����)
        String grant_type = "authorization_code";

        //*********1.��΢�ŷ�����ʹ�õ�¼ƾ֤code��ȡsession_key��openid*******************************//
        //ƴ���������
        String params = "appid="+wxspAppid + "&secret="+wxspSecret + "&js_code="+code + "&grant_type="+grant_type;
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        //��������
        String sr = HttpRequest.sendGet(url,params);
//        System.out.println("��������"+url+"?"+params+"\n��������"+sr);

        //������Ӧ����(ת����json����)
        JSONObject json = new JSONObject(sr);

        //��ȡ�Ự��Կ(session_key)
        String session_key = json.get("session_key").toString();

        //�û���Ψһ��ʶ(openid)
        String openid = (String)json.get("openid");

        //*********2.��encryptedData�������ݽ���AES����**************************************************//
        try{
            String result = AesCbcUtil.decrypt(encryptedData,session_key,iv,"UTF-8");
//            System.out.println("result==:"+result);

            if(null != result && result.length() > 0)
            {
                map.put("status",1);
                map.put("msg","���ܳɹ�");

                JSONObject userInfoJSON = new JSONObject(result);
                Map userInfo = new HashMap();
                userInfo.put("openId",userInfoJSON.get("openId"));
                userInfo.put("nickName",userInfoJSON.get("nickName"));
                userInfo.put("gender",userInfoJSON.get("gender"));
                userInfo.put("city",userInfoJSON.get("city"));
                userInfo.put("province",userInfoJSON.get("province"));
                userInfo.put("country",userInfoJSON.get("country"));
                userInfo.put("avatarUrl",userInfoJSON.get("avatarUrl"));


                //ע����֤��������״ε�¼������Ϣд�����ݿ⣬������ǣ��������Ϣ����
                RegisterUser.Register(userMapper,userInfoJSON);

                //����unionId & openId
                //�����Ϣ��ֻ�������������û��·�,�粻����,��û���������,�ڵ���ʱ��Ҫ����Ӧ���ж�,����ֱ��ȡֵ�ᱨ��,
                if(!userInfoJSON.isNull("unionId")){
                    userInfo.put("unionID",userInfoJSON.get("unionId"));
                }
                map.put("userInfo",userInfo);

//                System.out.println("userInfo="+userInfo+"�����¼�ɹ�");
            }else{
                map.put("status",0);
                map.put("msg","����ʧ��");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
