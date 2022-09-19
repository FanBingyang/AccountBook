package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.PageInfo;
import pojo.Scene;
import pojo.SceneExample;

public interface SceneMapper {
    int countByExample(SceneExample example);

    int deleteByExample(SceneExample example);

    int deleteByPrimaryKey(Integer sceneId);

    int insert(Scene record);

    int insertSelective(Scene record);

    List<Scene> selectByExample(SceneExample example);

    Scene selectByPrimaryKey(Integer sceneId);

    int updateByExampleSelective(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExample(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);

    //∑÷“≥≤È—Ø’Àµ•
    List<Scene> selectSceneByLimit(PageInfo pageInfo);
}