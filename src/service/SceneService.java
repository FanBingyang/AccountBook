package service;

import pojo.PageInfo;
import pojo.Scene;

import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/27 13:28
 */
public interface SceneService {

    //�½��˵�
    int insertScene(Scene scene);

    //ɾ���˵�
    int deleteScene(Integer sceneId);

    //�����������
    Scene addScene(Scene scene);

    //�޸��˵�
    Scene updateSceneById(Scene scene);

    //��ҳ��ѯ�˵�
    List<Scene> selectSceneByLimit(PageInfo pageInfo);

    //����id��ѯ�˵�
    Scene selectSceneById(Integer sceneId);

    //����������ѯ
    List<Scene> selectByExample(Scene scene);

    //�Ա������������
    List<Scene> compaerScene(Integer id_1,Integer id_2);

}
