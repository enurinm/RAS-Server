package com.ras.dao;

import lombok.Data;

@Data
public class MemberDao {
    private String id;
    private String pw;
    private String name;
    private String contact;
    private Integer memberCd;
}
