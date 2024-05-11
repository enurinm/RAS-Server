package com.ras.data;

import lombok.Data;

@Data
public class Code {
    private Integer code;
    private String codeTxt;
    private String codeName;
    private Integer type;
    private String typeName;
    private boolean useYn; // true - Y, false - N
}
