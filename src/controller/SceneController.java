package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageInfo;
import pojo.Scene;
import service.SceneService;
import util.DateUtil;

import java.util.List;

/**
 * @Author:·¶±üÑó
 * @Date:2019/8/27 16:20
 */
@Controller
@RequestMapping(value = "/scene")
public class SceneController {

    @Autowired
    private SceneService sceneService;

    @RequestMapping(value = "/insert.do")
    public @ResponseBody
    int insertScene(Scene scene)
    {
        return sceneService.insertScene(scene);
    }

    @RequestMapping(value = "/delete.do")
    public @ResponseBody
    int deleteScene(Integer id)
    {
        return sceneService.deleteScene(id);
    }

    @RequestMapping(value = "/add.do")
    public @ResponseBody
    Scene addScene(Scene scene){
        return sceneService.addScene(scene);
    }

    @RequestMapping(value = "/update.do")
    public @ResponseBody
    Scene updateSceneById(Scene scene)
    {
        return sceneService.updateSceneById(scene);
    }

    @RequestMapping(value = "/selectByLimit.do")
    public @ResponseBody
    List<Scene> selectSceneByLimit(PageInfo pageInfo){
        return sceneService.selectSceneByLimit(pageInfo);
    }

    @RequestMapping(value = "/selectById.do")
    public @ResponseBody
    Scene selectSceneById(Integer sceneId)
    {
        return sceneService.selectSceneById(sceneId);
    }

    @RequestMapping(value = "/select.do")
    public @ResponseBody
    List<Scene> selectByExample(Scene scene)
    {
        return sceneService.selectByExample(scene);
    }

    @RequestMapping(value = "/compare.do")
    public @ResponseBody
    List<Scene> compareScene(Integer id_1,Integer id_2){
        return sceneService.compaerScene(id_1,id_2);
    }

}
