package com.ras.data;

import lombok.Data;

@Data
public class Skill {
    private Integer id;
    private String name;
    private String img;
    private String txt;

    /**
     * 발동 조건 종류
     */
    private Integer triggerType;
    private Integer triggerStatId;

    /**
     * TRIGGER_TYPE이
     * 1(쿨타임): 기간 (라운드)
     * 2, 3, 4: 스탯 값 조건
     */
    private Integer triggerNum;
    private boolean triggerPersentYn; // 퍼센트/정수
    private boolean triggerBeAbYn; // 이상/이하
    private boolean triggerFirstDoYn; // 최초 발동 시 쿨타임 고려 여부
}
