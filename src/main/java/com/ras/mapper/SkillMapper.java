package com.ras.mapper;

import com.ras.dao.SkillEffectDao;
import com.ras.dao.SkillListDao;
import com.ras.dao.SkillTriggerDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper {
    List<SkillListDao> selectSkillList(SkillListDao param);
    List<SkillEffectDao> selectSkillEffectList(SkillListDao param);
    List<SkillTriggerDao> selectSkillTriggerList(SkillListDao param);
}
