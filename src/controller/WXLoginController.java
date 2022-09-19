package controller;

import mapper.UserMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.HttpRequest;		//自定义的发送请求的工具类
import util.RegisterUser;		//自定义的注册的工具类
import util.AesCbcUtil;			//自定义的AES解密工具类

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:范秉洋
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

        //登录凭证不能为空
        if(code == null || code.length() == 0)
        {
            map.put("status",0);
            map.put("msg","code不能为空");
            return map;
        }

        //小程序唯一标识(在微信小程序管理后台获取)
        String wxspAppid = "wxd837a802c37e57a0";
        //小程序的app secret(在微信小程序管理后台获取)
        String wxspSecret = "e00973b33c699abc6bf002bb3186af7e";
        //授权(必填)
        String grant_type = "authorization_code";

        //*********1.向微信服务器使用登录凭证code获取session_key和openid*******************************//
        //拼接请求参数
        String params = "appid="+wxspAppid + "&secret="+wxspSecret + "&js_code="+code + "&grant_type="+grant_type;
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        //发送请求
        String sr = HttpRequest.sendGet(url,params);
//        System.out.println("发送请求："+url+"?"+params+"\n请求结果："+sr);

        //解析相应内容(转换成json对象)
        JSONObject json = new JSONObject(sr);

        //获取会话密钥(session_key)
        String session_key = json.get("session_key").toString();

        //用户的唯一标识(openid)
        String openid = (String)json.get("openid");

        //*********2.对encryptedData加密数据进行AES解密**************************************************//
        try{
            String result = AesCbcUtil.decrypt(encryptedData,session_key,iv,"UTF-8");
//            System.out.println("result==:"+result);

            if(null != result && result.length() > 0)
            {
                map.put("status",1);
                map.put("msg","解密成功");

                JSONObject userInfoJSON = new JSONObject(result);
                Map userInfo = new HashMap();
                userInfo.put("openId",userInfoJSON.get("openId"));
                userInfo.put("nickName",userInfoJSON.get("nickName"));
                userInfo.put("gender",userInfoJSON.get("gender"));
                userInfo.put("city",userInfoJSON.get("city"));
                userInfo.put("province",userInfoJSON.get("province"));
                userInfo.put("country",userInfoJSON.get("country"));
                userInfo.put("avatarUrl",userInfoJSON.get("avatarUrl"));


                //注册验证，如果是首次登录，将信息写入数据库，如果不是，则进行信息更新
                RegisterUser.Register(userMapper,userInfoJSON);

                //解密unionId & openId
                //这个信息是只给符合条件的用户下发,如不符合,则没有这个数据,在调用时需要做相应的判断,否则直接取值会报错,
                if(!userInfoJSON.isNull("unionId")){
                    userInfo.put("unionID",userInfoJSON.get("unionId"));
                }
                map.put("userInfo",userInfo);

//                System.out.println("userInfo="+userInfo+"请求登录成功");
            }else{
                map.put("status",0);
                map.put("msg","解密失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
