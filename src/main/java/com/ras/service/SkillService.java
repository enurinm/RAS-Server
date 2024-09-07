package com.ras.service;

import com.ras.dao.SkillEffectDao;
import com.ras.dao.SkillListDao;
import com.ras.dao.SkillTriggerDao;
import com.ras.data.CodeName;
import com.ras.mapper.SkillMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SkillService {
    private final SkillMapper skillMapper;

    public List<SkillListDao> searchSkillList(SkillListDao inputParam) throws Exception{
        List<SkillListDao> returnDao = skillMapper.selectSkillList(inputParam);

        for(SkillListDao item : returnDao) {
            List<CodeName> triggerEffectList = new ArrayList<>();

            // 발동조건 조회
            List<SkillTriggerDao> triggerList = skillMapper.selectSkillTriggerList(item);
            CodeName trigger = new CodeName();
            String triggerVal = "";
            for(SkillTriggerDao tItem: triggerList) {
                if(tItem.getTriggerTypeCd() == null) {
                    continue;
                }

                if(tItem.getTriggerTypeCd().equals(53)) {
                    // 시전자 스탯 값 소모일 경우 신규 추가
                    CodeName use = new CodeName();

                    String name = tItem.getTriggerStatName() + " " + tItem.getTriggerNum();
                    // 퍼센트표기 1: Y / 0: N
                    if(tItem.getTriggerPercentYn() != null && tItem.getTriggerPercentYn().equals(1)) {
                        name += "%";
                    }

                    // 소모 값 추가
                    use.setKey("소모");
                    use.setValue(name);
                    triggerEffectList.add(use);
                } else {
                    // 소모 아닐 경우: 단순 이름 추가
                    triggerVal += tItem.getTriggerName() + " ";
                }
            }

            // 발동조건 세팅
            if(triggerVal.length() > 0) {
                trigger.setKey("발동");
                trigger.setValue(triggerVal);

                triggerEffectList.add(trigger);
            }


            // 효과 조회
            List<SkillEffectDao> effectList = skillMapper.selectSkillEffectList(item);
            for(int i = 0; i < effectList.size(); i++) {
                SkillEffectDao eItem = effectList.get(i);
                if(i == 0) {
                    // 지속시간 세팅
                    CodeName time = new CodeName();
                    time.setKey("지속");
                    time.setValue(eItem.getEffectMaintainTime()+" 라운드");
                    triggerEffectList.add(time);
                }

                // 효과 세팅
                // case 종류 : key / val 세팅, add
            }

            item.setTriggerEffectList(triggerEffectList);
        }

        return returnDao;
    }
}
