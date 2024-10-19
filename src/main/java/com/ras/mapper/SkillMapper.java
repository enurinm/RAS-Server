package com.ras.mapper;

import com.ras.dao.*;
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

    /**
     * 스킬 등록
     */
    void insertSkill(SkillDetailDao param);

    /**
     * 스킬 발동조건 등록
     */
    void insertSkillTrigger(SkillTriggerDao param);

    /**
     * 스킬 효과 등록
     */
    void insertSkillEffect(SkillEffectDao param);

    /**
     * 스킬 수정
     */
    void updateSkill(SkillDetailDao param);

    /**
     * 스킬 발동조건 등록
     */
    void updateSkillTrigger(SkillTriggerDao param);

    /**
     * 스킬 효과 등록
     */
    void updateSkillEffect(SkillEffectDao param);

}
