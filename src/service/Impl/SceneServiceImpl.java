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
 * @Author:范秉洋
 * @Date:2019/8/27 14:31
 */
@Service
public class SceneServiceImpl implements SceneService {

    @Autowired
    private SceneMapper sceneMapper;

    @Autowired
    private ExpenseService expenseService;

    /**
     * 新建账单
     * @param scene
     * @return
     */
    @Override
    public int insertScene(Scene scene) {
        //设置创建时间
        String date = DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss");
        scene.setSceneTime(date);
        //如果标题为空,将标题设置为时间
        if(scene.getSceneTitle() == null || scene.getSceneTitle().length() <=0){
            scene.setSceneTitle(date.substring(0,10));
        }
        //如果备注为空，将备注设置为 无
        if(scene.getSceneExplain() == null || scene.getSceneExplain().length() <= 0){
            scene.setSceneExplain("无");
        }
        //求所有消费的总和
        float total = 0;

        //进行判断账单里都有那些消费类型，然后依次将其作为单次消费进行写入
        if(scene.getSceneSnacks() != null && scene.getSceneSnacks() > 0)
        {
            total += scene.getSceneSnacks();
            insert(scene,"零食",scene.getSceneSnacks());
        }
        if(scene.getSceneFare() != null && scene.getSceneFare() > 0)
        {
            total += scene.getSceneFare();
            insert(scene,"交通",scene.getSceneFare());
        }
        if(scene.getSceneStay() != null && scene.getSceneStay() > 0)
        {
            total += scene.getSceneStay();
            insert(scene,"住宿",scene.getSceneStay());
        }
        if(scene.getSceneRepast() != null && scene.getSceneRepast() > 0)
        {
            total += scene.getSceneRepast();
            insert(scene,"餐饮",scene.getSceneRepast());
        }
        if(scene.getSceneRecreation() != null && scene.getSceneRecreation() > 0)
        {
            total += scene.getSceneRecreation();
            insert(scene,"娱乐",scene.getSceneRecreation());
        }
        if(scene.getSceneClothing() != null && scene.getSceneClothing() > 0)
        {
            total += scene.getSceneClothing();
            insert(scene,"服装",scene.getSceneClothing());
        }
        if(scene.getSceneDaily() != null && scene.getSceneDaily() > 0)
        {
            total += scene.getSceneDaily();
            insert(scene,"日常",scene.getSceneDaily());
        }
        if(scene.getSceneOther() != null && scene.getSceneOther() > 0)
        {
            total += scene.getSceneOther();
            insert(scene,"其他",scene.getSceneOther());
        }
        //更新消费总和
        scene.setSceneTotal(total);

        return sceneMapper.insertSelective(scene);
    }

    /**
     * 根据id删除账单
     * @param sceneId
     * @return
     */
    @Override
    public int deleteScene(Integer sceneId) {
        return sceneMapper.deleteByPrimaryKey(sceneId);
    }

    /**
     * 继续添加账单信息
     * @param scene
     * @return
     */
    @Override
    public Scene addScene(Scene scene) {
        //获取账单信息
        Scene sce = sceneMapper.selectByPrimaryKey(scene.getSceneId());
        //将原账单和新账单进行合并
        Scene s = CreatScene(sce,scene);


        //进行数据更新
        sceneMapper.updateByPrimaryKeySelective(s);
        return sce;
    }

    /**
     * 修改账单信息
     * @param scene
     * @return
     */
    @Override
    public Scene updateSceneById(Scene scene) {
        sceneMapper.updateByPrimaryKeySelective(scene);
        return sceneMapper.selectByPrimaryKey(scene.getSceneId());
    }

    /**
     * 分页查询账单
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
     * 根据id查询账单
     * @param sceneId
     * @return
     */
    @Override
    public Scene selectSceneById(Integer sceneId) {
        return sceneMapper.selectByPrimaryKey(sceneId);
    }

