package com.ras.data;

import lombok.Data;

@Data
public class MemberCharacterMap {
    private String memberId;
    private Integer characterId;
    private boolean representYn;
    private boolean authXYn;
    private boolean authWYn;
}
