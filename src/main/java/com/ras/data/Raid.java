package com.ras.data;

import lombok.Data;

import java.util.Date;

@Data
public class Raid {
    private Integer id;
    private String name;
    private String img;

    /**
     * 0: 턴제
     * 1: 라운드제
     */
    private boolean roundYn;
    /**
     * 0: 수동
     * 1: 자동
     */
    private boolean autoYn;
    private boolean autoActionYn;
    private boolean autoTimeYn;
    private Date autoTime;
    /**
     * 0: 적군부터
     * 1: 아군부터
     */
    private boolean friendFirstYn;
    private Integer baseStatId;
    private Integer sortMethod;

    /**
     * 레이드 상태 코드
     */
    private Integer raidCd;
    private Integer raidRound;
    private String raidTurn;

    private boolean participantFriendAllYn;
    private String participantFriend;
    private boolean participantEnemyAllYn;
    private String participantEnemy;

    /**
     * 0: 텍스트+이미지
     * 1: 이미지만
     * 2: 텍스트만
     */
    private Integer raidMainType;
    private String raidMainImg;
    private String raidMainTxt;
}
