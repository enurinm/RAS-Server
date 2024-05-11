package com.ras.data;

import lombok.Data;

@Data
public class CharacterEffectMap {
    private Integer characterId;
    private Integer effectId;
    private Integer startRound;
    private Integer leftTime;
}
