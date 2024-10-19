package com.ras.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SkillTrigger {
    private Integer id;
    private Integer skillId;

    /**
     * 발동 조건 종류
     */
    private Integer triggerTypeCd;
    private Integer triggerStatId;

    /**
     * TRIGGER_TYPE이
     * 1(쿨타임): 기간 (라운드)
     * 2, 3, 4: 스탯 값 조건
     */
    private Integer triggerNum;
    private Integer triggerPercentYn; // 퍼센트/정수
    private Integer triggerBeAbYn; // 이상/이하
    private Integer triggerFirstDoYn; // 최초 발동 시 쿨타임 고려 여부

    /**
     * 사용여부
     * 0: N
     * 1: Y (defalt)
     */
    private Integer useYn;
}
