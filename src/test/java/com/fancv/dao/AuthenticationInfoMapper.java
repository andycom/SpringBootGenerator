package com.fancv.dao;

import com.fancv.model.AuthenticationInfo;

public interface AuthenticationInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthenticationInfo record);

    int insertSelective(AuthenticationInfo record);

    AuthenticationInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthenticationInfo record);

    int updateByPrimaryKey(AuthenticationInfo record);
}