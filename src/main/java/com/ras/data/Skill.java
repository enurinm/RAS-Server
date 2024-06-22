package com.ras.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Skill {
    private Integer id;
    private String name;
    private String img;
    private String txt;
}