    /**
     * 根据条件查询账单，条件为账单的标题和时间模糊查询
     * @param scene
     * @return
     */
    @Override
    public List<Scene> selectByExample(Scene scene) {

        //创建查询条件对象
        SceneExample example = new SceneExample();
        SceneExample.Criteria  criteria = example.createCriteria();
        // 查询条件一次性全部设置的话可以直接用example.createCriteria();
        // 但是要是分开设置查询条件的话就必须把Criteria对象通过example创建出来，然后再依次设置，之后传参example过去;
        //设置用户id
//        example.createCriteria().andOpenIdEqualTo(scene.getOpenId()).andSceneTitleLike("%" + scene.getSceneTitle() + "%");
        criteria.andOpenIdEqualTo(scene.getOpenId());
        //如果查询标题不为空，设置为查询条件
        if(scene.getSceneTitle() != null && scene.getSceneTitle().length() > 0)
        {
            System.out.println("title:"+scene.getSceneTitle()+"---length:"+scene.getSceneTitle().length());
            criteria.andSceneTitleLike("%" + scene.getSceneTitle() + "%");
        }
        //如果查询时间不为空，设置为查询条件
        if(scene.getSceneTime() != null && scene.getSceneTime().length() > 0){
            System.out.println("time:"+scene.getSceneTime()+"---length:"+scene.getSceneTime().length());
            criteria.andSceneTimeLike("%" + scene.getSceneTime() + "%");
        }
        return sceneMapper.selectByExample(example);
    }

    /**
     * 根据两个账单id返回两个账单，用于比较两次的消费情况
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


    /*****************************以下是封装的两个小方法************************************************/

    /***
     * 将原账单和新添加的账单消费进行合并成一张账单
     * @param sce 原账单
     * @param scene 新账单
     * @return  合并之后的账单
     */
    public Scene CreatScene(Scene sce,Scene scene){
        //如果有哪个消费类型有了新增，进行相加
        if(scene.getSceneSnacks() != null && scene.getSceneSnacks() > 0)
        {
            insert(scene,"零食",scene.getSceneSnacks());
            sce.setSceneSnacks(scene.getSceneSnacks()+sce.getSceneSnacks());
        }
        if(scene.getSceneFare() != null && scene.getSceneFare() > 0)
        {
            insert(scene,"交通",scene.getSceneFare());
            sce.setSceneFare(scene.getSceneFare()+sce.getSceneFare());
        }
        if(scene.getSceneStay() != null && scene.getSceneStay() > 0)
        {
            insert(scene,"住宿",scene.getSceneStay());
            sce.setSceneStay(scene.getSceneStay()+sce.getSceneStay());
        }
        if(scene.getSceneRepast() != null && scene.getSceneRepast() > 0)
        {
            insert(scene,"餐饮",scene.getSceneRepast());
            sce.setSceneRepast(scene.getSceneRepast() + sce.getSceneRepast());
        }
        if(scene.getSceneRecreation() != null && scene.getSceneRecreation() > 0)
        {
            insert(scene,"娱乐",scene.getSceneRecreation());
            sce.setSceneRecreation(scene.getSceneRecreation()+sce.getSceneRecreation());
        }
        if(scene.getSceneClothing() != null && scene.getSceneClothing() > 0)
        {
            insert(scene,"服装",scene.getSceneClothing());
            sce.setSceneClothing(scene.getSceneClothing()+sce.getSceneClothing());
        }
        if(scene.getSceneDaily() != null && scene.getSceneDaily() > 0)
        {
            insert(scene,"日常",scene.getSceneDaily());
            sce.setSceneDaily(scene.getSceneDaily()+sce.getSceneDaily());
        }
        if(scene.getSceneOther() != null && scene.getSceneOther() > 0)
        {
            insert(scene,"其他",scene.getSceneOther());
            sce.setSceneOther(scene.getSceneOther()+sce.getSceneOther());
        }
        //设置修改过后的标题
        sce.setSceneTitle(scene.getSceneTitle());
        //设置修改过后的备注
        sce.setSceneExplain(scene.getSceneExplain());
        //求所有消费的总和
        float total =
                sce.getSceneSnacks() +
                sce.getSceneFare() +
                sce.getSceneStay() +
                sce.getSceneRepast() +
                sce.getSceneRecreation() +
                sce.getSceneClothing() +
                sce.getSceneDaily() +
                sce.getSceneOther();
        //更新消费总和
        sce.setSceneTotal(total);
        //将封装好的账单返回
        return sce;
    }

    /**
     * 在创建情景账单时，也需要对每笔消费进行单次消费录入，方便统计所有的消费情况
     * @param scene 账单
     * @param category 消费类型
     * @param money 消费金额
     * @return
     */
    public int insert(Scene scene,String category,float money){
        //设置单次消费
        Expense expense = new Expense(null,scene.getOpenId(),scene.getSceneTime().substring(0,10),category,money,scene.getSceneTitle()+"的消费","");
        //写入数据库
        return expenseService.insertExpense(expense);
    }
}
