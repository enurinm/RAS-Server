package com.ras.mapper;

import com.ras.dao.SkillDetailDao;
import com.ras.dao.SkillEffectDao;
import com.ras.dao.SkillListDao;
import com.ras.dao.SkillTriggerDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper {
    /**
     * 스킬 목록 조회
     */
    List<SkillListDao> selectSkillList(SkillListDao param);

    /**
     * 스킬 상세 조회
     */
    SkillDetailDao selectSkill(SkillListDao param);

    /**
     * 스킬 효과 리스트 조회
     */
    List<SkillEffectDao> selectSkillEffectList(SkillListDao param);

    /**
     * 스킬 발동조건 리스트 조회
     */
    List<SkillTriggerDao> selectSkillTriggerList(SkillListDao param);
}
