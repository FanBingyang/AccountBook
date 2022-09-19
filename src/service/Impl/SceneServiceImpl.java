package service.Impl;

import mapper.ExpenseMapper;
import mapper.SceneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Expense;
import pojo.PageInfo;
import pojo.Scene;
import pojo.SceneExample;
import service.ExpenseService;
import service.SceneService;
import util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/27 14:31
 */
@Service
public class SceneServiceImpl implements SceneService {

    @Autowired
    private SceneMapper sceneMapper;

    @Autowired
    private ExpenseService expenseService;

    /**
     * �½��˵�
     * @param scene
     * @return
     */
    @Override
    public int insertScene(Scene scene) {
        //���ô���ʱ��
        String date = DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss");
        scene.setSceneTime(date);
        //�������Ϊ��,����������Ϊʱ��
        if(scene.getSceneTitle() == null || scene.getSceneTitle().length() <=0){
            scene.setSceneTitle(date.substring(0,10));
        }
        //�����עΪ�գ�����ע����Ϊ ��
        if(scene.getSceneExplain() == null || scene.getSceneExplain().length() <= 0){
            scene.setSceneExplain("��");
        }
        //���������ѵ��ܺ�
        float total = 0;

        //�����ж��˵��ﶼ����Щ�������ͣ�Ȼ�����ν�����Ϊ�������ѽ���д��
        if(scene.getSceneSnacks() != null && scene.getSceneSnacks() > 0)
        {
            total += scene.getSceneSnacks();
            insert(scene,"��ʳ",scene.getSceneSnacks());
        }
        if(scene.getSceneFare() != null && scene.getSceneFare() > 0)
        {
            total += scene.getSceneFare();
            insert(scene,"��ͨ",scene.getSceneFare());
        }
        if(scene.getSceneStay() != null && scene.getSceneStay() > 0)
        {
            total += scene.getSceneStay();
            insert(scene,"ס��",scene.getSceneStay());
        }
        if(scene.getSceneRepast() != null && scene.getSceneRepast() > 0)
        {
            total += scene.getSceneRepast();
            insert(scene,"����",scene.getSceneRepast());
        }
        if(scene.getSceneRecreation() != null && scene.getSceneRecreation() > 0)
        {
            total += scene.getSceneRecreation();
            insert(scene,"����",scene.getSceneRecreation());
        }
        if(scene.getSceneClothing() != null && scene.getSceneClothing() > 0)
        {
            total += scene.getSceneClothing();
            insert(scene,"��װ",scene.getSceneClothing());
        }
        if(scene.getSceneDaily() != null && scene.getSceneDaily() > 0)
        {
            total += scene.getSceneDaily();
            insert(scene,"�ճ�",scene.getSceneDaily());
        }
        if(scene.getSceneOther() != null && scene.getSceneOther() > 0)
        {
            total += scene.getSceneOther();
            insert(scene,"����",scene.getSceneOther());
        }
        //���������ܺ�
        scene.setSceneTotal(total);

        return sceneMapper.insertSelective(scene);
    }

    /**
     * ����idɾ���˵�
     * @param sceneId
     * @return
     */
    @Override
    public int deleteScene(Integer sceneId) {
        return sceneMapper.deleteByPrimaryKey(sceneId);
    }

    /**
     * ��������˵���Ϣ
     * @param scene
     * @return
     */
    @Override
    public Scene addScene(Scene scene) {
        //��ȡ�˵���Ϣ
        Scene sce = sceneMapper.selectByPrimaryKey(scene.getSceneId());
        //��ԭ�˵������˵����кϲ�
        Scene s = CreatScene(sce,scene);


        //�������ݸ���
        sceneMapper.updateByPrimaryKeySelective(s);
        return sce;
    }

    /**
     * �޸��˵���Ϣ
     * @param scene
     * @return
     */
    @Override
    public Scene updateSceneById(Scene scene) {
        sceneMapper.updateByPrimaryKeySelective(scene);
        return sceneMapper.selectByPrimaryKey(scene.getSceneId());
    }

    /**
     * ��ҳ��ѯ�˵�
     * @param pageInfo
     * @return
     */
    @Override
    public List<Scene> selectSceneByLimit(PageInfo pageInfo) {
//        System.out.println(pageInfo.toString());
//        System.out.println(pageInfo.getStart());
        return sceneMapper.selectSceneByLimit(pageInfo);
    }

    /**
     * ����id��ѯ�˵�
     * @param sceneId
     * @return
     */
    @Override
    public Scene selectSceneById(Integer sceneId) {
        return sceneMapper.selectByPrimaryKey(sceneId);
    }

