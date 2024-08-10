package com.ras.dao;

import com.ras.data.CodeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SkillListDao extends SkillDao {
    Integer effectCd; // 스킬 효과 코드 - 검색용

    // 스킬 발동조건&효과 리스트
    List<CodeName> triggerEffectList;
}
