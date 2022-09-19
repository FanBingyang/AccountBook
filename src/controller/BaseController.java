package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:·¶±üÑó
 * @Date:2019/10/4 10:26
 */
@Controller
@RequestMapping(value = "/base")
public class BaseController {

    @RequestMapping(value = "/swiperItem.do")
    public @ResponseBody
    List<String> getSwiperItem(){
        String tomcatPath = System.getProperty("catalina.home");
        String PATH = tomcatPath + "\\webapps\\resource\\account\\swiper";
        String URL = "http://cynosure.online/resource/account/swiper/";
//        System.out.println("user.dir="+System.getProperty("user.dir"));
//        System.out.println("catalina.home="+System.getProperty("catalina.home"));
//        System.out.println("PATH="+PATH);

        File file = new File(PATH);
        List<String> list = new ArrayList<>();
        File[] files = file.listFiles();
        if(null != files && files.length != 0) {
            for (File file1 : files) {
                list.add(URL + file1.getName());
            }
        }
        return list;
    }
}
