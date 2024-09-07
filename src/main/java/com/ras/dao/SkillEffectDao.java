package com.ras.dao;

import com.ras.data.SkillEffect;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SkillEffectDao extends SkillEffect {
    private String effectName;
    private String effectTypeStatName;
}
