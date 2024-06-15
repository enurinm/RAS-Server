package com.ras.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Stat {
    private Integer id;
    private String name;
    private String txt;
    private boolean showYn;

    /**
     * 스탯 종류
     * 0: 유동 스탯 (기본 스탯)
     * 1: 고정 스탯 (기본 스탯)
     * 2: 연계 스탯
     */
    private Integer statType;

    private Integer minNum;
    private Integer maxNum;
    private Integer defaultNum;
    private Integer unit;

    /**
     * 0: 직접입력
     * 1: 배수입력
     */
    private Integer calcType;
    private Integer baseStatId;

    /**
     * 배수 입력일 경우 배수 숫자,
     * 직접 입력일 경우 수식 입력
     */
    private String calcTxt;
}
