package com.ras.mapper;

import com.ras.dao.MemberDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    MemberDao login(MemberDao params);
}
