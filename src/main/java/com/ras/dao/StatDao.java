package com.ras.dao;

import com.ras.data.Stat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatDao extends Stat {
    private String baseStatName;
}
