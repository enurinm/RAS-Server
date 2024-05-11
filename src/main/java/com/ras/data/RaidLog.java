package com.ras.data;

import lombok.Data;

import java.util.Date;

@Data
public class RaidLog {
    private Integer id;
    private Integer raidId;
    private Integer senderId;
    private Integer receiverId;
    private Date sendDt;
    private String txt;
}
