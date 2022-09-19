package service;

import pojo.PageInfo;
import pojo.Scene;

import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/27 13:28
 */
public interface SceneService {

    //新建账单
    int insertScene(Scene scene);

    //删除账单
    int deleteScene(Integer sceneId);

    //继续添加消费
    Scene addScene(Scene scene);

    //修改账单
    Scene updateSceneById(Scene scene);

    //分页查询账单
    List<Scene> selectSceneByLimit(PageInfo pageInfo);

    //根据id查询账单
    Scene selectSceneById(Integer sceneId);

    //根据条件查询
    List<Scene> selectByExample(Scene scene);

    //对比两次消费情况
    List<Scene> compaerScene(Integer id_1,Integer id_2);

}
