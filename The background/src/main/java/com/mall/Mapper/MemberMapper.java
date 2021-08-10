package com.mall.Mapper;/*
    @author Administrator
    @create 2021-07-15 11:46
*/

import com.mall.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Mapper
public interface MemberMapper {
    @Resource
    Member findAll(Member member);
    @Resource
    Member find_by_name(Member member);
    @Resource
    Member find_by_phone(Member member);
    @Resource
    Member find_by_time(Member member);
}
