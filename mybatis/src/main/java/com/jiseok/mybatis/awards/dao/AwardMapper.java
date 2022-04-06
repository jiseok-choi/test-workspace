package com.jiseok.mybatis.awards.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AwardMapper {

    int awardCount();
}
