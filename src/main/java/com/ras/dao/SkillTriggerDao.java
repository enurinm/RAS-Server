package com.ras.dao;

import com.ras.data.SkillTrigger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SkillTriggerDao extends SkillTrigger {
    private String triggerName;
    private String triggerStatName;
}
