package com.ras.data;

import lombok.Data;

@Data
public class Member {
    private String id;
    private String pw;
    private String name;
    private String contact;

    /**
     * 회원 권한 코드
     * 10: 관리자
     * 11: 사용자(승인)
     * 12: 사용자(미승인)
     * 13: 사용자(미승인/승인요청 중)
     */
    private Integer memberCd;
}
