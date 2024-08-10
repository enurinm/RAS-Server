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
            // for
                // 발동조건 세팅
                // if 소모 : new codename, add
                // else : string name += name
            // add codename 발동


            // 효과 조회
            List<SkillEffectDao> effectList = skillMapper.selectSkillEffectList(item);
            // for
                // if i = 0 : 지속시간 세팅
                // 효과 세팅
                // case 종류 : key / val 세팅, add
        }

        return returnDao;
    }
}
