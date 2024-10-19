package com.ras.data;

import lombok.Data;

@Data
public class SkillEffect {
    private Integer id;
    private Integer skillId;

    private Integer effectCd;
    private Integer effectUiCd;
    /**
     * 효과 상세 종류
     * 0: 고정값
     * 1: 배수
     * 2: 직접입력
     */
    private Integer effectType;
    private double effectTypeNum;
    private Integer effectTypeStat;
    private Integer effectTypeSkillCd1;
    private Integer effectTypeSkillCd2;
    private Integer effectTypeCalcTxt;
    /**
     * 효과 적용 시작 시기
     * 0: 이번 라운드부터
     * 1: 다음 라운드부터
     */
    private boolean effectStart;
    private Integer effectMaintainTime;
    private boolean effectApply;

    private Integer target;

    private boolean enemyAllYn;
    private Integer enemyNum;
    /**
     * 적군지정방식
     * 0: 랜덤
     * 1: 조건부 지정(스탯)
     * 2: 직접 지정
     */
    private Integer enemyTargetingType;
    private String enemyTxt;

    private boolean friendAllYn;
    private Integer friendNum;
    /**
     * 아군지정방식
     * 0: 랜덤
     * 1: 조건부 지정(스탯)
     * 2: 직접 지정
     */
    private Integer friendTargetingTime;
    private String friendTxt;
}
