package com.ras.dao;

import com.ras.data.SkillEffect;
import com.ras.data.SkillTrigger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SkillDetailDao extends SkillDao {
    // 스킬 발동조건 리스트
    List<SkillTrigger> skillTriggerList;

    // 스킬 효과 리스트
    List<SkillEffect> skillEffectList;

}
