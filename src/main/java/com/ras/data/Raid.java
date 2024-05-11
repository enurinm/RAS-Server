package com.ras.data;

import lombok.Data;

import java.util.Date;

@Data
public class Raid {
    private Integer id;
    private String name;
    private String img;

    private boolean roundYn;
    private boolean autoYn;
    private boolean autoActionYn;
    private boolean autoTimeYn;
    private Date autoTime;
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

    private Integer raidMainType;
    private String raidMainImg;
    private String raidMainTxt;
}