    /**
     * ����������ѯ�˵�������Ϊ�˵��ı����ʱ��ģ����ѯ
     * @param scene
     * @return
     */
    @Override
    public List<Scene> selectByExample(Scene scene) {

        //������ѯ��������
        SceneExample example = new SceneExample();
        SceneExample.Criteria  criteria = example.createCriteria();
        // ��ѯ����һ����ȫ�����õĻ�����ֱ����example.createCriteria();
        // ����Ҫ�Ƿֿ����ò�ѯ�����Ļ��ͱ����Criteria����ͨ��example����������Ȼ�����������ã�֮�󴫲�example��ȥ;
        //�����û�id
//        example.createCriteria().andOpenIdEqualTo(scene.getOpenId()).andSceneTitleLike("%" + scene.getSceneTitle() + "%");
        criteria.andOpenIdEqualTo(scene.getOpenId());
        //�����ѯ���ⲻΪ�գ�����Ϊ��ѯ����
        if(scene.getSceneTitle() != null && scene.getSceneTitle().length() > 0)
        {
            System.out.println("title:"+scene.getSceneTitle()+"---length:"+scene.getSceneTitle().length());
            criteria.andSceneTitleLike("%" + scene.getSceneTitle() + "%");
        }
        //�����ѯʱ�䲻Ϊ�գ�����Ϊ��ѯ����
        if(scene.getSceneTime() != null && scene.getSceneTime().length() > 0){
            System.out.println("time:"+scene.getSceneTime()+"---length:"+scene.getSceneTime().length());
            criteria.andSceneTimeLike("%" + scene.getSceneTime() + "%");
        }
        return sceneMapper.selectByExample(example);
    }

    /**
     * ���������˵�id���������˵������ڱȽ����ε��������
     * @param id_1
     * @param id_2
     * @return
     */
    @Override
    public List<Scene> compaerScene(Integer id_1, Integer id_2) {
        List<Scene> list = new ArrayList<>();

        Scene scene_1 = sceneMapper.selectByPrimaryKey(id_1);
        list.add(scene_1);

        Scene scene_2 = sceneMapper.selectByPrimaryKey(id_2);
        list.add(scene_2);

        return list;
    }


    /*****************************�����Ƿ�װ������С����************************************************/

    /***
     * ��ԭ�˵�������ӵ��˵����ѽ��кϲ���һ���˵�
     * @param sce ԭ�˵�
     * @param scene ���˵�
     * @return  �ϲ�֮����˵�
     */
    public Scene CreatScene(Scene sce,Scene scene){
        //������ĸ��������������������������
        if(scene.getSceneSnacks() != null && scene.getSceneSnacks() > 0)
        {
            insert(scene,"��ʳ",scene.getSceneSnacks());
            sce.setSceneSnacks(scene.getSceneSnacks()+sce.getSceneSnacks());
        }
        if(scene.getSceneFare() != null && scene.getSceneFare() > 0)
        {
            insert(scene,"��ͨ",scene.getSceneFare());
            sce.setSceneFare(scene.getSceneFare()+sce.getSceneFare());
        }
        if(scene.getSceneStay() != null && scene.getSceneStay() > 0)
        {
            insert(scene,"ס��",scene.getSceneStay());
            sce.setSceneStay(scene.getSceneStay()+sce.getSceneStay());
        }
        if(scene.getSceneRepast() != null && scene.getSceneRepast() > 0)
        {
            insert(scene,"����",scene.getSceneRepast());
            sce.setSceneRepast(scene.getSceneRepast() + sce.getSceneRepast());
        }
        if(scene.getSceneRecreation() != null && scene.getSceneRecreation() > 0)
        {
            insert(scene,"����",scene.getSceneRecreation());
            sce.setSceneRecreation(scene.getSceneRecreation()+sce.getSceneRecreation());
        }
        if(scene.getSceneClothing() != null && scene.getSceneClothing() > 0)
        {
            insert(scene,"��װ",scene.getSceneClothing());
            sce.setSceneClothing(scene.getSceneClothing()+sce.getSceneClothing());
        }
        if(scene.getSceneDaily() != null && scene.getSceneDaily() > 0)
        {
            insert(scene,"�ճ�",scene.getSceneDaily());
            sce.setSceneDaily(scene.getSceneDaily()+sce.getSceneDaily());
        }
        if(scene.getSceneOther() != null && scene.getSceneOther() > 0)
        {
            insert(scene,"����",scene.getSceneOther());
            sce.setSceneOther(scene.getSceneOther()+sce.getSceneOther());
        }
        //�����޸Ĺ���ı���
        sce.setSceneTitle(scene.getSceneTitle());
        //�����޸Ĺ���ı�ע
        sce.setSceneExplain(scene.getSceneExplain());
        //���������ѵ��ܺ�
        float total =
                sce.getSceneSnacks() +
                sce.getSceneFare() +
                sce.getSceneStay() +
                sce.getSceneRepast() +
                sce.getSceneRecreation() +
                sce.getSceneClothing() +
                sce.getSceneDaily() +
                sce.getSceneOther();
        //���������ܺ�
        sce.setSceneTotal(total);
        //����װ�õ��˵�����
        return sce;
    }

    /**
     * �ڴ����龰�˵�ʱ��Ҳ��Ҫ��ÿ�����ѽ��е�������¼�룬����ͳ�����е��������
     * @param scene �˵�
     * @param category ��������
     * @param money ���ѽ��
     * @return
     */
    public int insert(Scene scene,String category,float money){
        //���õ�������
        Expense expense = new Expense(null,scene.getOpenId(),scene.getSceneTime().substring(0,10),category,money,scene.getSceneTitle()+"������","");
        //д�����ݿ�
        return expenseService.insertExpense(expense);
    }
}
