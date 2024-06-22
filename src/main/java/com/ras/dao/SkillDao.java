package com.ras.dao;

import com.ras.data.Skill;
import com.ras.data.SkillEffect;
import com.ras.data.SkillTrigger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SkillDao extends Skill {
    // 스킬 발동조건 리스트
    List<SkillTrigger> skillTriggerList;

    // 스킬 효과 리스트
    List<SkillEffect> skillEffectList;

}
