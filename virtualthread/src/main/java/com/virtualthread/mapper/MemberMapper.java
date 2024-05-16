package com.virtualthread.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Value;

@Mapper
public interface MemberMapper {

    void insertMember( @Value( "name" ) String name );
}
